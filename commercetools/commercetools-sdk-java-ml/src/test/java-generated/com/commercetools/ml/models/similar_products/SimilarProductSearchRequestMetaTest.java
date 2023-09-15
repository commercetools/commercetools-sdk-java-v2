
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
public class SimilarProductSearchRequestMetaTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductSearchRequestMetaBuilder builder) {
        SimilarProductSearchRequestMeta similarProductSearchRequestMeta = builder.buildUnchecked();
        Assertions.assertThat(similarProductSearchRequestMeta).isInstanceOf(SimilarProductSearchRequestMeta.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SimilarProductSearchRequestMeta.builder()
                .similarityMeasures(new com.commercetools.ml.models.similar_products.SimilarityMeasuresImpl()) } };
    }

    @Test
    public void similarityMeasures() {
        SimilarProductSearchRequestMeta value = SimilarProductSearchRequestMeta.of();
        value.setSimilarityMeasures(new com.commercetools.ml.models.similar_products.SimilarityMeasuresImpl());
        Assertions.assertThat(value.getSimilarityMeasures())
                .isEqualTo(new com.commercetools.ml.models.similar_products.SimilarityMeasuresImpl());
    }
}
