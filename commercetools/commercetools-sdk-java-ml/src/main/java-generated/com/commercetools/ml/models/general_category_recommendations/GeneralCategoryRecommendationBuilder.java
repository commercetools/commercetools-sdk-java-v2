
package com.commercetools.ml.models.general_category_recommendations;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GeneralCategoryRecommendationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GeneralCategoryRecommendation generalCategoryRecommendation = GeneralCategoryRecommendation.builder()
 *             .categoryName("{categoryName}")
 *             .confidence(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GeneralCategoryRecommendationBuilder implements Builder<GeneralCategoryRecommendation> {

    private String categoryName;

    private Double confidence;

    /**
     *  <p>An English category name that is recommended for a product.</p>
     */

    public GeneralCategoryRecommendationBuilder categoryName(final String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     *  <p>Probability score for the category recommendation.</p>
     */

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
