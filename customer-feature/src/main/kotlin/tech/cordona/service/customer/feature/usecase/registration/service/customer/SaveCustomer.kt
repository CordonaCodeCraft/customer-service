package tech.cordona.service.customer.feature.usecase.registration.service.customer

import naturalIDGenerator
import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.CustomerRepository
import tech.cordona.service.customer.feature.usecase.registration.dto.SavedCustomerData
import tech.cordona.service.customer.model.customer.Customer
import tech.cordona.service.customer.model.reference.CustomerID

@UseCaseService
@Transactional(readOnly = false)
class SaveCustomer(private val repository: CustomerRepository) {
	operator fun invoke(personalNo: String, passportNo: String): SavedCustomerData {
		val customerID = CustomerID(naturalIDGenerator(personalNo, passportNo))
		val savedCustomer = repository.save(Customer(customerID))
		return SavedCustomerData(customer = savedCustomer, businessID = customerID)
	}
}