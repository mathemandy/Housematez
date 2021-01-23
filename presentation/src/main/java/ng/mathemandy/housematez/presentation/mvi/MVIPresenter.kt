package ng.mathemandy.housematez.presentation.mvi

interface MVIPresenter<SC : ScreenState> {
    fun processIntent(intent: ViewIntent)
    fun <VS : ViewState> subscribe(
        component: Subscriber<VS>,
        transform: StateTransform<SC, VS>
    )
}
