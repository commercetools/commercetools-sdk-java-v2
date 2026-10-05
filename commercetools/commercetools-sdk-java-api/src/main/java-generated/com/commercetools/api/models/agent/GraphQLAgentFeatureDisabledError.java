
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
 *  <p>Returned by a <span>/responses</span> request when the Intake Agent is not enabled for the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentFeatureDisabledError graphQLAgentFeatureDisabledError = GraphQLAgentFeatureDisabledError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("FeatureDisabled")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentFeatureDisabledErrorImpl.class)
public interface GraphQLAgentFeatureDisabledError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentFeatureDisabledError
     */
    String FEATURE_DISABLED = "FeatureDisabled";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentFeatureDisabledError
     */
    public static GraphQLAgentFeatureDisabledError of() {
        return new GraphQLAgentFeatureDisabledErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentFeatureDisabledError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentFeatureDisabledError of(final GraphQLAgentFeatureDisabledError template) {
        GraphQLAgentFeatureDisabledErrorImpl instance = new GraphQLAgentFeatureDisabledErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentFeatureDisabledError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentFeatureDisabledError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentFeatureDisabledError deepCopy(@Nullable final GraphQLAgentFeatureDisabledError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentFeatureDisabledErrorImpl instance = new GraphQLAgentFeatureDisabledErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentFeatureDisabledError
     * @return builder
     */
    public static GraphQLAgentFeatureDisabledErrorBuilder builder() {
        return GraphQLAgentFeatureDisabledErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentFeatureDisabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentFeatureDisabledErrorBuilder builder(final GraphQLAgentFeatureDisabledError template) {
        return GraphQLAgentFeatureDisabledErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentFeatureDisabledError(Function<GraphQLAgentFeatureDisabledError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentFeatureDisabledError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentFeatureDisabledError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentFeatureDisabledError>";
            }
        };
    }
}
