package com.example.quizme

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_question.*

class QuestionActivity : AppCompatActivity() {





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        val questionList = Constants.getQuestions()
        Log.i("Question Size","${questionList.size}")

        val currentPosition = 1
        val question: Question? = questionList[currentPosition -1]

        progressBar.progress = currentPosition
        tv_progress.text ="$currentPosition"+"/"+progressBar.max
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text= question.optionOne
        tv_option_two.text= question.optionTwo
        tv_option_three.text= question.optionThree
        tv_option_four.text= question.optionFour


    }
}