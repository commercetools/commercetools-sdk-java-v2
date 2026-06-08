
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
 *  <p>Returned when attempting to create or update a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> with a Line Item whose quantity exceeds the <code>maxCartQuantity</code> limit defined in the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> for that Line Item's SKU.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     LineItemQuantityAboveLimitError lineItemQuantityAboveLimitError = LineItemQuantityAboveLimitError.builder()
 *             .message("{message}")
 *             .quantity(1)
 *             .maxCartQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("LineItemQuantityAboveLimit")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = LineItemQuantityAboveLimitErrorImpl.class)
public interface LineItemQuantityAboveLimitError extends ErrorObject {

    /**
     * discriminator value for LineItemQuantityAboveLimitError
     */
    String LINE_ITEM_QUANTITY_ABOVE_LIMIT = "LineItemQuantityAboveLimit";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Quantity '$quantity' greater than maximum '$maxCartQuantity'."</code></p>
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
     *  <p>The maximum quantity allowed for this Line Item.</p>
     * @return maxCartQuantity
     */
    @NotNull
    @JsonProperty("maxCartQuantity")
    public Integer getMaxCartQuantity();

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @return lineItem
     */

    @JsonProperty("lineItem")
    public String getLineItem();

    /**
     *  <p><code>"Quantity '$quantity' greater than maximum '$maxCartQuantity'."</code></p>
     * @param message value to be set
     */

    public void setMessage(final String message);

    /**
     *  <p>The quantity that was requested.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Integer quantity);

    /**
     *  <p>The maximum quantity allowed for this Line Item.</p>
     * @param maxCartQuantity value to be set
     */

    public void setMaxCartQuantity(final Integer maxCartQuantity);

    /**
     *  <p>Reference to the Line Item that caused the error.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final String lineItem);

    /**
     * factory method
     * @return instance of LineItemQuantityAboveLimitError
     */
    public static LineItemQuantityAboveLimitError of() {
        return new LineItemQuantityAboveLimitErrorImpl();
    }

    /**
     * factory method to create a shallow copy LineItemQuantityAboveLimitError
     * @param template instance to be copied
     * @return copy instance
     */
    public static LineItemQuantityAboveLimitError of(final LineItemQuantityAboveLimitError template) {
        LineItemQuantityAboveLimitErrorImpl instance = new LineItemQuantityAboveLimitErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setQuantity(template.getQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    public LineItemQuantityAboveLimitError copyDeep();

    /**
     * factory method to create a deep copy of LineItemQuantityAboveLimitError
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static LineItemQuantityAboveLimitError deepCopy(@Nullable final LineItemQuantityAboveLimitError template) {
        if (template == null) {
            return null;
        }
        LineItemQuantityAboveLimitErrorImpl instance = new LineItemQuantityAboveLimitErrorImpl();
        instance.setMessage(template.getMessage());
        Optional.ofNullable(template.values()).ifPresent(t -> t.forEach(instance::setValue));
        instance.setQuantity(template.getQuantity());
        instance.setMaxCartQuantity(template.getMaxCartQuantity());
        instance.setLineItem(template.getLineItem());
        return instance;
    }

    /**
     * builder factory method for LineItemQuantityAboveLimitError
     * @return builder
     */
    public static LineItemQuantityAboveLimitErrorBuilder builder() {
        return LineItemQuantityAboveLimitErrorBuilder.of();
    }

    /**
     * create builder for LineItemQuantityAboveLimitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static LineItemQuantityAboveLimitErrorBuilder builder(final LineItemQuantityAboveLimitError template) {
        return LineItemQuantityAboveLimitErrorBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withLineItemQuantityAboveLimitError(Function<LineItemQuantityAboveLimitError, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<LineItemQuantityAboveLimitError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LineItemQuantityAboveLimitError>() {
            @Override
            public String toString() {
                return "TypeReference<LineItemQuantityAboveLimitError>";
            }
        };
    }
}
