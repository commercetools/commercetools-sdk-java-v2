
package com.commercetools.api.models.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductStateTransitionMessagePayloadTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductStateTransitionMessagePayloadBuilder builder) {
        ProductStateTransitionMessagePayload productStateTransitionMessagePayload = builder.buildUnchecked();
        Assertions.assertThat(productStateTransitionMessagePayload)
                .isInstanceOf(ProductStateTransitionMessagePayload.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        ProductStateTransitionMessagePayload.builder()
                                .state(new com.commercetools.api.models.state.StateReferenceImpl()) },
                new Object[] { "force", ProductStateTransitionMessagePayload.builder().force(true) } };
    }

    @Test
    public void state() {
        ProductStateTransitionMessagePayload value = ProductStateTransitionMessagePayload.of();
        value.setState(new com.commercetools.api.models.state.StateReferenceImpl());
        Assertions.assertThat(value.getState()).isEqualTo(new com.commercetools.api.models.state.StateReferenceImpl());
    }

    @Test
    public void force() {
        ProductStateTransitionMessagePayload value = ProductStateTransitionMessagePayload.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
