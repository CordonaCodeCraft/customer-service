package tech.cordona.service.customer.feature.usecase.registration.service.zipcode

import naturalIDGenerator
import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.ZipCodeRepository
import tech.cordona.service.customer.model.city.City
import tech.cordona.service.customer.model.reference.NaturalID
import tech.cordona.service.customer.model.zipcode.ZipCode

@UseCaseService
@Transactional(readOnly = false)
class SaveZipCode(private val repository: ZipCodeRepository) {
	operator fun invoke(city: City, zipCode: Int): ZipCode = repository.save(
		ZipCode(
			city = city,
			code = zipCode,
			naturalId = NaturalID(naturalIDGenerator())
		)
	)
}