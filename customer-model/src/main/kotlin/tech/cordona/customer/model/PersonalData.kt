package tech.cordona.customer.model

import BaseRelationalEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "PersonalData")
@Table(name = "personal_data")
class PersonalData(
	@Column(nullable = false)
	val firstName: String,
	@Column(nullable = false)
	val middleName: String,
	@Column(nullable = false)
	val lastName: String,
	@Column(nullable = false)
	val age: Int,
	@Column(unique = true, nullable = false)
	val passportNo: String,
	@Column(unique = true, nullable = false)
	val personalId: String,
	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	val customer: Customer,
	customerId: String
) : BaseRelationalEntity(customerId)