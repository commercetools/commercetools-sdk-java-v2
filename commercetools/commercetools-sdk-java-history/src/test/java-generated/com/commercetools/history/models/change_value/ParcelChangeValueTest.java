
package com.commercetools.history.models.change_value;

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
public class ParcelChangeValueTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ParcelChangeValueBuilder builder) {
        ParcelChangeValue parcelChangeValue = builder.buildUnchecked();
        Assertions.assertThat(parcelChangeValue).isInstanceOf(ParcelChangeValue.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ParcelChangeValue.builder().id("id") },
                new Object[] { ParcelChangeValue.builder().createdAt("createdAt") } };
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
