
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AzureFunctionsAuthenticationBuilder implements Builder<AzureFunctionsAuthentication> {

    private String key;

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
