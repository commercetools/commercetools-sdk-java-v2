
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerCustomTypeSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerCustomTypeSetMessagePayloadBuilder builder) {
        CustomerCustomTypeSetMessagePayload customerCustomTypeSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(customerCustomTypeSetMessagePayload)
                .isInstanceOf(CustomerCustomTypeSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        CustomerCustomTypeSetMessagePayload.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        CustomerCustomTypeSetMessagePayload.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void customFields() {
        CustomerCustomTypeSetMessagePayload value = CustomerCustomTypeSetMessagePayload.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        CustomerCustomTypeSetMessagePayload value = CustomerCustomTypeSetMessagePayload.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
