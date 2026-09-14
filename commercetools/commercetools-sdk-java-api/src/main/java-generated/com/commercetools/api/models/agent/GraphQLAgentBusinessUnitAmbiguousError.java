
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
 *  <p>Returned by a <span>/responses</span> request when the customer is associated with multiple <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Units</a> and none could be automatically selected. To resolve this error, specify an explicit <code>businessUnit</code> reference in the request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentBusinessUnitAmbiguousError graphQLAgentBusinessUnitAmbiguousError = GraphQLAgentBusinessUnitAmbiguousError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAmbiguous")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentBusinessUnitAmbiguousErrorImpl.class)
public interface GraphQLAgentBusinessUnitAmbiguousError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentBusinessUnitAmbiguousError
     */
    String BUSINESS_UNIT_AMBIGUOUS = "BusinessUnitAmbiguous";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentBusinessUnitAmbiguousError
     */
    public static GraphQLAgentBusinessUnitAmbiguousError of() {
        return new GraphQLAgentBusinessUnitAmbiguousErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentBusinessUnitAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentBusinessUnitAmbiguousError of(final GraphQLAgentBusinessUnitAmbiguousError template) {
        GraphQLAgentBusinessUnitAmbiguousErrorImpl instance = new GraphQLAgentBusinessUnitAmbiguousErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentBusinessUnitAmbiguousError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentBusinessUnitAmbiguousError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentBusinessUnitAmbiguousError deepCopy(
            @Nullable final GraphQLAgentBusinessUnitAmbiguousError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentBusinessUnitAmbiguousErrorImpl instance = new GraphQLAgentBusinessUnitAmbiguousErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentBusinessUnitAmbiguousError
     * @return builder
     */
    public static GraphQLAgentBusinessUnitAmbiguousErrorBuilder builder() {
        return GraphQLAgentBusinessUnitAmbiguousErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentBusinessUnitAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitAmbiguousErrorBuilder builder(
            final GraphQLAgentBusinessUnitAmbiguousError template) {
        return GraphQLAgentBusinessUnitAmbiguousErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentBusinessUnitAmbiguousError(
            Function<GraphQLAgentBusinessUnitAmbiguousError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentBusinessUnitAmbiguousError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentBusinessUnitAmbiguousError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentBusinessUnitAmbiguousError>";
            }
        };
    }
}
