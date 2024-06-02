package com.imnidasoftware.newsmultiplatform.db

import app.cash.sqldelight.db.SqlDriver
import app.cash.sqldelight.driver.jdbc.sqlite.JdbcSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver? {
        return JdbcSqliteDriver(
            url = "jdbc:sqlite:NewsMultiplatformDatabase.db",
            schema = NewsMultiplatformDatabase.Schema
        )
    }

}