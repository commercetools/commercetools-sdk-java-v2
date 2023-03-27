
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryRemoveTaxRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryRemoveTaxRateAction taxCategoryRemoveTaxRateAction = TaxCategoryRemoveTaxRateAction.builder()
 *             .taxRateId("{taxRateId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryRemoveTaxRateActionImpl.class)
public interface TaxCategoryRemoveTaxRateAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategoryRemoveTaxRateAction
     */
    String REMOVE_TAX_RATE = "removeTaxRate";

    /**
     *  <p>ID of the TaxRate to remove.</p>
     * @return taxRateId
     */
    @NotNull
    @JsonProperty("taxRateId")
    public String getTaxRateId();

    /**
     *  <p>ID of the TaxRate to remove.</p>
     * @param taxRateId value to be set
     */

    public void setTaxRateId(final String taxRateId);

    /**
     * factory method
     * @return instance of TaxCategoryRemoveTaxRateAction
     */
    public static TaxCategoryRemoveTaxRateAction of() {
        return new TaxCategoryRemoveTaxRateActionImpl();
    }

    /**
     * factory method to copy an instance of TaxCategoryRemoveTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryRemoveTaxRateAction of(final TaxCategoryRemoveTaxRateAction template) {
        TaxCategoryRemoveTaxRateActionImpl instance = new TaxCategoryRemoveTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        return instance;
    }

    /**
     * builder factory method for TaxCategoryRemoveTaxRateAction
     * @return builder
     */
    public static TaxCategoryRemoveTaxRateActionBuilder builder() {
        return TaxCategoryRemoveTaxRateActionBuilder.of();
    }

    /**
     * create builder for TaxCategoryRemoveTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryRemoveTaxRateActionBuilder builder(final TaxCategoryRemoveTaxRateAction template) {
        return TaxCategoryRemoveTaxRateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryRemoveTaxRateAction(Function<TaxCategoryRemoveTaxRateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryRemoveTaxRateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryRemoveTaxRateAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryRemoveTaxRateAction>";
            }
        };
    }
}
