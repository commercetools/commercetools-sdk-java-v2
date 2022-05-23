
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MissingImagesTaskStatus missingImagesTaskStatus = MissingImagesTaskStatus.builder()
           .state(TaskStatusEnum.PENDING)
           .expires(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
           .result(resultBuilder -> resultBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MissingImagesTaskStatusBuilder implements Builder<MissingImagesTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResult result;

    public MissingImagesTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>The expiry date of the result. You cannot access the result after the expiry date. Default: 1 day after the result first becomes available. This is only available when the TaskStatus state is SUCCESS.</p>
     */

    public MissingImagesTaskStatusBuilder expires(final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     */

    public MissingImagesTaskStatusBuilder result(
            Function<com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResultBuilder, com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResultBuilder> builder) {
        this.result = builder.apply(com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResultBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The response to an asynchronous request. The type depends on the request initiated. Only populated when the status is <code>SUCCESS</code>.</p>
     */

    public MissingImagesTaskStatusBuilder result(
            final com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResult result) {
        this.result = result;
        return this;
    }

    public com.commercetools.ml.models.common.TaskStatusEnum getState() {
        return this.state;
    }

    public java.time.ZonedDateTime getExpires() {
        return this.expires;
    }

    public com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResult getResult() {
        return this.result;
    }

    public MissingImagesTaskStatus build() {
        Objects.requireNonNull(state, MissingImagesTaskStatus.class + ": state is missing");
        Objects.requireNonNull(expires, MissingImagesTaskStatus.class + ": expires is missing");
        Objects.requireNonNull(result, MissingImagesTaskStatus.class + ": result is missing");
        return new MissingImagesTaskStatusImpl(state, expires, result);
    }

    /**
     * builds MissingImagesTaskStatus without checking for non null required values
     */
    public MissingImagesTaskStatus buildUnchecked() {
        return new MissingImagesTaskStatusImpl(state, expires, result);
    }

    public static MissingImagesTaskStatusBuilder of() {
        return new MissingImagesTaskStatusBuilder();
    }

    public static MissingImagesTaskStatusBuilder of(final MissingImagesTaskStatus template) {
        MissingImagesTaskStatusBuilder builder = new MissingImagesTaskStatusBuilder();
        builder.state = template.getState();
        builder.expires = template.getExpires();
        builder.result = template.getResult();
        return builder;
    }

}
