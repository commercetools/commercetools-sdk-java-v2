
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Destination for Google Cloud Pub/Sub that can be used for Pull subscriptions as well as for Push subscriptions. The <code>topic</code> must give the <code>pubsub.topics.publish</code> permission to the service account <code>subscriptions@commercetools-platform.iam.gserviceaccount.com</code>. If used with the CloudEventsFormat, the message conforms to the PubSub Protocol Binding of the Structured Content Mode.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GoogleCloudPubSubDestination googleCloudPubSubDestination = GoogleCloudPubSubDestination.builder()
 *             .projectId("{projectId}")
 *             .topic("{topic}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = GoogleCloudPubSubDestinationImpl.class)
public interface GoogleCloudPubSubDestination extends Destination {

    /**
     * discriminator value for GoogleCloudPubSubDestination
     */
    String GOOGLE_CLOUD_PUB_SUB = "GoogleCloudPubSub";

    /**
     *  <p>ID of the Google Cloud project that contains the Pub/Sub topic.</p>
     * @return projectId
     */
    @NotNull
    @JsonProperty("projectId")
    public String getProjectId();

    /**
     *  <p>Name of the topic.</p>
     * @return topic
     */
    @NotNull
    @JsonProperty("topic")
    public String getTopic();

    /**
     *  <p>ID of the Google Cloud project that contains the Pub/Sub topic.</p>
     * @param projectId value to be set
     */

    public void setProjectId(final String projectId);

    /**
     *  <p>Name of the topic.</p>
     * @param topic value to be set
     */

    public void setTopic(final String topic);

    /**
     * factory method
     * @return instance of GoogleCloudPubSubDestination
     */
    public static GoogleCloudPubSubDestination of() {
        return new GoogleCloudPubSubDestinationImpl();
    }

    /**
     * factory method to create a shallow copy GoogleCloudPubSubDestination
     * @param template instance to be copied
     * @return copy instance
     */
    public static GoogleCloudPubSubDestination of(final GoogleCloudPubSubDestination template) {
        GoogleCloudPubSubDestinationImpl instance = new GoogleCloudPubSubDestinationImpl();
        instance.setProjectId(template.getProjectId());
        instance.setTopic(template.getTopic());
        return instance;
    }

    /**
     * factory method to create a deep copy of GoogleCloudPubSubDestination
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static GoogleCloudPubSubDestination deepCopy(@Nullable final GoogleCloudPubSubDestination template) {
        if (template == null) {
            return null;
        }
        GoogleCloudPubSubDestinationImpl instance = new GoogleCloudPubSubDestinationImpl();
        instance.setProjectId(template.getProjectId());
        instance.setTopic(template.getTopic());
        return instance;
    }

    /**
     * builder factory method for GoogleCloudPubSubDestination
     * @return builder
     */
    public static GoogleCloudPubSubDestinationBuilder builder() {
        return GoogleCloudPubSubDestinationBuilder.of();
    }

    /**
     * create builder for GoogleCloudPubSubDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GoogleCloudPubSubDestinationBuilder builder(final GoogleCloudPubSubDestination template) {
        return GoogleCloudPubSubDestinationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withGoogleCloudPubSubDestination(Function<GoogleCloudPubSubDestination, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<GoogleCloudPubSubDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GoogleCloudPubSubDestination>() {
            @Override
            public String toString() {
                return "TypeReference<GoogleCloudPubSubDestination>";
            }
        };
    }
}
