package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.product.ProductPriceModeEnum;
import com.commercetools.api.models.message.ProductPriceModeSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceModeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceModeSetMessagePayload productPriceModeSetMessagePayload = ProductPriceModeSetMessagePayload.builder()
 *             .to(ProductPriceModeEnum.EMBEDDED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPriceModeSetMessagePayloadBuilder implements Builder<ProductPriceModeSetMessagePayload> {

    
    
    private com.commercetools.api.models.product.ProductPriceModeEnum to;

    
    /**
     *  <p>The PriceMode that was set.</p>
     * @param to value to be set
     * @return Builder
     */
    
    public ProductPriceModeSetMessagePayloadBuilder to( final com.commercetools.api.models.product.ProductPriceModeEnum to) {
        this.to = to;
        return this;
    }
    
    

    /**
     *  <p>The PriceMode that was set.</p>
     * @return to
     */
    
    
    public com.commercetools.api.models.product.ProductPriceModeEnum getTo(){
        return this.to;
    }

    /**
     * builds ProductPriceModeSetMessagePayload with checking for non-null required values
     * @return ProductPriceModeSetMessagePayload
     */
    public ProductPriceModeSetMessagePayload build() {
        Objects.requireNonNull(to, ProductPriceModeSetMessagePayload.class + ": to is missing");
        return new ProductPriceModeSetMessagePayloadImpl(to);
    }
    
    /**
     * builds ProductPriceModeSetMessagePayload without checking for non-null required values
     * @return ProductPriceModeSetMessagePayload
     */
    public ProductPriceModeSetMessagePayload buildUnchecked() {
        return new ProductPriceModeSetMessagePayloadImpl(to);
    }

    /**
     * factory method for an instance of ProductPriceModeSetMessagePayloadBuilder
     * @return builder 
     */
    public static ProductPriceModeSetMessagePayloadBuilder of() {
        return new ProductPriceModeSetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceModeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceModeSetMessagePayloadBuilder of(final ProductPriceModeSetMessagePayload template) {
        ProductPriceModeSetMessagePayloadBuilder builder = new ProductPriceModeSetMessagePayloadBuilder();
        builder.to = template.getTo();
        return builder;
    }

}
