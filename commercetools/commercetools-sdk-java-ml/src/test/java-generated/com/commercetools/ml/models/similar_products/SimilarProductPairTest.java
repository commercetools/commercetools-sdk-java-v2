
package com.commercetools.ml.models.similar_products;

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
public class SimilarProductPairTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductPairBuilder builder) {
        SimilarProductPair similarProductPair = builder.buildUnchecked();
        Assertions.assertThat(similarProductPair).isInstanceOf(SimilarProductPair.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SimilarProductPair.builder().confidence(0.7333717) },
                new Object[] { SimilarProductPair.builder()
                        .products(Collections.singletonList(
                            new com.commercetools.ml.models.similar_products.SimilarProductImpl())) } };
    }

    @Test
    public void confidence() {
        SimilarProductPair value = SimilarProductPair.of();
        value.setConfidence(0.7333717);
        Assertions.assertThat(value.getConfidence()).isEqualTo(0.7333717);
    }

    @Test
    public void products() {
        SimilarProductPair value = SimilarProductPair.of();
        value.setProducts(
            Collections.singletonList(new com.commercetools.ml.models.similar_products.SimilarProductImpl()));
        Assertions.assertThat(value.getProducts())
                .isEqualTo(
                    Collections.singletonList(new com.commercetools.ml.models.similar_products.SimilarProductImpl()));
    }
}
