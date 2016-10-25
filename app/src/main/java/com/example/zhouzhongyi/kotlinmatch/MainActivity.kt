package com.example.zhouzhongyi.kotlinmatch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var scoreHome = 0
    var scoreGuest = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayForHome(score: Int) {
        tv_homepoint.text = score.toString()
    }

    fun addThreeForHome(view: View) {
        scoreHome = scoreHome + 3
        displayForHome(scoreHome)
    }

    fun addTwoForHome(view: View) {
        scoreHome = scoreHome + 2
        displayForHome(scoreHome)
    }

    fun addOneForHome(view: View) {
        scoreHome = scoreHome + 1
        displayForHome(scoreHome)
    }

    fun displayForGuest(score: Int){
        tv_guestpoint.text = score.toString()
    }
    fun addThreeForGuest(view: View){
        scoreGuest = scoreGuest + 3
        displayForGuest(scoreGuest)
    }
    fun addTwoForGuest(view: View){
        scoreGuest = scoreGuest +2
        displayForGuest(scoreGuest)
    }
    fun addOneForGuest(view: View){
        scoreGuest = scoreGuest +1
        displayForGuest(scoreGuest)
    }
    fun Reset(view: View){
        scoreHome = 0
        scoreGuest = 0
        displayForHome(scoreHome)
        displayForGuest(scoreGuest)

    }

}
