
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
 *  <p>Returned when a Discount Group cannot be created or activated as the <span>limit</span> for active Discount Groups has been reached.</p>
 *  <p>The error is returned as a failed response to:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/discount-groups:POST" rel="nofollow">Create DiscountGroup</a> request</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountGroupSetIsActiveAction" rel="nofollow">Set IsActive</a> update action</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxDiscountGroupsReachedError graphQLMaxDiscountGroupsReachedError = GraphQLMaxDiscountGroupsReachedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MaxDiscountGroupsReached")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLMaxDiscountGroupsReachedErrorImpl.class)
public interface GraphQLMaxDiscountGroupsReachedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLMaxDiscountGroupsReachedError
     */
    String MAX_DISCOUNT_GROUPS_REACHED = "MaxDiscountGroupsReached";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLMaxDiscountGroupsReachedError
     */
    public static GraphQLMaxDiscountGroupsReachedError of() {
        return new GraphQLMaxDiscountGroupsReachedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLMaxDiscountGroupsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLMaxDiscountGroupsReachedError of(final GraphQLMaxDiscountGroupsReachedError template) {
        GraphQLMaxDiscountGroupsReachedErrorImpl instance = new GraphQLMaxDiscountGroupsReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLMaxDiscountGroupsReachedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLMaxDiscountGroupsReachedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLMaxDiscountGroupsReachedError deepCopy(
            @Nullable final GraphQLMaxDiscountGroupsReachedError template) {
        if (template == null) {
            return null;
        }
        GraphQLMaxDiscountGroupsReachedErrorImpl instance = new GraphQLMaxDiscountGroupsReachedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLMaxDiscountGroupsReachedError
     * @return builder
     */
    public static GraphQLMaxDiscountGroupsReachedErrorBuilder builder() {
        return GraphQLMaxDiscountGroupsReachedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLMaxDiscountGroupsReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxDiscountGroupsReachedErrorBuilder builder(
            final GraphQLMaxDiscountGroupsReachedError template) {
        return GraphQLMaxDiscountGroupsReachedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLMaxDiscountGroupsReachedError(Function<GraphQLMaxDiscountGroupsReachedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxDiscountGroupsReachedError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLMaxDiscountGroupsReachedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLMaxDiscountGroupsReachedError>";
            }
        };
    }
}
