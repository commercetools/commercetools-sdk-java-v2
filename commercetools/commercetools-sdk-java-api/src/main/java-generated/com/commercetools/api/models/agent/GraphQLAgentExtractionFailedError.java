
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
 *  <p>Returned by a <span>/responses</span> request when the input could not be processed due to an internal error.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentExtractionFailedError graphQLAgentExtractionFailedError = GraphQLAgentExtractionFailedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ExtractionFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentExtractionFailedErrorImpl.class)
public interface GraphQLAgentExtractionFailedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentExtractionFailedError
     */
    String EXTRACTION_FAILED = "ExtractionFailed";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentExtractionFailedError
     */
    public static GraphQLAgentExtractionFailedError of() {
        return new GraphQLAgentExtractionFailedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentExtractionFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentExtractionFailedError of(final GraphQLAgentExtractionFailedError template) {
        GraphQLAgentExtractionFailedErrorImpl instance = new GraphQLAgentExtractionFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentExtractionFailedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentExtractionFailedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentExtractionFailedError deepCopy(
            @Nullable final GraphQLAgentExtractionFailedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentExtractionFailedErrorImpl instance = new GraphQLAgentExtractionFailedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentExtractionFailedError
     * @return builder
     */
    public static GraphQLAgentExtractionFailedErrorBuilder builder() {
        return GraphQLAgentExtractionFailedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentExtractionFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentExtractionFailedErrorBuilder builder(final GraphQLAgentExtractionFailedError template) {
        return GraphQLAgentExtractionFailedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentExtractionFailedError(Function<GraphQLAgentExtractionFailedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentExtractionFailedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentExtractionFailedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentExtractionFailedError>";
            }
        };
    }
}
