
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class InvalidInputBuilder implements Builder<InvalidInput> {

    private String message;

    public InvalidInputBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public InvalidInput build() {
        Objects.requireNonNull(message, InvalidInput.class + ": message is missing");
        return new InvalidInputImpl(message);
    }

    /**
     * builds InvalidInput without checking for non null required values
     */
    public InvalidInput buildUnchecked() {
        return new InvalidInputImpl(message);
    }

    public static InvalidInputBuilder of() {
        return new InvalidInputBuilder();
    }

    public static InvalidInputBuilder of(final InvalidInput template) {
        InvalidInputBuilder builder = new InvalidInputBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
