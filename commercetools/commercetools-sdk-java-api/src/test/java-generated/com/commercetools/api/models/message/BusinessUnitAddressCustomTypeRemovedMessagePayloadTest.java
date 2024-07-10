
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
public class BusinessUnitAddressCustomTypeRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomTypeRemovedMessagePayloadBuilder builder) {
        BusinessUnitAddressCustomTypeRemovedMessagePayload businessUnitAddressCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeRemovedMessagePayload)
                .isInstanceOf(BusinessUnitAddressCustomTypeRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAddressCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") },
                new Object[] { BusinessUnitAddressCustomTypeRemovedMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeRemovedMessagePayload value = BusinessUnitAddressCustomTypeRemovedMessagePayload
                .of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeRemovedMessagePayload value = BusinessUnitAddressCustomTypeRemovedMessagePayload
                .of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
