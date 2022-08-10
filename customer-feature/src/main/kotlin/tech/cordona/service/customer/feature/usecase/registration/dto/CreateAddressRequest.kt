package tech.cordona.service.customer.feature.usecase.registration.dto

import tech.cordona.service.customer.model.customer.Customer
import tech.cordona.service.customer.model.reference.CustomerID

data class CreateAddressRequest(
	val customer: Customer,
	val businessID: CustomerID,
	val country: String,
	val city: String,
	val zipCode: Int,
	val streetName: String,
	val streetNo: Int,
	val entrance: String,
	val floorNo: Int,
	val apartmentNo: Int
)
