package com.example.diary.navigation
import com.example.diary.util.Constants.WRITE_SCREEN_ARG_KEY
sealed class Screen (val route: String){
    object Authentication: Screen(route= "authentication_screen")
    object Home: Screen(route= "home_screen")
    object Write: Screen(route= "write_screen?WRITE_SCREEN_ARG_KEY={diaryId}"){
        fun passDiaryID(diaryId: String) = "write_screen?$WRITE_SCREEN_ARG_KEY=$diaryId"
    }
}
