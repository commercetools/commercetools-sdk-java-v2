
package com.commercetools.ml.models.general_category_recommendations;

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
public class GeneralCategoryRecommendationTest {

    @TestTemplate
    @UseDataProvider("objectBuilder")
    public void buildUnchecked(GeneralCategoryRecommendationBuilder builder) {
        GeneralCategoryRecommendation generalCategoryRecommendation = builder.buildUnchecked();
        Assertions.assertThat(generalCategoryRecommendation).isInstanceOf(GeneralCategoryRecommendation.class);
    }

    @DataProvider
    public static Object[][] objectBuilder() {
        return new Object[][] { new Object[] { GeneralCategoryRecommendation.builder().categoryName("categoryName") },
                new Object[] { GeneralCategoryRecommendation.builder().confidence(0.7333717) } };
    }

    @Test
    public void categoryName() {
        GeneralCategoryRecommendation value = GeneralCategoryRecommendation.of();
        value.setCategoryName("categoryName");
        Assertions.assertThat(value.getCategoryName()).isEqualTo("categoryName");
    }

    @Test
    public void confidence() {
        GeneralCategoryRecommendation value = GeneralCategoryRecommendation.of();
        value.setConfidence(0.7333717);
        Assertions.assertThat(value.getConfidence()).isEqualTo(0.7333717);
    }
}
