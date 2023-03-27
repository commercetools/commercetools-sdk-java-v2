
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * QueryComplexityLimitExceededError
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryComplexityLimitExceededError queryComplexityLimitExceededError = QueryComplexityLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QueryComplexityLimitExceededErrorImpl.class)
public interface QueryComplexityLimitExceededError extends ErrorObject {

    /**
     * discriminator value for QueryComplexityLimitExceededError
     */
    String QUERY_COMPLEXITY_LIMIT_EXCEEDED = "QueryComplexityLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     * set message
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of QueryComplexityLimitExceededError
     */
    public static QueryComplexityLimitExceededError of() {
        return new QueryComplexityLimitExceededErrorImpl();
    }

    /**
     * factory method to copy an instance of QueryComplexityLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static QueryComplexityLimitExceededError of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorImpl instance = new QueryComplexityLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());

        return instance;
    }

    /**
     * builder factory method for QueryComplexityLimitExceededError
     * @return builder
     */
    public static QueryComplexityLimitExceededErrorBuilder builder() {
        return QueryComplexityLimitExceededErrorBuilder.of();
    }

    /**
     * create builder for QueryComplexityLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QueryComplexityLimitExceededErrorBuilder builder(final QueryComplexityLimitExceededError template) {
        return QueryComplexityLimitExceededErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQueryComplexityLimitExceededError(Function<QueryComplexityLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QueryComplexityLimitExceededError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QueryComplexityLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<QueryComplexityLimitExceededError>";
            }
        };
    }
}
