
package com.commercetools.api.models.agent;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.error.GraphQLErrorObject;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned by a <span>/responses</span> request when the customer's email address was not provided and could not be inferred from the input.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingCustomerEmailError graphQLAgentMissingCustomerEmailError = GraphQLAgentMissingCustomerEmailError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingCustomerEmail")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentMissingCustomerEmailErrorImpl.class)
public interface GraphQLAgentMissingCustomerEmailError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentMissingCustomerEmailError
     */
    String MISSING_CUSTOMER_EMAIL = "MissingCustomerEmail";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentMissingCustomerEmailError
     */
    public static GraphQLAgentMissingCustomerEmailError of() {
        return new GraphQLAgentMissingCustomerEmailErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentMissingCustomerEmailError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentMissingCustomerEmailError of(final GraphQLAgentMissingCustomerEmailError template) {
        GraphQLAgentMissingCustomerEmailErrorImpl instance = new GraphQLAgentMissingCustomerEmailErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentMissingCustomerEmailError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentMissingCustomerEmailError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentMissingCustomerEmailError deepCopy(
            @Nullable final GraphQLAgentMissingCustomerEmailError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentMissingCustomerEmailErrorImpl instance = new GraphQLAgentMissingCustomerEmailErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentMissingCustomerEmailError
     * @return builder
     */
    public static GraphQLAgentMissingCustomerEmailErrorBuilder builder() {
        return GraphQLAgentMissingCustomerEmailErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentMissingCustomerEmailError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingCustomerEmailErrorBuilder builder(
            final GraphQLAgentMissingCustomerEmailError template) {
        return GraphQLAgentMissingCustomerEmailErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentMissingCustomerEmailError(Function<GraphQLAgentMissingCustomerEmailError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentMissingCustomerEmailError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentMissingCustomerEmailError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentMissingCustomerEmailError>";
            }
        };
    }
}
