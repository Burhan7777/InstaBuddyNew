package com.pzbdownloaders.instabuddy.main_screen.domain.util

sealed class GetSearchResults<T>(val data: T, val message: String? = null, responseNumber: Int) {
    class Success<T>(data: T, message: String?, responseNumber: Int) :
        GetSearchResults<T>(data, message, responseNumber)

    class Error<T>(data: T, message: String?) : GetSearchResults<T>(data, message, 0)

    //  class TImeOut<T>(data: T, message: String?) : GetSearchResults<T>(data, message)
    //  class IsLoading<T>(data: T, message: String?) : GetSearchResults<T>(data, message)
    class SocketTimeOutException<T>(data: T, message: String?) :
        GetSearchResults<T>(data, message, 0)
}