
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a bulk request contains more items than the allowed maximum.</p>
 *  <p>Reduce the number of items in the request to at most <code>limit</code> and retry.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLBulkOperationMaxItemsExceededError graphQLBulkOperationMaxItemsExceededError = GraphQLBulkOperationMaxItemsExceededError.builder()
 *             .limit(0.3)
 *             .provided(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BulkOperationMaxItemsExceeded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLBulkOperationMaxItemsExceededErrorImpl.class)
public interface GraphQLBulkOperationMaxItemsExceededError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLBulkOperationMaxItemsExceededError
     */
    String BULK_OPERATION_MAX_ITEMS_EXCEEDED = "BulkOperationMaxItemsExceeded";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @return limit
     */
    @NotNull
    @JsonProperty("limit")
    public Integer getLimit();

    /**
     *  <p>Number of items provided in the request.</p>
     * @return provided
     */
    @NotNull
    @JsonProperty("provided")
    public Integer getProvided();

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @param limit value to be set
     */

    public void setLimit(final Integer limit);

    /**
     *  <p>Number of items provided in the request.</p>
     * @param provided value to be set
     */

    public void setProvided(final Integer provided);

    /**
     * factory method
     * @return instance of GraphQLBulkOperationMaxItemsExceededError
     */
    public static GraphQLBulkOperationMaxItemsExceededError of() {
        return new GraphQLBulkOperationMaxItemsExceededErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLBulkOperationMaxItemsExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLBulkOperationMaxItemsExceededError of(
            final GraphQLBulkOperationMaxItemsExceededError template) {
        GraphQLBulkOperationMaxItemsExceededErrorImpl instance = new GraphQLBulkOperationMaxItemsExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLimit(template.getLimit());
        instance.setProvided(template.getProvided());
        return instance;
    }

    public GraphQLBulkOperationMaxItemsExceededError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLBulkOperationMaxItemsExceededError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLBulkOperationMaxItemsExceededError deepCopy(
            @Nullable final GraphQLBulkOperationMaxItemsExceededError template) {
        if (template == null) {
            return null;
        }
        GraphQLBulkOperationMaxItemsExceededErrorImpl instance = new GraphQLBulkOperationMaxItemsExceededErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setLimit(template.getLimit());
        instance.setProvided(template.getProvided());
        return instance;
    }

    /**
     * builder factory method for GraphQLBulkOperationMaxItemsExceededError
     * @return builder
     */
    public static GraphQLBulkOperationMaxItemsExceededErrorBuilder builder() {
        return GraphQLBulkOperationMaxItemsExceededErrorBuilder.of();
    }

    /**
     * create builder for GraphQLBulkOperationMaxItemsExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLBulkOperationMaxItemsExceededErrorBuilder builder(
            final GraphQLBulkOperationMaxItemsExceededError template) {
        return GraphQLBulkOperationMaxItemsExceededErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLBulkOperationMaxItemsExceededError(
            Function<GraphQLBulkOperationMaxItemsExceededError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<GraphQLBulkOperationMaxItemsExceededError> typeReference() {
        return new tools.jackson.core.type.TypeReference<GraphQLBulkOperationMaxItemsExceededError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLBulkOperationMaxItemsExceededError>";
            }
        };
    }
}
