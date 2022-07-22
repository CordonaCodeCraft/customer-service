package tech.cordona.customer.persistence

import naturalIDGenerator
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.transaction.annotation.Transactional
import tech.cordona.customer.model.ContactData
import tech.cordona.customer.model.Customer
import tech.cordona.customer.model.PersonalData
import tech.cordona.customer.persistence.common.annotation.IntegrationTest
import tech.cordona.customer.persistence.contactdata.ContactDataService
import tech.cordona.customer.persistence.customer.CustomerService
import tech.cordona.customer.persistence.personaldata.PersonalDataService

@IntegrationTest
@ContextConfiguration(
	classes = [
		PersistenceConfig::class
	]
)
class PersistenceTest(
	@Autowired
	private val customerService: CustomerService,
	@Autowired
	private val personalDataService: PersonalDataService,
	@Autowired
	private val contactDataService: ContactDataService
) {

	@Test
	@Transactional
	fun run() {
		val businessID = naturalIDGenerator("8901102234", "9988776655")
		val savedCustomer = customerService.save(Customer(customerId = businessID))
		val savedContactData = contactDataService.save(
			ContactData(
				phoneNumber = "0899921649",
				email = "v.stoevski@gmail.com",
				customer = savedCustomer,
				customerId = businessID
			)
		)

		val savedPersonalData = personalDataService.save(
			PersonalData(
				firstName = "Venelinka",
				middleName = "Brandelinkova",
				lastName = "Hubavelkova",
				age = 20,
				passportNo = "9988776655",
				personalId = "8901102234",
				customer = savedCustomer,
				customerId = businessID
			)
		)
	}
}