
package com.commercetools.importapi.models.errors;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ContentionErrorBuilder implements Builder<ContentionError> {

    private String message;

    public ContentionErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public ContentionError build() {
        Objects.requireNonNull(message, ContentionError.class + ": message is missing");
        return new ContentionErrorImpl(message);
    }

    /**
     * builds ContentionError without checking for non null required values
     */
    public ContentionError buildUnchecked() {
        return new ContentionErrorImpl(message);
    }

    public static ContentionErrorBuilder of() {
        return new ContentionErrorBuilder();
    }

    public static ContentionErrorBuilder of(final ContentionError template) {
        ContentionErrorBuilder builder = new ContentionErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
