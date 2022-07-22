package tech.cordona.customer.persistence.customer

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import tech.cordona.customer.model.Customer

@Service
@Transactional(readOnly = true)
class CustomerServiceImpl(private val repository: CustomerRepository) : CustomerService {
	@Transactional(readOnly = false)
	override fun save(customer: Customer): Customer = repository.save(customer)
}