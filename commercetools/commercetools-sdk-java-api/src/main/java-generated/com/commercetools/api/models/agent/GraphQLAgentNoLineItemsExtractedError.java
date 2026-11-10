
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
 *  <p>Returned by a <span>/responses</span> request when no Line Items could be extracted from the provided <code>prompt</code> or files.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentNoLineItemsExtractedError graphQLAgentNoLineItemsExtractedError = GraphQLAgentNoLineItemsExtractedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("NoLineItemsExtracted")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentNoLineItemsExtractedErrorImpl.class)
public interface GraphQLAgentNoLineItemsExtractedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentNoLineItemsExtractedError
     */
    String NO_LINE_ITEMS_EXTRACTED = "NoLineItemsExtracted";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentNoLineItemsExtractedError
     */
    public static GraphQLAgentNoLineItemsExtractedError of() {
        return new GraphQLAgentNoLineItemsExtractedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentNoLineItemsExtractedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentNoLineItemsExtractedError of(final GraphQLAgentNoLineItemsExtractedError template) {
        GraphQLAgentNoLineItemsExtractedErrorImpl instance = new GraphQLAgentNoLineItemsExtractedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentNoLineItemsExtractedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentNoLineItemsExtractedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentNoLineItemsExtractedError deepCopy(
            @Nullable final GraphQLAgentNoLineItemsExtractedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentNoLineItemsExtractedErrorImpl instance = new GraphQLAgentNoLineItemsExtractedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentNoLineItemsExtractedError
     * @return builder
     */
    public static GraphQLAgentNoLineItemsExtractedErrorBuilder builder() {
        return GraphQLAgentNoLineItemsExtractedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentNoLineItemsExtractedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentNoLineItemsExtractedErrorBuilder builder(
            final GraphQLAgentNoLineItemsExtractedError template) {
        return GraphQLAgentNoLineItemsExtractedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentNoLineItemsExtractedError(Function<GraphQLAgentNoLineItemsExtractedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentNoLineItemsExtractedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentNoLineItemsExtractedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentNoLineItemsExtractedError>";
            }
        };
    }
}
