
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AccessDeniedErrorBuilder {

    private String message;

    public AccessDeniedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public AccessDeniedError build() {
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
