package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.AzureServiceBusDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Azure Service Bus can be used as a pull-queue with Queues, or to fan-out messages with Topics and Subscriptions. To set up a Subscription with Azure Service Bus, first create a queue/topic in the Azure Portal with a Shared Access Policy including the <code>Send</code> permission.</p>
 *
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AzureServiceBusDestinationImpl.class)
public interface AzureServiceBusDestination extends Destination {

    /**
     * discriminator value for AzureServiceBusDestination
     */
    String AZURE_SERVICE_BUS = "AzureServiceBus";

    /**
     *  <p>SharedAccessKey is partially hidden on retrieval for security reasons.</p>
     * @return connectionString
     */
    @NotNull
    @JsonProperty("connectionString")
    public String getConnectionString();

    /**
     *  <p>SharedAccessKey is partially hidden on retrieval for security reasons.</p>
     * @param connectionString value to be set
     */
    
    public void setConnectionString(final String connectionString);
    

    /**
     * factory method
     * @return instance of AzureServiceBusDestination
     */
    public static AzureServiceBusDestination of(){
        return new AzureServiceBusDestinationImpl();
    }
    

    /**
     * factory method to create a shallow copy AzureServiceBusDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static AzureServiceBusDestination of(final AzureServiceBusDestination template) {
        AzureServiceBusDestinationImpl instance = new AzureServiceBusDestinationImpl();
        instance.setConnectionString(template.getConnectionString());
        return instance;
    }

    /**
     * factory method to create a deep copy of AzureServiceBusDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AzureServiceBusDestination deepCopy(@Nullable final AzureServiceBusDestination template) {
        if (template == null) {
            return null;
        }
        AzureServiceBusDestinationImpl instance = new AzureServiceBusDestinationImpl();
        instance.setConnectionString(template.getConnectionString());
        return instance;
    }

    /**
     * builder factory method for AzureServiceBusDestination
     * @return builder
     */
    public static AzureServiceBusDestinationBuilder builder() {
        return AzureServiceBusDestinationBuilder.of();
    }
    
    /**
     * create builder for AzureServiceBusDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AzureServiceBusDestinationBuilder builder(final AzureServiceBusDestination template) {
        return AzureServiceBusDestinationBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAzureServiceBusDestination(Function<AzureServiceBusDestination, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AzureServiceBusDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AzureServiceBusDestination>() {
            @Override
            public String toString() {
                return "TypeReference<AzureServiceBusDestination>";
            }
        };
    }
}
