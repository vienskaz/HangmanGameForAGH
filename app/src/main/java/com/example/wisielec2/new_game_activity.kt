package com.example.wisielec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class new_game_activity : AppCompatActivity() {
    private lateinit var wordTextView: TextView
    private lateinit var imageView: ImageView
    private lateinit var gameLostTextView: TextView
    private lateinit var gameWonTextView: TextView
    private lateinit var underscoreWord: String
    private lateinit var selectedWord: String
    private lateinit var tries_counter: TextView
    private var tries = 0
    private var correctletterCount = 0

    private fun randomWordPicker(): String {
        return GameWords.words.random()
    }

    private fun generateUnderscores(word: String) {
        val sb = StringBuilder()
        word.forEach { char ->
            sb.append("_")
        }
        underscoreWord = sb.toString()
    }



    private var errorCount = 0
    private val maxErrors = 8

    private fun checkLetter(letter: Char) {
        if (!::selectedWord.isInitialized) return

        if (selectedWord.contains(letter, ignoreCase = true)) {
            val sb = StringBuilder(underscoreWord)
            for (i in selectedWord.indices) {
                if (selectedWord[i].equals(letter, ignoreCase = true)) {
                    sb[i] = letter
                    correctletterCount += 1
                    if (correctletterCount == selectedWord.length) {
                        gameWonTextView.visibility = View.VISIBLE
                        wordTextView.visibility = View.INVISIBLE
                        getWindow().setFlags(
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                            WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
                    }
                }
            }
            underscoreWord = sb.toString()
            wordTextView.text = underscoreWord
        } else {
            errorCount++
            val hangmanImageResource = resources.getIdentifier("hangman$errorCount", "drawable", "com.example.wisielec2")
            imageView.setImageResource(hangmanImageResource)
            if (errorCount >= maxErrors) {
                gameLostTextView.visibility = View.VISIBLE
                wordTextView.visibility = View.INVISIBLE
                getWindow().setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE,
                    WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE);
            }
        }
        tries_counter.text = errorCount.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game)

        wordTextView = findViewById(R.id.wordTextView)
        tries_counter = findViewById(R.id.tries_counter) // Initialize tries_counter here

        selectedWord = randomWordPicker()
        generateUnderscores(selectedWord)
        wordTextView.text = underscoreWord
        gameLostTextView = findViewById(R.id.LOST_SIGN)
        gameWonTextView = findViewById(R.id.WIN_SIGN)
        imageView = findViewById(R.id.imageView)

        val letterA: Button = findViewById(R.id.button16)
        letterA.setOnClickListener {
            checkLetter('A')
            letterA.isEnabled=false
        }

        val letterB: Button = findViewById(R.id.button28)
        letterB.setOnClickListener {
            checkLetter('B')
            letterB.isEnabled=false
        }

        val letterQ: Button = findViewById(R.id.button3)
        letterQ.setOnClickListener {
            checkLetter('Q')
            letterQ.isEnabled=false
        }

        val letterW: Button = findViewById(R.id.button4)
        letterW.setOnClickListener {
            checkLetter('W')
            letterW.isEnabled=false
        }

        val letterE: Button = findViewById(R.id.button7)
        letterE.setOnClickListener {
            checkLetter('E')
            letterE.isEnabled=false
        }

        val letterR: Button = findViewById(R.id.button8)
        letterR.setOnClickListener {
            checkLetter('R')
            letterR.isEnabled=false
        }

        val letterT: Button = findViewById(R.id.button9)
        letterT.setOnClickListener {
            checkLetter('T')
            letterT.isEnabled=false
        }

        val letterY: Button = findViewById(R.id.button10)
        letterY.setOnClickListener {
            checkLetter('Y')
            letterY.isEnabled=false
        }

        val letterU: Button = findViewById(R.id.button11)
        letterU.setOnClickListener {
            checkLetter('U')
            letterU.isEnabled=false
        }

        val letterI: Button = findViewById(R.id.button13)
        letterI.setOnClickListener {
            checkLetter('I')
            letterI.isEnabled=false
        }

        val letterO: Button = findViewById(R.id.button14)
        letterO.setOnClickListener {
            checkLetter('O')
            letterO.isEnabled=false
        }

        val letterP: Button = findViewById(R.id.button15)
        letterP.setOnClickListener {
            checkLetter('P')
            letterP.isEnabled=false
        }

        val letterS: Button = findViewById(R.id.button17)
        letterS.setOnClickListener {
            checkLetter('S')
            letterS.isEnabled=false
        }

        val letterD: Button = findViewById(R.id.button18)
        letterD.setOnClickListener {
            checkLetter('D')
            letterD.isEnabled=false
        }

        val letterF: Button = findViewById(R.id.button19)
        letterF.setOnClickListener {
            checkLetter('F')
            letterF.isEnabled=false
        }

        val letterG: Button = findViewById(R.id.button20)
        letterG.setOnClickListener {
            checkLetter('G')
            letterG.isEnabled=false
        }

        val letterH: Button = findViewById(R.id.button21)
        letterH.setOnClickListener {
            checkLetter('H')
            letterH.isEnabled=false
        }

        val letterJ: Button = findViewById(R.id.button22)
        letterJ.setOnClickListener {
            checkLetter('J')
            letterJ.isEnabled=false
        }

        val letterK: Button = findViewById(R.id.button23)
        letterK.setOnClickListener {
            checkLetter('K')
            letterK.isEnabled=false
        }

        val letterL: Button = findViewById(R.id.button24)
        letterL.setOnClickListener {
            checkLetter('L')
            letterL.isEnabled=false
        }

        val letterZ: Button = findViewById(R.id.button25)
        letterZ.setOnClickListener {
            checkLetter('Z')
            letterZ.isEnabled=false
        }

        val letterX: Button = findViewById(R.id.button26)
        letterX.setOnClickListener {
            checkLetter('X')
            letterX.isEnabled=false
        }

        val letterC: Button = findViewById(R.id.button27)
        letterC.setOnClickListener {
            checkLetter('C')
            letterC.isEnabled=false
        }

        val letterV: Button = findViewById(R.id.button29)
        letterV.setOnClickListener {
            checkLetter('V')
            letterV.isEnabled=false
        }

        val letterN: Button = findViewById(R.id.button30)
        letterN.setOnClickListener {
            checkLetter('N')
            letterN.isEnabled=false
        }

        val letterM: Button = findViewById(R.id.button31)
        letterM.setOnClickListener {
            checkLetter('M')
            letterM.isEnabled=false
        }






    }

}