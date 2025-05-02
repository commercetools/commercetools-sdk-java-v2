
package com.commercetools.importapi.models.customers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressBuilder builder) {
        CustomerAddress customerAddress = builder.buildUnchecked();
        Assertions.assertThat(customerAddress).isInstanceOf(CustomerAddress.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "key", CustomerAddress.builder().key("key") },
                new Object[] { "country", CustomerAddress.builder().country("country") },
                new Object[] { "title", CustomerAddress.builder().title("title") },
                new Object[] { "salutation", CustomerAddress.builder().salutation("salutation") },
                new Object[] { "firstName", CustomerAddress.builder().firstName("firstName") },
                new Object[] { "lastName", CustomerAddress.builder().lastName("lastName") },
                new Object[] { "streetName", CustomerAddress.builder().streetName("streetName") },
                new Object[] { "streetNumber", CustomerAddress.builder().streetNumber("streetNumber") },
                new Object[] { "additionalStreetInfo",
                        CustomerAddress.builder().additionalStreetInfo("additionalStreetInfo") },
                new Object[] { "postalCode", CustomerAddress.builder().postalCode("postalCode") },
                new Object[] { "city", CustomerAddress.builder().city("city") },
                new Object[] { "region", CustomerAddress.builder().region("region") },
                new Object[] { "state", CustomerAddress.builder().state("state") },
                new Object[] { "company", CustomerAddress.builder().company("company") },
                new Object[] { "department", CustomerAddress.builder().department("department") },
                new Object[] { "building", CustomerAddress.builder().building("building") },
                new Object[] { "apartment", CustomerAddress.builder().apartment("apartment") },
                new Object[] { "pOBox", CustomerAddress.builder().pOBox("pOBox") },
                new Object[] { "phone", CustomerAddress.builder().phone("phone") },
                new Object[] { "mobile", CustomerAddress.builder().mobile("mobile") },
                new Object[] { "email", CustomerAddress.builder().email("email") },
                new Object[] { "fax", CustomerAddress.builder().fax("fax") },
                new Object[] { "additionalAddressInfo",
                        CustomerAddress.builder().additionalAddressInfo("additionalAddressInfo") },
                new Object[] { "externalId", CustomerAddress.builder().externalId("externalId") },
                new Object[] { "custom", CustomerAddress.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void key() {
        CustomerAddress value = CustomerAddress.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void country() {
        CustomerAddress value = CustomerAddress.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void title() {
        CustomerAddress value = CustomerAddress.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void salutation() {
        CustomerAddress value = CustomerAddress.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void firstName() {
        CustomerAddress value = CustomerAddress.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        CustomerAddress value = CustomerAddress.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void streetName() {
        CustomerAddress value = CustomerAddress.of();
        value.setStreetName("streetName");
        Assertions.assertThat(value.getStreetName()).isEqualTo("streetName");
    }

    @Test
    public void streetNumber() {
        CustomerAddress value = CustomerAddress.of();
        value.setStreetNumber("streetNumber");
        Assertions.assertThat(value.getStreetNumber()).isEqualTo("streetNumber");
    }

    @Test
    public void additionalStreetInfo() {
        CustomerAddress value = CustomerAddress.of();
        value.setAdditionalStreetInfo("additionalStreetInfo");
        Assertions.assertThat(value.getAdditionalStreetInfo()).isEqualTo("additionalStreetInfo");
    }

    @Test
    public void postalCode() {
        CustomerAddress value = CustomerAddress.of();
        value.setPostalCode("postalCode");
        Assertions.assertThat(value.getPostalCode()).isEqualTo("postalCode");
    }

    @Test
    public void city() {
        CustomerAddress value = CustomerAddress.of();
        value.setCity("city");
        Assertions.assertThat(value.getCity()).isEqualTo("city");
    }

    @Test
    public void region() {
        CustomerAddress value = CustomerAddress.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void state() {
        CustomerAddress value = CustomerAddress.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void company() {
        CustomerAddress value = CustomerAddress.of();
        value.setCompany("company");
        Assertions.assertThat(value.getCompany()).isEqualTo("company");
    }

    @Test
    public void department() {
        CustomerAddress value = CustomerAddress.of();
        value.setDepartment("department");
        Assertions.assertThat(value.getDepartment()).isEqualTo("department");
    }

    @Test
    public void building() {
        CustomerAddress value = CustomerAddress.of();
        value.setBuilding("building");
        Assertions.assertThat(value.getBuilding()).isEqualTo("building");
    }

    @Test
    public void apartment() {
        CustomerAddress value = CustomerAddress.of();
        value.setApartment("apartment");
        Assertions.assertThat(value.getApartment()).isEqualTo("apartment");
    }

    @Test
    public void pOBox() {
        CustomerAddress value = CustomerAddress.of();
        value.setPOBox("pOBox");
        Assertions.assertThat(value.getPOBox()).isEqualTo("pOBox");
    }

    @Test
    public void phone() {
        CustomerAddress value = CustomerAddress.of();
        value.setPhone("phone");
        Assertions.assertThat(value.getPhone()).isEqualTo("phone");
    }

    @Test
    public void mobile() {
        CustomerAddress value = CustomerAddress.of();
        value.setMobile("mobile");
        Assertions.assertThat(value.getMobile()).isEqualTo("mobile");
    }

    @Test
    public void email() {
        CustomerAddress value = CustomerAddress.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void fax() {
        CustomerAddress value = CustomerAddress.of();
        value.setFax("fax");
        Assertions.assertThat(value.getFax()).isEqualTo("fax");
    }

    @Test
    public void additionalAddressInfo() {
        CustomerAddress value = CustomerAddress.of();
        value.setAdditionalAddressInfo("additionalAddressInfo");
        Assertions.assertThat(value.getAdditionalAddressInfo()).isEqualTo("additionalAddressInfo");
    }

    @Test
    public void externalId() {
        CustomerAddress value = CustomerAddress.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }

    @Test
    public void custom() {
        CustomerAddress value = CustomerAddress.of();
        value.setCustom(new com.commercetools.importapi.models.customfields.CustomImpl());
        Assertions.assertThat(value.getCustom())
                .isEqualTo(new com.commercetools.importapi.models.customfields.CustomImpl());
    }
}
