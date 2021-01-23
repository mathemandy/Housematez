package ng.mathemandy.housematez.presentation.mvi

interface ViewStateReducer<S : ScreenState, R : ViewResult> {
    fun reduce(previous: S, result: R): S
}
