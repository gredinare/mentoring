package com.gredi.manual_dependency_injection

object AppModule {
    val repository by lazy { Repository(DataSource()) }

    fun provideDataSource() = DataSource()
    fun provideRepository() = Repository(provideDataSource())
}