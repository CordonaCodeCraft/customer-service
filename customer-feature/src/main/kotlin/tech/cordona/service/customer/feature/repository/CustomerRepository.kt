package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.customer.Customer
import java.util.*

interface CustomerRepository : JpaRepository<Customer, UUID>