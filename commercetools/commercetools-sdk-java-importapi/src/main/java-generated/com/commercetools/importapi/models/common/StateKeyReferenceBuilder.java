package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.common.ReferenceType;
import com.commercetools.importapi.models.common.StateKeyReference;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StateKeyReferenceBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StateKeyReference stateKeyReference = StateKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StateKeyReferenceBuilder implements Builder<StateKeyReference> {

    
    
    private String key;

    
    /**
     * set the value to the key
     * @param key value to be set
     * @return Builder
     */
    
    public StateKeyReferenceBuilder key( final String key) {
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
     * builds StateKeyReference with checking for non-null required values
     * @return StateKeyReference
     */
    public StateKeyReference build() {
        Objects.requireNonNull(key, StateKeyReference.class + ": key is missing");
        return new StateKeyReferenceImpl(key);
    }
    
    /**
     * builds StateKeyReference without checking for non-null required values
     * @return StateKeyReference
     */
    public StateKeyReference buildUnchecked() {
        return new StateKeyReferenceImpl(key);
    }

    /**
     * factory method for an instance of StateKeyReferenceBuilder
     * @return builder 
     */
    public static StateKeyReferenceBuilder of() {
        return new StateKeyReferenceBuilder();
    }

    /**
     * create builder for StateKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StateKeyReferenceBuilder of(final StateKeyReference template) {
        StateKeyReferenceBuilder builder = new StateKeyReferenceBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
