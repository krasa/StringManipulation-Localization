package com.github.krasa.stringmanipulationlocalization.services

import com.intellij.openapi.project.Project
import com.github.krasa.stringmanipulationlocalization.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
