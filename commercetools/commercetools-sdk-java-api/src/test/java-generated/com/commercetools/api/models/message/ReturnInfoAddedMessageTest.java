
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnInfoAddedMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnInfoAddedMessageBuilder builder) {
        ReturnInfoAddedMessage returnInfoAddedMessage = builder.buildUnchecked();
        Assertions.assertThat(returnInfoAddedMessage).isInstanceOf(ReturnInfoAddedMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "returnInfo", ReturnInfoAddedMessage.builder()
                .returnInfo(new com.commercetools.api.models.order.ReturnInfoImpl()) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoAddedMessage value = ReturnInfoAddedMessage.of();
        value.setReturnInfo(new com.commercetools.api.models.order.ReturnInfoImpl());
        Assertions.assertThat(value.getReturnInfo()).isEqualTo(new com.commercetools.api.models.order.ReturnInfoImpl());
    }
}
