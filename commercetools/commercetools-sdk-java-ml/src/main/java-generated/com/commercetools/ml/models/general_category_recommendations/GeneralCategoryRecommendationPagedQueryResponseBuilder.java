
package com.commercetools.ml.models.general_category_recommendations;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeneralCategoryRecommendationPagedQueryResponseBuilder {

    private Long count;

    private Long total;

    private Long offset;

    private java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> results;

    public GeneralCategoryRecommendationPagedQueryResponseBuilder count(final Long count) {
        this.count = count;
        return this;
    }

    public GeneralCategoryRecommendationPagedQueryResponseBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public GeneralCategoryRecommendationPagedQueryResponseBuilder offset(final Long offset) {
        this.offset = offset;
        return this;
    }

    public GeneralCategoryRecommendationPagedQueryResponseBuilder results(
            final com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation... results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }

    public GeneralCategoryRecommendationPagedQueryResponseBuilder results(
            final java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> results) {
        this.results = results;
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

    public java.util.List<com.commercetools.ml.models.general_category_recommendations.GeneralCategoryRecommendation> getResults() {
        return this.results;
    }

    public GeneralCategoryRecommendationPagedQueryResponse build() {
        return new GeneralCategoryRecommendationPagedQueryResponseImpl(count, total, offset, results);
    }

    public static GeneralCategoryRecommendationPagedQueryResponseBuilder of() {
        return new GeneralCategoryRecommendationPagedQueryResponseBuilder();
    }

    public static GeneralCategoryRecommendationPagedQueryResponseBuilder of(
            final GeneralCategoryRecommendationPagedQueryResponse template) {
        GeneralCategoryRecommendationPagedQueryResponseBuilder builder = new GeneralCategoryRecommendationPagedQueryResponseBuilder();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.offset = template.getOffset();
        builder.results = template.getResults();
        return builder;
    }

}
