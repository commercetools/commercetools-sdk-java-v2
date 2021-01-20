
package com.commercetools.api.models.subscription;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.subscription.AzureServiceBusDestination;
import com.commercetools.api.models.subscription.Destination;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AzureServiceBusDestinationBuilder {

    private String connectionString;

    public AzureServiceBusDestinationBuilder connectionString(final String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

    public AzureServiceBusDestination build() {
        return new AzureServiceBusDestinationImpl(connectionString);
    }

    public static AzureServiceBusDestinationBuilder of() {
        return new AzureServiceBusDestinationBuilder();
    }

    public static AzureServiceBusDestinationBuilder of(final AzureServiceBusDestination template) {
        AzureServiceBusDestinationBuilder builder = new AzureServiceBusDestinationBuilder();
        builder.connectionString = template.getConnectionString();
        return builder;
    }

}
