
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchDeactivatedErrorBuilder {

    private String message;

    public SearchDeactivatedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SearchDeactivatedError build() {
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
