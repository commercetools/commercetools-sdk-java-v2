
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringRemoveImageActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringRemoveImageActionBuilder builder) {
        ProductTailoringRemoveImageAction productTailoringRemoveImageAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringRemoveImageAction).isInstanceOf(ProductTailoringRemoveImageAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringRemoveImageAction.builder().variantId(5L) },
                new Object[] { ProductTailoringRemoveImageAction.builder().sku("sku") },
                new Object[] { ProductTailoringRemoveImageAction.builder().imageUrl("imageUrl") },
                new Object[] { ProductTailoringRemoveImageAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void imageUrl() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void staged() {
        ProductTailoringRemoveImageAction value = ProductTailoringRemoveImageAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
