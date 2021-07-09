package com.learning.learningfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.learning.learningfragments.databinding.ActivityMainBinding
import com.learning.learningfragments.fragments.Fragment1
import com.learning.learningfragments.fragments.Fragment2

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.fragment1Btn.setOnClickListener {
            replaceFragment(Fragment1())
        }

        binding.fragment2Btn.setOnClickListener {
            replaceFragment(Fragment2())
        }

    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
                .beginTransaction()
                .replace(R.id.container_view, fragment)
                .commit()

//        Alternate method
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.frame_layout, fragment)
//        fragmentTransaction.commit()

    }
}