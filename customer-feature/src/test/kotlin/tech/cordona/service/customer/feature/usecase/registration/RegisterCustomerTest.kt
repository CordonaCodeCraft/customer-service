package tech.cordona.service.customer.feature.usecase.registration

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import tech.cordona.service.customer.feature.common.annotation.FakerInstance.customerRegistrationRequest
import tech.cordona.service.customer.feature.common.annotation.IntegrationTest
import tech.cordona.service.customer.feature.repository.AddressRepository
import tech.cordona.service.customer.feature.repository.ContactDataRepository
import tech.cordona.service.customer.feature.repository.CustomerRepository
import tech.cordona.service.customer.feature.repository.PersonalDataRepository

@IntegrationTest
internal class RegisterCustomerTest(
	@Autowired private val registerCustomer: RegisterCustomer,
	@Autowired private val customerRepository: CustomerRepository,
	@Autowired private val personalDataRepository: PersonalDataRepository,
	@Autowired private val contactDataRepository: ContactDataRepository,
	@Autowired private val addressRepository: AddressRepository
) {

	@Test
	fun `successfully registers a customer`() {
		val registeredCustomer = registerCustomer(customerRegistrationRequest)

		val naturalID = registeredCustomer.customerID
		val id = registeredCustomer.customer.id!!

		val retrievedCustomer = customerRepository.findById(id).get()
		val retrievedPersonalData = personalDataRepository.findById(id).get()
		val retrievedContactData = contactDataRepository.findById(id).get()
		val retrievedAddress = addressRepository.findById(id).get()

		assertThat(retrievedCustomer).isNotNull
		assertThat(retrievedPersonalData).isNotNull
		assertThat(retrievedContactData).isNotNull
		assertThat(retrievedAddress).isNotNull

		assertThat(retrievedCustomer.naturalId).isEqualTo(naturalID.value)
		assertThat(retrievedPersonalData.naturalId).isEqualTo(naturalID.value)
		assertThat(retrievedContactData.naturalId).isEqualTo(naturalID.value)
		assertThat(retrievedAddress.naturalId).isEqualTo(naturalID.value)
	}

}