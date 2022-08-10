package tech.cordona.service.customer.model.country

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.reference.NaturalID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity(name = "Country")
@Table(name = "countries")
class Country(
	@Column(unique = true, nullable = false)
	val name: String,
	naturalId: NaturalID
) : BaseRelationalUUIDEntity(naturalId.value)