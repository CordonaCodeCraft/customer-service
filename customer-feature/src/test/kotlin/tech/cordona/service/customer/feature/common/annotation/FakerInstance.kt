package tech.cordona.service.customer.feature.common.annotation

import com.github.javafaker.Faker
import tech.cordona.service.customer.api.dto.RegisterCustomerRequest
import java.time.ZoneId

object FakerInstance {

	val faker = Faker()

	val customerRegistrationRequest = RegisterCustomerRequest(
		firstName = faker.name().firstName(),
		middleName = faker.name().firstName(),
		lastName = faker.name().lastName(),
		age = faker.number().numberBetween(18, 80),
		birthDate = generateRandomBirthDate(18, 80),
		personalNo = faker.number().digits(10).toString(),
		passportNo = faker.number().digits(10).toString(),
		email = faker.internet().emailAddress(),
		phoneNumber = faker.phoneNumber().cellPhone(),
		country = faker.country().name(),
		city = faker.address().city(),
		zipCode = faker.number().digits(5).toInt(),
		streetName = faker.address().streetName(),
		streetNo = faker.number().numberBetween(1, 100),
		entrance = "A",
		floorNo = faker.number().numberBetween(1, 100),
		apartmentNo = faker.number().numberBetween(1, 100)
	)

	private fun generateRandomBirthDate(minAge: Int, maxAge: Int) =
		faker.date().birthday(minAge, maxAge).toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
}