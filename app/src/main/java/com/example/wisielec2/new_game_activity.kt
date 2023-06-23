package com.example.wisielec2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class new_game_activity : AppCompatActivity() {
    private val gameManager = GameManager()
    private lateinit var wordTextView: TextView
    private lateinit var GuessedLetters: TextView
    private lateinit var imageView: ImageView
    private lateinit var gameLostTextView: TextView
    private lateinit var gameWonTextView: TextView
    private lateinit var underscoreWord: String
    private lateinit var selectedWord: String
    private lateinit var tries_counter: TextView
    private var tries = 0

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

    private fun checkLetter(letter: Char) {
        if (selectedWord.contains(letter, ignoreCase = true)) {
            val sb = StringBuilder(underscoreWord)
            for (i in selectedWord.indices) {
                if (selectedWord[i].equals(letter, ignoreCase = true)) {
                    sb[i] = letter
                }
            }
            underscoreWord = sb.toString()
            wordTextView.text = underscoreWord
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_game)

        wordTextView = findViewById(R.id.wordTextView)

        selectedWord = randomWordPicker()
        generateUnderscores(selectedWord)
        wordTextView.text = underscoreWord

        val letterA: Button = findViewById(R.id.button16)
        letterA.setOnClickListener {
            checkLetter('A')
        }

        val letterB: Button = findViewById(R.id.button28)
        letterB.setOnClickListener {
            checkLetter('B')
        }

        val letterQ: Button = findViewById(R.id.button3)
        letterQ.setOnClickListener {
            checkLetter('Q')
        }

        val letterW: Button = findViewById(R.id.button4)
        letterW.setOnClickListener {
            checkLetter('W')
        }

        val letterE: Button = findViewById(R.id.button7)
        letterE.setOnClickListener {
            checkLetter('E')
        }

        val letterR: Button = findViewById(R.id.button8)
        letterR.setOnClickListener {
            checkLetter('R')
        }

        val letterT: Button = findViewById(R.id.button9)
        letterT.setOnClickListener {
            checkLetter('T')
        }

        val letterY: Button = findViewById(R.id.button10)
        letterY.setOnClickListener {
            checkLetter('Y')
        }

        val letterU: Button = findViewById(R.id.button11)
        letterU.setOnClickListener {
            checkLetter('Q')
        }

        val letterI: Button = findViewById(R.id.button13)
        letterI.setOnClickListener {
            checkLetter('I')
        }

        val letterO: Button = findViewById(R.id.button14)
        letterO.setOnClickListener {
            checkLetter('O')
        }

        val letterP: Button = findViewById(R.id.button15)
        letterP.setOnClickListener {
            checkLetter('P')
        }

        val letterS: Button = findViewById(R.id.button17)
        letterS.setOnClickListener {
            checkLetter('S')
        }

        val letterD: Button = findViewById(R.id.button18)
        letterD.setOnClickListener {
            checkLetter('D')
        }

        val letterF: Button = findViewById(R.id.button19)
        letterF.setOnClickListener {
            checkLetter('F')
        }

        val letterG: Button = findViewById(R.id.button20)
        letterG.setOnClickListener {
            checkLetter('G')
        }

        val letterH: Button = findViewById(R.id.button21)
        letterH.setOnClickListener {
            checkLetter('H')
        }

        val letterJ: Button = findViewById(R.id.button22)
        letterJ.setOnClickListener {
            checkLetter('J')
        }

        val letterK: Button = findViewById(R.id.button23)
        letterK.setOnClickListener {
            checkLetter('K')
        }

        val letterL: Button = findViewById(R.id.button24)
        letterL.setOnClickListener {
            checkLetter('L')
        }

        val letterZ: Button = findViewById(R.id.button25)
        letterZ.setOnClickListener {
            checkLetter('Z')
        }

        val letterX: Button = findViewById(R.id.button26)
        letterX.setOnClickListener {
            checkLetter('X')
        }

        val letterC: Button = findViewById(R.id.button27)
        letterC.setOnClickListener {
            checkLetter('C')
        }

        val letterV: Button = findViewById(R.id.button29)
        letterV.setOnClickListener {
            checkLetter('V')
        }

        val letterN: Button = findViewById(R.id.button30)
        letterN.setOnClickListener {
            checkLetter('N')
        }

        val letterM: Button = findViewById(R.id.button31)
        letterM.setOnClickListener {
            checkLetter('M')
        }






    }

}
