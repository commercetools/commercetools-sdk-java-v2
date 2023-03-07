
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String SET_CART_TOTAL_TAX = "setCartTotalTax";

    /**
     *  <p>The Cart's total gross price becoming the <code>totalGross</code> field (<code>totalNet</code> + taxes) on the Cart's <code>taxedPrice</code>.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("externalTotalGross")
    public Money getExternalTotalGross();

    /**
     *  <p>Set if the <code>externalTotalGross</code> price is a sum of portions with different tax rates.</p>
     */
    @Valid
    @JsonProperty("externalTaxPortions")
    public List<TaxPortionDraft> getExternalTaxPortions();

    public void setExternalTotalGross(final Money externalTotalGross);

    @JsonIgnore
    public void setExternalTaxPortions(final TaxPortionDraft... externalTaxPortions);

    public void setExternalTaxPortions(final List<TaxPortionDraft> externalTaxPortions);

    public static CartSetCartTotalTaxAction of() {
        return new CartSetCartTotalTaxActionImpl();
    }

    public static CartSetCartTotalTaxAction of(final CartSetCartTotalTaxAction template) {
        CartSetCartTotalTaxActionImpl instance = new CartSetCartTotalTaxActionImpl();
        instance.setExternalTotalGross(template.getExternalTotalGross());
        instance.setExternalTaxPortions(template.getExternalTaxPortions());
        return instance;
    }

    public static CartSetCartTotalTaxActionBuilder builder() {
        return CartSetCartTotalTaxActionBuilder.of();
    }

    public static CartSetCartTotalTaxActionBuilder builder(final CartSetCartTotalTaxAction template) {
        return CartSetCartTotalTaxActionBuilder.of(template);
    }

    default <T> T withCartSetCartTotalTaxAction(Function<CartSetCartTotalTaxAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartSetCartTotalTaxAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetCartTotalTaxAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetCartTotalTaxAction>";
            }
        };
    }
}
