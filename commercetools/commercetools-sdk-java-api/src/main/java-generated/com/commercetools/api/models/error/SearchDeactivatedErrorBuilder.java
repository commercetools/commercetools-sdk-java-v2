
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchDeactivatedErrorBuilder implements Builder<SearchDeactivatedError> {

    private String message;

    public SearchDeactivatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SearchDeactivatedError build() {
        Objects.requireNonNull(message, SearchDeactivatedError.class + ": message is missing");
        return new SearchDeactivatedErrorImpl(message);
    }

    /**
     * builds SearchDeactivatedError without checking for non null required values
     */
    public SearchDeactivatedError buildUnchecked() {
        return new SearchDeactivatedErrorImpl(message);
    }

    public static SearchDeactivatedErrorBuilder of() {
        return new SearchDeactivatedErrorBuilder();
    }

    public static SearchDeactivatedErrorBuilder of(final SearchDeactivatedError template) {
        SearchDeactivatedErrorBuilder builder = new SearchDeactivatedErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
