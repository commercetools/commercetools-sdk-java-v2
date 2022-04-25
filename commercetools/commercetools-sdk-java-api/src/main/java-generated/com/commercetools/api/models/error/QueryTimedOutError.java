
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = QueryTimedOutErrorImpl.class)
public interface QueryTimedOutError extends ErrorObject {

    String QUERY_TIMED_OUT = "QueryTimedOut";

    public static QueryTimedOutError of() {
        return new QueryTimedOutErrorImpl();
    }

    public static QueryTimedOutError of(final QueryTimedOutError template) {
        QueryTimedOutErrorImpl instance = new QueryTimedOutErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static QueryTimedOutErrorBuilder builder() {
        return QueryTimedOutErrorBuilder.of();
    }

    public static QueryTimedOutErrorBuilder builder(final QueryTimedOutError template) {
        return QueryTimedOutErrorBuilder.of(template);
    }

    default <T> T withQueryTimedOutError(Function<QueryTimedOutError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QueryTimedOutError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QueryTimedOutError>() {
            @Override
            public String toString() {
                return "TypeReference<QueryTimedOutError>";
            }
        };
    }
}
