
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SemanticErrorErrorBuilder implements Builder<SemanticErrorError> {

    private String message;

    public SemanticErrorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SemanticErrorError build() {
        Objects.requireNonNull(message, SemanticErrorError.class + ": message is missing");
        return new SemanticErrorErrorImpl(message);
    }

    /**
     * builds SemanticErrorError without checking for non null required values
     */
    public SemanticErrorError buildUnchecked() {
        return new SemanticErrorErrorImpl(message);
    }

    public static SemanticErrorErrorBuilder of() {
        return new SemanticErrorErrorBuilder();
    }

    public static SemanticErrorErrorBuilder of(final SemanticErrorError template) {
        SemanticErrorErrorBuilder builder = new SemanticErrorErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
