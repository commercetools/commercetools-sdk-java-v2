
package com.commercetools.history.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GeoLocationTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GeoLocationBuilder builder) {
        GeoLocation geoLocation = builder.buildUnchecked();
        Assertions.assertThat(geoLocation).isInstanceOf(GeoLocation.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "type", GeoLocation.builder().type("type") },
                new Object[] { "coordinates", GeoLocation.builder().coordinates(Collections.singletonList(9)) } };
    }

    @Test
    public void type() {
        GeoLocation value = GeoLocation.of();
        value.setType("type");
        Assertions.assertThat(value.getType()).isEqualTo("type");
    }

    @Test
    public void coordinates() {
        GeoLocation value = GeoLocation.of();
        value.setCoordinates(Collections.singletonList(9));
        Assertions.assertThat(value.getCoordinates()).isEqualTo(Collections.singletonList(9));
    }
}
