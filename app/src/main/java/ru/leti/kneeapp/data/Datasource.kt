package ru.leti.kneeapp.data

import android.content.Context
import ru.leti.kneeapp.R
import ru.leti.kneeapp.util.SharedPreferencesProvider


class Datasource {
    fun getExercisesList(context: Context): List<Training> {
        val sharedPreferencesProvider = SharedPreferencesProvider(context)
        val sharedPreferences = sharedPreferencesProvider.getEncryptedSharedPreferences()

        return listOf(
            Training(
                R.string.exercise_1_1_name,
                R.string.exercise_1_1_explanation,
                R.drawable.preview1_1,
                sharedPreferences.getString(
                    "exercise1_1_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise1_1,
                null
            ),
            Training(
                R.string.exercise_1_2_name,
                R.string.exercise_1_2_explanation,
                R.drawable.preview1_2,
                sharedPreferences.getString(
                    "exercise1_2_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise1_2_1,
                R.drawable.exercise1_2_2
            ),
            Training(
                R.string.exercise_1_3_name,
                R.string.exercise_1_3_explanation,
                R.drawable.preview1_3,
                sharedPreferences.getString(
                    "exercise1_3_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise1_3_1,
                R.drawable.exercise1_3_2
            ),
            Training(
                R.string.exercise_2_1_name,
                R.string.exercise_2_1_explanation,
                R.drawable.preview2_1,
                sharedPreferences.getString(
                    "exercise2_1_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise2_1_1,
                null
            ),
            Training(
                R.string.exercise_3_1_name,
                R.string.exercise_3_1_explanation,
                R.drawable.preview3_1,
                sharedPreferences.getString(
                    "exercise3_1_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise3_1_1,
                null
            ),
            Training(
                R.string.exercise_3_2_name,
                R.string.exercise_3_2_explanation,
                R.drawable.preview3_2,
                sharedPreferences.getString(
                    "exercise3_2_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise3_2_1,
                null
            ),
            Training(
                R.string.exercise_3_3_name,
                R.string.exercise_3_3_explanation,
                R.drawable.preview3_3,
                sharedPreferences.getString(
                    "exercise3_3_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise3_3_1,
                null
            ),
            Training(
                R.string.exercise_4_1_name,
                R.string.exercise_4_1_explanation,
                R.drawable.preview4_1,
                sharedPreferences.getString(
                    "exercise4_1_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise4_1_1,
                null
            ),
            Training(
                R.string.exercise_4_2_1_name,
                R.string.exercise_4_2_1_explanation,
                R.drawable.preview4_2_1,
                sharedPreferences.getString(
                    "exercise4_2_1_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise4_2_1,
                null
            ),
            Training(
                R.string.exercise_4_2_2_name,
                R.string.exercise_4_2_2_explanation,
                R.drawable.preview4_2_2,
                sharedPreferences.getString(
                    "exercise4_2_2_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise4_2_2,
                null
            ),
            Training(
                R.string.exercise_4_2_3_name,
                R.string.exercise_4_2_3_explanation,
                R.drawable.preview4_2_3,
                sharedPreferences.getString(
                    "exercise4_2_3_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise4_2_3,
                null
            ),
            Training(
                R.string.exercise_4_3_1_name,
                R.string.exercise_4_3_1_explanation,
                R.drawable.preview4_3_1,
                sharedPreferences.getString(
                    "exercise4_3_1_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise4_3_1,
                null
            ),
            Training(
                R.string.exercise_4_3_2_name,
                R.string.exercise_4_3_2_explanation,
                R.drawable.preview4_3_2,
                sharedPreferences.getString(
                    "exercise4_3_2_pass_mark",
                    context.getString(R.string.not_allowed_to)
                )!!,
                R.drawable.exercise4_3_2,
                null
            )
        )
    }
}