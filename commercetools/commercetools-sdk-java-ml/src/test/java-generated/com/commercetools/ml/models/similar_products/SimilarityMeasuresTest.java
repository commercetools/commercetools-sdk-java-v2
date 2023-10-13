
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
public class SimilarityMeasuresTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(SimilarityMeasuresBuilder builder) {
        SimilarityMeasures similarityMeasures = builder.buildUnchecked();
        Assertions.assertThat(similarityMeasures).isInstanceOf(SimilarityMeasures.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { SimilarityMeasures.builder().name(4L) },
                new Object[] { SimilarityMeasures.builder().description(6L) },
                new Object[] { SimilarityMeasures.builder().attribute(8L) },
                new Object[] { SimilarityMeasures.builder().variantCount(5L) },
                new Object[] { SimilarityMeasures.builder().price(6L) } };
    }

    @Test
    public void name() {
        SimilarityMeasures value = SimilarityMeasures.of();
        value.setName(4L);
        Assertions.assertThat(value.getName()).isEqualTo(4L);
    }

    @Test
    public void description() {
        SimilarityMeasures value = SimilarityMeasures.of();
        value.setDescription(6L);
        Assertions.assertThat(value.getDescription()).isEqualTo(6L);
    }

    @Test
    public void attribute() {
        SimilarityMeasures value = SimilarityMeasures.of();
        value.setAttribute(8L);
        Assertions.assertThat(value.getAttribute()).isEqualTo(8L);
    }

    @Test
    public void variantCount() {
        SimilarityMeasures value = SimilarityMeasures.of();
        value.setVariantCount(5L);
        Assertions.assertThat(value.getVariantCount()).isEqualTo(5L);
    }

    @Test
    public void price() {
        SimilarityMeasures value = SimilarityMeasures.of();
        value.setPrice(6L);
        Assertions.assertThat(value.getPrice()).isEqualTo(6L);
    }
}
