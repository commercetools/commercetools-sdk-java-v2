
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExternalOAuthFailedErrorBuilder {

    private String message;

    public ExternalOAuthFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ExternalOAuthFailedError build() {
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
