
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionAzureFunctionsAuthenticationBuilder {

    private String key;

    public ExtensionAzureFunctionsAuthenticationBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public ExtensionAzureFunctionsAuthentication build() {
        return new ExtensionAzureFunctionsAuthenticationImpl(key);
    }

    public static ExtensionAzureFunctionsAuthenticationBuilder of() {
        return new ExtensionAzureFunctionsAuthenticationBuilder();
    }

    public static ExtensionAzureFunctionsAuthenticationBuilder of(
            final ExtensionAzureFunctionsAuthentication template) {
        ExtensionAzureFunctionsAuthenticationBuilder builder = new ExtensionAzureFunctionsAuthenticationBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
