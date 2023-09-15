
package com.commercetools.api.models.common;

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
public class BaseAddressTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BaseAddressBuilder builder) {
        BaseAddress baseAddress = builder.buildUnchecked();
        Assertions.assertThat(baseAddress).isInstanceOf(BaseAddress.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { BaseAddress.builder().id("id") },
                new Object[] { BaseAddress.builder().key("key") },
                new Object[] { BaseAddress.builder().country("country") },
                new Object[] { BaseAddress.builder().title("title") },
                new Object[] { BaseAddress.builder().salutation("salutation") },
                new Object[] { BaseAddress.builder().firstName("firstName") },
                new Object[] { BaseAddress.builder().lastName("lastName") },
                new Object[] { BaseAddress.builder().streetName("streetName") },
                new Object[] { BaseAddress.builder().streetNumber("streetNumber") },
                new Object[] { BaseAddress.builder().additionalStreetInfo("additionalStreetInfo") },
                new Object[] { BaseAddress.builder().postalCode("postalCode") },
                new Object[] { BaseAddress.builder().city("city") },
                new Object[] { BaseAddress.builder().region("region") },
                new Object[] { BaseAddress.builder().state("state") },
                new Object[] { BaseAddress.builder().company("company") },
                new Object[] { BaseAddress.builder().department("department") },
                new Object[] { BaseAddress.builder().building("building") },
                new Object[] { BaseAddress.builder().apartment("apartment") },
                new Object[] { BaseAddress.builder().pOBox("pOBox") },
                new Object[] { BaseAddress.builder().phone("phone") },
                new Object[] { BaseAddress.builder().mobile("mobile") },
                new Object[] { BaseAddress.builder().email("email") },
                new Object[] { BaseAddress.builder().fax("fax") },
                new Object[] { BaseAddress.builder().additionalAddressInfo("additionalAddressInfo") },
                new Object[] { BaseAddress.builder().externalId("externalId") } };
    }

    @Test
    public void id() {
        BaseAddress value = BaseAddress.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void key() {
        BaseAddress value = BaseAddress.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }

    @Test
    public void country() {
        BaseAddress value = BaseAddress.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void title() {
        BaseAddress value = BaseAddress.of();
        value.setTitle("title");
        Assertions.assertThat(value.getTitle()).isEqualTo("title");
    }

    @Test
    public void salutation() {
        BaseAddress value = BaseAddress.of();
        value.setSalutation("salutation");
        Assertions.assertThat(value.getSalutation()).isEqualTo("salutation");
    }

    @Test
    public void firstName() {
        BaseAddress value = BaseAddress.of();
        value.setFirstName("firstName");
        Assertions.assertThat(value.getFirstName()).isEqualTo("firstName");
    }

    @Test
    public void lastName() {
        BaseAddress value = BaseAddress.of();
        value.setLastName("lastName");
        Assertions.assertThat(value.getLastName()).isEqualTo("lastName");
    }

    @Test
    public void streetName() {
        BaseAddress value = BaseAddress.of();
        value.setStreetName("streetName");
        Assertions.assertThat(value.getStreetName()).isEqualTo("streetName");
    }

    @Test
    public void streetNumber() {
        BaseAddress value = BaseAddress.of();
        value.setStreetNumber("streetNumber");
        Assertions.assertThat(value.getStreetNumber()).isEqualTo("streetNumber");
    }

    @Test
    public void additionalStreetInfo() {
        BaseAddress value = BaseAddress.of();
        value.setAdditionalStreetInfo("additionalStreetInfo");
        Assertions.assertThat(value.getAdditionalStreetInfo()).isEqualTo("additionalStreetInfo");
    }

    @Test
    public void postalCode() {
        BaseAddress value = BaseAddress.of();
        value.setPostalCode("postalCode");
        Assertions.assertThat(value.getPostalCode()).isEqualTo("postalCode");
    }

    @Test
    public void city() {
        BaseAddress value = BaseAddress.of();
        value.setCity("city");
        Assertions.assertThat(value.getCity()).isEqualTo("city");
    }

    @Test
    public void region() {
        BaseAddress value = BaseAddress.of();
        value.setRegion("region");
        Assertions.assertThat(value.getRegion()).isEqualTo("region");
    }

    @Test
    public void state() {
        BaseAddress value = BaseAddress.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }

    @Test
    public void company() {
        BaseAddress value = BaseAddress.of();
        value.setCompany("company");
        Assertions.assertThat(value.getCompany()).isEqualTo("company");
    }

    @Test
    public void department() {
        BaseAddress value = BaseAddress.of();
        value.setDepartment("department");
        Assertions.assertThat(value.getDepartment()).isEqualTo("department");
    }

    @Test
    public void building() {
        BaseAddress value = BaseAddress.of();
        value.setBuilding("building");
        Assertions.assertThat(value.getBuilding()).isEqualTo("building");
    }

    @Test
    public void apartment() {
        BaseAddress value = BaseAddress.of();
        value.setApartment("apartment");
        Assertions.assertThat(value.getApartment()).isEqualTo("apartment");
    }

    @Test
    public void pOBox() {
        BaseAddress value = BaseAddress.of();
        value.setPOBox("pOBox");
        Assertions.assertThat(value.getPOBox()).isEqualTo("pOBox");
    }

    @Test
    public void phone() {
        BaseAddress value = BaseAddress.of();
        value.setPhone("phone");
        Assertions.assertThat(value.getPhone()).isEqualTo("phone");
    }

    @Test
    public void mobile() {
        BaseAddress value = BaseAddress.of();
        value.setMobile("mobile");
        Assertions.assertThat(value.getMobile()).isEqualTo("mobile");
    }

    @Test
    public void email() {
        BaseAddress value = BaseAddress.of();
        value.setEmail("email");
        Assertions.assertThat(value.getEmail()).isEqualTo("email");
    }

    @Test
    public void fax() {
        BaseAddress value = BaseAddress.of();
        value.setFax("fax");
        Assertions.assertThat(value.getFax()).isEqualTo("fax");
    }

    @Test
    public void additionalAddressInfo() {
        BaseAddress value = BaseAddress.of();
        value.setAdditionalAddressInfo("additionalAddressInfo");
        Assertions.assertThat(value.getAdditionalAddressInfo()).isEqualTo("additionalAddressInfo");
    }

    @Test
    public void externalId() {
        BaseAddress value = BaseAddress.of();
        value.setExternalId("externalId");
        Assertions.assertThat(value.getExternalId()).isEqualTo("externalId");
    }
}
