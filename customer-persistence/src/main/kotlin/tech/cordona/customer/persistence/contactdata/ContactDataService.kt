package tech.cordona.customer.persistence.contactdata

import tech.cordona.customer.model.ContactData

interface ContactDataService {
	fun save(contactData: ContactData): ContactData
}