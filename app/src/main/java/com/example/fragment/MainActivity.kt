package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFragment1.setOnClickListener {
            replaceFragment(Fragment1())

        }
        binding.btnFragment2.setOnClickListener {
            replaceFragment(Fragment2())

        }

    }

    private fun replaceFragment(fragment: Fragment) {
       val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.FrameLayout,fragment)
        fragmentTransaction.commit()
    }
}