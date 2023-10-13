
package com.commercetools.importapi.models.customers;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class CustomerAddressTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressBuilder builder) {
        CustomerAddress customerAddress = builder.buildUnchecked();
        Assertions.assertThat(customerAddress).isInstanceOf(CustomerAddress.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { CustomerAddress.builder().key("key") },
                new Object[] { CustomerAddress.builder().title("title") },
                new Object[] { CustomerAddress.builder().salutation("salutation") },
                new Object[] { CustomerAddress.builder().firstName("firstName") },
                new Object[] { CustomerAddress.builder().lastName("lastName") },
                new Object[] { CustomerAddress.builder().streetName("streetName") },
                new Object[] { CustomerAddress.builder().streetNumber("streetNumber") },
                new Object[] { CustomerAddress.builder().additionalStreetInfo("additionalStreetInfo") },
                new Object[] { CustomerAddress.builder().postalCode("postalCode") },
                new Object[] { CustomerAddress.builder().city("city") },
                new Object[] { CustomerAddress.builder().region("region") },
                new Object[] { CustomerAddress.builder().state("state") },
                new Object[] { CustomerAddress.builder().country("country") },
                new Object[] { CustomerAddress.builder().company("company") },
                new Object[] { CustomerAddress.builder().department("department") },
                new Object[] { CustomerAddress.builder().building("building") },
                new Object[] { CustomerAddress.builder().apartment("apartment") },
                new Object[] { CustomerAddress.builder().pOBox("pOBox") },
                new Object[] { CustomerAddress.builder().phone("phone") },
                new Object[] { CustomerAddress.builder().mobile("mobile") },
                new Object[] { CustomerAddress.builder().email("email") },
                new Object[] { CustomerAddress.builder().fax("fax") },
                new Object[] { CustomerAddress.builder().additionalAddressInfo("additionalAddressInfo") },
                new Object[] { CustomerAddress.builder().externalId("externalId") },
                new Object[] { CustomerAddress.builder()
                        .custom(new com.commercetools.importapi.models.customfields.CustomImpl()) } };
    }

    @Test
    public void key() {
        CustomerAddress value = CustomerAddress.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
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
    public void country() {
        CustomerAddress value = CustomerAddress.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
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
