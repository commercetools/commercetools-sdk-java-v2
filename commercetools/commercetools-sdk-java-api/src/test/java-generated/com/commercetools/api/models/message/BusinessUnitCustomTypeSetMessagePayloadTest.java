
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
public class BusinessUnitCustomTypeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(BusinessUnitCustomTypeSetMessagePayloadBuilder builder) {
        BusinessUnitCustomTypeSetMessagePayload businessUnitCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(businessUnitCustomTypeSetMessagePayload)
                .isInstanceOf(BusinessUnitCustomTypeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { BusinessUnitCustomTypeSetMessagePayload.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { BusinessUnitCustomTypeSetMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        BusinessUnitCustomTypeSetMessagePayload value = BusinessUnitCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        BusinessUnitCustomTypeSetMessagePayload value = BusinessUnitCustomTypeSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
