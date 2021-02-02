
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingImagesTaskStatusBuilder {

    private com.commercetools.ml.models.common.TaskStatusEnum state;

    private java.time.ZonedDateTime expires;

    private com.commercetools.ml.models.missing_data.MissingImagesPagedQueryResult result;

    public MissingImagesTaskStatusBuilder state(final com.commercetools.ml.models.common.TaskStatusEnum state) {
        this.state = state;
        return this;
    }

    public MissingImagesTaskStatusBuilder expires(final java.time.ZonedDateTime expires) {
        this.expires = expires;
        return this;
    }

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
