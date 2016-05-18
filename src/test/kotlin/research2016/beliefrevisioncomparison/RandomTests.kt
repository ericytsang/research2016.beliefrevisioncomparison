package research2016.beliefrevisioncomparison

import org.junit.Test
import research2016.propositionallogic.Not
import research2016.propositionallogic.Proposition
import research2016.propositionallogic.makeRandom

/**
 * Created by surpl on 5/17/2016.
 */

class RandomTests
{
    val prop1 = Proposition.makeRandom(12)
    val prop2 = Proposition.makeRandom(12)
    val prop3 = Proposition.makeRandom(12)

    @Test
    fun reviseHamming0()
    {
        val beliefState = setOf(prop3)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming1()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming2()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming3()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming4()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming5()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseHamming6()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseHamming(beliefState,sentence)}")
    }

    @Test
    fun reviseBases1()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases2()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases3()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases4()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases5()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }

    @Test
    fun reviseBases6()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        println("revised: ${reviseBases(beliefState,sentence)}")
    }
}