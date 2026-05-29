
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Returned when attempting to create or update a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> with a Line Item whose quantity is below the <code>minCartQuantity</code> limit defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> for that Line Item's SKU.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLLineItemQuantityBelowLimitError graphQLLineItemQuantityBelowLimitError = GraphQLLineItemQuantityBelowLimitError.builder()
 *             .quantity(1)
 *             .minCartQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LineItemQuantityBelowLimit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GraphQLLineItemQuantityBelowLimitErrorImpl.class)
public interface GraphQLLineItemQuantityBelowLimitError extends GraphQLErrorObject {

    /**
     * discriminator value for GraphQLLineItemQuantityBelowLimitError
     */
    String LINE_ITEM_QUANTITY_BELOW_LIMIT = "LineItemQuantityBelowLimit";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p>The quantity that was requested.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Integer getQuantity();

    /**
     *  <p>The minimum quantity required for this Line Item.</p>
     * @return minCartQuantity
     */
    @NotNull
    @JsonProperty("minCartQuantity")
    public Integer getMinCartQuantity();

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @return lineItem
     */

    @JsonProperty("lineItem")
    public String getLineItem();

    /**
     *  <p>The quantity that was requested.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     *  <p>The minimum quantity required for this Line Item.</p>
     * @param minCartQuantity value to be set
     */

    public void setMinCartQuantity(final Integer minCartQuantity);

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final String lineItem);

    /**
     * factory method
     * @return instance of GraphQLLineItemQuantityBelowLimitError
     */
    public static GraphQLLineItemQuantityBelowLimitError of() {
        return new GraphQLLineItemQuantityBelowLimitErrorImpl();
    }

    /**
     * factory method to create a shallow copy GraphQLLineItemQuantityBelowLimitError
     * @param template instance to be copied
     * @return copy instance
     */
    public static GraphQLLineItemQuantityBelowLimitError of(final GraphQLLineItemQuantityBelowLimitError template) {
        GraphQLLineItemQuantityBelowLimitErrorImpl instance = new GraphQLLineItemQuantityBelowLimitErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setQuantity(template.getQuantity());
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public GraphQLLineItemQuantityBelowLimitError copyDeep();

    /**
     * factory method to create a deep copy of GraphQLLineItemQuantityBelowLimitError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GraphQLLineItemQuantityBelowLimitError deepCopy(
            @Nullable final GraphQLLineItemQuantityBelowLimitError template) {
        if (template == null) {
            return null;
        }
        GraphQLLineItemQuantityBelowLimitErrorImpl instance = new GraphQLLineItemQuantityBelowLimitErrorImpl();
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setQuantity(template.getQuantity());
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    /**
     * builder factory method for GraphQLLineItemQuantityBelowLimitError
     * @return builder
     */
    public static GraphQLLineItemQuantityBelowLimitErrorBuilder builder() {
        return GraphQLLineItemQuantityBelowLimitErrorBuilder.of();
    }

    /**
     * create builder for GraphQLLineItemQuantityBelowLimitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLLineItemQuantityBelowLimitErrorBuilder builder(
            final GraphQLLineItemQuantityBelowLimitError template) {
        return GraphQLLineItemQuantityBelowLimitErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGraphQLLineItemQuantityBelowLimitError(
            Function<GraphQLLineItemQuantityBelowLimitError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GraphQLLineItemQuantityBelowLimitError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GraphQLLineItemQuantityBelowLimitError>() {
            @Override
            public String toString() {
                return "TypeReference<GraphQLLineItemQuantityBelowLimitError>";
            }
        };
    }
}
