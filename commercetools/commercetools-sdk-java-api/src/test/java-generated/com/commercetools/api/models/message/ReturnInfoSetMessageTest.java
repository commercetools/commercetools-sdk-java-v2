
package com.commercetools.api.models.message;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ReturnInfoSetMessageTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ReturnInfoSetMessageBuilder builder) {
        ReturnInfoSetMessage returnInfoSetMessage = builder.buildUnchecked();
        Assertions.assertThat(returnInfoSetMessage).isInstanceOf(ReturnInfoSetMessage.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "returnInfo", ReturnInfoSetMessage.builder()
                .returnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl())) } };
    }

    @Test
    public void returnInfo() {
        ReturnInfoSetMessage value = ReturnInfoSetMessage.of();
        value.setReturnInfo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
        Assertions.assertThat(value.getReturnInfo())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.order.ReturnInfoImpl()));
    }
}
