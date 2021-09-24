package com.example.quizme

object Constants{
    const val USER_NAME:String ="Username"
    const val TOTAL_QUESTION: String="total_question"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What programming language does this picture belong to?",
            R.drawable.java,
            "Java",
            "Python",
            "Javascript",
            "C+",
            1
        )

        questionsList.add(que1)

        //2
        val que2 = Question(
            2,
            "What programming language does this picture belong to?",
            R.drawable.python,
            "Swift",
            "Python",
            "Javascript",
            "C+",
            2
        )
        questionsList.add(que2)
        //3
        val que3 = Question(
            3,
            "What programming language does this picture belong to?",
            R.drawable.swift,
            "C++",
            "C##",
            "Javascript",
            "Swift",
            4
        )
        questionsList.add(que3)
        //4
        val que4 = Question(
            4,
            "What programming language does this picture belong to?",
            R.drawable.javascript,
            "Java",
            "Swift",
            "Javascript",
            "Ruby",
            3
        )
        questionsList.add(que4)
        //5
        val que5 = Question(
            5,
            "What programming language does this picture belong to?",
            R.drawable.hashtag,
            "Java",
            "Ruby",
            "C#",
            "C+",
            3
        )
        questionsList.add(que5)
        //6
        val que6 = Question(
            6,
            "What programming language does this picture belong to?",
            R.drawable.c,
            "C#",
            "Python",
            "Swift",
            "C++",
            4
        )
        questionsList.add(que6)
        return questionsList

    }
}