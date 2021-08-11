
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GenericErrorBuilder implements Builder<GenericError> {

    private String message;

    public GenericErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public GenericError build() {
        Objects.requireNonNull(message, GenericError.class + ": message is missing");
        return new GenericErrorImpl(message);
    }

    /**
     * builds GenericError without checking for non null required values
     */
    public GenericError buildUnchecked() {
        return new GenericErrorImpl(message);
    }

    public static GenericErrorBuilder of() {
        return new GenericErrorBuilder();
    }

    public static GenericErrorBuilder of(final GenericError template) {
        GenericErrorBuilder builder = new GenericErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
