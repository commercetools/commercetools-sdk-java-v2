
package com.commercetools.checkout.models.application;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class AllowedOriginsTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, AllowedOriginsBuilder builder) {
        AllowedOrigins allowedOrigins = builder.buildUnchecked();
        Assertions.assertThat(allowedOrigins).isInstanceOf(AllowedOrigins.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "allowAll", AllowedOrigins.builder().allowAll(true) },
                new Object[] { "origins", AllowedOrigins.builder().origins(Collections.singletonList("origins")) } };
    }

    @Test
    public void allowAll() {
        AllowedOrigins value = AllowedOrigins.of();
        value.setAllowAll(true);
        Assertions.assertThat(value.getAllowAll()).isEqualTo(true);
    }

    @Test
    public void origins() {
        AllowedOrigins value = AllowedOrigins.of();
        value.setOrigins(Collections.singletonList("origins"));
        Assertions.assertThat(value.getOrigins()).isEqualTo(Collections.singletonList("origins"));
    }
}
