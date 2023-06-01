package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeEnumKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeChangeEnumKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeChangeEnumKeyAction productTypeChangeEnumKeyAction = ProductTypeChangeEnumKeyAction.builder()
 *             .attributeName("{attributeName}")
 *             .key("{key}")
 *             .newKey("{newKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeChangeEnumKeyActionBuilder implements Builder<ProductTypeChangeEnumKeyAction> {

    
    
    private String attributeName;
    
    
    
    private String key;
    
    
    
    private String newKey;

    
    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @param attributeName value to be set
     * @return Builder
     */
    
    public ProductTypeChangeEnumKeyActionBuilder attributeName( final String attributeName) {
        this.attributeName = attributeName;
        return this;
    }
    
    
    
    
    /**
     *  <p>Existing key to be changed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ProductTypeChangeEnumKeyActionBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     *  <p>New key to be set.</p>
     * @param newKey value to be set
     * @return Builder
     */
    
    public ProductTypeChangeEnumKeyActionBuilder newKey( final String newKey) {
        this.newKey = newKey;
        return this;
    }
    
    

    /**
     *  <p>Name of the AttributeDefinition to update.</p>
     * @return attributeName
     */
    
    
    public String getAttributeName(){
        return this.attributeName;
    }
    
    /**
     *  <p>Existing key to be changed.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }
    
    /**
     *  <p>New key to be set.</p>
     * @return newKey
     */
    
    
    public String getNewKey(){
        return this.newKey;
    }

    /**
     * builds ProductTypeChangeEnumKeyAction with checking for non-null required values
     * @return ProductTypeChangeEnumKeyAction
     */
    public ProductTypeChangeEnumKeyAction build() {
        Objects.requireNonNull(attributeName, ProductTypeChangeEnumKeyAction.class + ": attributeName is missing");
        Objects.requireNonNull(key, ProductTypeChangeEnumKeyAction.class + ": key is missing");
        Objects.requireNonNull(newKey, ProductTypeChangeEnumKeyAction.class + ": newKey is missing");
        return new ProductTypeChangeEnumKeyActionImpl(attributeName, key, newKey);
    }
    
    /**
     * builds ProductTypeChangeEnumKeyAction without checking for non-null required values
     * @return ProductTypeChangeEnumKeyAction
     */
    public ProductTypeChangeEnumKeyAction buildUnchecked() {
        return new ProductTypeChangeEnumKeyActionImpl(attributeName, key, newKey);
    }

    /**
     * factory method for an instance of ProductTypeChangeEnumKeyActionBuilder
     * @return builder 
     */
    public static ProductTypeChangeEnumKeyActionBuilder of() {
        return new ProductTypeChangeEnumKeyActionBuilder();
    }

    /**
     * create builder for ProductTypeChangeEnumKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeChangeEnumKeyActionBuilder of(final ProductTypeChangeEnumKeyAction template) {
        ProductTypeChangeEnumKeyActionBuilder builder = new ProductTypeChangeEnumKeyActionBuilder();
        builder.attributeName = template.getAttributeName();
        builder.key = template.getKey();
        builder.newKey = template.getNewKey();
        return builder;
    }

}
