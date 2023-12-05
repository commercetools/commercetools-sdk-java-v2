
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
public class BusinessUnitCustomTypeRemovedMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCustomTypeRemovedMessagePayloadBuilder builder) {
        BusinessUnitCustomTypeRemovedMessagePayload businessUnitCustomTypeRemovedMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeRemovedMessagePayload)
                .isInstanceOf(BusinessUnitCustomTypeRemovedMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitCustomTypeRemovedMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeRemovedMessagePayload value = BusinessUnitCustomTypeRemovedMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
