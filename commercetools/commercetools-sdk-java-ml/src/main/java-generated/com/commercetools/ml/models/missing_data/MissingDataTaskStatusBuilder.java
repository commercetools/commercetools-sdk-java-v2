
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MissingDataTaskStatusBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MissingDataTaskStatus missingDataTaskStatus = MissingDataTaskStatus.builder()
 *             .state(TaskStatusEnum.PENDING)
 *             .expires(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingDataTaskStatusBuilder implements Builder<MissingDataTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResult result;

    /**
     <>
     */

    public MissingDataTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    /**
     <*  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>>
     */

    public MissingDataTaskStatusBuilder expires(final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    /**
     <*  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>>
     */

    public MissingDataTaskStatusBuilder result(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResultBuilder, com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResultBuilder> builder) {
        this.result = builder
                .apply(com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResultBuilder.of())
                .build();
        return this;
    }

    /**
     <*  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>>
     */

    public MissingDataTaskStatusBuilder result(
            final com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResult result) {
        this.result = result;
        return this;
    }

    public com.commercetools.ml.models.common.TaskStatusEnum getState() {
        return this.state;
    }

    public java.time.ZonedDateTime getExpires() {
        return this.expires;
    }

    public com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResult getResult() {
        return this.result;
    }

    public MissingDataTaskStatus build() {
        Objects.requireNonNull(state, MissingDataTaskStatus.class + ": state is missing");
        Objects.requireNonNull(expires, MissingDataTaskStatus.class + ": expires is missing");
        Objects.requireNonNull(result, MissingDataTaskStatus.class + ": result is missing");
        return new MissingDataTaskStatusImpl(state, expires, result);
    }

    /**
     * builds MissingDataTaskStatus without checking for non null required values
     */
    public MissingDataTaskStatus buildUnchecked() {
        return new MissingDataTaskStatusImpl(state, expires, result);
    }

    public static MissingDataTaskStatusBuilder of() {
        return new MissingDataTaskStatusBuilder();
    }

    public static MissingDataTaskStatusBuilder of(final MissingDataTaskStatus template) {
        MissingDataTaskStatusBuilder builder = new MissingDataTaskStatusBuilder();
        builder.state = template.getState();
        builder.expires = template.getExpires();
        builder.result = template.getResult();
        return builder;
    }

}
