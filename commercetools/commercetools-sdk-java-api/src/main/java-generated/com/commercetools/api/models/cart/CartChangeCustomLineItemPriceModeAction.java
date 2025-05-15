
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartChangeCustomLineItemPriceModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = CartChangeCustomLineItemPriceModeAction.builder()
 *             .mode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeCustomLineItemPriceMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemPriceModeActionImpl.class)
public interface CartChangeCustomLineItemPriceModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeCustomLineItemPriceModeAction
     */
    String CHANGE_CUSTOM_LINE_ITEM_PRICE_MODE = "changeCustomLineItemPriceMode";

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemId
     */

    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return mode
     */
    @NotNull
    @JsonProperty("mode")
    public CustomLineItemPriceMode getMode();

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param mode value to be set
     */

    public void setMode(final CustomLineItemPriceMode mode);

    /**
     * factory method
     * @return instance of CartChangeCustomLineItemPriceModeAction
     */
    public static CartChangeCustomLineItemPriceModeAction of() {
        return new CartChangeCustomLineItemPriceModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangeCustomLineItemPriceModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeCustomLineItemPriceModeAction of(final CartChangeCustomLineItemPriceModeAction template) {
        CartChangeCustomLineItemPriceModeActionImpl instance = new CartChangeCustomLineItemPriceModeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setMode(template.getMode());
        return instance;
    }

    public CartChangeCustomLineItemPriceModeAction copyDeep();

    /**
     * factory method to create a deep copy of CartChangeCustomLineItemPriceModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangeCustomLineItemPriceModeAction deepCopy(
            @Nullable final CartChangeCustomLineItemPriceModeAction template) {
        if (template == null) {
            return null;
        }
        CartChangeCustomLineItemPriceModeActionImpl instance = new CartChangeCustomLineItemPriceModeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setMode(template.getMode());
        return instance;
    }

    /**
     * builder factory method for CartChangeCustomLineItemPriceModeAction
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder builder() {
        return CartChangeCustomLineItemPriceModeActionBuilder.of();
    }

    /**
     * create builder for CartChangeCustomLineItemPriceModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeCustomLineItemPriceModeActionBuilder builder(
            final CartChangeCustomLineItemPriceModeAction template) {
        return CartChangeCustomLineItemPriceModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeCustomLineItemPriceModeAction(
            Function<CartChangeCustomLineItemPriceModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemPriceModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemPriceModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeCustomLineItemPriceModeAction>";
            }
        };
    }
}
