package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 * TaxCategoryRemoveTaxRateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryRemoveTaxRateAction taxCategoryRemoveTaxRateAction = TaxCategoryRemoveTaxRateAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = TaxCategoryRemoveTaxRateActionImpl.class)
public interface TaxCategoryRemoveTaxRateAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategoryRemoveTaxRateAction
     */
    String REMOVE_TAX_RATE = "removeTaxRate";

    /**
     *  <p>ID of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @return taxRateId
     */
    
    @JsonProperty("taxRateId")
    public String getTaxRateId();
    /**
     *  <p>Key of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @return taxRateKey
     */
    
    @JsonProperty("taxRateKey")
    public String getTaxRateKey();

    /**
     *  <p>ID of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @param taxRateId value to be set
     */
    
    public void setTaxRateId(final String taxRateId);
    
    
    /**
     *  <p>Key of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @param taxRateKey value to be set
     */
    
    public void setTaxRateKey(final String taxRateKey);
    

    /**
     * factory method
     * @return instance of TaxCategoryRemoveTaxRateAction
     */
    public static TaxCategoryRemoveTaxRateAction of(){
        return new TaxCategoryRemoveTaxRateActionImpl();
    }
    

    /**
     * factory method to create a shallow copy TaxCategoryRemoveTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryRemoveTaxRateAction of(final TaxCategoryRemoveTaxRateAction template) {
        TaxCategoryRemoveTaxRateActionImpl instance = new TaxCategoryRemoveTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        instance.setTaxRateKey(template.getTaxRateKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategoryRemoveTaxRateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryRemoveTaxRateAction deepCopy(@Nullable final TaxCategoryRemoveTaxRateAction template) {
        if (template == null) {
            return null;
        }
        TaxCategoryRemoveTaxRateActionImpl instance = new TaxCategoryRemoveTaxRateActionImpl();
        instance.setTaxRateId(template.getTaxRateId());
        instance.setTaxRateKey(template.getTaxRateKey());
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
