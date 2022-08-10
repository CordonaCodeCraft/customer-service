package tech.cordona.service.customer.model.personaldata

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.customer.Customer
import tech.cordona.service.customer.model.reference.CustomerID
import java.time.LocalDate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "PersonalData")
@Table(name = "personal_data")
class PersonalData(
	@OneToOne
	@MapsId
	val customer: Customer,
	@Column(nullable = false)
	val firstName: String,
	@Column(nullable = false)
	val middleName: String,
	@Column(nullable = false)
	val lastName: String,
	@Column(nullable = false)
	val age: Int,
	@Column(nullable = false)
	val birthDate: LocalDate,
	@Column(unique = true, nullable = false)
	val personalNo: String,
	@Column(unique = true, nullable = false)
	val passportNo: String,
	businessID: CustomerID
) : BaseRelationalUUIDEntity(businessID.value)