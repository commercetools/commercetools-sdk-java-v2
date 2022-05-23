
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingPricesTaskStatusBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingPricesTaskStatus missingPricesTaskStatus = MissingPricesTaskStatus.builder()
 *             .state(TaskStatusEnum.PENDING)
 *             .expires(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingPricesTaskStatusBuilder implements Builder<MissingPricesTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult result;

    /**
     <>
     */

    public MissingPricesTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    /**
     <*  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>>
     */

    public MissingPricesTaskStatusBuilder expires(final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    /**
     <*  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>>
     */

    public MissingPricesTaskStatusBuilder result(
            Function<com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResultBuilder, com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResultBuilder> builder) {
        this.result = builder.apply(com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResultBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>>
     */

    public MissingPricesTaskStatusBuilder result(
            final com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult result) {
        this.result = result;
        return this;
    }

    public com.commercetools.ml.models.common.TaskStatusEnum getState() {
        return this.state;
    }

    public java.time.ZonedDateTime getExpires() {
        return this.expires;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesPagedQueryResult getResult() {
        return this.result;
    }

    public MissingPricesTaskStatus build() {
        Objects.requireNonNull(state, MissingPricesTaskStatus.class + ": state is missing");
        Objects.requireNonNull(expires, MissingPricesTaskStatus.class + ": expires is missing");
        Objects.requireNonNull(result, MissingPricesTaskStatus.class + ": result is missing");
        return new MissingPricesTaskStatusImpl(state, expires, result);
    }

    /**
     * builds MissingPricesTaskStatus without checking for non null required values
     */
    public MissingPricesTaskStatus buildUnchecked() {
        return new MissingPricesTaskStatusImpl(state, expires, result);
    }

    public static MissingPricesTaskStatusBuilder of() {
        return new MissingPricesTaskStatusBuilder();
    }

    public static MissingPricesTaskStatusBuilder of(final MissingPricesTaskStatus template) {
        MissingPricesTaskStatusBuilder builder = new MissingPricesTaskStatusBuilder();
        builder.state = template.getState();
        builder.expires = template.getExpires();
        builder.result = template.getResult();
        return builder;
    }

}
