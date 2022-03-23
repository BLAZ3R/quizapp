package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {

    // TODO (STEP 1: Create a constant variables which we required in the result screen.)
    // START
    var USER_NAME: String = "user_name"
     var TOTAL_QUESTIONS: Int = 5
     var CORRECT_ANSWERS: Int = 0
    // END
    
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "Why are so many people farmers, like Cooper, in the world of \"Interstellar\"?",
            R.drawable.interstellar01,
            "they distrust technology", "it's easy and fun",
            "the world was running out of food", "nobody can afford college anymore", 3
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What was Coop's job before he was a farmer?",
            R.drawable.cooper,
            "an engineer and test pilot", "a professor of physics",
            "a bootlegger", "a spy", 1
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "Which crop is blight destroying as the film opens?",
            R.drawable.wheat,
            "wheat", "corn",
            "soy", "hops", 1
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What is the name of Cooper's son?",
            R.drawable.tom,
            "Mark", "Fred",
            "Tom", "Joseph", 3
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "Why does Murphy dislike her name?",
            R.drawable.merph,
            "it's a masculine name", "it sounds working-class",
            "it's usually a last name", "it reminds her and others of Murphy's Law", 4
        )

        questionsList.add(que5)

        return questionsList
    }
}