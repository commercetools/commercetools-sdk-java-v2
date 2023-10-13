
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
public class SimilarProductSearchRequestTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductSearchRequestBuilder builder) {
        SimilarProductSearchRequest similarProductSearchRequest = builder.buildUnchecked();
        Assertions.assertThat(similarProductSearchRequest).isInstanceOf(SimilarProductSearchRequest.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SimilarProductSearchRequest.builder().limit(7L) },
                new Object[] { SimilarProductSearchRequest.builder().offset(3L) },
                new Object[] { SimilarProductSearchRequest.builder().language("language") },
                new Object[] { SimilarProductSearchRequest.builder().currencyCode("currencyCode") },
                new Object[] { SimilarProductSearchRequest.builder()
                        .similarityMeasures(
                            new com.commercetools.ml.models.similar_products.SimilarityMeasuresImpl()) },
                new Object[] { SimilarProductSearchRequest.builder()
                        .productSetSelectors(Collections.singletonList(
                            new com.commercetools.ml.models.similar_products.ProductSetSelectorImpl())) },
                new Object[] { SimilarProductSearchRequest.builder().confidenceMin(0.7340351) },
                new Object[] { SimilarProductSearchRequest.builder().confidenceMax(0.30089796) } };
    }

    @Test
    public void limit() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setLimit(7L);
        Assertions.assertThat(value.getLimit()).isEqualTo(7L);
    }

    @Test
    public void offset() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void language() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setLanguage("language");
        Assertions.assertThat(value.getLanguage()).isEqualTo("language");
    }

    @Test
    public void currencyCode() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setCurrencyCode("currencyCode");
        Assertions.assertThat(value.getCurrencyCode()).isEqualTo("currencyCode");
    }

    @Test
    public void similarityMeasures() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setSimilarityMeasures(new com.commercetools.ml.models.similar_products.SimilarityMeasuresImpl());
        Assertions.assertThat(value.getSimilarityMeasures())
                .isEqualTo(new com.commercetools.ml.models.similar_products.SimilarityMeasuresImpl());
    }

    @Test
    public void productSetSelectors() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setProductSetSelectors(
            Collections.singletonList(new com.commercetools.ml.models.similar_products.ProductSetSelectorImpl()));
        Assertions.assertThat(value.getProductSetSelectors())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.ml.models.similar_products.ProductSetSelectorImpl()));
    }

    @Test
    public void confidenceMin() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setConfidenceMin(0.7340351);
        Assertions.assertThat(value.getConfidenceMin()).isEqualTo(0.7340351);
    }

    @Test
    public void confidenceMax() {
        SimilarProductSearchRequest value = SimilarProductSearchRequest.of();
        value.setConfidenceMax(0.30089796);
        Assertions.assertThat(value.getConfidenceMax()).isEqualTo(0.30089796);
    }
}
