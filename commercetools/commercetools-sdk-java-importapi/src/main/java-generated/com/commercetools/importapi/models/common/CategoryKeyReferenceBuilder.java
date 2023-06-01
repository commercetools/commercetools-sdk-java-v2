package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CategoryKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryKeyReference categoryKeyReference = CategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryKeyReferenceBuilder implements Builder<CategoryKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public CategoryKeyReferenceBuilder key( final String key) {
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
     * builds CategoryKeyReference with checking for non-null required values
     * @return CategoryKeyReference
     */
    public CategoryKeyReference build() {
        Objects.requireNonNull(key, CategoryKeyReference.class + ": key is missing");
        return new CategoryKeyReferenceImpl(key);
    }
    
    /**
     * builds CategoryKeyReference without checking for non-null required values
     * @return CategoryKeyReference
     */
    public CategoryKeyReference buildUnchecked() {
        return new CategoryKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of CategoryKeyReferenceBuilder
     * @return builder 
     */
    public static CategoryKeyReferenceBuilder of() {
        return new CategoryKeyReferenceBuilder();
    }

    /**
     * create builder for CategoryKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryKeyReferenceBuilder of(final CategoryKeyReference template) {
        CategoryKeyReferenceBuilder builder = new CategoryKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
