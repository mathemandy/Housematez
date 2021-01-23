package ng.mathemandy.housematez.presentation.mvi

/**
 * Represents a type that wants to subscribe to state updates from the [StateMachine]
 */
interface Subscriber<State> {
    fun onNewState(state: State)
}
