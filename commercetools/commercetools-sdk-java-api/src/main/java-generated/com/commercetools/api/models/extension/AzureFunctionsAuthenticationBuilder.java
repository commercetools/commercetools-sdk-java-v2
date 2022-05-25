
package com.commercetools.api.models.extension;

import java.util.*;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AzureFunctionsAuthenticationBuilder implements Builder<AzureFunctionsAuthentication> {

    private String key;

    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     */

    public AzureFunctionsAuthenticationBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public AzureFunctionsAuthentication build() {
        Objects.requireNonNull(key, AzureFunctionsAuthentication.class + ": key is missing");
        return new AzureFunctionsAuthenticationImpl(key);
    }

    /**
     * builds AzureFunctionsAuthentication without checking for non null required values
     */
    public AzureFunctionsAuthentication buildUnchecked() {
        return new AzureFunctionsAuthenticationImpl(key);
    }

    public static AzureFunctionsAuthenticationBuilder of() {
        return new AzureFunctionsAuthenticationBuilder();
    }

    public static AzureFunctionsAuthenticationBuilder of(final AzureFunctionsAuthentication template) {
        AzureFunctionsAuthenticationBuilder builder = new AzureFunctionsAuthenticationBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
