
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * TaxCategoryAddTaxRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryAddTaxRateAction taxCategoryAddTaxRateAction = TaxCategoryAddTaxRateAction.builder()
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addTaxRate")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryAddTaxRateActionImpl.class)
public interface TaxCategoryAddTaxRateAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategoryAddTaxRateAction
     */
    String ADD_TAX_RATE = "addTaxRate";

    /**
     *  <p>Value to append to the <code>rates</code> array.</p>
     * @return taxRate
     */
    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public TaxRateDraft getTaxRate();

    /**
     *  <p>Value to append to the <code>rates</code> array.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRateDraft taxRate);

    /**
     * factory method
     * @return instance of TaxCategoryAddTaxRateAction
     */
    public static TaxCategoryAddTaxRateAction of() {
        return new TaxCategoryAddTaxRateActionImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryAddTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryAddTaxRateAction of(final TaxCategoryAddTaxRateAction template) {
        TaxCategoryAddTaxRateActionImpl instance = new TaxCategoryAddTaxRateActionImpl();
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    public TaxCategoryAddTaxRateAction copyDeep();

    /**
     * factory method to create a deep copy of TaxCategoryAddTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryAddTaxRateAction deepCopy(@Nullable final TaxCategoryAddTaxRateAction template) {
        if (template == null) {
            return null;
        }
        TaxCategoryAddTaxRateActionImpl instance = new TaxCategoryAddTaxRateActionImpl();
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRateDraft.deepCopy(template.getTaxRate()));
        return instance;
    }

    /**
     * builder factory method for TaxCategoryAddTaxRateAction
     * @return builder
     */
    public static TaxCategoryAddTaxRateActionBuilder builder() {
        return TaxCategoryAddTaxRateActionBuilder.of();
    }

    /**
     * create builder for TaxCategoryAddTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryAddTaxRateActionBuilder builder(final TaxCategoryAddTaxRateAction template) {
        return TaxCategoryAddTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryAddTaxRateAction(Function<TaxCategoryAddTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryAddTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryAddTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryAddTaxRateAction>";
            }
        };
    }
}
