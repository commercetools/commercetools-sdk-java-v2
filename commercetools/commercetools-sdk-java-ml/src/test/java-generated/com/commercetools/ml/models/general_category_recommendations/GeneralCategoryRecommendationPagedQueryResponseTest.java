
package com.commercetools.ml.models.general_category_recommendations;

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
public class GeneralCategoryRecommendationPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GeneralCategoryRecommendationPagedQueryResponseBuilder builder) {
        GeneralCategoryRecommendationPagedQueryResponse generalCategoryRecommendationPagedQueryResponse = builder
                .buildUnchecked();
        Assertions.assertThat(generalCategoryRecommendationPagedQueryResponse)
                .isInstanceOf(GeneralCategoryRecommendationPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GeneralCategoryRecommendationPagedQueryResponse.builder().count(2L) },
                new Object[] { GeneralCategoryRecommendationPagedQueryResponse.builder().total(1L) },
                new Object[] { GeneralCategoryRecommendationPagedQueryResponse.builder().offset(3L) },
                new Object[] { GeneralCategoryRecommendationPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationImpl())) } };
    }

    @Test
    public void count() {
        GeneralCategoryRecommendationPagedQueryResponse value = GeneralCategoryRecommendationPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        GeneralCategoryRecommendationPagedQueryResponse value = GeneralCategoryRecommendationPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        GeneralCategoryRecommendationPagedQueryResponse value = GeneralCategoryRecommendationPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        GeneralCategoryRecommendationPagedQueryResponse value = GeneralCategoryRecommendationPagedQueryResponse.of();
        value.setResults(Collections.singletonList(
            new com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendationImpl()));
    }
}
