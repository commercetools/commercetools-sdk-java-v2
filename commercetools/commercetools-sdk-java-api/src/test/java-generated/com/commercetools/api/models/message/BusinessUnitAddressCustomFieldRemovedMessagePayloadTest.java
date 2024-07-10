
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
public class BusinessUnitAddressCustomFieldRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomFieldRemovedMessagePayload businessUnitAddressCustomFieldRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomFieldRemovedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomFieldRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAddressCustomFieldRemovedMessagePayload.builder().name("name") },
                new Object[] { BusinessUnitAddressCustomFieldRemovedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void name() {
        BusinessUnitAddressCustomFieldRemovedMessagePayload value = BusinessUnitAddressCustomFieldRemovedMessagePayload
                .of();
        value.setName("name");
        Assertions.assertThat(value.getName()).isEqualTo("name");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomFieldRemovedMessagePayload value = BusinessUnitAddressCustomFieldRemovedMessagePayload
                .of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
