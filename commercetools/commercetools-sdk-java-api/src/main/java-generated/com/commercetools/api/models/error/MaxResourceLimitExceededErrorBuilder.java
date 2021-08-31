
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MaxResourceLimitExceededErrorBuilder implements Builder<MaxResourceLimitExceededError> {

    private String message;

    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    public MaxResourceLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public MaxResourceLimitExceededErrorBuilder exceededResource(
            final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource() {
        return this.exceededResource;
    }

    public MaxResourceLimitExceededError build() {
        Objects.requireNonNull(message, MaxResourceLimitExceededError.class + ": message is missing");
        Objects.requireNonNull(exceededResource, MaxResourceLimitExceededError.class + ": exceededResource is missing");
        return new MaxResourceLimitExceededErrorImpl(message, exceededResource);
    }

    /**
     * builds MaxResourceLimitExceededError without checking for non null required values
     */
    public MaxResourceLimitExceededError buildUnchecked() {
        return new MaxResourceLimitExceededErrorImpl(message, exceededResource);
    }

    public static MaxResourceLimitExceededErrorBuilder of() {
        return new MaxResourceLimitExceededErrorBuilder();
    }

    public static MaxResourceLimitExceededErrorBuilder of(final MaxResourceLimitExceededError template) {
        MaxResourceLimitExceededErrorBuilder builder = new MaxResourceLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.exceededResource = template.getExceededResource();
        return builder;
    }

}
