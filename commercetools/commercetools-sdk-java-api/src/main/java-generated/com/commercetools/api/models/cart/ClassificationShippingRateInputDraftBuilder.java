package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInputDraft;
import com.commercetools.api.models.cart.ClassificationShippingRateInputDraft;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ClassificationShippingRateInputDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ClassificationShippingRateInputDraft classificationShippingRateInputDraft = ClassificationShippingRateInputDraft.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ClassificationShippingRateInputDraftBuilder implements Builder<ClassificationShippingRateInputDraft> {

    
    
    private String key;

    
    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ClassificationShippingRateInputDraftBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Key of the value used as a programmatic identifier.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }

    /**
     * builds ClassificationShippingRateInputDraft with checking for non-null required values
     * @return ClassificationShippingRateInputDraft
     */
    public ClassificationShippingRateInputDraft build() {
        Objects.requireNonNull(key, ClassificationShippingRateInputDraft.class + ": key is missing");
        return new ClassificationShippingRateInputDraftImpl(key);
    }
    
    /**
     * builds ClassificationShippingRateInputDraft without checking for non-null required values
     * @return ClassificationShippingRateInputDraft
     */
    public ClassificationShippingRateInputDraft buildUnchecked() {
        return new ClassificationShippingRateInputDraftImpl(key);
    }

    /**
     * factory method for an instance of ClassificationShippingRateInputDraftBuilder
     * @return builder 
     */
    public static ClassificationShippingRateInputDraftBuilder of() {
        return new ClassificationShippingRateInputDraftBuilder();
    }

    /**
     * create builder for ClassificationShippingRateInputDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ClassificationShippingRateInputDraftBuilder of(final ClassificationShippingRateInputDraft template) {
        ClassificationShippingRateInputDraftBuilder builder = new ClassificationShippingRateInputDraftBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
