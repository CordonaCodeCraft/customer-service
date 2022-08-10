package tech.cordona.service.customer.model.address

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.city.City
import tech.cordona.service.customer.model.country.Country
import tech.cordona.service.customer.model.customer.Customer
import tech.cordona.service.customer.model.reference.CustomerID
import tech.cordona.service.customer.model.zipcode.ZipCode
import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.ManyToOne
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "Address")
@Table(name = "addresses")
class Address(
	@OneToOne
	@MapsId
	val customer: Customer,
	@ManyToOne(fetch = LAZY)
	private val country: Country,
	@ManyToOne(fetch = LAZY)
	private val city: City,
	@ManyToOne(fetch = LAZY)
	private val zipCode: ZipCode,
	private val streetNo: Int,
	private val streetName: String,
	private val entrance: String,
	private val floorNo: Int,
	private val apartmentNo: Int,
	businessID: CustomerID
) : BaseRelationalUUIDEntity(businessID.value)