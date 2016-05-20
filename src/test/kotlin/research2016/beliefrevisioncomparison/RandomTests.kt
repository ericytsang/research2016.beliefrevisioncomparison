package research2016.beliefrevisioncomparison

import org.junit.Test
import research2016.propositionallogic.BasicProposition
import research2016.propositionallogic.Not
import research2016.propositionallogic.Proposition
import research2016.propositionallogic.makeRandom

/**
 * tests showing general performance of algorithms by having them revise
 * randomly generated formulas.
 */
class RandomTests
{
    fun Proposition.Companion.makeRandom(numPropositions:Int):Proposition
    {
        return Proposition.makeRandom(BasicProposition.makeRandom(listOf("p","q","r","s","t"),numPropositions))
    }

    @Test
    fun reviseHamming00()
    {
        val beliefState = setOf(Proposition.makeRandom(12))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming01()
    {
        val beliefState = setOf(Proposition.makeRandom(13))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming02()
    {
        val beliefState = setOf(Proposition.makeRandom(14))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming03()
    {
        val beliefState = setOf(Proposition.makeRandom(15))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming04()
    {
        val beliefState = setOf(Proposition.makeRandom(16))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming05()
    {
        val beliefState = setOf(Proposition.makeRandom(17))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming06()
    {
        val beliefState = setOf(Proposition.makeRandom(18))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming07()
    {
        val beliefState = setOf(Proposition.makeRandom(19))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming08()
    {
        val beliefState = setOf(Proposition.makeRandom(20))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming10()
    {
        val sentence = Proposition.makeRandom(13)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming11()
    {
        val sentence = Proposition.makeRandom(14)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming12()
    {
        val sentence = Proposition.makeRandom(15)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming13()
    {
        val sentence = Proposition.makeRandom(16)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming14()
    {
        val sentence = Proposition.makeRandom(17)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming15()
    {
        val sentence = Proposition.makeRandom(18)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming16()
    {
        val sentence = Proposition.makeRandom(19)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming17()
    {
        val sentence = Proposition.makeRandom(20)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseBases01()
    {
        val beliefState = setOf(Proposition.makeRandom(13))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases02()
    {
        val beliefState = setOf(Proposition.makeRandom(14))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases03()
    {
        val beliefState = setOf(Proposition.makeRandom(15))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases04()
    {
        val beliefState = setOf(Proposition.makeRandom(16))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases05()
    {
        val beliefState = setOf(Proposition.makeRandom(17))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases06()
    {
        val beliefState = setOf(Proposition.makeRandom(18))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases07()
    {
        val beliefState = setOf(Proposition.makeRandom(19))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases08()
    {
        val beliefState = setOf(Proposition.makeRandom(20))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases10()
    {
        val sentence = Proposition.makeRandom(13)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases11()
    {
        val sentence = Proposition.makeRandom(14)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases12()
    {
        val sentence = Proposition.makeRandom(15)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases13()
    {
        val sentence = Proposition.makeRandom(16)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases14()
    {
        val sentence = Proposition.makeRandom(17)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases15()
    {
        val sentence = Proposition.makeRandom(18)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases16()
    {
        val sentence = Proposition.makeRandom(19)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases17()
    {
        val sentence = Proposition.makeRandom(20)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }
}