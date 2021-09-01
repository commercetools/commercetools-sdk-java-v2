
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SyntaxErrorErrorBuilder implements Builder<SyntaxErrorError> {

    private String message;

    public SyntaxErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SyntaxErrorError build() {
        Objects.requireNonNull(message, SyntaxErrorError.class + ": message is missing");
        return new SyntaxErrorErrorImpl(message);
    }

    /**
     * builds SyntaxErrorError without checking for non null required values
     */
    public SyntaxErrorError buildUnchecked() {
        return new SyntaxErrorErrorImpl(message);
    }

    public static SyntaxErrorErrorBuilder of() {
        return new SyntaxErrorErrorBuilder();
    }

    public static SyntaxErrorErrorBuilder of(final SyntaxErrorError template) {
        SyntaxErrorErrorBuilder builder = new SyntaxErrorErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
