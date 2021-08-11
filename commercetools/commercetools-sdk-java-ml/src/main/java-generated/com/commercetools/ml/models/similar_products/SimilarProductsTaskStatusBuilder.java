
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SimilarProductsTaskStatusBuilder implements Builder<SimilarProductsTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    @Nullable
    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult result;

    public SimilarProductsTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    public SimilarProductsTaskStatusBuilder expires(@Nullable final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    public SimilarProductsTaskStatusBuilder result(
            Function<com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder, com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder> builder) {
        this.result = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder.of())
                .build();
        return this;
    }

    public SimilarProductsTaskStatusBuilder result(
            final com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult result) {
        this.result = result;
        return this;
    }

    public com.commercetools.ml.models.common.TaskStatusEnum getState() {
        return this.state;
    }

    @Nullable
    public java.time.ZonedDateTime getExpires() {
        return this.expires;
    }

    public com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult getResult() {
        return this.result;
    }

    public SimilarProductsTaskStatus build() {
        Objects.requireNonNull(state, SimilarProductsTaskStatus.class + ": state is missing");
        Objects.requireNonNull(result, SimilarProductsTaskStatus.class + ": result is missing");
        return new SimilarProductsTaskStatusImpl(state, expires, result);
    }

    /**
     * builds SimilarProductsTaskStatus without checking for non null required values
     */
    public SimilarProductsTaskStatus buildUnchecked() {
        return new SimilarProductsTaskStatusImpl(state, expires, result);
    }

    public static SimilarProductsTaskStatusBuilder of() {
        return new SimilarProductsTaskStatusBuilder();
    }

    public static SimilarProductsTaskStatusBuilder of(final SimilarProductsTaskStatus template) {
        SimilarProductsTaskStatusBuilder builder = new SimilarProductsTaskStatusBuilder();
        builder.state = template.getState();
        builder.expires = template.getExpires();
        builder.result = template.getResult();
        return builder;
    }

}
