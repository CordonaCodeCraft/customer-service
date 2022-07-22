package tech.cordona.customer.persistence.contactdata

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.customer.model.ContactData
import java.util.*

interface ContactDataRepository : JpaRepository<ContactData, UUID>