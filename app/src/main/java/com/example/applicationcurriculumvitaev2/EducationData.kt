package com.example.applicationcurriculumvitaev2

import androidx.annotation.DrawableRes
import kotlin.random.Random

data class EducationData
    (
    val companyname_ed: String,
    @DrawableRes
    val companyimage_ed: Int,
    val companyaddress_ed: String,
    val companystartdate_ed: String,
    val companyenddate_ed: String
) {
    companion object {
        @JvmField
        val C_NAMES = arrayOf("AMAZON", "FACEBOOK", "LINKEDIN", "GOOGLE", "MICROSOFT", "ESPRIT")

        @JvmField
        val C_ADDRESS = arrayOf("TUNISIA", "USA")

        @JvmField
        val C_IMAGES = arrayOf(
            R.drawable.ic_logo_esprit,
            R.drawable.ic_logo_google,
            R.drawable.ic_logo_microsoft,
            R.drawable.ic_logo_facebook,
            R.drawable.ic_logo_amazon,
            R.drawable.ic_logo_linkedin
        )

        @JvmField
        val C_STARTDATE = arrayOf(
            "Today", "19/12/2020", "2021-10-29",
            "2021-11-01",
            "2021-11-12",
            "2021-11-24"
        )

        @JvmField
        val C_ENDDATE = arrayOf(
            "Today", "19/12/2020", "2021-10-29",
            "2021-11-01",
            "2021-11-12",
            "2021-11-24"
        )

        @JvmStatic
        fun genRandomCompanies(n: Int): ArrayList<EducationData> {
            val educationArray = ArrayList<EducationData>(n)
            for (i in 1..n) {
                educationArray.add(
                    EducationData(
                        C_NAMES[Random.nextInt(C_NAMES.size)],
                        C_IMAGES[Random.nextInt(C_IMAGES.size)],
                        C_ADDRESS[Random.nextInt(C_ADDRESS.size)],
                        C_STARTDATE[Random.nextInt(C_STARTDATE.size)],
                        C_ENDDATE[Random.nextInt(C_ENDDATE.size)]
                    )
                )
            }
            return educationArray
        }


    }
}
