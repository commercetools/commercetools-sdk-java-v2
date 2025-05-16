
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Cannot be used in LineItemDraft or CustomLineItemDraft.</p>
 *  <p>Can only be set by these update actions:</p>
 *  <ul>
 *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Carts</li>
 *   <li>Set LineItem TaxAmount, Set CustomLineItem TaxAmount, or Set ShippingMethod TaxAmount on Order Edits</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTaxAmountDraft externalTaxAmountDraft = ExternalTaxAmountDraft.builder()
 *             .totalGross(totalGrossBuilder -> totalGrossBuilder)
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ExternalTaxAmountDraftImpl.class)
public interface ExternalTaxAmountDraft extends io.vrap.rmf.base.client.Draft<ExternalTaxAmountDraft> {

    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     * @return totalGross
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     * @return taxRate
     */
    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public ExternalTaxRateDraft getTaxRate();

    /**
     *  <p>Total gross amount (<code>totalNet</code> + <code>taxPortions</code>) of the Line Item or Custom Line Item.</p>
     * @param totalGross value to be set
     */

    public void setTotalGross(final Money totalGross);

    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final ExternalTaxRateDraft taxRate);

    /**
     * factory method
     * @return instance of ExternalTaxAmountDraft
     */
    public static ExternalTaxAmountDraft of() {
        return new ExternalTaxAmountDraftImpl();
    }

    /**
     * factory method to create a shallow copy ExternalTaxAmountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static ExternalTaxAmountDraft of(final ExternalTaxAmountDraft template) {
        ExternalTaxAmountDraftImpl instance = new ExternalTaxAmountDraftImpl();
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public ExternalTaxAmountDraft copyDeep();

    /**
     * factory method to create a deep copy of ExternalTaxAmountDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ExternalTaxAmountDraft deepCopy(@Nullable final ExternalTaxAmountDraft template) {
        if (template == null) {
            return null;
        }
        ExternalTaxAmountDraftImpl instance = new ExternalTaxAmountDraftImpl();
        instance.setTotalGross(com.commercetools.api.models.common.Money.deepCopy(template.getTotalGross()));
        instance.setTaxRate(com.commercetools.api.models.cart.ExternalTaxRateDraft.deepCopy(template.getTaxRate()));
        return instance;
    }

    /**
     * builder factory method for ExternalTaxAmountDraft
     * @return builder
     */
    public static ExternalTaxAmountDraftBuilder builder() {
        return ExternalTaxAmountDraftBuilder.of();
    }

    /**
     * create builder for ExternalTaxAmountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTaxAmountDraftBuilder builder(final ExternalTaxAmountDraft template) {
        return ExternalTaxAmountDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withExternalTaxAmountDraft(Function<ExternalTaxAmountDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTaxAmountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTaxAmountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTaxAmountDraft>";
            }
        };
    }
}
