package tech.cordona.customer.model

import BaseRelationalEntity
import javax.persistence.Entity
import javax.persistence.Table


@Entity(name = "Customer")
@Table(name = "customers")
class Customer(customerId: String) : BaseRelationalEntity(customerId)
