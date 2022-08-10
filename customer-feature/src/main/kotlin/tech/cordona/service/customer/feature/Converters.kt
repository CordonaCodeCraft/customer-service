package tech.cordona.service.customer.feature

import tech.cordona.service.customer.api.dto.RegisterCustomerRequest
import tech.cordona.service.customer.feature.usecase.registration.dto.CreateAddressRequest
import tech.cordona.service.customer.feature.usecase.registration.dto.SavedCustomerData
import tech.cordona.service.customer.model.contactdata.ContactData
import tech.cordona.service.customer.model.personaldata.PersonalData

fun createAddressRequest(savedCustomerData: SavedCustomerData, request: RegisterCustomerRequest) =
	CreateAddressRequest(
		customer = savedCustomerData.customer,
		businessID = savedCustomerData.businessID,
		country = request.country,
		city = request.city,
		zipCode = request.zipCode,
		streetName = request.streetName,
		streetNo = request.streetNo,
		entrance = request.entrance,
		floorNo = request.floorNo,
		apartmentNo = request.apartmentNo
	)

fun createPersonalData(savedCustomerData: SavedCustomerData, request: RegisterCustomerRequest) =
	PersonalData(
		customer = savedCustomerData.customer,
		businessID = savedCustomerData.businessID,
		firstName = request.firstName,
		middleName = request.middleName,
		lastName = request.lastName,
		age = request.age,
		birthDate = request.birthDate,
		personalNo = request.personalNo,
		passportNo = request.passportNo
	)

fun createContactData(savedCustomerData: SavedCustomerData, request: RegisterCustomerRequest) =
	ContactData(
		customer = savedCustomerData.customer,
		businessID = savedCustomerData.businessID,
		phoneNumber = request.phoneNumber,
		email = request.email
	)
