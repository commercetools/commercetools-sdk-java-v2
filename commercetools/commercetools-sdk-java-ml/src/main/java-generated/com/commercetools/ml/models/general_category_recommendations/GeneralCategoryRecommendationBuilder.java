
package com.commercetools.ml.models.general_category_recommendations;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeneralCategoryRecommendationBuilder implements Builder<GeneralCategoryRecommendation> {

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
        Objects.requireNonNull(categoryName, GeneralCategoryRecommendation.class + ": categoryName is missing");
        Objects.requireNonNull(confidence, GeneralCategoryRecommendation.class + ": confidence is missing");
        return new GeneralCategoryRecommendationImpl(categoryName, confidence);
    }

    /**
     * builds GeneralCategoryRecommendation without checking for non null required values
     */
    public GeneralCategoryRecommendation buildUnchecked() {
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
