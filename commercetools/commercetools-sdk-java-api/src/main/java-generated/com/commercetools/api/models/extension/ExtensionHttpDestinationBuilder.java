
package com.commercetools.api.models.extension;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionHttpDestinationBuilder {

    private String url;

    @Nullable
    private com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication;

    public ExtensionHttpDestinationBuilder url(final String url) {
        this.url = url;
        return this;
    }

    public ExtensionHttpDestinationBuilder authentication(
            @Nullable final com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication authentication) {
        this.authentication = authentication;
        return this;
    }

    public String getUrl() {
        return this.url;
    }

    @Nullable
    public com.commercetools.api.models.extension.ExtensionHttpDestinationAuthentication getAuthentication() {
        return this.authentication;
    }

    public ExtensionHttpDestination build() {
        return new ExtensionHttpDestinationImpl(url, authentication);
    }

    public static ExtensionHttpDestinationBuilder of() {
        return new ExtensionHttpDestinationBuilder();
    }

    public static ExtensionHttpDestinationBuilder of(final ExtensionHttpDestination template) {
        ExtensionHttpDestinationBuilder builder = new ExtensionHttpDestinationBuilder();
        builder.url = template.getUrl();
        builder.authentication = template.getAuthentication();
        return builder;
    }

}
