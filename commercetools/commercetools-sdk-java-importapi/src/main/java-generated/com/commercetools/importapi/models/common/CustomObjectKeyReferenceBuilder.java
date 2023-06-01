package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.CustomObjectKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomObjectKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectKeyReference customObjectKeyReference = CustomObjectKeyReference.builder()
 *             .key("{key}")
 *             .container("{container}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomObjectKeyReferenceBuilder implements Builder<CustomObjectKeyReference> {

    
    
    private String key;
    
    
    
    private String container;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public CustomObjectKeyReferenceBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    
    
    
    /**
     * set the value to the container
     * @param container value to be set
     * @return Builder
     */
    
    public CustomObjectKeyReferenceBuilder container( final String container) {
        this.container = container;
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
     * value of container}
     * @return container
     */
    
    
    public String getContainer(){
        return this.container;
    }

    /**
     * builds CustomObjectKeyReference with checking for non-null required values
     * @return CustomObjectKeyReference
     */
    public CustomObjectKeyReference build() {
        Objects.requireNonNull(key, CustomObjectKeyReference.class + ": key is missing");
        Objects.requireNonNull(container, CustomObjectKeyReference.class + ": container is missing");
        return new CustomObjectKeyReferenceImpl(key, container);
    }
    
    /**
     * builds CustomObjectKeyReference without checking for non-null required values
     * @return CustomObjectKeyReference
     */
    public CustomObjectKeyReference buildUnchecked() {
        return new CustomObjectKeyReferenceImpl(key, container);
    }

    /**
     * factory method for an instance of CustomObjectKeyReferenceBuilder
     * @return builder 
     */
    public static CustomObjectKeyReferenceBuilder of() {
        return new CustomObjectKeyReferenceBuilder();
    }

    /**
     * create builder for CustomObjectKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectKeyReferenceBuilder of(final CustomObjectKeyReference template) {
        CustomObjectKeyReferenceBuilder builder = new CustomObjectKeyReferenceBuilder();
        builder.key = template.getKey();
        builder.container = template.getContainer();
        return builder;
    }

}
