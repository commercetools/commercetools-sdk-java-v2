
package com.commercetools.api.models.product;

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
public class ProductRemoveImageActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductRemoveImageActionBuilder builder) {
        ProductRemoveImageAction productRemoveImageAction = builder.buildUnchecked();
        Assertions.assertThat(productRemoveImageAction).isInstanceOf(ProductRemoveImageAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductRemoveImageAction.builder().variantId(5L) },
                new Object[] { ProductRemoveImageAction.builder().sku("sku") },
                new Object[] { ProductRemoveImageAction.builder().imageUrl("imageUrl") },
                new Object[] { ProductRemoveImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void staged() {
        ProductRemoveImageAction value = ProductRemoveImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
