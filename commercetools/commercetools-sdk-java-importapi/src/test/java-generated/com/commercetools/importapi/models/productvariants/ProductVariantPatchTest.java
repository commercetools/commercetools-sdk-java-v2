
package com.commercetools.importapi.models.productvariants;

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
public class ProductVariantPatchTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProductVariantPatchBuilder builder) {
        ProductVariantPatch productVariantPatch = builder.buildUnchecked();
        Assertions.assertThat(productVariantPatch).isInstanceOf(ProductVariantPatch.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProductVariantPatch.builder()
                .productVariant(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl()) },
                new Object[] { ProductVariantPatch.builder()
                        .attributes(new com.commercetools.importapi.models.productvariants.AttributesImpl()) },
                new Object[] { ProductVariantPatch.builder().staged(true) } };
    }

    @Test
    public void productVariant() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setProductVariant(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
        Assertions.assertThat(value.getProductVariant())
                .isEqualTo(new com.commercetools.importapi.models.common.ProductVariantKeyReferenceImpl());
    }

    @Test
    public void attributes() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setAttributes(new com.commercetools.importapi.models.productvariants.AttributesImpl());
        Assertions.assertThat(value.getAttributes())
                .isEqualTo(new com.commercetools.importapi.models.productvariants.AttributesImpl());
    }

    @Test
    public void staged() {
        ProductVariantPatch value = ProductVariantPatch.of();
        value.setStaged(true);
        Assertions.assertThat(value.getStaged()).isEqualTo(true);
    }
}
