
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
public class VariantTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(VariantBuilder builder) {
        Variant variant = builder.buildUnchecked();
        Assertions.assertThat(variant).isInstanceOf(Variant.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { Variant.builder().id(2) }, new Object[] { Variant.builder().sku("sku") },
                new Object[] { Variant.builder().key("key") } };
    }

    @Test
    public void id() {
        Variant value = Variant.of();
        value.setId(2);
        Assertions.assertThat(value.getId()).isEqualTo(2);
    }

    @Test
    public void sku() {
        Variant value = Variant.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void key() {
        Variant value = Variant.of();
        value.setKey("key");
        Assertions.assertThat(value.getKey()).isEqualTo("key");
    }
}
