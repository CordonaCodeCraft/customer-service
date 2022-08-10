package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.country.Country
import java.util.*

interface CountryRepository : JpaRepository<Country, UUID> {
	fun findCountryByName(name: String): Country?
}