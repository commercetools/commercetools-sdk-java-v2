package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CartKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartKeyReference cartKeyReference = CartKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CartKeyReferenceBuilder implements Builder<CartKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public CartKeyReferenceBuilder key( final String key) {
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
     * builds CartKeyReference with checking for non-null required values
     * @return CartKeyReference
     */
    public CartKeyReference build() {
        Objects.requireNonNull(key, CartKeyReference.class + ": key is missing");
        return new CartKeyReferenceImpl(key);
    }
    
    /**
     * builds CartKeyReference without checking for non-null required values
     * @return CartKeyReference
     */
    public CartKeyReference buildUnchecked() {
        return new CartKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of CartKeyReferenceBuilder
     * @return builder 
     */
    public static CartKeyReferenceBuilder of() {
        return new CartKeyReferenceBuilder();
    }

    /**
     * create builder for CartKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartKeyReferenceBuilder of(final CartKeyReference template) {
        CartKeyReferenceBuilder builder = new CartKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
