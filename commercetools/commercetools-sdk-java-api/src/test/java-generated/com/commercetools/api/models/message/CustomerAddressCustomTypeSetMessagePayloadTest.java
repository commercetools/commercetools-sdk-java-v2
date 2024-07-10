
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
public class CustomerAddressCustomTypeSetMessagePayloadTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(CustomerAddressCustomTypeSetMessagePayloadBuilder builder) {
        CustomerAddressCustomTypeSetMessagePayload customerAddressCustomTypeSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomTypeSetMessagePayload)
                .isInstanceOf(CustomerAddressCustomTypeSetMessagePayload.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { CustomerAddressCustomTypeSetMessagePayload.builder()
                        .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { CustomerAddressCustomTypeSetMessagePayload.builder().previousTypeId("previousTypeId") },
                new Object[] { CustomerAddressCustomTypeSetMessagePayload.builder().addressId("addressId") } };
    }

    @Test
    public void customFields() {
        CustomerAddressCustomTypeSetMessagePayload value = CustomerAddressCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        CustomerAddressCustomTypeSetMessagePayload value = CustomerAddressCustomTypeSetMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomTypeSetMessagePayload value = CustomerAddressCustomTypeSetMessagePayload.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
