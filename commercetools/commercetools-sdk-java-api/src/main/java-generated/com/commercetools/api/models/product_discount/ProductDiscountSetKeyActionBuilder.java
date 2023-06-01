package com.commercetools.api.models.product_discount;

import com.commercetools.api.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.models.product_discount.ProductDiscountSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductDiscountSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountSetKeyAction productDiscountSetKeyAction = ProductDiscountSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductDiscountSetKeyActionBuilder implements Builder<ProductDiscountSetKeyAction> {

    
    @Nullable
    private String key;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductDiscountSetKeyActionBuilder key(@Nullable final String key) {
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
     * builds ProductDiscountSetKeyAction with checking for non-null required values
     * @return ProductDiscountSetKeyAction
     */
    public ProductDiscountSetKeyAction build() {
        return new ProductDiscountSetKeyActionImpl(key);
    }
    
    /**
     * builds ProductDiscountSetKeyAction without checking for non-null required values
     * @return ProductDiscountSetKeyAction
     */
    public ProductDiscountSetKeyAction buildUnchecked() {
        return new ProductDiscountSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ProductDiscountSetKeyActionBuilder
     * @return builder 
     */
    public static ProductDiscountSetKeyActionBuilder of() {
        return new ProductDiscountSetKeyActionBuilder();
    }

    /**
     * create builder for ProductDiscountSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountSetKeyActionBuilder of(final ProductDiscountSetKeyAction template) {
        ProductDiscountSetKeyActionBuilder builder = new ProductDiscountSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
