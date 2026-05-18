
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class RemoveAllowedOriginUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, RemoveAllowedOriginUpdateActionBuilder builder) {
        RemoveAllowedOriginUpdateAction removeAllowedOriginUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(removeAllowedOriginUpdateAction).isInstanceOf(RemoveAllowedOriginUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "origin", RemoveAllowedOriginUpdateAction.builder().origin("origin") } };
    }

    @Test
    public void origin() {
        RemoveAllowedOriginUpdateAction value = RemoveAllowedOriginUpdateAction.of();
        value.setOrigin("origin");
        Assertions.assertThat(value.getOrigin()).isEqualTo("origin");
    }
}
