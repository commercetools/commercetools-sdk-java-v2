package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.ProductTypeKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTypeKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeKeyReference productTypeKeyReference = ProductTypeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductTypeKeyReferenceBuilder implements Builder<ProductTypeKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public ProductTypeKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     * value of key}
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }

    /**
     * builds ProductTypeKeyReference with checking for non-null required values
     * @return ProductTypeKeyReference
     */
    public ProductTypeKeyReference build() {
        Objects.requireNonNull(key, ProductTypeKeyReference.class + ": key is missing");
        return new ProductTypeKeyReferenceImpl(key);
    }
    
    /**
     * builds ProductTypeKeyReference without checking for non-null required values
     * @return ProductTypeKeyReference
     */
    public ProductTypeKeyReference buildUnchecked() {
        return new ProductTypeKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of ProductTypeKeyReferenceBuilder
     * @return builder 
     */
    public static ProductTypeKeyReferenceBuilder of() {
        return new ProductTypeKeyReferenceBuilder();
    }

    /**
     * create builder for ProductTypeKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeKeyReferenceBuilder of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceBuilder builder = new ProductTypeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
