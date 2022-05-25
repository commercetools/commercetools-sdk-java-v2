
package com.commercetools.ml.models.category_recommendations;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectCategoryRecommendationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectCategoryRecommendation projectCategoryRecommendation = ProjectCategoryRecommendation.builder()
 *             .category(categoryBuilder -> categoryBuilder)
 *             .confidence(0.3)
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectCategoryRecommendationBuilder implements Builder<ProjectCategoryRecommendation> {

    private com.commercetools.ml.models.common.CategoryReference category;

    private Double confidence;

    private String path;

    /**
     *  <p>A category that is recommended for a product.</p>
     */

    public ProjectCategoryRecommendationBuilder category(
            Function<com.commercetools.ml.models.common.CategoryReferenceBuilder, com.commercetools.ml.models.common.CategoryReferenceBuilder> builder) {
        this.category = builder.apply(com.commercetools.ml.models.common.CategoryReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>A category that is recommended for a product.</p>
     */

    public ProjectCategoryRecommendationBuilder category(
            final com.commercetools.ml.models.common.CategoryReference category) {
        this.category = category;
        return this;
    }

    /**
     *  <p>Probability score for the category recommendation.</p>
     */

    public ProjectCategoryRecommendationBuilder confidence(final Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     *  <p>Breadcrumb path to the recommended category. This only picks up one language, not all available languages for the category. English is prioritized, but if English data is not available, an arbitrary language is selected. Do not use this to identify a category,use the category ID from the category reference instead.</p>
     */

    public ProjectCategoryRecommendationBuilder path(final String path) {
        this.path = path;
        return this;
    }

    public com.commercetools.ml.models.common.CategoryReference getCategory() {
        return this.category;
    }

    public Double getConfidence() {
        return this.confidence;
    }

    public String getPath() {
        return this.path;
    }

    public ProjectCategoryRecommendation build() {
        Objects.requireNonNull(category, ProjectCategoryRecommendation.class + ": category is missing");
        Objects.requireNonNull(confidence, ProjectCategoryRecommendation.class + ": confidence is missing");
        Objects.requireNonNull(path, ProjectCategoryRecommendation.class + ": path is missing");
        return new ProjectCategoryRecommendationImpl(category, confidence, path);
    }

    /**
     * builds ProjectCategoryRecommendation without checking for non null required values
     */
    public ProjectCategoryRecommendation buildUnchecked() {
        return new ProjectCategoryRecommendationImpl(category, confidence, path);
    }

    public static ProjectCategoryRecommendationBuilder of() {
        return new ProjectCategoryRecommendationBuilder();
    }

    public static ProjectCategoryRecommendationBuilder of(final ProjectCategoryRecommendation template) {
        ProjectCategoryRecommendationBuilder builder = new ProjectCategoryRecommendationBuilder();
        builder.category = template.getCategory();
        builder.confidence = template.getConfidence();
        builder.path = template.getPath();
        return builder;
    }

}
