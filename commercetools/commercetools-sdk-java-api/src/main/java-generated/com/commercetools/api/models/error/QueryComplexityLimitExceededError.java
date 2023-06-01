package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.QueryComplexityLimitExceededErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
    public static QueryComplexityLimitExceededError of(){
        return new QueryComplexityLimitExceededErrorImpl();
    }
    

    /**
     * factory method to create a shallow copy QueryComplexityLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static QueryComplexityLimitExceededError of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorImpl instance = new QueryComplexityLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * factory method to create a deep copy of QueryComplexityLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QueryComplexityLimitExceededError deepCopy(@Nullable final QueryComplexityLimitExceededError template) {
        if (template == null) {
            return null;
        }
        QueryComplexityLimitExceededErrorImpl instance = new QueryComplexityLimitExceededErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
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
