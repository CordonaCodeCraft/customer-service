package tech.cordona.service.customer.feature.usecase.registration.service.country

import naturalIDGenerator
import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.CountryRepository
import tech.cordona.service.customer.model.country.Country
import tech.cordona.service.customer.model.reference.NaturalID

@UseCaseService
@Transactional(readOnly = false)
class SaveCountry(
	private val repository: CountryRepository,
	private val findCountryByName: FindCountryByName,
) {
	operator fun invoke(countryName: String) =
		findCountryByName(countryName)
			?: repository.save(
				Country(
					name = countryName,
					businessID = NaturalID(naturalIDGenerator())
				)
			)
}