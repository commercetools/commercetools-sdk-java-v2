
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ResourceSizeLimitExceededErrorBuilder {

    private String message;

    public ResourceSizeLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ResourceSizeLimitExceededError build() {
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
