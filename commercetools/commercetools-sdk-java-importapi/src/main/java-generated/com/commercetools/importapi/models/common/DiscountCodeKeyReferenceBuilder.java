package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.DiscountCodeKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeKeyReference discountCodeKeyReference = DiscountCodeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountCodeKeyReferenceBuilder implements Builder<DiscountCodeKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public DiscountCodeKeyReferenceBuilder key( final String key) {
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
     * builds DiscountCodeKeyReference with checking for non-null required values
     * @return DiscountCodeKeyReference
     */
    public DiscountCodeKeyReference build() {
        Objects.requireNonNull(key, DiscountCodeKeyReference.class + ": key is missing");
        return new DiscountCodeKeyReferenceImpl(key);
    }
    
    /**
     * builds DiscountCodeKeyReference without checking for non-null required values
     * @return DiscountCodeKeyReference
     */
    public DiscountCodeKeyReference buildUnchecked() {
        return new DiscountCodeKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of DiscountCodeKeyReferenceBuilder
     * @return builder 
     */
    public static DiscountCodeKeyReferenceBuilder of() {
        return new DiscountCodeKeyReferenceBuilder();
    }

    /**
     * create builder for DiscountCodeKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeKeyReferenceBuilder of(final DiscountCodeKeyReference template) {
        DiscountCodeKeyReferenceBuilder builder = new DiscountCodeKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
