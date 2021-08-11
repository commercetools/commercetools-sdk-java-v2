
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceSizeLimitExceededErrorBuilder implements Builder<ResourceSizeLimitExceededError> {

    private String message;

    public ResourceSizeLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ResourceSizeLimitExceededError build() {
        Objects.requireNonNull(message, ResourceSizeLimitExceededError.class + ": message is missing");
        return new ResourceSizeLimitExceededErrorImpl(message);
    }

    /**
     * builds ResourceSizeLimitExceededError without checking for non null required values
     */
    public ResourceSizeLimitExceededError buildUnchecked() {
        return new ResourceSizeLimitExceededErrorImpl(message);
    }

    public static ResourceSizeLimitExceededErrorBuilder of() {
        return new ResourceSizeLimitExceededErrorBuilder();
    }

    public static ResourceSizeLimitExceededErrorBuilder of(final ResourceSizeLimitExceededError template) {
        ResourceSizeLimitExceededErrorBuilder builder = new ResourceSizeLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
