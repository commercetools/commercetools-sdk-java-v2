
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   SimilarProductsTaskStatus similarProductsTaskStatus = SimilarProductsTaskStatus.builder()
           .state(TaskStatusEnum.PENDING)
           .result(resultBuilder -> resultBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductsTaskStatusBuilder implements Builder<SimilarProductsTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    @Nullable
    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult result;

    public SimilarProductsTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     */

    public SimilarProductsTaskStatusBuilder expires(@Nullable final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     */

    public SimilarProductsTaskStatusBuilder result(
            Function<com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder, com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder> builder) {
        this.result = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     */

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
