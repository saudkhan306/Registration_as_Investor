package com.themmit.registration.investor.helpers

import android.content.Context

class Auths {

    companion object {
        fun isLoggedIn(context: Context): Boolean? {
            return SharedPreference.getValueAsBool(context, "is_loggedIn")
        }

        fun getLogginType(context: Context): String? {
            return SharedPreference.getValueAsString(context, "login_type")
        }
    }

}