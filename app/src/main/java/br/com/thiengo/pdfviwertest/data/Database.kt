package br.com.thiengo.pdfviwertest.data

import br.com.thiengo.pdfviwertest.R
import br.com.thiengo.pdfviwertest.domain.Doc

class Database {
    companion object{
        fun getDocs() = listOf(
                Doc(R.drawable.kotlin_bg, "Kotlin", 194),
                Doc(R.drawable.java_bg, "Java", 670),
                Doc(R.drawable.python_bg, "Python", 1538),
                Doc(R.drawable.haskell_bg, "Haskell", 503),
                Doc(R.drawable.scala_bg, "Scala", 547)
            )
    }
}
