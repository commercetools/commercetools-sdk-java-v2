
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreOrderUrlTemplateSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreOrderUrlTemplateSetMessageBuilder builder) {
        StoreOrderUrlTemplateSetMessage storeOrderUrlTemplateSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeOrderUrlTemplateSetMessage).isInstanceOf(StoreOrderUrlTemplateSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "orderUrlTemplate",
                StoreOrderUrlTemplateSetMessage.builder().orderUrlTemplate("orderUrlTemplate") } };
    }

    @Test
    public void orderUrlTemplate() {
        StoreOrderUrlTemplateSetMessage value = StoreOrderUrlTemplateSetMessage.of();
        value.setOrderUrlTemplate("orderUrlTemplate");
        Assertions.assertThat(value.getOrderUrlTemplate()).isEqualTo("orderUrlTemplate");
    }
}
