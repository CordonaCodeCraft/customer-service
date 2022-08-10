package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.contactdata.ContactData
import java.util.*

interface ContactDataRepository : JpaRepository<ContactData, UUID>