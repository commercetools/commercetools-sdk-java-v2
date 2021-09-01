
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AccessDeniedErrorBuilder implements Builder<AccessDeniedError> {

    private String message;

    public AccessDeniedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public AccessDeniedError build() {
        Objects.requireNonNull(message, AccessDeniedError.class + ": message is missing");
        return new AccessDeniedErrorImpl(message);
    }

    /**
     * builds AccessDeniedError without checking for non null required values
     */
    public AccessDeniedError buildUnchecked() {
        return new AccessDeniedErrorImpl(message);
    }

    public static AccessDeniedErrorBuilder of() {
        return new AccessDeniedErrorBuilder();
    }

    public static AccessDeniedErrorBuilder of(final AccessDeniedError template) {
        AccessDeniedErrorBuilder builder = new AccessDeniedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
