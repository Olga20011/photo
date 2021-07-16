package com.example.registration

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.ButtonBarLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CoursesActivity : AppCompatActivity() {
    lateinit var rvCourses: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coursesactivity)

    }
    fun displayCourses(){
        var courseList= listOf<Courses>(
            Courses("Mobile Development","AND 101","Native Android Development","John Owuor"),
            Courses("Javascript","BBC 221","The oldest language in existance","Purity Maina"),
            Courses("Python","ERF 555","Backend programming language","James Mwai")

        )
        rvCourses=findViewById(R.id.rvCourses)
        var coursesAdapter = courses_recyclerview_adapter(courseList)
        rvCourses.layoutManager=LinearLayoutManager(baseContext)
        rvCourses.adapter=coursesAdapter

    }
}