
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
     */
    @NotNull
    @Valid
    @JsonProperty("totalGross")
    public Money getTotalGross();

    /**
     *  <p>Tax Rates and subrates of states and countries.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public ExternalTaxRateDraft getTaxRate();

    public void setTotalGross(final Money totalGross);

    public void setTaxRate(final ExternalTaxRateDraft taxRate);

    public static ExternalTaxAmountDraft of() {
        return new ExternalTaxAmountDraftImpl();
    }

    public static ExternalTaxAmountDraft of(final ExternalTaxAmountDraft template) {
        ExternalTaxAmountDraftImpl instance = new ExternalTaxAmountDraftImpl();
        instance.setTotalGross(template.getTotalGross());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public static ExternalTaxAmountDraftBuilder builder() {
        return ExternalTaxAmountDraftBuilder.of();
    }

    public static ExternalTaxAmountDraftBuilder builder(final ExternalTaxAmountDraft template) {
        return ExternalTaxAmountDraftBuilder.of(template);
    }

    default <T> T withExternalTaxAmountDraft(Function<ExternalTaxAmountDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ExternalTaxAmountDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ExternalTaxAmountDraft>() {
            @Override
            public String toString() {
                return "TypeReference<ExternalTaxAmountDraft>";
            }
        };
    }
}
