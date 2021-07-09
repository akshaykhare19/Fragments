package com.learning.learningfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.learning.learningfragments.fragments.Fragment1
import com.learning.learningfragments.fragments.Fragment2

class MainActivity : AppCompatActivity() {

    lateinit var firstFragmentBtn:Button
    lateinit var secondFragmentBtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragmentBtn = findViewById(R.id.fragment_1_btn)
        secondFragmentBtn = findViewById(R.id.fragment_2_btn)

        firstFragmentBtn.setOnClickListener {
            replaceFragment(Fragment1())
        }

        secondFragmentBtn.setOnClickListener {
            replaceFragment(Fragment2())
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
                .beginTransaction()
                .replace(R.id.frame_layout, fragment)
                .commit()

//        Alternate method
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame_layout, fragment)
//        fragmentTransaction.commit()

    }
}