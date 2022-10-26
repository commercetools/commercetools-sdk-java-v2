
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AzureServiceBusDestinationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AzureServiceBusDestination azureServiceBusDestination = AzureServiceBusDestination.builder()
 *             .connectionString("{connectionString}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AzureServiceBusDestinationBuilder implements Builder<AzureServiceBusDestination> {

    private String connectionString;

    /**
     *  <p>SharedAccessKey is partially hidden on retrieval for security reasons.</p>
     */

    public AzureServiceBusDestinationBuilder connectionString(final String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    public String getConnectionString() {
        return this.connectionString;
    }

    public AzureServiceBusDestination build() {
        Objects.requireNonNull(connectionString, AzureServiceBusDestination.class + ": connectionString is missing");
        return new AzureServiceBusDestinationImpl(connectionString);
    }

    /**
     * builds AzureServiceBusDestination without checking for non null required values
     */
    public AzureServiceBusDestination buildUnchecked() {
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
