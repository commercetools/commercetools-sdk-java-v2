
package com.commercetools.api.models.common;

import java.util.Collections;

import com.tngtech.junit.dataprovider.DataProvider;
import com.tngtech.junit.dataprovider.DataProviderExtension;
import com.tngtech.junit.dataprovider.UseDataProvider;
import com.tngtech.junit.dataprovider.UseDataProviderExtension;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(UseDataProviderExtension.class)
@ExtendWith(DataProviderExtension.class)
public class GeoJsonPointTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GeoJsonPointBuilder builder) {
        GeoJsonPoint geoJsonPoint = builder.buildUnchecked();
        Assertions.assertThat(geoJsonPoint).isInstanceOf(GeoJsonPoint.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { GeoJsonPoint.builder().coordinates(Collections.singletonList(0.34595948)) } };
    }

    @Test
    public void coordinates() {
        GeoJsonPoint value = GeoJsonPoint.of();
        value.setCoordinates(Collections.singletonList(0.34595948));
        Assertions.assertThat(value.getCoordinates()).isEqualTo(Collections.singletonList(0.34595948));
    }
}
