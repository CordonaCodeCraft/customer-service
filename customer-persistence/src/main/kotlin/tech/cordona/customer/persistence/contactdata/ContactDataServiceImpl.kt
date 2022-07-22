package tech.cordona.customer.persistence.contactdata

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import tech.cordona.customer.model.ContactData

@Service
@Transactional(readOnly = true)
class ContactDataServiceImpl(private val repository: ContactDataRepository) : ContactDataService {
	@Transactional
	override fun save(contactData: ContactData): ContactData = repository.save(contactData)
}