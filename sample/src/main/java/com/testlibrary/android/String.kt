package com.testlibrary.android

fun String?.hasValues() = !this.isNullOrEmpty()

fun String?.hasNoValues() = this.isNullOrEmpty()