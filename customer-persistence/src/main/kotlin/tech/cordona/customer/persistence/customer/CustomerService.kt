package tech.cordona.customer.persistence.customer

import tech.cordona.customer.model.Customer

interface CustomerService {
	fun save(customer: Customer): Customer
}