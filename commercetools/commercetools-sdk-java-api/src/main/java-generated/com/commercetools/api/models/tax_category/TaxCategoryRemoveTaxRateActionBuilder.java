package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryRemoveTaxRateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryRemoveTaxRateActionBuilder
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
public class TaxCategoryRemoveTaxRateActionBuilder implements Builder<TaxCategoryRemoveTaxRateAction> {

    
    @Nullable
    private String taxRateId;
    
    
    @Nullable
    private String taxRateKey;

    
    /**
     *  <p>ID of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @param taxRateId value to be set
     * @return Builder
     */
    
    public TaxCategoryRemoveTaxRateActionBuilder taxRateId(@Nullable final String taxRateId) {
        this.taxRateId = taxRateId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Key of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @param taxRateKey value to be set
     * @return Builder
     */
    
    public TaxCategoryRemoveTaxRateActionBuilder taxRateKey(@Nullable final String taxRateKey) {
        this.taxRateKey = taxRateKey;
        return this;
    }
    
    

    /**
     *  <p>ID of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @return taxRateId
     */
    
    @Nullable
    public String getTaxRateId(){
        return this.taxRateId;
    }
    
    /**
     *  <p>Key of the TaxRate to remove. Either <code>taxRateId</code> or <code>taxRateKey</code> is required for this update action.</p>
     * @return taxRateKey
     */
    
    @Nullable
    public String getTaxRateKey(){
        return this.taxRateKey;
    }

    /**
     * builds TaxCategoryRemoveTaxRateAction with checking for non-null required values
     * @return TaxCategoryRemoveTaxRateAction
     */
    public TaxCategoryRemoveTaxRateAction build() {
        return new TaxCategoryRemoveTaxRateActionImpl(taxRateId, taxRateKey);
    }
    
    /**
     * builds TaxCategoryRemoveTaxRateAction without checking for non-null required values
     * @return TaxCategoryRemoveTaxRateAction
     */
    public TaxCategoryRemoveTaxRateAction buildUnchecked() {
        return new TaxCategoryRemoveTaxRateActionImpl(taxRateId, taxRateKey);
    }

    /**
     * factory method for an instance of TaxCategoryRemoveTaxRateActionBuilder
     * @return builder 
     */
    public static TaxCategoryRemoveTaxRateActionBuilder of() {
        return new TaxCategoryRemoveTaxRateActionBuilder();
    }

    /**
     * create builder for TaxCategoryRemoveTaxRateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryRemoveTaxRateActionBuilder of(final TaxCategoryRemoveTaxRateAction template) {
        TaxCategoryRemoveTaxRateActionBuilder builder = new TaxCategoryRemoveTaxRateActionBuilder();
        builder.taxRateId = template.getTaxRateId();
        builder.taxRateKey = template.getTaxRateKey();
        return builder;
    }

}
