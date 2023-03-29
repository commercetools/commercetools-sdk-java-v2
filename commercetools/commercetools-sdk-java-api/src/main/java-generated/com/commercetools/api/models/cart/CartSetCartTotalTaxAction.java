
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This update action results in the <code>taxedPrice</code> field being added to the Cart when the <code>ExternalAmount</code> TaxMode is used.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCartTotalTaxAction cartSetCartTotalTaxAction = CartSetCartTotalTaxAction.builder()
 *             .externalTotalGross(externalTotalGrossBuilder -> externalTotalGrossBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetCartTotalTaxActionImpl.class)
public interface CartSetCartTotalTaxAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetCartTotalTaxAction
     */
    String SET_CART_TOTAL_TAX = "setCartTotalTax";

    /**
     *  <p>The Cart's total gross price becoming the <code>totalGross</code> field (<code>totalNet</code> + taxes) on the Cart's <code>taxedPrice</code>.</p>
     * @return externalTotalGross
     */
    @NotNull
    @Valid
    @JsonProperty("externalTotalGross")
    public Money getExternalTotalGross();

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     * @return externalTaxPortions
     */
    @Valid
    @JsonProperty("externalTaxPortions")
    public List<TaxPortionDraft> getExternalTaxPortions();

    /**
     *  <p>The Cart's total gross price becoming the <code>totalGross</code> field (<code>totalNet</code> + taxes) on the Cart's <code>taxedPrice</code>.</p>
     * @param externalTotalGross value to be set
     */

    public void setExternalTotalGross(final Money externalTotalGross);

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     * @param externalTaxPortions values to be set
     */

    @JsonIgnore
    public void setExternalTaxPortions(final TaxPortionDraft... externalTaxPortions);

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     * @param externalTaxPortions values to be set
     */

    public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);

    /**
     * factory method
     * @return instance of CartSetCartTotalTaxAction
     */
    public static CartSetCartTotalTaxAction of() {
        return new CartSetCartTotalTaxActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetCartTotalTaxAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetCartTotalTaxAction of(final CartSetCartTotalTaxAction template) {
        CartSetCartTotalTaxActionImpl instance = new CartSetCartTotalTaxActionImpl();
        instance.setExternalTotalGross(template.getExternalTotalGross());
        instance.setExternalTaxPortions(template.getExternalTaxPortions());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetCartTotalTaxAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetCartTotalTaxAction deepCopy(@Nullable final CartSetCartTotalTaxAction template) {
        if (template == null) {
            return null;
        }
        CartSetCartTotalTaxActionImpl instance = new CartSetCartTotalTaxActionImpl();
        instance.setExternalTotalGross(Optional.ofNullable(template.getExternalTotalGross())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setExternalTaxPortions(Optional.ofNullable(template.getExternalTaxPortions())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.TaxPortionDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartSetCartTotalTaxAction
     * @return builder
     */
    public static CartSetCartTotalTaxActionBuilder builder() {
        return CartSetCartTotalTaxActionBuilder.of();
    }

    /**
     * create builder for CartSetCartTotalTaxAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetCartTotalTaxActionBuilder builder(final CartSetCartTotalTaxAction template) {
        return CartSetCartTotalTaxActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetCartTotalTaxAction(Function<CartSetCartTotalTaxAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCartTotalTaxAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCartTotalTaxAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCartTotalTaxAction>";
            }
        };
    }
}
