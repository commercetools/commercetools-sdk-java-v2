
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CustomerGroupCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, CustomerGroupCustomTypeSetMessageBuilder builder) {
        CustomerGroupCustomTypeSetMessage customerGroupCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(customerGroupCustomTypeSetMessage).isInstanceOf(CustomerGroupCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        CustomerGroupCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "oldTypeId", CustomerGroupCustomTypeSetMessage.builder().oldTypeId("oldTypeId") } };
    }

    @Test
    public void customFields() {
        CustomerGroupCustomTypeSetMessage value = CustomerGroupCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void oldTypeId() {
        CustomerGroupCustomTypeSetMessage value = CustomerGroupCustomTypeSetMessage.of();
        value.setOldTypeId("oldTypeId");
        Assertions.assertThat(value.getOldTypeId()).isEqualTo("oldTypeId");
    }
}
