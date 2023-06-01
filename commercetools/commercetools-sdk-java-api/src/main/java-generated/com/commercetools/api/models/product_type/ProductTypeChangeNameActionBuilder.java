package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeNameAction productTypeChangeNameAction = ProductTypeChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeNameActionBuilder implements Builder<ProductTypeChangeNameAction> {

    
    
    private String name;

    
    /**
     *  <p>New value to set.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public ProductTypeChangeNameActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    

    /**
     *  <p>New value to set.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }

    /**
     * builds ProductTypeChangeNameAction with checking for non-null required values
     * @return ProductTypeChangeNameAction
     */
    public ProductTypeChangeNameAction build() {
        Objects.requireNonNull(name, ProductTypeChangeNameAction.class + ": name is missing");
        return new ProductTypeChangeNameActionImpl(name);
    }
    
    /**
     * builds ProductTypeChangeNameAction without checking for non-null required values
     * @return ProductTypeChangeNameAction
     */
    public ProductTypeChangeNameAction buildUnchecked() {
        return new ProductTypeChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of ProductTypeChangeNameActionBuilder
     * @return builder 
     */
    public static ProductTypeChangeNameActionBuilder of() {
        return new ProductTypeChangeNameActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeNameActionBuilder of(final ProductTypeChangeNameAction template) {
        ProductTypeChangeNameActionBuilder builder = new ProductTypeChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
