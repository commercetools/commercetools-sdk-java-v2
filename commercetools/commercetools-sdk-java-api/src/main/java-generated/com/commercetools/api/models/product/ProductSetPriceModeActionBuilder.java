package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetPriceModeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetPriceModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPriceModeAction productSetPriceModeAction = ProductSetPriceModeAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductSetPriceModeActionBuilder implements Builder<ProductSetPriceModeAction> {

    
    @Nullable
    private com.commercetools.api.models.product.ProductPriceModeEnum priceMode;

    
    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     * @param priceMode value to be set
     * @return Builder
     */
    
    public ProductSetPriceModeActionBuilder priceMode(@Nullable final com.commercetools.api.models.product.ProductPriceModeEnum priceMode) {
        this.priceMode = priceMode;
        return this;
    }
    
    

    /**
     *  <p>Specifies which type of Prices should be used when looking up a price for the Product.</p>
     * @return priceMode
     */
    
    @Nullable
    public com.commercetools.api.models.product.ProductPriceModeEnum getPriceMode(){
        return this.priceMode;
    }

    /**
     * builds ProductSetPriceModeAction with checking for non-null required values
     * @return ProductSetPriceModeAction
     */
    public ProductSetPriceModeAction build() {
        return new ProductSetPriceModeActionImpl(priceMode);
    }
    
    /**
     * builds ProductSetPriceModeAction without checking for non-null required values
     * @return ProductSetPriceModeAction
     */
    public ProductSetPriceModeAction buildUnchecked() {
        return new ProductSetPriceModeActionImpl(priceMode);
    }

    /**
     * factory method for an instance of ProductSetPriceModeActionBuilder
     * @return builder 
     */
    public static ProductSetPriceModeActionBuilder of() {
        return new ProductSetPriceModeActionBuilder();
    }

    /**
     * create builder for ProductSetPriceModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetPriceModeActionBuilder of(final ProductSetPriceModeAction template) {
        ProductSetPriceModeActionBuilder builder = new ProductSetPriceModeActionBuilder();
        builder.priceMode = template.getPriceMode();
        return builder;
    }

}
