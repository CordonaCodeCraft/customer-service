package tech.cordona.customer.persistence.personaldata

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import tech.cordona.customer.model.PersonalData

@Service
@Transactional(readOnly = true)
class PersonalDataServiceImpl(private val repository: PersonalDataRepository) : PersonalDataService {
	@Transactional
	override fun save(personalData: PersonalData): PersonalData = repository.save(personalData)
}