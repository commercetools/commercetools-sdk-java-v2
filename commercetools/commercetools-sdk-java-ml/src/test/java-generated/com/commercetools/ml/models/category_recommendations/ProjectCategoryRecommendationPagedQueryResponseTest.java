
package com.commercetools.ml.models.category_recommendations;

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
public class ProjectCategoryRecommendationPagedQueryResponseTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectCategoryRecommendationPagedQueryResponseBuilder builder) {
        ProjectCategoryRecommendationPagedQueryResponse projectCategoryRecommendationPagedQueryResponse = builder
                .buildUnchecked();
        Assertions.assertThat(projectCategoryRecommendationPagedQueryResponse)
                .isInstanceOf(ProjectCategoryRecommendationPagedQueryResponse.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectCategoryRecommendationPagedQueryResponse.builder().count(2L) },
                new Object[] { ProjectCategoryRecommendationPagedQueryResponse.builder().total(1L) },
                new Object[] { ProjectCategoryRecommendationPagedQueryResponse.builder().offset(3L) },
                new Object[] { ProjectCategoryRecommendationPagedQueryResponse.builder()
                        .results(Collections.singletonList(
                            new com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationImpl())) },
                new Object[] { ProjectCategoryRecommendationPagedQueryResponse.builder()
                        .meta(
                            new com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaImpl()) } };
    }

    @Test
    public void count() {
        ProjectCategoryRecommendationPagedQueryResponse value = ProjectCategoryRecommendationPagedQueryResponse.of();
        value.setCount(2L);
        Assertions.assertThat(value.getCount()).isEqualTo(2L);
    }

    @Test
    public void total() {
        ProjectCategoryRecommendationPagedQueryResponse value = ProjectCategoryRecommendationPagedQueryResponse.of();
        value.setTotal(1L);
        Assertions.assertThat(value.getTotal()).isEqualTo(1L);
    }

    @Test
    public void offset() {
        ProjectCategoryRecommendationPagedQueryResponse value = ProjectCategoryRecommendationPagedQueryResponse.of();
        value.setOffset(3L);
        Assertions.assertThat(value.getOffset()).isEqualTo(3L);
    }

    @Test
    public void results() {
        ProjectCategoryRecommendationPagedQueryResponse value = ProjectCategoryRecommendationPagedQueryResponse.of();
        value.setResults(Collections.singletonList(
            new com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationImpl()));
        Assertions.assertThat(value.getResults())
                .isEqualTo(Collections.singletonList(
                    new com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationImpl()));
    }

    @Test
    public void meta() {
        ProjectCategoryRecommendationPagedQueryResponse value = ProjectCategoryRecommendationPagedQueryResponse.of();
        value.setMeta(new com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaImpl());
        Assertions.assertThat(value.getMeta())
                .isEqualTo(
                    new com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaImpl());
    }
}
