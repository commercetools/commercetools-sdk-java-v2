
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingDataTaskStatusBuilder implements Builder<MissingDataTaskStatus> {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResult result;

    public MissingDataTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    public MissingDataTaskStatusBuilder expires(final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

    public MissingDataTaskStatusBuilder result(
            Function<com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResultBuilder, com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResultBuilder> builder) {
        this.result = builder
                .apply(com.commercetools.ml.models.missing_data.MissingAttributesPagedQueryResultBuilder.of())
                .build();
        return this;
    }

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
