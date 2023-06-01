package com.commercetools.api.models.extension;

import com.commercetools.api.models.extension.HttpDestinationAuthentication;
import com.commercetools.api.models.extension.AzureFunctionsAuthentication;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AzureFunctionsAuthenticationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AzureFunctionsAuthentication azureFunctionsAuthentication = AzureFunctionsAuthentication.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class AzureFunctionsAuthenticationBuilder implements Builder<AzureFunctionsAuthentication> {

    
    
    private String key;

    
    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public AzureFunctionsAuthenticationBuilder key( final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return key
     */
    
    
    public String getKey(){
        return this.key;
    }

    /**
     * builds AzureFunctionsAuthentication with checking for non-null required values
     * @return AzureFunctionsAuthentication
     */
    public AzureFunctionsAuthentication build() {
        Objects.requireNonNull(key, AzureFunctionsAuthentication.class + ": key is missing");
        return new AzureFunctionsAuthenticationImpl(key);
    }
    
    /**
     * builds AzureFunctionsAuthentication without checking for non-null required values
     * @return AzureFunctionsAuthentication
     */
    public AzureFunctionsAuthentication buildUnchecked() {
        return new AzureFunctionsAuthenticationImpl(key);
    }

    /**
     * factory method for an instance of AzureFunctionsAuthenticationBuilder
     * @return builder 
     */
    public static AzureFunctionsAuthenticationBuilder of() {
        return new AzureFunctionsAuthenticationBuilder();
    }

    /**
     * create builder for AzureFunctionsAuthentication instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AzureFunctionsAuthenticationBuilder of(final AzureFunctionsAuthentication template) {
        AzureFunctionsAuthenticationBuilder builder = new AzureFunctionsAuthenticationBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
