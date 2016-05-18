package research2016.beliefrevisioncomparison

import research2016.propositionallogic.And
import research2016.propositionallogic.Contradiction
import research2016.propositionallogic.Proposition
import research2016.propositionallogic.Situation
import research2016.propositionallogic.basicPropositions
import research2016.propositionallogic.evaluate
import research2016.propositionallogic.generateFrom
import research2016.propositionallogic.isSatisfiable
import research2016.propositionallogic.makeFrom

/**
 * belief revision using hamming distance for ordering states.
 */
fun reviseHamming(beliefState:Set<Proposition>,sentence:Proposition):Set<Proposition>
{
    val concatenatedBeliefStates = beliefState.fold<Proposition,Proposition?>(null) {initial,next -> initial?.let {And(initial,next)} ?: next} ?: Contradiction

    val nearestSituations = printTime("                         hamming: ")
    {
        // sentence models are grouped by hamming distance.
        // i.e.: Map<hamming distance, model>
        //
        // if there are no beliefStateModels, then all models are mapped to 0
        val beliefStateSituations = Situation.generateFrom(concatenatedBeliefStates.basicPropositions)
        val sentenceSituations = Situation.generateFrom(sentence.basicPropositions)
        val beliefStateModels = beliefStateSituations.filter {concatenatedBeliefStates.evaluate(it)}
        val sentenceModels = sentenceSituations.filter {sentence.evaluate(it)}
        val orderedSentenceModels = sentenceModels.groupBy()
        {
            situation ->
            val nearestSituation = beliefStateModels.minBy {situation.hammingDistance(it)}
            nearestSituation?.hammingDistance(situation) ?: 0
        }

        // return the group of models with the lowest hamming distance as a
        // proposition
        val smallestDistance = orderedSentenceModels.keys.min()
        orderedSentenceModels[smallestDistance] ?: emptyList()
    }
    return nearestSituations.map {Proposition.makeFrom(it)}.toSet()
}

/**
 * returns the hamming distance between this [Situation] and the [other]
 * [Situation]; the number of mappings of [BasicProposition]s to truth values
 * that they disagree with.
 */
fun Situation.hammingDistance(other:Situation):Int
{
    val commonKeys = if (other.keys.size < keys.size)
    {
        other.keys.intersect(keys)
    }
    else
    {
        keys.intersect(other.keys)
    }

    return commonKeys.count {this[it] != other[it]}
}

/**
 * belief revision using the belief bases method.
 */
fun reviseBases(beliefState:Set<Proposition>,sentence:Proposition):Set<Proposition>
{
    printTime("                         bases: ")
    {
        return beliefState.filter {And(it,sentence).isSatisfiable}.toSet()+sentence
    }
}

/**
 * measures and prints out the time it takes to execute [block] in milliseconds.
 * [label] is printed before the milliseconds are printed.
 */
inline fun <R> printTime(label:String? = null,block:()->R):R
{
    val startTime = System.currentTimeMillis()
    try
    {
        return block()
    }
    finally
    {
        label?.let {print(label)}
        println("${System.currentTimeMillis()-startTime}ms")
    }
}
