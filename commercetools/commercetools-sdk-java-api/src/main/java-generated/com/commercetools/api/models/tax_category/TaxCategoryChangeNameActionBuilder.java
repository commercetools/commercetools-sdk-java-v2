package com.commercetools.api.models.tax_category;

import com.commercetools.api.models.tax_category.TaxCategoryUpdateAction;
import com.commercetools.api.models.tax_category.TaxCategoryChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryChangeNameAction taxCategoryChangeNameAction = TaxCategoryChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryChangeNameActionBuilder implements Builder<TaxCategoryChangeNameAction> {

    
    
    private String name;

    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public TaxCategoryChangeNameActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds TaxCategoryChangeNameAction with checking for non-null required values
     * @return TaxCategoryChangeNameAction
     */
    public TaxCategoryChangeNameAction build() {
        Objects.requireNonNull(name, TaxCategoryChangeNameAction.class + ": name is missing");
        return new TaxCategoryChangeNameActionImpl(name);
    }
    
    /**
     * builds TaxCategoryChangeNameAction without checking for non-null required values
     * @return TaxCategoryChangeNameAction
     */
    public TaxCategoryChangeNameAction buildUnchecked() {
        return new TaxCategoryChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of TaxCategoryChangeNameActionBuilder
     * @return builder 
     */
    public static TaxCategoryChangeNameActionBuilder of() {
        return new TaxCategoryChangeNameActionBuilder();
    }

    /**
     * create builder for TaxCategoryChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryChangeNameActionBuilder of(final TaxCategoryChangeNameAction template) {
        TaxCategoryChangeNameActionBuilder builder = new TaxCategoryChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
