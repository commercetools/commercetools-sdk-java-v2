
package com.commercetools.history.models.common;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class LocationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, LocationBuilder builder) {
        Location location = builder.buildUnchecked();
        Assertions.assertThat(location).isInstanceOf(Location.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "country", Location.builder().country("country") },
                new Object[] { "state", Location.builder().state("state") } };
    }

    @Test
    public void country() {
        Location value = Location.of();
        value.setCountry("country");
        Assertions.assertThat(value.getCountry()).isEqualTo("country");
    }

    @Test
    public void state() {
        Location value = Location.of();
        value.setState("state");
        Assertions.assertThat(value.getState()).isEqualTo("state");
    }
}
