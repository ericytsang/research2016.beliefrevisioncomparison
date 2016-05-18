package research2016.beliefrevisioncomparison

import org.junit.Test
import research2016.propositionallogic.And
import research2016.propositionallogic.BasicProposition
import research2016.propositionallogic.Not
import research2016.propositionallogic.Or

/**
 * hand crafted tests to verify that the revision functions work as expected.
 */
class HandCraftedTests
{
    val prop1 = And(And(BasicProposition.make("p"),BasicProposition.make("q")),BasicProposition.make("r"))
    val prop2 = Or(Or(BasicProposition.make("p"),BasicProposition.make("q")),BasicProposition.make("r"))
    val prop3 = Or(Or(Not(BasicProposition.make("p")),Not(BasicProposition.make("q"))),Not(BasicProposition.make("r")))

    @Test
    fun reviseHamming1()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseHamming(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[((p∧q)∧r)]")
    }

    @Test
    fun reviseHamming2()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseHamming(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[(((¬p)∧q)∧r), ((p∧(¬q))∧r), ((p∧q)∧(¬r))]")
    }

    @Test
    fun reviseHamming3()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseHamming(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[(((¬p)∧(¬q))∧r), (((¬p)∧q)∧(¬r)), (((¬p)∧q)∧r), ((p∧(¬q))∧(¬r)), ((p∧(¬q))∧r), ((p∧q)∧(¬r))]")
    }

    @Test
    fun reviseBases1()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseBases(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[((p∨q)∨r), ((p∧q)∧r)]")
    }

    @Test
    fun reviseBases2()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseBases(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[(¬((p∧q)∧r))]")
    }

    @Test
    fun reviseBases3()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseBases(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[((p∨q)∨r), (((¬p)∨(¬q))∨(¬r))]")
    }
}
