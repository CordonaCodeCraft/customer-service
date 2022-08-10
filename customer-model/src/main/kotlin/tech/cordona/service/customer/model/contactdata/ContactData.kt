package tech.cordona.service.customer.model.contactdata

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.customer.Customer
import tech.cordona.service.customer.model.reference.CustomerID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "ContactData")
@Table(name = "contact_data")
class ContactData(
	@OneToOne
	@MapsId
	val customer: Customer,
	@Column(unique = true, nullable = false)
	val phoneNumber: String,
	@Column(unique = true, nullable = false)
	val email: String,
	customerID: CustomerID
) : BaseRelationalUUIDEntity(customerID.value)