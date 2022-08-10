package tech.cordona.service.customer.feature.usecase.registration.dto

import tech.cordona.service.customer.model.customer.Customer
import tech.cordona.service.customer.model.reference.CustomerID

data class SavedCustomerData(
	val customer: Customer,
	val businessID: CustomerID
)
