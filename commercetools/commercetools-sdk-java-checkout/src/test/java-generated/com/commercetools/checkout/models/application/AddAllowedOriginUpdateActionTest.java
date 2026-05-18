
package com.commercetools.checkout.models.application;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AddAllowedOriginUpdateActionTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AddAllowedOriginUpdateActionBuilder builder) {
        AddAllowedOriginUpdateAction addAllowedOriginUpdateAction = builder.buildUnchecked();
        Assertions.assertThat(addAllowedOriginUpdateAction).isInstanceOf(AddAllowedOriginUpdateAction.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "origin", AddAllowedOriginUpdateAction.builder().origin("origin") } };
    }

    @Test
    public void origin() {
        AddAllowedOriginUpdateAction value = AddAllowedOriginUpdateAction.of();
        value.setOrigin("origin");
        Assertions.assertThat(value.getOrigin()).isEqualTo("origin");
    }
}
