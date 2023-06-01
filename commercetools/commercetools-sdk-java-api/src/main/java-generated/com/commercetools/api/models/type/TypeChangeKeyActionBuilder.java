package com.commercetools.api.models.type;

import com.commercetools.api.models.type.TypeUpdateAction;
import com.commercetools.api.models.type.TypeChangeKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * TypeChangeKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeKeyAction typeChangeKeyAction = TypeChangeKeyAction.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class TypeChangeKeyActionBuilder implements Builder<TypeChangeKeyAction> {

    
    
    private String key;

    
    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public TypeChangeKeyActionBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }

    /**
     * builds TypeChangeKeyAction with checking for non-null required values
     * @return TypeChangeKeyAction
     */
    public TypeChangeKeyAction build() {
        Objects.requireNonNull(key, TypeChangeKeyAction.class + ": key is missing");
        return new TypeChangeKeyActionImpl(key);
    }
    
    /**
     * builds TypeChangeKeyAction without checking for non-null required values
     * @return TypeChangeKeyAction
     */
    public TypeChangeKeyAction buildUnchecked() {
        return new TypeChangeKeyActionImpl(key);
    }

    /**
     * factory method for an instance of TypeChangeKeyActionBuilder
     * @return builder 
     */
    public static TypeChangeKeyActionBuilder of() {
        return new TypeChangeKeyActionBuilder();
    }

    /**
     * create builder for TypeChangeKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeKeyActionBuilder of(final TypeChangeKeyAction template) {
        TypeChangeKeyActionBuilder builder = new TypeChangeKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
