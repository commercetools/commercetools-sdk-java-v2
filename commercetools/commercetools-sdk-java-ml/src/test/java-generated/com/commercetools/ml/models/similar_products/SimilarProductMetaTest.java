
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
public class SimilarProductMetaTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarProductMetaBuilder builder) {
        SimilarProductMeta similarProductMeta = builder.buildUnchecked();
        Assertions.assertThat(similarProductMeta).isInstanceOf(SimilarProductMeta.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { SimilarProductMeta.builder()
                        .name(new com.commercetools.ml.models.common.LocalizedStringImpl()) },
                new Object[] { SimilarProductMeta.builder()
                        .description(new com.commercetools.ml.models.common.LocalizedStringImpl()) },
                new Object[] { SimilarProductMeta.builder().price(new com.commercetools.ml.models.common.MoneyImpl()) },
                new Object[] { SimilarProductMeta.builder().variantCount(5L) } };
    }

    @Test
    public void name() {
        SimilarProductMeta value = SimilarProductMeta.of();
        value.setName(new com.commercetools.ml.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getName()).isEqualTo(new com.commercetools.ml.models.common.LocalizedStringImpl());
    }

    @Test
    public void description() {
        SimilarProductMeta value = SimilarProductMeta.of();
        value.setDescription(new com.commercetools.ml.models.common.LocalizedStringImpl());
        Assertions.assertThat(value.getDescription())
                .isEqualTo(new com.commercetools.ml.models.common.LocalizedStringImpl());
    }

    @Test
    public void price() {
        SimilarProductMeta value = SimilarProductMeta.of();
        value.setPrice(new com.commercetools.ml.models.common.MoneyImpl());
        Assertions.assertThat(value.getPrice()).isEqualTo(new com.commercetools.ml.models.common.MoneyImpl());
    }

    @Test
    public void variantCount() {
        SimilarProductMeta value = SimilarProductMeta.of();
        value.setVariantCount(5L);
        Assertions.assertThat(value.getVariantCount()).isEqualTo(5L);
    }
}
