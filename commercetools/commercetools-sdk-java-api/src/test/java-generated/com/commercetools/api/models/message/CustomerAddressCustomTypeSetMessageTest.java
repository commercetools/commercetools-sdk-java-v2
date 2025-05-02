
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerAddressCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerAddressCustomTypeSetMessageBuilder builder) {
        CustomerAddressCustomTypeSetMessage customerAddressCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerAddressCustomTypeSetMessage)
                .isInstanceOf(CustomerAddressCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        CustomerAddressCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        CustomerAddressCustomTypeSetMessage.builder().previousTypeId("previousTypeId") },
                new Object[] { "addressId", CustomerAddressCustomTypeSetMessage.builder().addressId("addressId") } };
    }

    @Test
    public void customFields() {
        CustomerAddressCustomTypeSetMessage value = CustomerAddressCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        CustomerAddressCustomTypeSetMessage value = CustomerAddressCustomTypeSetMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }

    @Test
    public void addressId() {
        CustomerAddressCustomTypeSetMessage value = CustomerAddressCustomTypeSetMessage.of();
        value.setAddressId("addressId");
        Assertions.assertThat(value.getAddressId()).isEqualTo("addressId");
    }
}
