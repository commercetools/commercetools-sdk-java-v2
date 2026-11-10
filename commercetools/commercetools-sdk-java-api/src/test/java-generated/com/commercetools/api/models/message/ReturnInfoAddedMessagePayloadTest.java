
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnInfoAddedMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnInfoAddedMessagePayloadBuilder builder) {
        ReturnInfoAddedMessagePayload returnInfoAddedMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(returnInfoAddedMessagePayload).isInstanceOf(ReturnInfoAddedMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "returnInfo", ReturnInfoAddedMessagePayload.builder()
                .returnInfo(new com.commercetools.api.models.order.ReturnInfoImpl()) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoAddedMessagePayload value = ReturnInfoAddedMessagePayload.of();
        value.setReturnInfo(new com.commercetools.api.models.order.ReturnInfoImpl());
        Assertions.assertThat(value.getReturnInfo()).isEqualTo(new com.commercetools.api.models.order.ReturnInfoImpl());
    }
}
