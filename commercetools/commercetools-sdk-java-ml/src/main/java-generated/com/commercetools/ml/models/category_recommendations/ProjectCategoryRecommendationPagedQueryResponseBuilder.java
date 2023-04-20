
package com.commercetools.ml.models.category_recommendations;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectCategoryRecommendationPagedQueryResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectCategoryRecommendationPagedQueryResponse projectCategoryRecommendationPagedQueryResponse = ProjectCategoryRecommendationPagedQueryResponse.builder()
 *             .count(0.3)
 *             .total(0.3)
 *             .offset(0.3)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .meta(metaBuilder -> metaBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectCategoryRecommendationPagedQueryResponseBuilder
        implements Builder<ProjectCategoryRecommendationPagedQueryResponse> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> results;

    private com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta meta;

    /**
     * set the value to the count
     * @param count value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    /**
     * set the value to the total
     * @param total value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    /**
     * set values to the results
     * @param results value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder results(
            final com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    /**
     * set value to the results
     * @param results value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> results) {
        this.results = results;
        return this;
    }

    /**
     * add values to the results
     * @param results value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder plusResults(
            final com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder plusResults(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder
                .apply(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder.of())
                .build());
        return this;
    }

    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder withResults(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder
                .apply(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder.of())
                .build());
        return this;
    }

    /**
     * add the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder addResults(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> builder) {
        return plusResults(builder
                .apply(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder.of()));
    }

    /**
     * set the value to the results using the builder function
     * @param builder function to build the results value
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder setResults(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> builder) {
        return results(builder
                .apply(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder.of()));
    }

    /**
     * set the value to the meta using the builder function
     * @param builder function to build the meta value
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder meta(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder> builder) {
        this.meta = builder
                .apply(
                    com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder.of())
                .build();
        return this;
    }

    /**
     * set the value to the meta using the builder function
     * @param builder function to build the meta value
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder withMeta(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta> builder) {
        this.meta = builder.apply(
            com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder.of());
        return this;
    }

    /**
     * set the value to the meta
     * @param meta value to be set
     * @return Builder
     */

    public ProjectCategoryRecommendationPagedQueryResponseBuilder meta(
            final com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta meta) {
        this.meta = meta;
        return this;
    }

    /**
     * value of count}
     * @return count
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * value of total}
     * @return total
     */

    public Long getTotal() {
        return this.total;
    }

    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */

    public Long getOffset() {
        return this.offset;
    }

    /**
     * value of results}
     * @return results
     */

    public java.util.List<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> getResults() {
        return this.results;
    }

    /**
     * value of meta}
     * @return meta
     */

    public com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta getMeta() {
        return this.meta;
    }

    /**
     * builds ProjectCategoryRecommendationPagedQueryResponse with checking for non-null required values
     * @return ProjectCategoryRecommendationPagedQueryResponse
     */
    public ProjectCategoryRecommendationPagedQueryResponse build() {
        Objects.requireNonNull(count, ProjectCategoryRecommendationPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(total, ProjectCategoryRecommendationPagedQueryResponse.class + ": total is missing");
        Objects.requireNonNull(offset, ProjectCategoryRecommendationPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProjectCategoryRecommendationPagedQueryResponse.class + ": results is missing");
        Objects.requireNonNull(meta, ProjectCategoryRecommendationPagedQueryResponse.class + ": meta is missing");
        return new ProjectCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results, meta);
    }

    /**
     * builds ProjectCategoryRecommendationPagedQueryResponse without checking for non-null required values
     * @return ProjectCategoryRecommendationPagedQueryResponse
     */
    public ProjectCategoryRecommendationPagedQueryResponse buildUnchecked() {
        return new ProjectCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results, meta);
    }

    /**
     * factory method for an instance of ProjectCategoryRecommendationPagedQueryResponseBuilder
     * @return builder
     */
    public static ProjectCategoryRecommendationPagedQueryResponseBuilder of() {
        return new ProjectCategoryRecommendationPagedQueryResponseBuilder();
    }

    /**
     * create builder for ProjectCategoryRecommendationPagedQueryResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectCategoryRecommendationPagedQueryResponseBuilder of(
            final ProjectCategoryRecommendationPagedQueryResponse template) {
        ProjectCategoryRecommendationPagedQueryResponseBuilder builder = new ProjectCategoryRecommendationPagedQueryResponseBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        builder.meta = template.getMeta();
        return builder;
    }

}
