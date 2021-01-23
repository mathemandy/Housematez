package com.ezike.tobenna.housematez.presentation_android

import androidx.lifecycle.ViewModel
import ng.mathemandy.tobenna.housematez.presentation.mvi.MVIPresenter
import ng.mathemandy.tobenna.housematez.presentation.mvi.ScreenState
import ng.mathemandy.tobenna.housematez.presentation.mvi.StateMachine
import ng.mathemandy.tobenna.housematez.presentation.mvi.StateTransform
import ng.mathemandy.tobenna.housematez.presentation.mvi.Subscriber
import ng.mathemandy.tobenna.housematez.presentation.mvi.ViewIntent
import ng.mathemandy.tobenna.housematez.presentation.mvi.ViewResult
import ng.mathemandy.tobenna.housematez.presentation.mvi.ViewState

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
