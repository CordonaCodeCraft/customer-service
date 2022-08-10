package tech.cordona.service.customer.feature.usecase.registration.service.country

import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.CountryRepository
import tech.cordona.service.customer.model.country.Country

@UseCaseService
@Transactional(readOnly = true)
class FindCountryByName(private val repository: CountryRepository) {
	operator fun invoke(countryName: String): Country? = repository.findCountryByName(countryName)
}