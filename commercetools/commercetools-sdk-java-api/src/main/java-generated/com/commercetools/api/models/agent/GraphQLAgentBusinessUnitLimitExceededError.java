
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
 *  <p>Returned by a <span>/responses</span> request when the customer is associated with more <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Units</a> than can be resolved automatically. To resolve this error, specify an explicit <code>businessUnit</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentBusinessUnitLimitExceededError graphQLAgentBusinessUnitLimitExceededError = GraphQLAgentBusinessUnitLimitExceededError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitLimitExceeded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentBusinessUnitLimitExceededErrorImpl.class)
public interface GraphQLAgentBusinessUnitLimitExceededError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentBusinessUnitLimitExceededError
     */
    String BUSINESS_UNIT_LIMIT_EXCEEDED = "BusinessUnitLimitExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentBusinessUnitLimitExceededError
     */
    public static GraphQLAgentBusinessUnitLimitExceededError of() {
        return new GraphQLAgentBusinessUnitLimitExceededErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentBusinessUnitLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentBusinessUnitLimitExceededError of(
            final GraphQLAgentBusinessUnitLimitExceededError template) {
        GraphQLAgentBusinessUnitLimitExceededErrorImpl instance = new GraphQLAgentBusinessUnitLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentBusinessUnitLimitExceededError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentBusinessUnitLimitExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentBusinessUnitLimitExceededError deepCopy(
            @Nullable final GraphQLAgentBusinessUnitLimitExceededError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentBusinessUnitLimitExceededErrorImpl instance = new GraphQLAgentBusinessUnitLimitExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentBusinessUnitLimitExceededError
     * @return builder
     */
    public static GraphQLAgentBusinessUnitLimitExceededErrorBuilder builder() {
        return GraphQLAgentBusinessUnitLimitExceededErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentBusinessUnitLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitLimitExceededErrorBuilder builder(
            final GraphQLAgentBusinessUnitLimitExceededError template) {
        return GraphQLAgentBusinessUnitLimitExceededErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentBusinessUnitLimitExceededError(
            Function<GraphQLAgentBusinessUnitLimitExceededError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentBusinessUnitLimitExceededError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentBusinessUnitLimitExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentBusinessUnitLimitExceededError>";
            }
        };
    }
}
