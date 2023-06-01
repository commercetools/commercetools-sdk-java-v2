package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.ProductPriceKeySetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductPriceKeySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductPriceKeySetMessagePayload productPriceKeySetMessagePayload = ProductPriceKeySetMessagePayload.builder()
 *             .variantId(0.3)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductPriceKeySetMessagePayloadBuilder implements Builder<ProductPriceKeySetMessagePayload> {

    
    
    private Long variantId;
    
    
    @Nullable
    private String priceId;
    
    
    @Nullable
    private String oldKey;
    
    
    @Nullable
    private String key;
    
    
    
    private Boolean staged;

    
    /**
     * set the value to the variantId
     * @param variantId value to be set
     * @return Builder
     */
    
    public ProductPriceKeySetMessagePayloadBuilder variantId( final Long variantId) {
        this.variantId = variantId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Unique identifier of the Price.</p>
     * @param priceId value to be set
     * @return Builder
     */
    
    public ProductPriceKeySetMessagePayloadBuilder priceId(@Nullable final String priceId) {
        this.priceId = priceId;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> value of the Price before the Set Price Key update action.</p>
     * @param oldKey value to be set
     * @return Builder
     */
    
    public ProductPriceKeySetMessagePayloadBuilder oldKey(@Nullable final String oldKey) {
        this.oldKey = oldKey;
        return this;
    }
    
    
    
    
    /**
     *  <p><code>key</code> value of the Price after the Set Price Key update action.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductPriceKeySetMessagePayloadBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     * @return Builder
     */
    
    public ProductPriceKeySetMessagePayloadBuilder staged( final Boolean staged) {
        this.staged = staged;
        return this;
    }
    
    

    /**
     * value of variantId}
     * @return variantId
     */
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    /**
     *  <p>Unique identifier of the Price.</p>
     * @return priceId
     */
    
    @Nullable
    public String getPriceId(){
        return this.priceId;
    }
    
    /**
     *  <p><code>key</code> value of the Price before the Set Price Key update action.</p>
     * @return oldKey
     */
    
    @Nullable
    public String getOldKey(){
        return this.oldKey;
    }
    
    /**
     *  <p><code>key</code> value of the Price after the Set Price Key update action.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    /**
     * builds ProductPriceKeySetMessagePayload with checking for non-null required values
     * @return ProductPriceKeySetMessagePayload
     */
    public ProductPriceKeySetMessagePayload build() {
        Objects.requireNonNull(variantId, ProductPriceKeySetMessagePayload.class + ": variantId is missing");
        Objects.requireNonNull(staged, ProductPriceKeySetMessagePayload.class + ": staged is missing");
        return new ProductPriceKeySetMessagePayloadImpl(variantId, priceId, oldKey, key, staged);
    }
    
    /**
     * builds ProductPriceKeySetMessagePayload without checking for non-null required values
     * @return ProductPriceKeySetMessagePayload
     */
    public ProductPriceKeySetMessagePayload buildUnchecked() {
        return new ProductPriceKeySetMessagePayloadImpl(variantId, priceId, oldKey, key, staged);
    }

    /**
     * factory method for an instance of ProductPriceKeySetMessagePayloadBuilder
     * @return builder 
     */
    public static ProductPriceKeySetMessagePayloadBuilder of() {
        return new ProductPriceKeySetMessagePayloadBuilder();
    }

    /**
     * create builder for ProductPriceKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductPriceKeySetMessagePayloadBuilder of(final ProductPriceKeySetMessagePayload template) {
        ProductPriceKeySetMessagePayloadBuilder builder = new ProductPriceKeySetMessagePayloadBuilder();
        builder.variantId = template.getVariantId();
        builder.priceId = template.getPriceId();
        builder.oldKey = template.getOldKey();
        builder.key = template.getKey();
        builder.staged = template.getStaged();
        return builder;
    }

}
