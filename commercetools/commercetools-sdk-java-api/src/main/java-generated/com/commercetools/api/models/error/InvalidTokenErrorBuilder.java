
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidTokenErrorBuilder {

    private String message;

    public InvalidTokenErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidTokenError build() {
        return new InvalidTokenErrorImpl(message);
    }

    public static InvalidTokenErrorBuilder of() {
        return new InvalidTokenErrorBuilder();
    }

    public static InvalidTokenErrorBuilder of(final InvalidTokenError template) {
        InvalidTokenErrorBuilder builder = new InvalidTokenErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
