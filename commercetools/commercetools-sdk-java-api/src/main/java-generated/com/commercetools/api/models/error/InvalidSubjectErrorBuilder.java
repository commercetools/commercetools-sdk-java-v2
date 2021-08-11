
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidSubjectErrorBuilder implements Builder<InvalidSubjectError> {

    private String message;

    public InvalidSubjectErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidSubjectError build() {
        Objects.requireNonNull(message, InvalidSubjectError.class + ": message is missing");
        return new InvalidSubjectErrorImpl(message);
    }

    /**
     * builds InvalidSubjectError without checking for non null required values
     */
    public InvalidSubjectError buildUnchecked() {
        return new InvalidSubjectErrorImpl(message);
    }

    public static InvalidSubjectErrorBuilder of() {
        return new InvalidSubjectErrorBuilder();
    }

    public static InvalidSubjectErrorBuilder of(final InvalidSubjectError template) {
        InvalidSubjectErrorBuilder builder = new InvalidSubjectErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
