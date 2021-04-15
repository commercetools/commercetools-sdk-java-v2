
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidOperationErrorBuilder {

    private String message;

    public InvalidOperationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidOperationError build() {
        return new InvalidOperationErrorImpl(message);
    }

    public static InvalidOperationErrorBuilder of() {
        return new InvalidOperationErrorBuilder();
    }

    public static InvalidOperationErrorBuilder of(final InvalidOperationError template) {
        InvalidOperationErrorBuilder builder = new InvalidOperationErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
