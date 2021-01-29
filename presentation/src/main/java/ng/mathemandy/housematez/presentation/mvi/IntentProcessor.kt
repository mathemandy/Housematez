package ng.mathemandy.housematez.presentation.mvi

import kotlinx.coroutines.flow.Flow

interface IntentProcessor<out R : ViewResult> {
    fun intentToResult(viewIntent: ViewIntent): Flow<R>
}

class InvalidViewIntentException(private val viewIntent: ViewIntent) : IllegalArgumentException() {
    override val message: String?
        get() = "Invalid intent $viewIntent"
}
