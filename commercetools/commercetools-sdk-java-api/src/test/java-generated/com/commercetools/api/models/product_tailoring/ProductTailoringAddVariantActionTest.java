
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
public class ProductTailoringAddVariantActionTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductTailoringAddVariantActionBuilder builder) {
        ProductTailoringAddVariantAction productTailoringAddVariantAction = builder.buildUnchecked();
        Assertions.assertThat(productTailoringAddVariantAction).isInstanceOf(ProductTailoringAddVariantAction.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductTailoringAddVariantAction.builder().id(2L) },
                new Object[] { ProductTailoringAddVariantAction.builder().sku("sku") },
                new Object[] { ProductTailoringAddVariantAction.builder()
                        .images(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl())) },
                new Object[] { ProductTailoringAddVariantAction.builder()
                        .assets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl())) },
                new Object[] { ProductTailoringAddVariantAction.builder().staged(true) } };
    }

    @Test
    public void id() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setId(2L);
        Assertions.assertThat(value.getId()).isEqualTo(2L);
    }

    @Test
    public void sku() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setSku("sku");
        Assertions.assertThat(value.getSku()).isEqualTo("sku");
    }

    @Test
    public void images() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setImages(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
        Assertions.assertThat(value.getImages())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.ImageImpl()));
    }

    @Test
    public void assets() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setAssets(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
        Assertions.assertThat(value.getAssets())
                .isEqualTo(Collections.singletonList(new com.commercetools.api.models.common.AssetDraftImpl()));
    }

    @Test
    public void staged() {
        ProductTailoringAddVariantAction value = ProductTailoringAddVariantAction.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
