package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeSetKeyAction productTypeSetKeyAction = ProductTypeSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeSetKeyActionBuilder implements Builder<ProductTypeSetKeyAction> {

    
    @Nullable
    private String key;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductTypeSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds ProductTypeSetKeyAction with checking for non-null required values
     * @return ProductTypeSetKeyAction
     */
    public ProductTypeSetKeyAction build() {
        return new ProductTypeSetKeyActionImpl(key);
    }
    
    /**
     * builds ProductTypeSetKeyAction without checking for non-null required values
     * @return ProductTypeSetKeyAction
     */
    public ProductTypeSetKeyAction buildUnchecked() {
        return new ProductTypeSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ProductTypeSetKeyActionBuilder
     * @return builder 
     */
    public static ProductTypeSetKeyActionBuilder of() {
        return new ProductTypeSetKeyActionBuilder();
    }

    /**
     * create builder for ProductTypeSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeSetKeyActionBuilder of(final ProductTypeSetKeyAction template) {
        ProductTypeSetKeyActionBuilder builder = new ProductTypeSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
