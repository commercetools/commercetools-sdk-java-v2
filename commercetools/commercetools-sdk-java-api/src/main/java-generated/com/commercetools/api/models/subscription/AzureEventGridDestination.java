package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.AzureEventGridDestinationImpl;

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
 *  <p>Azure Event Grid can be used to push messages to Azure Functions, HTTP endpoints (webhooks), and several other Azure tools. Event Grid can only be used with the CloudEventsFormat. To set up a Subscription with Azure Event Grid, first create a topic in the Azure Portal. To allow Composable Commerce to push messages to your topic, provide an access key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AzureEventGridDestination azureEventGridDestination = AzureEventGridDestination.builder()
 *             .uri("{uri}")
 *             .accessKey("{accessKey}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = AzureEventGridDestinationImpl.class)
public interface AzureEventGridDestination extends Destination {

    /**
     * discriminator value for AzureEventGridDestination
     */
    String EVENT_GRID = "EventGrid";

    /**
     *  <p>URI of the topic.</p>
     * @return uri
     */
    @NotNull
    @JsonProperty("uri")
    public String getUri();
    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @return accessKey
     */
    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    /**
     *  <p>URI of the topic.</p>
     * @param uri value to be set
     */
    
    public void setUri(final String uri);
    
    
    /**
     *  <p>Partially hidden on retrieval for security reasons.</p>
     * @param accessKey value to be set
     */
    
    public void setAccessKey(final String accessKey);
    

    /**
     * factory method
     * @return instance of AzureEventGridDestination
     */
    public static AzureEventGridDestination of(){
        return new AzureEventGridDestinationImpl();
    }
    

    /**
     * factory method to create a shallow copy AzureEventGridDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static AzureEventGridDestination of(final AzureEventGridDestination template) {
        AzureEventGridDestinationImpl instance = new AzureEventGridDestinationImpl();
        instance.setUri(template.getUri());
        instance.setAccessKey(template.getAccessKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of AzureEventGridDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AzureEventGridDestination deepCopy(@Nullable final AzureEventGridDestination template) {
        if (template == null) {
            return null;
        }
        AzureEventGridDestinationImpl instance = new AzureEventGridDestinationImpl();
        instance.setUri(template.getUri());
        instance.setAccessKey(template.getAccessKey());
        return instance;
    }

    /**
     * builder factory method for AzureEventGridDestination
     * @return builder
     */
    public static AzureEventGridDestinationBuilder builder() {
        return AzureEventGridDestinationBuilder.of();
    }
    
    /**
     * create builder for AzureEventGridDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AzureEventGridDestinationBuilder builder(final AzureEventGridDestination template) {
        return AzureEventGridDestinationBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAzureEventGridDestination(Function<AzureEventGridDestination, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AzureEventGridDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AzureEventGridDestination>() {
            @Override
            public String toString() {
                return "TypeReference<AzureEventGridDestination>";
            }
        };
    }
}
