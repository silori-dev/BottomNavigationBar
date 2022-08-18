package com.xtremedevx.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.xtremedevx.bottomnavbar.screen.HomeScreen
import com.xtremedevx.bottomnavbar.screen.ProfileScreen
import com.xtremedevx.bottomnavbar.screen.SettingsScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(
            route = BottomBarScreen.Home.route,
        ) { HomeScreen() }
        composable(
            route = BottomBarScreen.Profile.route,
        ) { ProfileScreen() }
        composable(
            route = BottomBarScreen.Setting.route,
        ) { SettingsScreen() }
    }

}