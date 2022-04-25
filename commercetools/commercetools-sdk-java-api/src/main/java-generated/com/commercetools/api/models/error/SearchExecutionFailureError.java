
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SearchExecutionFailureErrorImpl.class)
public interface SearchExecutionFailureError extends ErrorObject {

    String SEARCH_EXECUTION_FAILURE = "SearchExecutionFailure";

    public static SearchExecutionFailureError of() {
        return new SearchExecutionFailureErrorImpl();
    }

    public static SearchExecutionFailureError of(final SearchExecutionFailureError template) {
        SearchExecutionFailureErrorImpl instance = new SearchExecutionFailureErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    public static SearchExecutionFailureErrorBuilder builder() {
        return SearchExecutionFailureErrorBuilder.of();
    }

    public static SearchExecutionFailureErrorBuilder builder(final SearchExecutionFailureError template) {
        return SearchExecutionFailureErrorBuilder.of(template);
    }

    default <T> T withSearchExecutionFailureError(Function<SearchExecutionFailureError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SearchExecutionFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SearchExecutionFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<SearchExecutionFailureError>";
            }
        };
    }
}
