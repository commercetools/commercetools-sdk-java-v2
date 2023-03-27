
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GoogleCloudPubSubDestinationBuilder
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
public class GoogleCloudPubSubDestinationBuilder implements Builder<GoogleCloudPubSubDestination> {

    private String projectId;

    private String topic;

    /**
     *  <p>ID of the Google Cloud project that contains the Pub/Sub topic.</p>
     * @param projectId value to be set
     * @return Builder
     */

    public GoogleCloudPubSubDestinationBuilder projectId(final String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     *  <p>Name of the topic.</p>
     * @param topic value to be set
     * @return Builder
     */

    public GoogleCloudPubSubDestinationBuilder topic(final String topic) {
        this.topic = topic;
        return this;
    }

    /**
     *  <p>ID of the Google Cloud project that contains the Pub/Sub topic.</p>
     * @return projectId
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     *  <p>Name of the topic.</p>
     * @return topic
     */

    public String getTopic() {
        return this.topic;
    }

    /**
     * builds GoogleCloudPubSubDestination with checking for non-null required values
     * @return GoogleCloudPubSubDestination
     */
    public GoogleCloudPubSubDestination build() {
        Objects.requireNonNull(projectId, GoogleCloudPubSubDestination.class + ": projectId is missing");
        Objects.requireNonNull(topic, GoogleCloudPubSubDestination.class + ": topic is missing");
        return new GoogleCloudPubSubDestinationImpl(projectId, topic);
    }

    /**
     * builds GoogleCloudPubSubDestination without checking for non-null required values
     * @return GoogleCloudPubSubDestination
     */
    public GoogleCloudPubSubDestination buildUnchecked() {
        return new GoogleCloudPubSubDestinationImpl(projectId, topic);
    }

    /**
     * factory method for an instance of GoogleCloudPubSubDestinationBuilder
     * @return builder
     */
    public static GoogleCloudPubSubDestinationBuilder of() {
        return new GoogleCloudPubSubDestinationBuilder();
    }

    /**
     * create builder for GoogleCloudPubSubDestination instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GoogleCloudPubSubDestinationBuilder of(final GoogleCloudPubSubDestination template) {
        GoogleCloudPubSubDestinationBuilder builder = new GoogleCloudPubSubDestinationBuilder();
        builder.projectId = template.getProjectId();
        builder.topic = template.getTopic();
        return builder;
    }

}
