
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryReplaceTaxRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReplaceTaxRateAction taxCategoryReplaceTaxRateAction = TaxCategoryReplaceTaxRateAction.builder()
 *             .taxRateId("{taxRateId}")
 *             .taxRate(taxRateBuilder -> taxRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryReplaceTaxRateActionImpl.class)
public interface TaxCategoryReplaceTaxRateAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategoryReplaceTaxRateAction
     */
    String REPLACE_TAX_RATE = "replaceTaxRate";

    /**
     *  <p>ID of the TaxRate to replace.</p>
     * @return taxRateId
     */
    @NotNull
    @JsonProperty("taxRateId")
    public String getTaxRateId();

    /**
     *  <p>New TaxRate to replace with.</p>
     * @return taxRate
     */
    @NotNull
    @Valid
    @JsonProperty("taxRate")
    public TaxRateDraft getTaxRate();

    /**
     *  <p>ID of the TaxRate to replace.</p>
     * @param taxRateId value to be set
     */

    public void setTaxRateId(final String taxRateId);

    /**
     *  <p>New TaxRate to replace with.</p>
     * @param taxRate value to be set
     */

    public void setTaxRate(final TaxRateDraft taxRate);

    /**
     * factory method
     * @return instance of TaxCategoryReplaceTaxRateAction
     */
    public static TaxCategoryReplaceTaxRateAction of() {
        return new TaxCategoryReplaceTaxRateActionImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryReplaceTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryReplaceTaxRateAction of(final TaxCategoryReplaceTaxRateAction template) {
        TaxCategoryReplaceTaxRateActionImpl instance = new TaxCategoryReplaceTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        instance.setTaxRate(template.getTaxRate());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategoryReplaceTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryReplaceTaxRateAction deepCopy(@Nullable final TaxCategoryReplaceTaxRateAction template) {
        if (template == null) {
            return null;
        }
        TaxCategoryReplaceTaxRateActionImpl instance = new TaxCategoryReplaceTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        instance.setTaxRate(com.commercetools.api.models.tax_category.TaxRateDraft.deepCopy(template.getTaxRate()));
        return instance;
    }

    /**
     * builder factory method for TaxCategoryReplaceTaxRateAction
     * @return builder
     */
    public static TaxCategoryReplaceTaxRateActionBuilder builder() {
        return TaxCategoryReplaceTaxRateActionBuilder.of();
    }

    /**
     * create builder for TaxCategoryReplaceTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryReplaceTaxRateActionBuilder builder(final TaxCategoryReplaceTaxRateAction template) {
        return TaxCategoryReplaceTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryReplaceTaxRateAction(Function<TaxCategoryReplaceTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryReplaceTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryReplaceTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryReplaceTaxRateAction>";
            }
        };
    }
}
