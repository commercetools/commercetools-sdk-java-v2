
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class PendingOperationErrorBuilder implements Builder<PendingOperationError> {

    private String message;

    public PendingOperationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public PendingOperationError build() {
        Objects.requireNonNull(message, PendingOperationError.class + ": message is missing");
        return new PendingOperationErrorImpl(message);
    }

    /**
     * builds PendingOperationError without checking for non null required values
     */
    public PendingOperationError buildUnchecked() {
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
