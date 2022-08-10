package tech.cordona.service.customer.feature.repository

import org.springframework.data.jpa.repository.JpaRepository
import tech.cordona.service.customer.model.personaldata.PersonalData
import java.util.*

interface PersonalDataRepository : JpaRepository<PersonalData, UUID>