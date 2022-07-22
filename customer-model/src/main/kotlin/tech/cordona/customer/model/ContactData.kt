package tech.cordona.customer.model

import BaseRelationalEntity
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "ContactData")
@Table(name = "contact_data")
class ContactData(
	@Column(unique = true, nullable = false)
	val phoneNumber: String,
	@Column(unique = true, nullable = false)
	val email: String,
	@OneToOne
	@MapsId
	@JoinColumn(name = "id")
	val customer: Customer,
	customerId: String
) : BaseRelationalEntity(customerId)