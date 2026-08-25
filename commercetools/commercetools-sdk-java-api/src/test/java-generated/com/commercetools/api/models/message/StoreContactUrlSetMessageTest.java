
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class StoreContactUrlSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, StoreContactUrlSetMessageBuilder builder) {
        StoreContactUrlSetMessage storeContactUrlSetMessage = builder.buildUnchecked();
        Assertions.assertThat(storeContactUrlSetMessage).isInstanceOf(StoreContactUrlSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "contactUrl", StoreContactUrlSetMessage.builder().contactUrl("contactUrl") } };
    }

    @Test
    public void contactUrl() {
        StoreContactUrlSetMessage value = StoreContactUrlSetMessage.of();
        value.setContactUrl("contactUrl");
        Assertions.assertThat(value.getContactUrl()).isEqualTo("contactUrl");
    }
}
