
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
 *  <p>Returned by a <span>/responses</span> request when the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a> could not be resolved from the input. Pin it with an explicit <code>businessUnit</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentBusinessUnitUnresolvedError graphQLAgentBusinessUnitUnresolvedError = GraphQLAgentBusinessUnitUnresolvedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitUnresolved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentBusinessUnitUnresolvedErrorImpl.class)
public interface GraphQLAgentBusinessUnitUnresolvedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentBusinessUnitUnresolvedError
     */
    String BUSINESS_UNIT_UNRESOLVED = "BusinessUnitUnresolved";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentBusinessUnitUnresolvedError
     */
    public static GraphQLAgentBusinessUnitUnresolvedError of() {
        return new GraphQLAgentBusinessUnitUnresolvedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentBusinessUnitUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentBusinessUnitUnresolvedError of(final GraphQLAgentBusinessUnitUnresolvedError template) {
        GraphQLAgentBusinessUnitUnresolvedErrorImpl instance = new GraphQLAgentBusinessUnitUnresolvedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentBusinessUnitUnresolvedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentBusinessUnitUnresolvedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentBusinessUnitUnresolvedError deepCopy(
            @Nullable final GraphQLAgentBusinessUnitUnresolvedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentBusinessUnitUnresolvedErrorImpl instance = new GraphQLAgentBusinessUnitUnresolvedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentBusinessUnitUnresolvedError
     * @return builder
     */
    public static GraphQLAgentBusinessUnitUnresolvedErrorBuilder builder() {
        return GraphQLAgentBusinessUnitUnresolvedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentBusinessUnitUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitUnresolvedErrorBuilder builder(
            final GraphQLAgentBusinessUnitUnresolvedError template) {
        return GraphQLAgentBusinessUnitUnresolvedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentBusinessUnitUnresolvedError(
            Function<GraphQLAgentBusinessUnitUnresolvedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentBusinessUnitUnresolvedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentBusinessUnitUnresolvedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentBusinessUnitUnresolvedError>";
            }
        };
    }
}
