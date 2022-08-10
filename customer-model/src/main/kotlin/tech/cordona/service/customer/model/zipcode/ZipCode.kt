package tech.cordona.service.customer.model.zipcode

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.city.City
import tech.cordona.service.customer.model.reference.NaturalID
import javax.persistence.Entity
import javax.persistence.MapsId
import javax.persistence.OneToOne
import javax.persistence.Table

@Entity(name = "ZipCode")
@Table(name = "zip_codes")
class ZipCode(
	@OneToOne
	@MapsId
	private val city: City,
	private val code: Int,
	businessID: NaturalID
) : BaseRelationalUUIDEntity(businessID.value)