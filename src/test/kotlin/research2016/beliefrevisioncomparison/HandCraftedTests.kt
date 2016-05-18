package research2016.beliefrevisioncomparison

import org.junit.Test
import research2016.propositionallogic.And
import research2016.propositionallogic.BasicProposition
import research2016.propositionallogic.Not
import research2016.propositionallogic.Or

/**
 * Created by surpl on 5/17/2016.
 */
class HandCraftedTests
{
    val prop1 = And(And(And(And(And(And(And(And(And(And(BasicProposition.make("p"),BasicProposition.make("q")),BasicProposition.make("r")),BasicProposition.make("s")),BasicProposition.make("t")),BasicProposition.make("u")),BasicProposition.make("v")),BasicProposition.make("w")),BasicProposition.make("x")),BasicProposition.make("y")),BasicProposition.make("z"))
    val prop2 = Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(BasicProposition.make("p"),BasicProposition.make("q")),BasicProposition.make("r")),BasicProposition.make("s")),BasicProposition.make("t")),BasicProposition.make("u")),BasicProposition.make("v")),BasicProposition.make("w")),BasicProposition.make("x")),BasicProposition.make("y")),BasicProposition.make("z"))
    val prop3 = Or(Or(Or(Or(Or(Or(Or(Or(Or(Or(Not(BasicProposition.make("p")),Not(BasicProposition.make("q"))),Not(BasicProposition.make("r"))),Not(BasicProposition.make("s"))),Not(BasicProposition.make("t"))),Not(BasicProposition.make("u"))),Not(BasicProposition.make("v"))),Not(BasicProposition.make("w"))),Not(BasicProposition.make("x"))),Not(BasicProposition.make("y"))),Not(BasicProposition.make("z")))

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
}
