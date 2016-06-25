package com.github.ericytsang.research2016.beliefrevisioncomparison

import org.junit.Test
import com.github.ericytsang.research2016.propositionallogic.Variable
import com.github.ericytsang.research2016.propositionallogic.Not
import com.github.ericytsang.research2016.propositionallogic.and
import com.github.ericytsang.research2016.propositionallogic.not
import com.github.ericytsang.research2016.propositionallogic.or

/**
 * hand crafted tests to verify that the revision functions work as expected.
 */
class HandCraftedTests
{
    val p = Variable.make("p")
    val q = Variable.make("q")
    val r = Variable.make("r")
    val prop1 = p and q and r
    val prop2 = p or q or r
    val prop3 = p.not or q.not or r.not

    @Test
    fun reviseHamming1SentenceIsSubsetOfBeliefState()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseHamming(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[p∧q∧r]")
    }

    @Test
    fun reviseHamming2SentenceIsOutsideOfBeliefState()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseHamming(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[¬p∧q∧r, p∧¬q∧r, p∧q∧¬r]")
    }

    @Test
    fun reviseHamming3SentenceIntersectsWithBeliefState()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseHamming(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[¬p∧¬q∧r, ¬p∧q∧¬r, ¬p∧q∧r, p∧¬q∧¬r, p∧¬q∧r, p∧q∧¬r]")
    }

    @Test
    fun reviseBases1SentenceIsSubsetOfBeliefState()
    {
        val beliefState = setOf(prop2)
        val sentence = prop1
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseBases(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[p∨q∨r, p∧q∧r]")
    }

    @Test
    fun reviseBases2SentenceIsOutsideOfBeliefState()
    {
        val beliefState = setOf(prop1)
        val sentence = Not(prop1)
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseBases(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[¬(p∧q∧r)]")
    }

    @Test
    fun reviseBases3SentenceIntersectsWithBeliefState()
    {
        val beliefState = setOf(prop2)
        val sentence = prop3
        println("beliefState: $beliefState")
        println("sentence: $sentence")
        val revised = reviseBases(beliefState,sentence)
        println("revised: $revised")
        assert(revised.toString() == "[p∨q∨r, ¬p∨¬q∨¬r]")
    }
}
