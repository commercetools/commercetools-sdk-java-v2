
package com.commercetools.ml.models.category_recommendations;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProjectCategoryRecommendationPagedQueryResponseBuilder
        implements Builder<ProjectCategoryRecommendationPagedQueryResponse> {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> results;

    private com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta meta;

    public ProjectCategoryRecommendationPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder results(
            final com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> results) {
        this.results = results;
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder plusResults(
            final com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation... results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }

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

    public ProjectCategoryRecommendationPagedQueryResponseBuilder withResults(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder
                .apply(com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationBuilder.of())
                .build());
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder meta(
            Function<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder, com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder> builder) {
        this.meta = builder
                .apply(
                    com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMetaBuilder.of())
                .build();
        return this;
    }

    public ProjectCategoryRecommendationPagedQueryResponseBuilder meta(
            final com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta meta) {
        this.meta = meta;
        return this;
    }

    public Long getCount() {
        return this.count;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getOffset() {
        return this.offset;
    }

    public java.util.List<com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendation> getResults() {
        return this.results;
    }

    public com.commercetools.ml.models.category_recommendations.ProjectCategoryRecommendationMeta getMeta() {
        return this.meta;
    }

    public ProjectCategoryRecommendationPagedQueryResponse build() {
        Objects.requireNonNull(count, ProjectCategoryRecommendationPagedQueryResponse.class + ": count is missing");
        Objects.requireNonNull(total, ProjectCategoryRecommendationPagedQueryResponse.class + ": total is missing");
        Objects.requireNonNull(offset, ProjectCategoryRecommendationPagedQueryResponse.class + ": offset is missing");
        Objects.requireNonNull(results, ProjectCategoryRecommendationPagedQueryResponse.class + ": results is missing");
        Objects.requireNonNull(meta, ProjectCategoryRecommendationPagedQueryResponse.class + ": meta is missing");
        return new ProjectCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results, meta);
    }

    /**
     * builds ProjectCategoryRecommendationPagedQueryResponse without checking for non null required values
     */
    public ProjectCategoryRecommendationPagedQueryResponse buildUnchecked() {
        return new ProjectCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results, meta);
    }

    public static ProjectCategoryRecommendationPagedQueryResponseBuilder of() {
        return new ProjectCategoryRecommendationPagedQueryResponseBuilder();
    }

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
