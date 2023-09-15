
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
public class ProjectCategoryRecommendationMetaTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(ProjectCategoryRecommendationMetaBuilder builder) {
        ProjectCategoryRecommendationMeta projectCategoryRecommendationMeta = builder.buildUnchecked();
        Assertions.assertThat(projectCategoryRecommendationMeta).isInstanceOf(ProjectCategoryRecommendationMeta.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { ProjectCategoryRecommendationMeta.builder().productName("productName") },
                new Object[] { ProjectCategoryRecommendationMeta.builder().productImageUrl("productImageUrl") },
                new Object[] { ProjectCategoryRecommendationMeta.builder()
                        .generalCategoryNames(Collections.singletonList("generalCategoryNames")) } };
    }

    @Test
    public void productName() {
        ProjectCategoryRecommendationMeta value = ProjectCategoryRecommendationMeta.of();
        value.setProductName("productName");
        Assertions.assertThat(value.getProductName()).isEqualTo("productName");
    }

    @Test
    public void productImageUrl() {
        ProjectCategoryRecommendationMeta value = ProjectCategoryRecommendationMeta.of();
        value.setProductImageUrl("productImageUrl");
        Assertions.assertThat(value.getProductImageUrl()).isEqualTo("productImageUrl");
    }

    @Test
    public void generalCategoryNames() {
        ProjectCategoryRecommendationMeta value = ProjectCategoryRecommendationMeta.of();
        value.setGeneralCategoryNames(Collections.singletonList("generalCategoryNames"));
        Assertions.assertThat(value.getGeneralCategoryNames())
                .isEqualTo(Collections.singletonList("generalCategoryNames"));
    }
}
