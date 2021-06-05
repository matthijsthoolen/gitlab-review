package com.github.matthijsthoolen.gitlabreview.services

import com.github.matthijsthoolen.gitlabreview.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
