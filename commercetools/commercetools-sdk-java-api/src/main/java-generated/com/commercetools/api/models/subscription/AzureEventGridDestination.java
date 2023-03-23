
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AzureEventGridDestinationImpl.class)
public interface AzureEventGridDestination extends Destination {

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

    public void setUri(final String uri);

    public void setAccessKey(final String accessKey);

    public static AzureEventGridDestination of() {
        return new AzureEventGridDestinationImpl();
    }

    public static AzureEventGridDestination of(final AzureEventGridDestination template) {
        AzureEventGridDestinationImpl instance = new AzureEventGridDestinationImpl();
        instance.setUri(template.getUri());
        instance.setAccessKey(template.getAccessKey());
        return instance;
    }

    public static AzureEventGridDestinationBuilder builder() {
        return AzureEventGridDestinationBuilder.of();
    }

    public static AzureEventGridDestinationBuilder builder(final AzureEventGridDestination template) {
        return AzureEventGridDestinationBuilder.of(template);
    }

    default <T> T withAzureEventGridDestination(Function<AzureEventGridDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AzureEventGridDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AzureEventGridDestination>() {
            @Override
            public String toString() {
                return "TypeReference<AzureEventGridDestination>";
            }
        };
    }
}
