package com.example.weatherforecast

open class BasePresenter<View : BaseView> {
    var view: View? = null

    fun attachView(view: View) {
        this.view = view
        onViewAttached()
    }

    open fun onViewAttached() {}

    fun destroyView() {
        this.view = null
    }

}