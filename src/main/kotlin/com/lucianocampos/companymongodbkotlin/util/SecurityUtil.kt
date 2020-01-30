package com.lucianocampos.companymongodbkotlin.util

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

class SecurityUtil {

    fun makeBCrypt(password: String): String = BCryptPasswordEncoder().encode(password)
}
