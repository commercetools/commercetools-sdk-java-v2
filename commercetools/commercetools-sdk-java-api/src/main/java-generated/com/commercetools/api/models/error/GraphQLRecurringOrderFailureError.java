
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
 *  <p>Returned when a subsequent Order for a <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Order</a> could not be processed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLRecurringOrderFailureError graphQLRecurringOrderFailureError = GraphQLRecurringOrderFailureError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderFailure")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLRecurringOrderFailureErrorImpl.class)
public interface GraphQLRecurringOrderFailureError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLRecurringOrderFailureError
     */
    String RECURRING_ORDER_FAILURE = "RecurringOrderFailure";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     * @return details
     */
    @NotNull
    @JsonProperty("details")
    public Object getDetails();

    /**
     *  <p>Details about the error's cause and the entities involved.</p>
     * @param details value to be set
     */

    public void setDetails(final Object details);

    /**
     * factory method
     * @return instance of GraphQLRecurringOrderFailureError
     */
    public static GraphQLRecurringOrderFailureError of() {
        return new GraphQLRecurringOrderFailureErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLRecurringOrderFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLRecurringOrderFailureError of(final GraphQLRecurringOrderFailureError template) {
        GraphQLRecurringOrderFailureErrorImpl instance = new GraphQLRecurringOrderFailureErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDetails(template.getDetails());
        return instance;
    }

    public GraphQLRecurringOrderFailureError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLRecurringOrderFailureError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLRecurringOrderFailureError deepCopy(
            @Nullable final GraphQLRecurringOrderFailureError template) {
        if (template == null) {
            return null;
        }
        GraphQLRecurringOrderFailureErrorImpl instance = new GraphQLRecurringOrderFailureErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setDetails(template.getDetails());
        return instance;
    }

    /**
     * builder factory method for GraphQLRecurringOrderFailureError
     * @return builder
     */
    public static GraphQLRecurringOrderFailureErrorBuilder builder() {
        return GraphQLRecurringOrderFailureErrorBuilder.of();
    }

    /**
     * create builder for GraphQLRecurringOrderFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLRecurringOrderFailureErrorBuilder builder(final GraphQLRecurringOrderFailureError template) {
        return GraphQLRecurringOrderFailureErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLRecurringOrderFailureError(Function<GraphQLRecurringOrderFailureError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLRecurringOrderFailureError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLRecurringOrderFailureError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLRecurringOrderFailureError>";
            }
        };
    }
}
