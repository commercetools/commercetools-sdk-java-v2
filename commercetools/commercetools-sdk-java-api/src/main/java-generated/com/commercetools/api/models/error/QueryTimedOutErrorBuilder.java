
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class QueryTimedOutErrorBuilder implements Builder<QueryTimedOutError> {

    private String message;

    public QueryTimedOutErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public QueryTimedOutError build() {
        Objects.requireNonNull(message, QueryTimedOutError.class + ": message is missing");
        return new QueryTimedOutErrorImpl(message);
    }

    /**
     * builds QueryTimedOutError without checking for non null required values
     */
    public QueryTimedOutError buildUnchecked() {
        return new QueryTimedOutErrorImpl(message);
    }

    public static QueryTimedOutErrorBuilder of() {
        return new QueryTimedOutErrorBuilder();
    }

    public static QueryTimedOutErrorBuilder of(final QueryTimedOutError template) {
        QueryTimedOutErrorBuilder builder = new QueryTimedOutErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
