
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AnonymousIdAlreadyInUseErrorBuilder implements Builder<AnonymousIdAlreadyInUseError> {

    private String message;

    public AnonymousIdAlreadyInUseErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public AnonymousIdAlreadyInUseError build() {
        Objects.requireNonNull(message, AnonymousIdAlreadyInUseError.class + ": message is missing");
        return new AnonymousIdAlreadyInUseErrorImpl(message);
    }

    /**
     * builds AnonymousIdAlreadyInUseError without checking for non null required values
     */
    public AnonymousIdAlreadyInUseError buildUnchecked() {
        return new AnonymousIdAlreadyInUseErrorImpl(message);
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of() {
        return new AnonymousIdAlreadyInUseErrorBuilder();
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorBuilder builder = new AnonymousIdAlreadyInUseErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
