
package com.commercetools.api.models.product_tailoring;

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
public class ProductTailoringSetExternalImagesActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringSetExternalImagesActionBuilder builder) {
        ProductTailoringSetExternalImagesAction productTailoringSetExternalImagesAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringSetExternalImagesAction)
                .isInstanceOf(ProductTailoringSetExternalImagesAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringSetExternalImagesAction.builder().variantId(5L) },
                new Object[] { ProductTailoringSetExternalImagesAction.builder().sku("sku") },
                new Object[] { ProductTailoringSetExternalImagesAction.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { ProductTailoringSetExternalImagesAction.builder().staged(true) } };
    }

    @Test
    public void variantId() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void sku() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void staged() {
        ProductTailoringSetExternalImagesAction value = ProductTailoringSetExternalImagesAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
