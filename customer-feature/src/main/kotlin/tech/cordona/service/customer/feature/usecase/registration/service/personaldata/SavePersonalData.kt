package tech.cordona.service.customer.feature.usecase.registration.service.personaldata

import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.PersonalDataRepository
import tech.cordona.service.customer.model.personaldata.PersonalData

@UseCaseService
@Transactional(readOnly = false)
class SavePersonalData(private val repository: PersonalDataRepository) {
	operator fun invoke(personalData: PersonalData) = repository.save(personalData)
}