package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.OrderKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderKeyReference orderKeyReference = OrderKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderKeyReferenceBuilder implements Builder<OrderKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public OrderKeyReferenceBuilder key( final String key) {
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
     * builds OrderKeyReference with checking for non-null required values
     * @return OrderKeyReference
     */
    public OrderKeyReference build() {
        Objects.requireNonNull(key, OrderKeyReference.class + ": key is missing");
        return new OrderKeyReferenceImpl(key);
    }
    
    /**
     * builds OrderKeyReference without checking for non-null required values
     * @return OrderKeyReference
     */
    public OrderKeyReference buildUnchecked() {
        return new OrderKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of OrderKeyReferenceBuilder
     * @return builder 
     */
    public static OrderKeyReferenceBuilder of() {
        return new OrderKeyReferenceBuilder();
    }

    /**
     * create builder for OrderKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderKeyReferenceBuilder of(final OrderKeyReference template) {
        OrderKeyReferenceBuilder builder = new OrderKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
