
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
 *  <p>Returned by a <span>/responses</span> request when the resolved <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> has more than one entry in the <code>distributionChannels</code> array, which is not supported. To resolve this error, choose a Store with zero or one distribution channel.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentStoreDistributionChannelsUnsupportedError graphQLAgentStoreDistributionChannelsUnsupportedError = GraphQLAgentStoreDistributionChannelsUnsupportedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("StoreDistributionChannelsUnsupported")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl.class)
public interface GraphQLAgentStoreDistributionChannelsUnsupportedError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLAgentStoreDistributionChannelsUnsupportedError
     */
    String STORE_DISTRIBUTION_CHANNELS_UNSUPPORTED = "StoreDistributionChannelsUnsupported";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     * factory method
     * @return instance of GraphQLAgentStoreDistributionChannelsUnsupportedError
     */
    public static GraphQLAgentStoreDistributionChannelsUnsupportedError of() {
        return new GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLAgentStoreDistributionChannelsUnsupportedError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLAgentStoreDistributionChannelsUnsupportedError of(
            final GraphQLAgentStoreDistributionChannelsUnsupportedError template) {
        GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl instance = new GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    public GraphQLAgentStoreDistributionChannelsUnsupportedError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLAgentStoreDistributionChannelsUnsupportedError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLAgentStoreDistributionChannelsUnsupportedError deepCopy(
            @Nullable final GraphQLAgentStoreDistributionChannelsUnsupportedError template) {
        if (template == null) {
            return null;
        }
        GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl instance = new GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        return instance;
    }

    /**
     * builder factory method for GraphQLAgentStoreDistributionChannelsUnsupportedError
     * @return builder
     */
    public static GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder builder() {
        return GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder.of();
    }

    /**
     * create builder for GraphQLAgentStoreDistributionChannelsUnsupportedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder builder(
            final GraphQLAgentStoreDistributionChannelsUnsupportedError template) {
        return GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLAgentStoreDistributionChannelsUnsupportedError(
            Function<GraphQLAgentStoreDistributionChannelsUnsupportedError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLAgentStoreDistributionChannelsUnsupportedError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLAgentStoreDistributionChannelsUnsupportedError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLAgentStoreDistributionChannelsUnsupportedError>";
            }
        };
    }
}
