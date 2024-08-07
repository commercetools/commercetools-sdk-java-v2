
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
public class BusinessUnitAddressCustomTypeRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitAddressCustomTypeRemovedMessageBuilder builder) {
        BusinessUnitAddressCustomTypeRemovedMessage businessUnitAddressCustomTypeRemovedMessage = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitAddressCustomTypeRemovedMessage)
                .isInstanceOf(BusinessUnitAddressCustomTypeRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitAddressCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") },
                new Object[] { BusinessUnitAddressCustomTypeRemovedMessage.builder().addressId("addressId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitAddressCustomTypeRemovedMessage value = BusinessUnitAddressCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }

    @Test
    public void addressId() {
        BusinessUnitAddressCustomTypeRemovedMessage value = BusinessUnitAddressCustomTypeRemovedMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
