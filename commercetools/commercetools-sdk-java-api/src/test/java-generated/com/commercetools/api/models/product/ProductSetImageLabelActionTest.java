
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
public class ProductSetImageLabelActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductSetImageLabelActionBuilder builder) {
        ProductSetImageLabelAction productSetImageLabelAction = builder.buildUnchecked();
        Assertions.assertThat(productSetImageLabelAction).isInstanceOf(ProductSetImageLabelAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductSetImageLabelAction.builder().sku("sku") },
                new Object[] { ProductSetImageLabelAction.builder().variantId(5L) },
                new Object[] { ProductSetImageLabelAction.builder().imageUrl("imageUrl") },
                new Object[] { ProductSetImageLabelAction.builder().label("label") },
                new Object[] { ProductSetImageLabelAction.builder().staged(true) } };
    }

    @Test
    public void sku() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void variantId() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void imageUrl() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setImageUrl("imageUrl");
        Assertions.assertThat(value.getImageUrl()).isEqualTo("imageUrl");
    }

    @Test
    public void label() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setLabel("label");
        Assertions.assertThat(value.getLabel()).isEqualTo("label");
    }

    @Test
    public void staged() {
        ProductSetImageLabelAction value = ProductSetImageLabelAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
