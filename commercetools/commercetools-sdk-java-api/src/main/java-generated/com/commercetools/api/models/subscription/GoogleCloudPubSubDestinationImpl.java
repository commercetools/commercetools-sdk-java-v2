
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Destination for Google Cloud Pub/Sub that can be used for Pull subscriptions as well as for Push subscriptions. The <code>topic</code> must give the <code>pubsub.topics.publish</code> permission to the service account <code>subscriptions@commercetools-platform.iam.gserviceaccount.com</code>. If used with the CloudEventsFormat, the message conforms to the PubSub Protocol Binding of the Structured Content Mode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GoogleCloudPubSubDestinationImpl implements GoogleCloudPubSubDestination, ModelBase {

    private String type;

    private String projectId;

    private String topic;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GoogleCloudPubSubDestinationImpl(@JsonProperty("projectId") final String projectId,
            @JsonProperty("topic") final String topic) {
        this.projectId = projectId;
        this.topic = topic;
        this.type = GOOGLE_CLOUD_PUB_SUB;
    }

    /**
     * create empty instance
     */
    public GoogleCloudPubSubDestinationImpl() {
        this.type = GOOGLE_CLOUD_PUB_SUB;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>ID of the Google Cloud project that contains the Pub/Sub topic.</p>
     */

    public String getProjectId() {
        return this.projectId;
    }

    /**
     *  <p>Name of the topic.</p>
     */

    public String getTopic() {
        return this.topic;
    }

    public void setProjectId(final String projectId) {
        this.projectId = projectId;
    }

    public void setTopic(final String topic) {
        this.topic = topic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GoogleCloudPubSubDestinationImpl that = (GoogleCloudPubSubDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(projectId, that.projectId)
                .append(topic, that.topic)
                .append(type, that.type)
                .append(projectId, that.projectId)
                .append(topic, that.topic)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(projectId).append(topic).toHashCode();
    }

}
