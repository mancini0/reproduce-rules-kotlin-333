package com.example


class FakeConnection : AutoCloseable {
    override fun close() {
        println("closed!")
    }
    fun doWork(): Int {
        return 42
    }
}

class SomeLib {
    fun doFoo() {
        val conn = FakeConnection();
        conn.use {
            conn.doWork()
        }
    }
}
