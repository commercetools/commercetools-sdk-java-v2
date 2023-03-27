
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
     * @param categoryName value to be set
     * @return Builder
     */

    public GeneralCategoryRecommendationBuilder categoryName(final String categoryName) {
        this.categoryName = categoryName;
        return this;
    }

    /**
     *  <p>Probability score for the category recommendation.</p>
     * @param confidence value to be set
     * @return Builder
     */

    public GeneralCategoryRecommendationBuilder confidence(final Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     *  <p>An English category name that is recommended for a product.</p>
     * @return categoryName
     */

    public String getCategoryName() {
        return this.categoryName;
    }

    /**
     *  <p>Probability score for the category recommendation.</p>
     * @return confidence
     */

    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * builds GeneralCategoryRecommendation with checking for non-null required values
     * @return GeneralCategoryRecommendation
     */
    public GeneralCategoryRecommendation build() {
        Objects.requireNonNull(categoryName, GeneralCategoryRecommendation.class + ": categoryName is missing");
        Objects.requireNonNull(confidence, GeneralCategoryRecommendation.class + ": confidence is missing");
        return new GeneralCategoryRecommendationImpl(categoryName, confidence);
    }

    /**
     * builds GeneralCategoryRecommendation without checking for non-null required values
     * @return GeneralCategoryRecommendation
     */
    public GeneralCategoryRecommendation buildUnchecked() {
        return new GeneralCategoryRecommendationImpl(categoryName, confidence);
    }

    /**
     * factory method for an instance of GeneralCategoryRecommendationBuilder
     * @return builder
     */
    public static GeneralCategoryRecommendationBuilder of() {
        return new GeneralCategoryRecommendationBuilder();
    }

    /**
     * create builder for GeneralCategoryRecommendation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GeneralCategoryRecommendationBuilder of(final GeneralCategoryRecommendation template) {
        GeneralCategoryRecommendationBuilder builder = new GeneralCategoryRecommendationBuilder();
        builder.categoryName = template.getCategoryName();
        builder.confidence = template.getConfidence();
        return builder;
    }

}
