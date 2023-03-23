
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartChangeCustomLineItemPriceModeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeCustomLineItemPriceModeAction cartChangeCustomLineItemPriceModeAction = CartChangeCustomLineItemPriceModeAction.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .mode(CustomLineItemPriceMode.STANDARD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeCustomLineItemPriceModeActionImpl.class)
public interface CartChangeCustomLineItemPriceModeAction extends CartUpdateAction {

    String CHANGE_CUSTOM_LINE_ITEM_PRICE_MODE = "changeCustomLineItemPriceMode";

    /**
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return mode
     */
    @NotNull
    @JsonProperty("mode")
    public CustomLineItemPriceMode getMode();

    public void setCustomLineItemId(final String customLineItemId);

    public void setMode(final CustomLineItemPriceMode mode);

    public static CartChangeCustomLineItemPriceModeAction of() {
        return new CartChangeCustomLineItemPriceModeActionImpl();
    }

    public static CartChangeCustomLineItemPriceModeAction of(final CartChangeCustomLineItemPriceModeAction template) {
        CartChangeCustomLineItemPriceModeActionImpl instance = new CartChangeCustomLineItemPriceModeActionImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setMode(template.getMode());
        return instance;
    }

    public static CartChangeCustomLineItemPriceModeActionBuilder builder() {
        return CartChangeCustomLineItemPriceModeActionBuilder.of();
    }

    public static CartChangeCustomLineItemPriceModeActionBuilder builder(
            final CartChangeCustomLineItemPriceModeAction template) {
        return CartChangeCustomLineItemPriceModeActionBuilder.of(template);
    }

    default <T> T withCartChangeCustomLineItemPriceModeAction(
            Function<CartChangeCustomLineItemPriceModeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemPriceModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeCustomLineItemPriceModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeCustomLineItemPriceModeAction>";
            }
        };
    }
}
