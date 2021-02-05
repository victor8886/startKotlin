package com.github.victor8886.startkotlin.services

import com.github.victor8886.startkotlin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
