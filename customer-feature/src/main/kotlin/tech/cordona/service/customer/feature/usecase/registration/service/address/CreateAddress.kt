package tech.cordona.service.customer.feature.usecase.registration.service.address

import org.springframework.transaction.annotation.Transactional
import tech.cordona.service.customer.feature.annotation.UseCaseService
import tech.cordona.service.customer.feature.usecase.registration.dto.CreateAddressRequest
import tech.cordona.service.customer.feature.usecase.registration.service.city.SaveCity
import tech.cordona.service.customer.feature.usecase.registration.service.country.SaveCountry
import tech.cordona.service.customer.feature.usecase.registration.service.zipcode.SaveZipCode
import tech.cordona.service.customer.model.address.Address

@UseCaseService
@Transactional(readOnly = false)
class CreateAddress(
	private val saveCountry: SaveCountry,
	private val saveCity: SaveCity,
	private val saveZipCode: SaveZipCode,
	private val saveAddress: SaveAddress
) {
	operator fun invoke(request: CreateAddressRequest): Address {
		val country = saveCountry(request.country)
		val city = saveCity(country, request.city)
		val zipCode = saveZipCode(city, request.zipCode)
		return saveAddress(
			Address(
				customer = request.customer,
				businessID = request.businessID,
				country = country,
				city = city,
				zipCode = zipCode,
				streetNo = request.streetNo,
				streetName = request.streetName,
				entrance = request.entrance,
				floorNo = request.floorNo,
				apartmentNo = request.apartmentNo
			)
		)
	}
}