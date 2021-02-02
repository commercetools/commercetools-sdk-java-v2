
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidScopeErrorBuilder {

    private String message;

    public InvalidScopeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidScopeError build() {
        return new InvalidScopeErrorImpl(message);
    }

    public static InvalidScopeErrorBuilder of() {
        return new InvalidScopeErrorBuilder();
    }

    public static InvalidScopeErrorBuilder of(final InvalidScopeError template) {
        InvalidScopeErrorBuilder builder = new InvalidScopeErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
