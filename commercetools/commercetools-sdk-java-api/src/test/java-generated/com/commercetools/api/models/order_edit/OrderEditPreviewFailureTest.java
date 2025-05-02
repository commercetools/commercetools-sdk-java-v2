
package com.commercetools.api.models.order_edit;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class OrderEditPreviewFailureTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, OrderEditPreviewFailureBuilder builder) {
        OrderEditPreviewFailure orderEditPreviewFailure = builder.buildUnchecked();
        Assertions.assertThat(orderEditPreviewFailure).isInstanceOf(OrderEditPreviewFailure.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "errors", OrderEditPreviewFailure.builder()
                .errors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl())) } };
    }

    @Test
    public void errors() {
        OrderEditPreviewFailure value = OrderEditPreviewFailure.of();
        value.setErrors(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
        Assertions.assertThat(value.getErrors())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.error.ErrorObjectImpl()));
    }
}
