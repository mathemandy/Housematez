package ng.mathemandy.housematez.presentation_android

import androidx.lifecycle.ViewModel
import ng.mathemandy.housematez.presentation.mvi.*

abstract class ComponentManager<S : ScreenState, out R : ViewResult>(
    private val stateMachine: StateMachine<S, R>
) : ViewModel(), MVIPresenter<S> {

    override fun <VS : ViewState> subscribe(
        component: Subscriber<VS>,
        transform: StateTransform<S, VS>
    ) {
        stateMachine.subscribe(component, transform)
    }

    override fun processIntent(intent: ViewIntent) {
        stateMachine.processIntent(intent)
    }

    fun unsubscribeAll() {
        stateMachine.unSubscribeComponents()
    }

    override fun onCleared() {
        stateMachine.unSubscribe()
    }
}
