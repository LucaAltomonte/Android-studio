package com.studio.mattiaferigutti.scorecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var currentScoreTeamA = 0
    private var currentScoreTeamB = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addTeamAButton.setOnClickListener {
            addPoint(it.id)
        }

        addTeamBButton.setOnClickListener {
            addPoint(it.id)
        }

        removeTeamAButton.setOnClickListener {
            removePoint(it.id)
        }

        removeTeamBButton.setOnClickListener {
            removePoint(it.id)
        }
    }

    private fun addPoint(id: Int) {
        when (id) {
            R.id.addTeamAButton -> {
                currentScoreTeamA++
                updateTextView(teamATextView, currentScoreTeamA)
            }

            R.id.addTeamBButton -> {
                currentScoreTeamB++
                updateTextView(teamBTextView, currentScoreTeamB)
            }
        }
    }

    private fun removePoint(id: Int) {
        when (id) {
            R.id.removeTeamAButton -> {
                currentScoreTeamA--
                updateTextView(teamATextView, currentScoreTeamA)
            }

            R.id.removeTeamBButton -> {
                currentScoreTeamB--
                updateTextView(teamBTextView, currentScoreTeamB)
            }
        }
    }

    private fun updateTextView(textView: TextView, score: Int) {
        textView.text = score.toString()
    }

}