
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PendingOperationErrorBuilder {

    private String message;

    public PendingOperationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public PendingOperationError build() {
        return new PendingOperationErrorImpl(message);
    }

    public static PendingOperationErrorBuilder of() {
        return new PendingOperationErrorBuilder();
    }

    public static PendingOperationErrorBuilder of(final PendingOperationError template) {
        PendingOperationErrorBuilder builder = new PendingOperationErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
