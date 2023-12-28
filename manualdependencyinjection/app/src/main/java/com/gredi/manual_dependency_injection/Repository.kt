package com.gredi.manual_dependency_injection

class Repository(val dataSource: DataSource) {
    fun getData() = dataSource.getData()
}