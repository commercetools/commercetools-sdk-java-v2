
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddressTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddressBuilder builder) {
        Address address = builder.buildUnchecked();
        Assertions.assertThat(address).isInstanceOf(Address.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", Address.builder().id("id") },
                new Object[] { "key", Address.builder().key("key") },
                new Object[] { "title", Address.builder().title("title") },
                new Object[] { "salutation", Address.builder().salutation("salutation") },
                new Object[] { "firstName", Address.builder().firstName("firstName") },
                new Object[] { "lastName", Address.builder().lastName("lastName") },
                new Object[] { "streetName", Address.builder().streetName("streetName") },
                new Object[] { "streetNumber", Address.builder().streetNumber("streetNumber") },
                new Object[] { "additionalStreetInfo", Address.builder().additionalStreetInfo("additionalStreetInfo") },
                new Object[] { "postalCode", Address.builder().postalCode("postalCode") },
                new Object[] { "city", Address.builder().city("city") },
                new Object[] { "region", Address.builder().region("region") },
                new Object[] { "state", Address.builder().state("state") },
                new Object[] { "country", Address.builder().country("country") },
                new Object[] { "company", Address.builder().company("company") },
                new Object[] { "department", Address.builder().department("department") },
                new Object[] { "building", Address.builder().building("building") },
                new Object[] { "apartment", Address.builder().apartment("apartment") },
                new Object[] { "pOBox", Address.builder().pOBox("pOBox") },
                new Object[] { "phone", Address.builder().phone("phone") },
                new Object[] { "mobile", Address.builder().mobile("mobile") },
                new Object[] { "email", Address.builder().email("email") },
                new Object[] { "fax", Address.builder().fax("fax") },
                new Object[] { "additionalAddressInfo",
                        Address.builder().additionalAddressInfo("additionalAddressInfo") },
                new Object[] { "externalId", Address.builder().externalId("externalId") } };
    }

    @Test
    public void id() {
        Address value = Address.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        Address value = Address.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void title() {
        Address value = Address.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void salutation() {
        Address value = Address.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void firstName() {
        Address value = Address.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        Address value = Address.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void streetName() {
        Address value = Address.of();
        value.setStreetName("streetName");
        Assertions.assertThat(value.getStreetName()).isEqualTo("streetName");
    }

    @Test
    public void streetNumber() {
        Address value = Address.of();
        value.setStreetNumber("streetNumber");
        Assertions.assertThat(value.getStreetNumber()).isEqualTo("streetNumber");
    }

    @Test
    public void additionalStreetInfo() {
        Address value = Address.of();
        value.setAdditionalStreetInfo("additionalStreetInfo");
        Assertions.assertThat(value.getAdditionalStreetInfo()).isEqualTo("additionalStreetInfo");
    }

    @Test
    public void postalCode() {
        Address value = Address.of();
        value.setPostalCode("postalCode");
        Assertions.assertThat(value.getPostalCode()).isEqualTo("postalCode");
    }

    @Test
    public void city() {
        Address value = Address.of();
        value.setCity("city");
        Assertions.assertThat(value.getCity()).isEqualTo("city");
    }

    @Test
    public void region() {
        Address value = Address.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void state() {
        Address value = Address.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void country() {
        Address value = Address.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void company() {
        Address value = Address.of();
        value.setCompany("company");
        Assertions.assertThat(value.getCompany()).isEqualTo("company");
    }

    @Test
    public void department() {
        Address value = Address.of();
        value.setDepartment("department");
        Assertions.assertThat(value.getDepartment()).isEqualTo("department");
    }

    @Test
    public void building() {
        Address value = Address.of();
        value.setBuilding("building");
        Assertions.assertThat(value.getBuilding()).isEqualTo("building");
    }

    @Test
    public void apartment() {
        Address value = Address.of();
        value.setApartment("apartment");
        Assertions.assertThat(value.getApartment()).isEqualTo("apartment");
    }

    @Test
    public void pOBox() {
        Address value = Address.of();
        value.setPOBox("pOBox");
        Assertions.assertThat(value.getPOBox()).isEqualTo("pOBox");
    }

    @Test
    public void phone() {
        Address value = Address.of();
        value.setPhone("phone");
        Assertions.assertThat(value.getPhone()).isEqualTo("phone");
    }

    @Test
    public void mobile() {
        Address value = Address.of();
        value.setMobile("mobile");
        Assertions.assertThat(value.getMobile()).isEqualTo("mobile");
    }

    @Test
    public void email() {
        Address value = Address.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void fax() {
        Address value = Address.of();
        value.setFax("fax");
        Assertions.assertThat(value.getFax()).isEqualTo("fax");
    }

    @Test
    public void additionalAddressInfo() {
        Address value = Address.of();
        value.setAdditionalAddressInfo("additionalAddressInfo");
        Assertions.assertThat(value.getAdditionalAddressInfo()).isEqualTo("additionalAddressInfo");
    }

    @Test
    public void externalId() {
        Address value = Address.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
