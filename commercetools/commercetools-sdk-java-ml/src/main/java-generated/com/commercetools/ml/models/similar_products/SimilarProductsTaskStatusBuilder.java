
package com.commercetools.ml.models.similar_products;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SimilarProductsTaskStatusBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SimilarProductsTaskStatus similarProductsTaskStatus = SimilarProductsTaskStatus.builder()
 *             .state(TaskStatusEnum.PENDING)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SimilarProductsTaskStatusBuilder implements Builder<SimilarProductsTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    @Nullable
    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult result;

    /**
     * set the value to the state
     * @param state value to be set
     * @return Builder
     */

    public SimilarProductsTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     * @param expires value to be set
     * @return Builder
     */

    public SimilarProductsTaskStatusBuilder expires(@Nullable final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     * @param builder function to build the result value
     * @return Builder
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
     * @param builder function to build the result value
     * @return Builder
     */

    public SimilarProductsTaskStatusBuilder withResult(
            Function<com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder, com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult> builder) {
        this.result = builder
                .apply(com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResultBuilder.of());
        return this;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     * @param result value to be set
     * @return Builder
     */

    public SimilarProductsTaskStatusBuilder result(
            final com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult result) {
        this.result = result;
        return this;
    }

    /**
     * value of state}
     * @return state
     */

    public com.commercetools.ml.models.common.TaskStatusEnum getState() {
        return this.state;
    }

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     * @return expires
     */

    @Nullable
    public java.time.ZonedDateTime getExpires() {
        return this.expires;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     * @return result
     */

    public com.commercetools.ml.models.similar_products.SimilarProductsPagedQueryResult getResult() {
        return this.result;
    }

    /**
     * builds SimilarProductsTaskStatus with checking for non-null required values
     * @return SimilarProductsTaskStatus
     */
    public SimilarProductsTaskStatus build() {
        Objects.requireNonNull(state, SimilarProductsTaskStatus.class + ": state is missing");
        Objects.requireNonNull(result, SimilarProductsTaskStatus.class + ": result is missing");
        return new SimilarProductsTaskStatusImpl(state, expires, result);
    }

    /**
     * builds SimilarProductsTaskStatus without checking for non-null required values
     * @return SimilarProductsTaskStatus
     */
    public SimilarProductsTaskStatus buildUnchecked() {
        return new SimilarProductsTaskStatusImpl(state, expires, result);
    }

    /**
     * factory method for an instance of SimilarProductsTaskStatusBuilder
     * @return builder
     */
    public static SimilarProductsTaskStatusBuilder of() {
        return new SimilarProductsTaskStatusBuilder();
    }

    /**
     * create builder for SimilarProductsTaskStatus instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SimilarProductsTaskStatusBuilder of(final SimilarProductsTaskStatus template) {
        SimilarProductsTaskStatusBuilder builder = new SimilarProductsTaskStatusBuilder();
        builder.state = template.getState();
        builder.expires = template.getExpires();
        builder.result = template.getResult();
        return builder;
    }

}
