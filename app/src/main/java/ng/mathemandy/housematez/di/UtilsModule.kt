package ng.mathemandy.housematez.di

import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.BuildConfig
import com.orhanobut.logger.FormatStrategy
import com.orhanobut.logger.PrettyFormatStrategy
import org.koin.dsl.module

const val LOG_TAG = "enginebai"

val logModule = module {
    single<AndroidLogAdapter> { (formatStrategy: FormatStrategy) ->
        object : AndroidLogAdapter(formatStrategy) {
            override fun isLoggable(priority: Int, tag: String?): Boolean {
                return BuildConfig.DEBUG && tag == LOG_TAG
            }
        }
    }

    single<FormatStrategy> {
        PrettyFormatStrategy.newBuilder()
            .tag(LOG_TAG)
            .methodCount(3)
            .methodOffset(5) // avoid timber internal stack track
            .build()
    }

//    single<Timber.Tree> { TimberLoggerDebugTree() }
}
