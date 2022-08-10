package tech.cordona.service.customer.feature.usecase.registration.service.city

import naturalIDGenerator
import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.repository.CityRepository
import tech.cordona.service.customer.model.city.City
import tech.cordona.service.customer.model.country.Country
import tech.cordona.service.customer.model.reference.NaturalID

@UseCaseService
@Transactional(readOnly = false)
class SaveCity(private val repository: CityRepository) {
	operator fun invoke(country: Country, cityName: String) = repository.save(
		City(
			name = cityName,
			country = country,
			businessID = NaturalID(naturalIDGenerator())
		)
	)
}