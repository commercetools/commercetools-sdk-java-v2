
package com.commercetools.api.models.extension;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ExtensionChangeDestinationActionBuilder {

    private com.commercetools.api.models.extension.ExtensionDestination destination;

    public ExtensionChangeDestinationActionBuilder destination(
            final com.commercetools.api.models.extension.ExtensionDestination destination) {
        this.destination = destination;
        return this;
    }

    public com.commercetools.api.models.extension.ExtensionDestination getDestination() {
        return this.destination;
    }

    public ExtensionChangeDestinationAction build() {
        return new ExtensionChangeDestinationActionImpl(destination);
    }

    public static ExtensionChangeDestinationActionBuilder of() {
        return new ExtensionChangeDestinationActionBuilder();
    }

    public static ExtensionChangeDestinationActionBuilder of(final ExtensionChangeDestinationAction template) {
        ExtensionChangeDestinationActionBuilder builder = new ExtensionChangeDestinationActionBuilder();
        builder.destination = template.getDestination();
        return builder;
    }

}
