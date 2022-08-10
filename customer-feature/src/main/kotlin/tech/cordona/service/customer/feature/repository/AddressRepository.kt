package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.address.Address
import java.util.*

interface AddressRepository : JpaRepository<Address, UUID>