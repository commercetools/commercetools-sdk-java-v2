
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GeneralErrorBuilder implements Builder<GeneralError> {

    private String message;

    public GeneralErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public GeneralError build() {
        Objects.requireNonNull(message, GeneralError.class + ": message is missing");
        return new GeneralErrorImpl(message);
    }

    /**
     * builds GeneralError without checking for non null required values
     */
    public GeneralError buildUnchecked() {
        return new GeneralErrorImpl(message);
    }

    public static GeneralErrorBuilder of() {
        return new GeneralErrorBuilder();
    }

    public static GeneralErrorBuilder of(final GeneralError template) {
        GeneralErrorBuilder builder = new GeneralErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
