package tech.cordona.customer.persistence.personaldata

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.customer.model.PersonalData
import java.util.*

interface PersonalDataRepository : JpaRepository<PersonalData, UUID>