
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
public class ProductTailoringSetImageLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetImageLabelActionBuilder builder) {
        ProductTailoringSetImageLabelAction productTailoringSetImageLabelAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetImageLabelAction)
                .isInstanceOf(ProductTailoringSetImageLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetImageLabelAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetImageLabelAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetImageLabelAction.builder().imageUrl("imageUrl") },
                new Object[] { ProductTailoringSetImageLabelAction.builder().label("label") },
                new Object[] { ProductTailoringSetImageLabelAction.builder().staged(true) } };
    }

    @Test
    public void sku() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void variantId() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void imageUrl() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void label() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }

    @Test
    public void staged() {
        ProductTailoringSetImageLabelAction value = ProductTailoringSetImageLabelAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
