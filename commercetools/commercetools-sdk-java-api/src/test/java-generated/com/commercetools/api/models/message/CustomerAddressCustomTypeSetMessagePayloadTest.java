
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomTypeSetMessagePayloadBuilder builder) {
        CustomerAddressCustomTypeSetMessagePayload customerAddressCustomTypeSetMessagePayload = builder
                .buildUnchecked();
        Assertions.assertThat(customerAddressCustomTypeSetMessagePayload)
                .isInstanceOf(CustomerAddressCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        CustomerAddressCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        CustomerAddressCustomTypeSetMessagePayload.builder().previousTypeId("previousTypeId") },
                new Object[] { "addressId",
                        CustomerAddressCustomTypeSetMessagePayload.builder().addressId("addressId") } };
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
