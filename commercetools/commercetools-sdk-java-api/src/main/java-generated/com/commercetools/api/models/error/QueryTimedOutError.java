
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when the query times out.</p>
 *  <p>If a query constantly times out, please check if it follows the performance best practices.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryTimedOutError queryTimedOutError = QueryTimedOutError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("QueryTimedOut")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = QueryTimedOutErrorImpl.class)
public interface QueryTimedOutError extends ErrorObject {

    /**
     * discriminator value for QueryTimedOutError
     */
    String QUERY_TIMED_OUT = "QueryTimedOut";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"The query timed out. If your query constantly times out, please check that it follows the performance best practices (see https://docs.commercetools.com/api/predicates/query#performance-considerations)."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p><code>"The query timed out. If your query constantly times out, please check that it follows the performance best practices (see https://docs.commercetools.com/api/predicates/query#performance-considerations)."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     * factory method
     * @return instance of QueryTimedOutError
     */
    public static QueryTimedOutError of() {
        return new QueryTimedOutErrorImpl();
    }

    /**
     * factory method to create a shallow copy QueryTimedOutError
     * @param template instance to be copied
     * @return copy instance
     */
    public static QueryTimedOutError of(final QueryTimedOutError template) {
        QueryTimedOutErrorImpl instance = new QueryTimedOutErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public QueryTimedOutError copyDeep();

    /**
     * factory method to create a deep copy of QueryTimedOutError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static QueryTimedOutError deepCopy(@Nullable final QueryTimedOutError template) {
        if (template == null) {
            return null;
        }
        QueryTimedOutErrorImpl instance = new QueryTimedOutErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for QueryTimedOutError
     * @return builder
     */
    public static QueryTimedOutErrorBuilder builder() {
        return QueryTimedOutErrorBuilder.of();
    }

    /**
     * create builder for QueryTimedOutError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static QueryTimedOutErrorBuilder builder(final QueryTimedOutError template) {
        return QueryTimedOutErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withQueryTimedOutError(Function<QueryTimedOutError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<QueryTimedOutError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<QueryTimedOutError>() {
            @Override
            public String toString() {
                return "TypeReference<QueryTimedOutError>";
            }
        };
    }
}
