package tech.cordona.service.customer.api.dto

import java.time.LocalDate

data class RegisterCustomerRequest(
	val firstName: String,
	val middleName: String,
	val lastName: String,
	val age: Int,
	val birthDate: LocalDate,
	val personalNo: String,
	val passportNo: String,
	val email: String,
	val phoneNumber: String,
	val country: String,
	val city: String,
	val zipCode: Int,
	val streetName: String,
	val streetNo: Int,
	val entrance: String,
	val floorNo: Int,
	val apartmentNo: Int
)
