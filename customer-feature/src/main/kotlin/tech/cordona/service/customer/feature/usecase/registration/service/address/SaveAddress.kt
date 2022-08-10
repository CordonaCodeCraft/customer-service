package tech.cordona.service.customer.feature.usecase.registration.service.address

import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.AddressRepository
import tech.cordona.service.customer.model.address.Address

@UseCaseService
@Transactional(readOnly = false)
class SaveAddress(private val repository: AddressRepository) {
	operator fun invoke(address: Address) = repository.save(address)
}