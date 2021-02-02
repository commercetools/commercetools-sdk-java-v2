
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SearchExecutionFailureErrorBuilder {

    private String message;

    public SearchExecutionFailureErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public SearchExecutionFailureError build() {
        return new SearchExecutionFailureErrorImpl(message);
    }

    public static SearchExecutionFailureErrorBuilder of() {
        return new SearchExecutionFailureErrorBuilder();
    }

    public static SearchExecutionFailureErrorBuilder of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorBuilder builder = new SearchExecutionFailureErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
