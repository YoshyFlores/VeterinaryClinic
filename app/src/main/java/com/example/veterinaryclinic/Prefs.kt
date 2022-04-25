package com.example.veterinaryclinic

import android.content.Context

class Prefs(val context: Context) {

    val SHARED_NAME = "Mydatabase"

    //    Keys for Shared Preferences of the Veterinarian
    val SHARED_VETERINARIAN_NAME = "veterinarian_name"
    val SHARED_VETERINARIAN_PHONE = "veterinarian_phone"
    val SHARED_VETERINARIAN_SPECIALTY = "veterinarian_specialty"
    val SHARED_VETERINARIAN_WORK_CLINIC = "veterinarian_work_clinic"

    //    Keys for Shared Preferences of the Pets
    val SHARED_PET_NAME = "pet_name"
    val SHARED_PET_RACE = "pet_race"
    val SHARED_PET_AGE = "pet_age"
    val SHARED_PET_NAME_OWNER = "pet_name_owner"

    //  Keys for Shared Preferences of the Vaccines
    val SHARED_VACCINE_NAME = "vaccine_name"
    val SHARED_VACCINE_DESCRIPTION = "vaccine_description"
    val SHARED_VACCINE_PRICE = "vaccine_price"

    //  Keys for Shared Preferences of the Clinic Information
    val SHARED_CLINIC_NAME = "clinic_name"
    val SHARED_CLINIC_ADDRESS = "clinic_address"
    val SHARED_CLINIC_PHONE = "clinic_phone"

    val storage = context.getSharedPreferences(SHARED_NAME,0)

    fun saveNameVeterinarian(name: String){
        val editor = storage.edit()
        editor.putString(SHARED_VETERINARIAN_NAME,name)
        editor.apply()
    }

    fun getNameVeterinarian(): String {
        return storage.getString(SHARED_VETERINARIAN_NAME,"Doc. Yosselin Flores")!!
    }

    fun savePhoneVeterinarian(phone: String){
        val editor = storage.edit()
        editor.putString(SHARED_VETERINARIAN_PHONE,phone)
        editor.apply()
    }

    fun getPhoneVeterinarian(): String{
        return storage.getString(SHARED_VETERINARIAN_PHONE,"0000-0000")!!
    }

    fun saveSpecialtyVeterinarian(specialty: String){
        val editor = storage.edit()
        editor.putString(SHARED_VETERINARIAN_SPECIALTY,specialty)
        editor.apply()
    }

    fun getSpecialtyVeterinarian(): String{
        return storage.getString(SHARED_VETERINARIAN_SPECIALTY,"Medico Veterinario General")!!
    }

    fun saveWorkClinicVeterinarian(workClinic: String){
        val editor = storage.edit()
        editor.putString(SHARED_VETERINARIAN_WORK_CLINIC,workClinic)
        editor.apply()
    }

    fun getWorkClinicVeterinarian(): String{
        return storage.getString(SHARED_VETERINARIAN_WORK_CLINIC,"Clinica Veterinaria Santa Rosa de Lima")!!
    }

    fun saveNamePet(namePet: String){
        val editor = storage.edit()
        editor.putString(SHARED_PET_NAME,namePet)
        editor.apply()
    }

    fun getNamePet(): String{
        return storage.getString(SHARED_PET_NAME,"Doky")!!
    }

    fun saveRacePet(racePet: String) {
        val editor = storage.edit()
        editor.putString(SHARED_PET_RACE, racePet)
        editor.apply()
    }

    fun getRacePet() : String {
        return storage.getString(SHARED_PET_RACE,"Pastor Aleman")!!
    }

    fun saveAgePet(agePet: String){
        val editor = storage.edit()
        editor.putString(SHARED_PET_AGE,agePet)
        editor.apply()
    }

    fun getAgePet(): String{
        return storage.getString(SHARED_PET_AGE,"2 Meses")!!
    }

    fun savePetNameOwner(namePetOwner: String){
        val editor = storage.edit()
        editor.putString(SHARED_PET_NAME_OWNER,namePetOwner)
        editor.apply()
    }

    fun getPetNameOwner(): String{
        return storage.getString(SHARED_PET_NAME_OWNER,"Yosselin")!!
    }

    fun saveVaccineName(vaccineName: String){
        val editor = storage.edit()
        editor.putString(SHARED_VACCINE_NAME,vaccineName)
        editor.apply()
    }

    fun getVaccineName(): String{
        return storage.getString(SHARED_VACCINE_NAME,"Parvovirus")!!
    }

    fun saveVaccineDescription(vaccineDescription: String){
        val editor = storage.edit()
        editor.putString(SHARED_VACCINE_DESCRIPTION,vaccineDescription)
        editor.apply()
    }

    fun getVaccineDescription(): String{
        return storage.getString(SHARED_VACCINE_DESCRIPTION,"Vacuna contra el parvovirus")!!
    }

    fun saveVaccinePrice(vaccinePrice: String){
        val editor = storage.edit()
        editor.putString(SHARED_VACCINE_PRICE,vaccinePrice)
        editor.apply()
    }

    fun getVaccinePrice(): String{
        return storage.getString(SHARED_VACCINE_PRICE,"$ 5.00")!!
    }

    fun saveClinicName(clinicName: String){
        val editor = storage.edit()
        editor.putString(SHARED_CLINIC_NAME,clinicName)
        editor.apply()
    }

    fun getClinicName(): String{
        return storage.getString(SHARED_CLINIC_NAME,"Clinica Veterinaria Martinez")!!
    }

    fun saveClinicAddress(clinicAddress: String){
        val editor = storage.edit()
        editor.putString(SHARED_CLINIC_ADDRESS,clinicAddress)
        editor.apply()
    }

    fun getClinicAddress(): String{
        return storage.getString(SHARED_CLINIC_ADDRESS,"Av. Las Mascotas, Santa Rosa de Lima")!!
    }

    fun saveClinicPhone(clinicPhone: String){
        val editor = storage.edit()
        editor.putString(SHARED_CLINIC_PHONE,clinicPhone)
        editor.apply()
    }

    fun getClinicPhone(): String{
        return storage.getString(SHARED_CLINIC_PHONE,"0000-0000")!!
    }
}