
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
public class SimilarProductsPagedQueryResultTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductsPagedQueryResultBuilder builder) {
        SimilarProductsPagedQueryResult similarProductsPagedQueryResult = builder.buildUnchecked();
        Assertions.assertThat(similarProductsPagedQueryResult).isInstanceOf(SimilarProductsPagedQueryResult.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SimilarProductsPagedQueryResult.builder().count(2L) },
                new Object[] { SimilarProductsPagedQueryResult.builder().total(1L) },
                new Object[] { SimilarProductsPagedQueryResult.builder().offset(3L) },
                new Object[] { SimilarProductsPagedQueryResult.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.ml.models.similar_products.SimilarProductPairImpl())) },
                new Object[] { SimilarProductsPagedQueryResult.builder()
                        .meta(
                            new com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaImpl()) } };
    }

    @Test
    public void count() {
        SimilarProductsPagedQueryResult value = SimilarProductsPagedQueryResult.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        SimilarProductsPagedQueryResult value = SimilarProductsPagedQueryResult.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        SimilarProductsPagedQueryResult value = SimilarProductsPagedQueryResult.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        SimilarProductsPagedQueryResult value = SimilarProductsPagedQueryResult.of();
        value.setResults(
            Collections.singletonList(new com.commercetools.ml.models.similar_products.SimilarProductPairImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections
                        .singletonList(new com.commercetools.ml.models.similar_products.SimilarProductPairImpl()));
    }

    @Test
    public void meta() {
        SimilarProductsPagedQueryResult value = SimilarProductsPagedQueryResult.of();
        value.setMeta(new com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaImpl());
        Assertions.assertThat(value.getMeta())
                .isEqualTo(new com.commercetools.ml.models.similar_products.SimilarProductSearchRequestMetaImpl());
    }
}
