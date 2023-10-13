
package com.commercetools.history.models.common;

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
public class LocationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(LocationBuilder builder) {
        Location location = builder.buildUnchecked();
        Assertions.assertThat(location).isInstanceOf(Location.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Location.builder().country("country") },
                new Object[] { Location.builder().state("state") } };
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
