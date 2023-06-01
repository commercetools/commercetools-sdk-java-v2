package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.PaymentKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentKeyReference paymentKeyReference = PaymentKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class PaymentKeyReferenceBuilder implements Builder<PaymentKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public PaymentKeyReferenceBuilder key( final String key) {
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
     * builds PaymentKeyReference with checking for non-null required values
     * @return PaymentKeyReference
     */
    public PaymentKeyReference build() {
        Objects.requireNonNull(key, PaymentKeyReference.class + ": key is missing");
        return new PaymentKeyReferenceImpl(key);
    }
    
    /**
     * builds PaymentKeyReference without checking for non-null required values
     * @return PaymentKeyReference
     */
    public PaymentKeyReference buildUnchecked() {
        return new PaymentKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of PaymentKeyReferenceBuilder
     * @return builder 
     */
    public static PaymentKeyReferenceBuilder of() {
        return new PaymentKeyReferenceBuilder();
    }

    /**
     * create builder for PaymentKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentKeyReferenceBuilder of(final PaymentKeyReference template) {
        PaymentKeyReferenceBuilder builder = new PaymentKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
