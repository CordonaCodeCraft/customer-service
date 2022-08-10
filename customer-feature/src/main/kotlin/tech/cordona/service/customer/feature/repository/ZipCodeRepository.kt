package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.zipcode.ZipCode
import java.util.*

interface ZipCodeRepository : JpaRepository<ZipCode, UUID>