
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = GoogleCloudPubSubDestinationImpl.class)
public interface GoogleCloudPubSubDestination extends Destination {

    String GOOGLE_CLOUD_PUB_SUB = "GoogleCloudPubSub";

    @NotNull
    @JsonProperty("projectId")
    public String getProjectId();

    @NotNull
    @JsonProperty("topic")
    public String getTopic();

    public void setProjectId(final String projectId);

    public void setTopic(final String topic);

    public static GoogleCloudPubSubDestination of() {
        return new GoogleCloudPubSubDestinationImpl();
    }

    public static GoogleCloudPubSubDestination of(final GoogleCloudPubSubDestination template) {
        GoogleCloudPubSubDestinationImpl instance = new GoogleCloudPubSubDestinationImpl();
        instance.setProjectId(template.getProjectId());
        instance.setTopic(template.getTopic());
        return instance;
    }

    public static GoogleCloudPubSubDestinationBuilder builder() {
        return GoogleCloudPubSubDestinationBuilder.of();
    }

    public static GoogleCloudPubSubDestinationBuilder builder(final GoogleCloudPubSubDestination template) {
        return GoogleCloudPubSubDestinationBuilder.of(template);
    }

    default <T> T withGoogleCloudPubSubDestination(Function<GoogleCloudPubSubDestination, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<GoogleCloudPubSubDestination> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<GoogleCloudPubSubDestination>() {
            @Override
            public String toString() {
                return "TypeReference<GoogleCloudPubSubDestination>";
            }
        };
    }
}
