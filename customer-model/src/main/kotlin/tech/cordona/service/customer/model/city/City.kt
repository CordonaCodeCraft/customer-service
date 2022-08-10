package tech.cordona.service.customer.model.city

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.country.Country
import tech.cordona.service.customer.model.reference.NaturalID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType.LAZY
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity(name = "City")
@Table(name = "cities")
class City(
	@Column(nullable = false)
	private val name: String,
	@ManyToOne(fetch = LAZY)
	private val country: Country,
	naturalId: NaturalID
) : BaseRelationalUUIDEntity(naturalId.value)