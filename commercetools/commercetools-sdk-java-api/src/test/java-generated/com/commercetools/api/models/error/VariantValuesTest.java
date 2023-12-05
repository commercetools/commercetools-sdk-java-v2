
package com.commercetools.api.models.error;

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
public class VariantValuesTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(VariantValuesBuilder builder) {
        VariantValues variantValues = builder.buildUnchecked();
        Assertions.assertThat(variantValues).isInstanceOf(VariantValues.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { VariantValues.builder().sku("sku") },
                new Object[] { VariantValues.builder()
                        .prices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl())) },
                new Object[] { VariantValues.builder()
                        .attributes(
                            Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl())) } };
    }

    @Test
    public void sku() {
        VariantValues value = VariantValues.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void prices() {
        VariantValues value = VariantValues.of();
        value.setPrices(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
        Assertions.assertThat(value.getPrices())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.PriceDraftImpl()));
    }

    @Test
    public void attributes() {
        VariantValues value = VariantValues.of();
        value.setAttributes(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.product.AttributeImpl()));
    }
}
