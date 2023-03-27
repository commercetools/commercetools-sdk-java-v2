
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
     * @param connectionString value to be set
     * @return Builder
     */

    public AzureServiceBusDestinationBuilder connectionString(final String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     *  <p>SharedAccessKey is partially hidden on retrieval for security reasons.</p>
     * @return connectionString
     */

    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * builds AzureServiceBusDestination with checking for non-null required values
     * @return AzureServiceBusDestination
     */
    public AzureServiceBusDestination build() {
        Objects.requireNonNull(connectionString, AzureServiceBusDestination.class + ": connectionString is missing");
        return new AzureServiceBusDestinationImpl(connectionString);
    }

    /**
     * builds AzureServiceBusDestination without checking for non-null required values
     * @return AzureServiceBusDestination
     */
    public AzureServiceBusDestination buildUnchecked() {
        return new AzureServiceBusDestinationImpl(connectionString);
    }

    /**
     * factory method for an instance of AzureServiceBusDestinationBuilder
     * @return builder
     */
    public static AzureServiceBusDestinationBuilder of() {
        return new AzureServiceBusDestinationBuilder();
    }

    /**
     * create builder for AzureServiceBusDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AzureServiceBusDestinationBuilder of(final AzureServiceBusDestination template) {
        AzureServiceBusDestinationBuilder builder = new AzureServiceBusDestinationBuilder();
        builder.connectionString = template.getConnectionString();
        return builder;
    }

}
