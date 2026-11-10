
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderCustomTypeSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderCustomTypeSetMessageBuilder builder) {
        OrderCustomTypeSetMessage orderCustomTypeSetMessage = builder.buildUnchecked();
        Assertions.assertThat(orderCustomTypeSetMessage).isInstanceOf(OrderCustomTypeSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "customFields",
                        OrderCustomTypeSetMessage.builder()
                                .customFields(new com.commercetools.api.models.type.CustomFieldsImpl()) },
                new Object[] { "previousTypeId",
                        OrderCustomTypeSetMessage.builder().previousTypeId("previousTypeId") } };
    }

    @Test
    public void customFields() {
        OrderCustomTypeSetMessage value = OrderCustomTypeSetMessage.of();
        value.setCustomFields(new com.commercetools.api.models.type.CustomFieldsImpl());
        Assertions.assertThat(value.getCustomFields())
                .isEqualTo(new com.commercetools.api.models.type.CustomFieldsImpl());
    }

    @Test
    public void previousTypeId() {
        OrderCustomTypeSetMessage value = OrderCustomTypeSetMessage.of();
        value.setPreviousTypeId("previousTypeId");
        Assertions.assertThat(value.getPreviousTypeId()).isEqualTo("previousTypeId");
    }
}
