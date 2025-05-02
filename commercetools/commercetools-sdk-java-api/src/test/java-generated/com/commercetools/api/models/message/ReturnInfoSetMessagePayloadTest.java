
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnInfoSetMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnInfoSetMessagePayloadBuilder builder) {
        ReturnInfoSetMessagePayload returnInfoSetMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(returnInfoSetMessagePayload).isInstanceOf(ReturnInfoSetMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "returnInfo", ReturnInfoSetMessagePayload.builder()
                .returnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl())) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoSetMessagePayload value = ReturnInfoSetMessagePayload.of();
        value.setReturnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
        Assertions.assertThat(value.getReturnInfo())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
    }
}
