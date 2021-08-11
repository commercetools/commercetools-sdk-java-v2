
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GoogleCloudPubSubDestinationBuilder implements Builder<GoogleCloudPubSubDestination> {

    private String projectId;

    private String topic;

    public GoogleCloudPubSubDestinationBuilder projectId(final String projectId) {
        this.projectId = projectId;
        return this;
    }

    public GoogleCloudPubSubDestinationBuilder topic(final String topic) {
        this.topic = topic;
        return this;
    }

    public String getProjectId() {
        return this.projectId;
    }

    public String getTopic() {
        return this.topic;
    }

    public GoogleCloudPubSubDestination build() {
        Objects.requireNonNull(projectId, GoogleCloudPubSubDestination.class + ": projectId is missing");
        Objects.requireNonNull(topic, GoogleCloudPubSubDestination.class + ": topic is missing");
        return new GoogleCloudPubSubDestinationImpl(projectId, topic);
    }

    /**
     * builds GoogleCloudPubSubDestination without checking for non null required values
     */
    public GoogleCloudPubSubDestination buildUnchecked() {
        return new GoogleCloudPubSubDestinationImpl(projectId, topic);
    }

    public static GoogleCloudPubSubDestinationBuilder of() {
        return new GoogleCloudPubSubDestinationBuilder();
    }

    public static GoogleCloudPubSubDestinationBuilder of(final GoogleCloudPubSubDestination template) {
        GoogleCloudPubSubDestinationBuilder builder = new GoogleCloudPubSubDestinationBuilder();
        builder.projectId = template.getProjectId();
        builder.topic = template.getTopic();
        return builder;
    }

}
