package com.themmit.registration.investor.helpers

import android.content.Context
import android.content.SharedPreferences

class SharedPreference {

    companion object {

        private var sharedPref: SharedPreferences? = null

        private val key = "registered_as_investors"
        fun getPreference(context: Context): SharedPreferences? {
            if (sharedPref == null)
                sharedPref = context.getSharedPreferences(key, Context.MODE_PRIVATE)
            return sharedPref
        }

        fun getValueAsBool(context: Context, key: String, defaultVal: Boolean = false): Boolean? {
            return getPreference(context)?.getBoolean(key, defaultVal)
        }

        fun getValueAsString(context: Context, key: String, defaultVal: String = ""): String? {
            return getPreference(context)?.getString(key, defaultVal)
        }

        fun getValueAsInt(context: Context, key: String, defaultVal: Int = -1): Int? {
            return getPreference(context)?.getInt(key, defaultVal)
        }
    }
}