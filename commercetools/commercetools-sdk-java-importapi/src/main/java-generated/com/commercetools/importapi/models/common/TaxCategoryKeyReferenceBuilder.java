package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.TaxCategoryKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategoryKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryKeyReference taxCategoryKeyReference = TaxCategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TaxCategoryKeyReferenceBuilder implements Builder<TaxCategoryKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public TaxCategoryKeyReferenceBuilder key( final String key) {
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
     * builds TaxCategoryKeyReference with checking for non-null required values
     * @return TaxCategoryKeyReference
     */
    public TaxCategoryKeyReference build() {
        Objects.requireNonNull(key, TaxCategoryKeyReference.class + ": key is missing");
        return new TaxCategoryKeyReferenceImpl(key);
    }
    
    /**
     * builds TaxCategoryKeyReference without checking for non-null required values
     * @return TaxCategoryKeyReference
     */
    public TaxCategoryKeyReference buildUnchecked() {
        return new TaxCategoryKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of TaxCategoryKeyReferenceBuilder
     * @return builder 
     */
    public static TaxCategoryKeyReferenceBuilder of() {
        return new TaxCategoryKeyReferenceBuilder();
    }

    /**
     * create builder for TaxCategoryKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryKeyReferenceBuilder of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceBuilder builder = new TaxCategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
