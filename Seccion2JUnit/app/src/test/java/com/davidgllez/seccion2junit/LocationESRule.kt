package com.davidgllez.seccion2junit

import org.junit.rules.TestRule
import org.junit.runner.Description
import org.junit.runners.model.Statement

/**
 * Created by davidgonzalez on 18/02/23
 */
class LocationESRule: TestRule {

    var assertions: Assertions? = null

    override fun apply(base: Statement?, description: Description): Statement {
        return object : Statement(){
            override fun evaluate() {
                assertions = Assertions()
                assertions?.setLocation("ES")
                try {
                    base?.evaluate()
                } finally {
                    assertions = null
                }
            }
        }
    }
}