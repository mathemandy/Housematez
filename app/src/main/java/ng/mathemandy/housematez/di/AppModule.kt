package ng.mathemandy.housematez.di

import ng.mathemandy.housematez.utils.ExceptionHandler
import com.google.gson.Gson
import org.koin.dsl.module

val appModule = module {
    single { Gson() }
    single(createdAtStart = true) { ExceptionHandler() }
}