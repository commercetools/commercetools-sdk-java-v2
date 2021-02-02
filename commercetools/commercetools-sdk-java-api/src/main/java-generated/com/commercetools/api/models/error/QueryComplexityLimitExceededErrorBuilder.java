
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class QueryComplexityLimitExceededErrorBuilder {

    private String message;

    public QueryComplexityLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public QueryComplexityLimitExceededError build() {
        return new QueryComplexityLimitExceededErrorImpl(message);
    }

    public static QueryComplexityLimitExceededErrorBuilder of() {
        return new QueryComplexityLimitExceededErrorBuilder();
    }

    public static QueryComplexityLimitExceededErrorBuilder of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorBuilder builder = new QueryComplexityLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
