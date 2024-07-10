
package com.commercetools.api.models.message;

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
public class BusinessUnitAddressCustomFieldAddedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomFieldAddedMessagePayload businessUnitAddressCustomFieldAddedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldAddedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomFieldAddedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAddressCustomFieldAddedMessagePayload.builder().name("name") },
                new Object[] { BusinessUnitAddressCustomFieldAddedMessagePayload.builder().value("value") },
                new Object[] { BusinessUnitAddressCustomFieldAddedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldAddedMessagePayload value = BusinessUnitAddressCustomFieldAddedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void value() {
        BusinessUnitAddressCustomFieldAddedMessagePayload value = BusinessUnitAddressCustomFieldAddedMessagePayload
                .of();
        value.setValue("value");
        Assertions.assertThat(value.getValue()).isEqualTo("value");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomFieldAddedMessagePayload value = BusinessUnitAddressCustomFieldAddedMessagePayload
                .of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
