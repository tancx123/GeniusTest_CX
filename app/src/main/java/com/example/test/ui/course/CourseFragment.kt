package com.example.test.ui.course

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.test.R

class CourseFragment : Fragment() {

    private lateinit var courseViewModel: CourseViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        courseViewModel =
            ViewModelProviders.of(this).get(CourseViewModel::class.java)
        return inflater.inflate(R.layout.fragment_course, container, false)
        /*val textView: TextView = root.findViewById(R.id.tv_course)
        courseViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root*/
    }
}