
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AzureEventGridDestinationBuilder implements Builder<AzureEventGridDestination> {

    private String uri;

    private String accessKey;

    public AzureEventGridDestinationBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    public AzureEventGridDestinationBuilder accessKey(final String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    public String getAccessKey() {
        return this.accessKey;
    }

    public AzureEventGridDestination build() {
        Objects.requireNonNull(uri, AzureEventGridDestination.class + ": uri is missing");
        Objects.requireNonNull(accessKey, AzureEventGridDestination.class + ": accessKey is missing");
        return new AzureEventGridDestinationImpl(uri, accessKey);
    }

    /**
     * builds AzureEventGridDestination without checking for non null required values
     */
    public AzureEventGridDestination buildUnchecked() {
        return new AzureEventGridDestinationImpl(uri, accessKey);
    }

    public static AzureEventGridDestinationBuilder of() {
        return new AzureEventGridDestinationBuilder();
    }

    public static AzureEventGridDestinationBuilder of(final AzureEventGridDestination template) {
        AzureEventGridDestinationBuilder builder = new AzureEventGridDestinationBuilder();
        builder.uri = template.getUri();
        builder.accessKey = template.getAccessKey();
        return builder;
    }

}
