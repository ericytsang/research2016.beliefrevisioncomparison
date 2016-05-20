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
        return Proposition.makeRandom(BasicProposition.makeRandom(listOf("a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"),numPropositions))
    }

    @Test
    fun reviseHamming0()
    {
        val beliefState = setOf(Proposition.makeRandom(12))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming1()
    {
        val beliefState = setOf(Proposition.makeRandom(13))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming2()
    {
        val beliefState = setOf(Proposition.makeRandom(14))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming3()
    {
        val beliefState = setOf(Proposition.makeRandom(15))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming4()
    {
        val beliefState = setOf(Proposition.makeRandom(16))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming5()
    {
        val beliefState = setOf(Proposition.makeRandom(17))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming6()
    {
        val beliefState = setOf(Proposition.makeRandom(18))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming7()
    {
        val beliefState = setOf(Proposition.makeRandom(19))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming8()
    {
        val beliefState = setOf(Proposition.makeRandom(20))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction0()
    {
        val sentence = Proposition.makeRandom(13)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction1()
    {
        val sentence = Proposition.makeRandom(14)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction2()
    {
        val sentence = Proposition.makeRandom(15)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction3()
    {
        val sentence = Proposition.makeRandom(16)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction4()
    {
        val sentence = Proposition.makeRandom(17)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction5()
    {
        val sentence = Proposition.makeRandom(18)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction6()
    {
        val sentence = Proposition.makeRandom(19)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHammingOfContradiction7()
    {
        val sentence = Proposition.makeRandom(20)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseBases1()
    {
        val beliefState = setOf(Proposition.makeRandom(13))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases2()
    {
        val beliefState = setOf(Proposition.makeRandom(14))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases3()
    {
        val beliefState = setOf(Proposition.makeRandom(15))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases4()
    {
        val beliefState = setOf(Proposition.makeRandom(16))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases5()
    {
        val beliefState = setOf(Proposition.makeRandom(17))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases6()
    {
        val beliefState = setOf(Proposition.makeRandom(18))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases7()
    {
        val beliefState = setOf(Proposition.makeRandom(19))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases8()
    {
        val beliefState = setOf(Proposition.makeRandom(20))
        val sentence = Proposition.makeRandom(5)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction0()
    {
        val sentence = Proposition.makeRandom(13)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction1()
    {
        val sentence = Proposition.makeRandom(14)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction2()
    {
        val sentence = Proposition.makeRandom(15)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction3()
    {
        val sentence = Proposition.makeRandom(16)
        val beliefState = setOf(Not(sentence))
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction4()
    {
        val sentence = Proposition.makeRandom(17)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction5()
    {
        val sentence = Proposition.makeRandom(18)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction6()
    {
        val sentence = Proposition.makeRandom(19)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBasesOfContradiction7()
    {
        val sentence = Proposition.makeRandom(20)
        val beliefState = setOf(Not(sentence),sentence)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }
}