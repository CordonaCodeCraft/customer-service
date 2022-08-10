package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.city.City
import java.util.*

interface CityRepository : JpaRepository<City, UUID>