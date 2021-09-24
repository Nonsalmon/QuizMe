package com.example.quizme

object Constants{

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
            "Java"
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
            "Python"
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
            "Swift"
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
            "Javascript"
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
            "C#"
        )
        questionsList.add(que5)
        //6
        val que6 = Question(
            6,
            "What programming language does this picture belong to?",
            R.drawable.c,
            "C++",
            "Python",
            "Swift",
            "C+",
            "C++"
        )
        questionsList.add(que6)
        return questionsList

    }
}