package tech.cordona.service.customer.model.customer

import BaseRelationalUUIDEntity
import tech.cordona.service.customer.model.reference.CustomerID
import javax.persistence.Entity
import javax.persistence.Table


@Entity(name = "Customer")
@Table(name = "customers")
class Customer(businessID: CustomerID) : BaseRelationalUUIDEntity(businessID.value)
