
package com.commercetools.history.models.change_value;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class ParcelChangeValueTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, ParcelChangeValueBuilder builder) {
        ParcelChangeValue parcelChangeValue = builder.buildUnchecked();
        Assertions.assertThat(parcelChangeValue).isInstanceOf(ParcelChangeValue.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "id", ParcelChangeValue.builder().id("id") },
                new Object[] { "createdAt", ParcelChangeValue.builder().createdAt("createdAt") } };
    }

    @Test
    public void id() {
        ParcelChangeValue value = ParcelChangeValue.of();
        value.setId("id");
        Assertions.assertThat(value.getId()).isEqualTo("id");
    }

    @Test
    public void createdAt() {
        ParcelChangeValue value = ParcelChangeValue.of();
        value.setCreatedAt("createdAt");
        Assertions.assertThat(value.getCreatedAt()).isEqualTo("createdAt");
    }
}
