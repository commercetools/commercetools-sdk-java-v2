
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
public class CustomerGroupCustomTypeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerGroupCustomTypeSetMessagePayloadBuilder builder) {
        CustomerGroupCustomTypeSetMessagePayload customerGroupCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomTypeSetMessagePayload)
                .isInstanceOf(CustomerGroupCustomTypeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerGroupCustomTypeSetMessagePayload.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { CustomerGroupCustomTypeSetMessagePayload.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        CustomerGroupCustomTypeSetMessagePayload value = CustomerGroupCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        CustomerGroupCustomTypeSetMessagePayload value = CustomerGroupCustomTypeSetMessagePayload.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
