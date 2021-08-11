
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class IronMqDestinationBuilder implements Builder<IronMqDestination> {

    private String uri;

    public IronMqDestinationBuilder uri(final String uri) {
        this.uri = uri;
        return this;
    }

    public String getUri() {
        return this.uri;
    }

    public IronMqDestination build() {
        Objects.requireNonNull(uri, IronMqDestination.class + ": uri is missing");
        return new IronMqDestinationImpl(uri);
    }

    /**
     * builds IronMqDestination without checking for non null required values
     */
    public IronMqDestination buildUnchecked() {
        return new IronMqDestinationImpl(uri);
    }

    public static IronMqDestinationBuilder of() {
        return new IronMqDestinationBuilder();
    }

    public static IronMqDestinationBuilder of(final IronMqDestination template) {
        IronMqDestinationBuilder builder = new IronMqDestinationBuilder();
        builder.uri = template.getUri();
        return builder;
    }

}
