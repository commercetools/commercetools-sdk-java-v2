
package com.commercetools.api.models.common;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class GeoJsonPointTest {

    @ParameterizedTest(name = "#{index} with {0}")
    @MethodSource("objectBuilder")
    public void buildUnchecked(String name, GeoJsonPointBuilder builder) {
        GeoJsonPoint geoJsonPoint = builder.buildUnchecked();
        Assertions.assertThat(geoJsonPoint).isInstanceOf(GeoJsonPoint.class);
    }

    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { "coordinates",
                GeoJsonPoint.builder().coordinates(Collections.singletonList(0.34595948)) } };
    }

    @Test
    public void coordinates() {
        GeoJsonPoint value = GeoJsonPoint.of();
        value.setCoordinates(Collections.singletonList(0.34595948));
        Assertions.assertThat(value.getCoordinates()).isEqualTo(Collections.singletonList(0.34595948));
    }
}
