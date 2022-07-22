package tech.cordona.customer.persistence.personaldata

import tech.cordona.customer.model.PersonalData

interface PersonalDataService {
	fun save(personalData: PersonalData): PersonalData
}