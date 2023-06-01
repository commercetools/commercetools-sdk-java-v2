package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.ExtensionUpdateAction;
import com.commercetools.api.models.extension.ExtensionSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExtensionSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExtensionSetKeyAction extensionSetKeyAction = ExtensionSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ExtensionSetKeyActionBuilder implements Builder<ExtensionSetKeyAction> {

    
    @Nullable
    private String key;

    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public ExtensionSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds ExtensionSetKeyAction with checking for non-null required values
     * @return ExtensionSetKeyAction
     */
    public ExtensionSetKeyAction build() {
        return new ExtensionSetKeyActionImpl(key);
    }
    
    /**
     * builds ExtensionSetKeyAction without checking for non-null required values
     * @return ExtensionSetKeyAction
     */
    public ExtensionSetKeyAction buildUnchecked() {
        return new ExtensionSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of ExtensionSetKeyActionBuilder
     * @return builder 
     */
    public static ExtensionSetKeyActionBuilder of() {
        return new ExtensionSetKeyActionBuilder();
    }

    /**
     * create builder for ExtensionSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExtensionSetKeyActionBuilder of(final ExtensionSetKeyAction template) {
        ExtensionSetKeyActionBuilder builder = new ExtensionSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
