
package com.commercetools.history.models.common;

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
public class GeoLocationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GeoLocationBuilder builder) {
        GeoLocation geoLocation = builder.buildUnchecked();
        Assertions.assertThat(geoLocation).isInstanceOf(GeoLocation.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GeoLocation.builder().type("type") },
                new Object[] { GeoLocation.builder().coordinates(Collections.singletonList(9)) } };
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
