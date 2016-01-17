package com.github.rujews.plugins

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by 飞雪无情 on 16-1-17.
 */
class Ex53CustomPlugin implements Plugin<Project>{

    @Override
    void apply(Project target) {
        target.task('ex53CustomTask') << {
            println "这是一个通过自定义插件方式创建的任务"
        }
    }
}
