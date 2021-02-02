
package com.commercetools.ml.models.general_category_recommendations;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeneralCategoryRecommendationBuilder {

    private String categoryName;

    private Double confidence;

    public GeneralCategoryRecommendationBuilder categoryName(final String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    public GeneralCategoryRecommendationBuilder confidence(final Double confidence) {
        this.confidence = confidence;
        return this;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public Double getConfidence() {
        return this.confidence;
    }

    public GeneralCategoryRecommendation build() {
        return new GeneralCategoryRecommendationImpl(categoryName, confidence);
    }

    public static GeneralCategoryRecommendationBuilder of() {
        return new GeneralCategoryRecommendationBuilder();
    }

    public static GeneralCategoryRecommendationBuilder of(final GeneralCategoryRecommendation template) {
        GeneralCategoryRecommendationBuilder builder = new GeneralCategoryRecommendationBuilder();
        builder.categoryName = template.getCategoryName();
        builder.confidence = template.getConfidence();
        return builder;
    }

}
