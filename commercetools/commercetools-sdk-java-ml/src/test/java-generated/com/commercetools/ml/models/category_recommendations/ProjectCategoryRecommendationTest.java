
package com.commercetools.ml.models.category_recommendations;

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
public class ProjectCategoryRecommendationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectCategoryRecommendationBuilder builder) {
        ProjectCategoryRecommendation projectCategoryRecommendation = builder.buildUnchecked();
        Assertions.assertThat(projectCategoryRecommendation).isInstanceOf(ProjectCategoryRecommendation.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] {
                new Object[] { ProjectCategoryRecommendation.builder()
                        .category(new com.commercetools.ml.models.common.CategoryReferenceImpl()) },
                new Object[] { ProjectCategoryRecommendation.builder().confidence(0.7333717) },
                new Object[] { ProjectCategoryRecommendation.builder().path("path") } };
    }

    @Test
    public void category() {
        ProjectCategoryRecommendation value = ProjectCategoryRecommendation.of();
        value.setCategory(new com.commercetools.ml.models.common.CategoryReferenceImpl());
        Assertions.assertThat(value.getCategory())
                .isEqualTo(new com.commercetools.ml.models.common.CategoryReferenceImpl());
    }

    @Test
    public void confidence() {
        ProjectCategoryRecommendation value = ProjectCategoryRecommendation.of();
        value.setConfidence(0.7333717);
        Assertions.assertThat(value.getConfidence()).isEqualTo(0.7333717);
    }

    @Test
    public void path() {
        ProjectCategoryRecommendation value = ProjectCategoryRecommendation.of();
        value.setPath("path");
        Assertions.assertThat(value.getPath()).isEqualTo("path");
    }
}
