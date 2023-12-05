
package com.commercetools.ml.models.similar_products;

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
public class SimilarProductTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductBuilder builder) {
        SimilarProduct similarProduct = builder.buildUnchecked();
        Assertions.assertThat(similarProduct).isInstanceOf(SimilarProduct.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SimilarProduct.builder()
                        .product(new com.commercetools.ml.models.common.ProductReferenceImpl()) },
                new Object[] { SimilarProduct.builder().variantId(5L) }, new Object[] { SimilarProduct.builder()
                        .meta(new com.commercetools.ml.models.similar_products.SimilarProductMetaImpl()) } };
    }

    @Test
    public void product() {
        SimilarProduct value = SimilarProduct.of();
        value.setProduct(new com.commercetools.ml.models.common.ProductReferenceImpl());
        Assertions.assertThat(value.getProduct())
                .isEqualTo(new com.commercetools.ml.models.common.ProductReferenceImpl());
    }

    @Test
    public void variantId() {
        SimilarProduct value = SimilarProduct.of();
        value.setVariantId(5L);
        Assertions.assertThat(value.getVariantId()).isEqualTo(5L);
    }

    @Test
    public void meta() {
        SimilarProduct value = SimilarProduct.of();
        value.setMeta(new com.commercetools.ml.models.similar_products.SimilarProductMetaImpl());
        Assertions.assertThat(value.getMeta())
                .isEqualTo(new com.commercetools.ml.models.similar_products.SimilarProductMetaImpl());
    }
}
