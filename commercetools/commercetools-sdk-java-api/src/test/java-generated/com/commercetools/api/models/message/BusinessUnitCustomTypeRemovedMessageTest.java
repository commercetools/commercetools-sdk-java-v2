
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
public class BusinessUnitCustomTypeRemovedMessageTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCustomTypeRemovedMessageBuilder builder) {
        BusinessUnitCustomTypeRemovedMessage businessUnitCustomTypeRemovedMessage = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeRemovedMessage)
                .isInstanceOf(BusinessUnitCustomTypeRemovedMessage.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitCustomTypeRemovedMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeRemovedMessage value = BusinessUnitCustomTypeRemovedMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
