
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = QueryComplexityLimitExceededErrorImpl.class)
public interface QueryComplexityLimitExceededError extends ErrorObject {

    String QUERY_COMPLEXITY_LIMIT_EXCEEDED = "QueryComplexityLimitExceeded";

    public static QueryComplexityLimitExceededError of() {
        return new QueryComplexityLimitExceededErrorImpl();
    }

    public static QueryComplexityLimitExceededError of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorImpl instance = new QueryComplexityLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static QueryComplexityLimitExceededErrorBuilder builder() {
        return QueryComplexityLimitExceededErrorBuilder.of();
    }

    public static QueryComplexityLimitExceededErrorBuilder builder(final QueryComplexityLimitExceededError template) {
        return QueryComplexityLimitExceededErrorBuilder.of(template);
    }

    default <T> T withQueryComplexityLimitExceededError(Function<QueryComplexityLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<QueryComplexityLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QueryComplexityLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<QueryComplexityLimitExceededError>";
            }
        };
    }
}
