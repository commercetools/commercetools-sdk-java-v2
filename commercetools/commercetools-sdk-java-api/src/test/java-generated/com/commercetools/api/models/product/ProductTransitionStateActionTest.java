
package com.commercetools.api.models.product;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ProductTransitionStateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ProductTransitionStateActionBuilder builder) {
        ProductTransitionStateAction productTransitionStateAction = builder.buildUnchecked();
        Assertions.assertThat(productTransitionStateAction).isInstanceOf(ProductTransitionStateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { "state",
                        ProductTransitionStateAction.builder()
                                .state(new com.commercetools.api.models.state.StateResourceIdentifierImpl()) },
                new Object[] { "force", ProductTransitionStateAction.builder().force(true) } };
    }

    @Test
    public void state() {
        ProductTransitionStateAction value = ProductTransitionStateAction.of();
        value.setState(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
        Assertions.assertThat(value.getState())
                .isEqualTo(new com.commercetools.api.models.state.StateResourceIdentifierImpl());
    }

    @Test
    public void force() {
        ProductTransitionStateAction value = ProductTransitionStateAction.of();
        value.setForce(true);
        Assertions.assertThat(value.getForce()).isEqualTo(true);
    }
}
