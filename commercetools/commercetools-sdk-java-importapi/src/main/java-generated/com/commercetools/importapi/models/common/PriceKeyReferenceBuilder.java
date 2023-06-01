package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.PriceKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceKeyReference priceKeyReference = PriceKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PriceKeyReferenceBuilder implements Builder<PriceKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public PriceKeyReferenceBuilder key( final String key) {
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
     * builds PriceKeyReference with checking for non-null required values
     * @return PriceKeyReference
     */
    public PriceKeyReference build() {
        Objects.requireNonNull(key, PriceKeyReference.class + ": key is missing");
        return new PriceKeyReferenceImpl(key);
    }
    
    /**
     * builds PriceKeyReference without checking for non-null required values
     * @return PriceKeyReference
     */
    public PriceKeyReference buildUnchecked() {
        return new PriceKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of PriceKeyReferenceBuilder
     * @return builder 
     */
    public static PriceKeyReferenceBuilder of() {
        return new PriceKeyReferenceBuilder();
    }

    /**
     * create builder for PriceKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceKeyReferenceBuilder of(final PriceKeyReference template) {
        PriceKeyReferenceBuilder builder = new PriceKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
