
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
 *  <p>Returned by a <span>/responses</span> request when a shipping country was not provided and could not be inferred from the input.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingCountryError graphQLAgentMissingCountryError = GraphQLAgentMissingCountryError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("MissingCountry")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentMissingCountryErrorImpl.class)
public interface GraphQLAgentMissingCountryError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentMissingCountryError
     */
    String MISSING_COUNTRY = "MissingCountry";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentMissingCountryError
     */
    public static GraphQLAgentMissingCountryError of() {
        return new GraphQLAgentMissingCountryErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentMissingCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentMissingCountryError of(final GraphQLAgentMissingCountryError template) {
        GraphQLAgentMissingCountryErrorImpl instance = new GraphQLAgentMissingCountryErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentMissingCountryError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentMissingCountryError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentMissingCountryError deepCopy(@Nullable final GraphQLAgentMissingCountryError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentMissingCountryErrorImpl instance = new GraphQLAgentMissingCountryErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentMissingCountryError
     * @return builder
     */
    public static GraphQLAgentMissingCountryErrorBuilder builder() {
        return GraphQLAgentMissingCountryErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentMissingCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingCountryErrorBuilder builder(final GraphQLAgentMissingCountryError template) {
        return GraphQLAgentMissingCountryErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentMissingCountryError(Function<GraphQLAgentMissingCountryError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentMissingCountryError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentMissingCountryError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentMissingCountryError>";
            }
        };
    }
}
