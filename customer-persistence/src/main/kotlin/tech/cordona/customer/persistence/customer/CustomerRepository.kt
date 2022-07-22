package tech.cordona.customer.persistence.customer

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.customer.model.Customer
import java.util.*

interface CustomerRepository : JpaRepository<Customer, UUID>