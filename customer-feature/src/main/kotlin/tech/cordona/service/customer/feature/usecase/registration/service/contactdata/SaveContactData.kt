package tech.cordona.service.customer.feature.usecase.registration.service.contactdata

import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.ContactDataRepository
import tech.cordona.service.customer.model.contactdata.ContactData

@UseCaseService
@Transactional(readOnly = false)
class SaveContactData(private val repository: ContactDataRepository) {
	operator fun invoke(contactData: ContactData): ContactData = repository.save(contactData)
}