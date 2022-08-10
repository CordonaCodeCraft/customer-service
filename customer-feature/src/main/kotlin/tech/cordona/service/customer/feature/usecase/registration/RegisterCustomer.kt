package tech.cordona.service.customer.feature.usecase.registration

import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.api.dto.RegisterCustomerRequest
import tech.cordona.service.customer.feature.annotation.UseCase
import tech.cordona.service.customer.feature.createAddressRequest
import tech.cordona.service.customer.feature.createContactData
import tech.cordona.service.customer.feature.createPersonalData
import tech.cordona.service.customer.feature.usecase.registration.dto.SavedCustomerData
import tech.cordona.service.customer.feature.usecase.registration.service.address.CreateAddress
import tech.cordona.service.customer.feature.usecase.registration.service.contactdata.SaveContactData
import tech.cordona.service.customer.feature.usecase.registration.service.customer.SaveCustomer
import tech.cordona.service.customer.feature.usecase.registration.service.personaldata.SavePersonalData

@UseCase
@Transactional(readOnly = false)
class RegisterCustomer(
	private val saveCustomer: SaveCustomer,
	private val savePersonalData: SavePersonalData,
	private val saveContactData: SaveContactData,
	private val createAddress: CreateAddress
) {
	operator fun invoke(registrationRequest: RegisterCustomerRequest): SavedCustomerData {
		val savedCustomerData = saveCustomer(registrationRequest.personalNo, registrationRequest.passportNo)
		savePersonalData(createPersonalData(savedCustomerData, registrationRequest))
		saveContactData(createContactData(savedCustomerData, registrationRequest))
		createAddress(createAddressRequest(savedCustomerData, registrationRequest))
		return savedCustomerData
	}
}