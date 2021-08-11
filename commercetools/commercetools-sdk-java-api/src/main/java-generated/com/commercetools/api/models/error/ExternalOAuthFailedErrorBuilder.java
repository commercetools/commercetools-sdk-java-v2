
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalOAuthFailedErrorBuilder implements Builder<ExternalOAuthFailedError> {

    private String message;

    public ExternalOAuthFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ExternalOAuthFailedError build() {
        Objects.requireNonNull(message, ExternalOAuthFailedError.class + ": message is missing");
        return new ExternalOAuthFailedErrorImpl(message);
    }

    /**
     * builds ExternalOAuthFailedError without checking for non null required values
     */
    public ExternalOAuthFailedError buildUnchecked() {
        return new ExternalOAuthFailedErrorImpl(message);
    }

    public static ExternalOAuthFailedErrorBuilder of() {
        return new ExternalOAuthFailedErrorBuilder();
    }

    public static ExternalOAuthFailedErrorBuilder of(final ExternalOAuthFailedError template) {
        ExternalOAuthFailedErrorBuilder builder = new ExternalOAuthFailedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
