
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
 *  <p>Changing the price rounding mode leads to recalculation of taxes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangePriceRoundingModeAction cartChangePriceRoundingModeAction = CartChangePriceRoundingModeAction.builder()
 *             .priceRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changePriceRoundingMode")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangePriceRoundingModeActionImpl.class)
public interface CartChangePriceRoundingModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangePriceRoundingModeAction
     */
    String CHANGE_PRICE_ROUNDING_MODE = "changePriceRoundingMode";

    /**
     *  <p>New value to set.</p>
     * @return priceRoundingMode
     */
    @NotNull
    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>New value to set.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     * factory method
     * @return instance of CartChangePriceRoundingModeAction
     */
    public static CartChangePriceRoundingModeAction of() {
        return new CartChangePriceRoundingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangePriceRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangePriceRoundingModeAction of(final CartChangePriceRoundingModeAction template) {
        CartChangePriceRoundingModeActionImpl instance = new CartChangePriceRoundingModeActionImpl();
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        return instance;
    }

    public CartChangePriceRoundingModeAction copyDeep();

    /**
     * factory method to create a deep copy of CartChangePriceRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangePriceRoundingModeAction deepCopy(
            @Nullable final CartChangePriceRoundingModeAction template) {
        if (template == null) {
            return null;
        }
        CartChangePriceRoundingModeActionImpl instance = new CartChangePriceRoundingModeActionImpl();
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        return instance;
    }

    /**
     * builder factory method for CartChangePriceRoundingModeAction
     * @return builder
     */
    public static CartChangePriceRoundingModeActionBuilder builder() {
        return CartChangePriceRoundingModeActionBuilder.of();
    }

    /**
     * create builder for CartChangePriceRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangePriceRoundingModeActionBuilder builder(final CartChangePriceRoundingModeAction template) {
        return CartChangePriceRoundingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangePriceRoundingModeAction(Function<CartChangePriceRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangePriceRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangePriceRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangePriceRoundingModeAction>";
            }
        };
    }
}
