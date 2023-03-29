
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Changing the tax rounding mode leads to recalculation of taxes.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartChangeTaxRoundingModeAction cartChangeTaxRoundingModeAction = CartChangeTaxRoundingModeAction.builder()
 *             .taxRoundingMode(RoundingMode.HALF_EVEN)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartChangeTaxRoundingModeActionImpl.class)
public interface CartChangeTaxRoundingModeAction extends CartUpdateAction {

    /**
     * discriminator value for CartChangeTaxRoundingModeAction
     */
    String CHANGE_TAX_ROUNDING_MODE = "changeTaxRoundingMode";

    /**
     *  <p>New value to set.</p>
     * @return taxRoundingMode
     */
    @NotNull
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>New value to set.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     * factory method
     * @return instance of CartChangeTaxRoundingModeAction
     */
    public static CartChangeTaxRoundingModeAction of() {
        return new CartChangeTaxRoundingModeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartChangeTaxRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartChangeTaxRoundingModeAction of(final CartChangeTaxRoundingModeAction template) {
        CartChangeTaxRoundingModeActionImpl instance = new CartChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartChangeTaxRoundingModeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartChangeTaxRoundingModeAction deepCopy(@Nullable final CartChangeTaxRoundingModeAction template) {
        if (template == null) {
            return null;
        }
        CartChangeTaxRoundingModeActionImpl instance = new CartChangeTaxRoundingModeActionImpl();
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        return instance;
    }

    /**
     * builder factory method for CartChangeTaxRoundingModeAction
     * @return builder
     */
    public static CartChangeTaxRoundingModeActionBuilder builder() {
        return CartChangeTaxRoundingModeActionBuilder.of();
    }

    /**
     * create builder for CartChangeTaxRoundingModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartChangeTaxRoundingModeActionBuilder builder(final CartChangeTaxRoundingModeAction template) {
        return CartChangeTaxRoundingModeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartChangeTaxRoundingModeAction(Function<CartChangeTaxRoundingModeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxRoundingModeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartChangeTaxRoundingModeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartChangeTaxRoundingModeAction>";
            }
        };
    }
}
