
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class GoogleCloudPubSubDestinationImpl implements GoogleCloudPubSubDestination {

    private String type;

    private String projectId;

    private String topic;

    @JsonCreator
    GoogleCloudPubSubDestinationImpl(@JsonProperty("projectId") final String projectId,
            @JsonProperty("topic") final String topic) {
        this.projectId = projectId;
        this.topic = topic;
        this.type = GOOGLE_CLOUD_PUB_SUB;
    }

    public GoogleCloudPubSubDestinationImpl() {
        this.type = GOOGLE_CLOUD_PUB_SUB;
    }

    public String getType() {
        return this.type;
    }

    public String getProjectId() {
        return this.projectId;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(projectId).append(topic).toHashCode();
    }

}
