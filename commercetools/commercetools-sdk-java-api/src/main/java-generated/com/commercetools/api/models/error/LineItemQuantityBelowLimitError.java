
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
 *  <p>Returned when attempting to create or update a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> with a Line Item whose quantity is below the <code>minCartQuantity</code> limit defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> for that Line Item's SKU.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemQuantityBelowLimitError lineItemQuantityBelowLimitError = LineItemQuantityBelowLimitError.builder()
 *             .message("{message}")
 *             .quantity(1)
 *             .minCartQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LineItemQuantityBelowLimit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemQuantityBelowLimitErrorImpl.class)
public interface LineItemQuantityBelowLimitError extends ErrorObject {

    /**
     * discriminator value for LineItemQuantityBelowLimitError
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
     *  <p><code>"Quantity '$quantity' less than minimum '$minCartQuantity'."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

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
     *  <p><code>"Quantity '$quantity' less than minimum '$minCartQuantity'."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

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
     * @return instance of LineItemQuantityBelowLimitError
     */
    public static LineItemQuantityBelowLimitError of() {
        return new LineItemQuantityBelowLimitErrorImpl();
    }

    /**
     * factory method to create a shallow copy LineItemQuantityBelowLimitError
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemQuantityBelowLimitError of(final LineItemQuantityBelowLimitError template) {
        LineItemQuantityBelowLimitErrorImpl instance = new LineItemQuantityBelowLimitErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setQuantity(template.getQuantity());
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public LineItemQuantityBelowLimitError copyDeep();

    /**
     * factory method to create a deep copy of LineItemQuantityBelowLimitError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemQuantityBelowLimitError deepCopy(@Nullable final LineItemQuantityBelowLimitError template) {
        if (template == null) {
            return null;
        }
        LineItemQuantityBelowLimitErrorImpl instance = new LineItemQuantityBelowLimitErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setQuantity(template.getQuantity());
        instance.setMinCartQuantity(template.getMinCartQuantity());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    /**
     * builder factory method for LineItemQuantityBelowLimitError
     * @return builder
     */
    public static LineItemQuantityBelowLimitErrorBuilder builder() {
        return LineItemQuantityBelowLimitErrorBuilder.of();
    }

    /**
     * create builder for LineItemQuantityBelowLimitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemQuantityBelowLimitErrorBuilder builder(final LineItemQuantityBelowLimitError template) {
        return LineItemQuantityBelowLimitErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemQuantityBelowLimitError(Function<LineItemQuantityBelowLimitError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<LineItemQuantityBelowLimitError> typeReference() {
        return new tools.jackson.core.type.TypeReference<LineItemQuantityBelowLimitError>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemQuantityBelowLimitError>";
            }
        };
    }
}
