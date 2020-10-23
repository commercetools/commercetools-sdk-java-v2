package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.GoogleCloudPubSubDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = GoogleCloudPubSubDestinationImpl.class)
public interface GoogleCloudPubSubDestination extends Destination {

    
    @NotNull
    @JsonProperty("projectId")
    public String getProjectId();
    
    @NotNull
    @JsonProperty("topic")
    public String getTopic();

    public void setProjectId(final String projectId);
    
    public void setTopic(final String topic);

    public static GoogleCloudPubSubDestinationImpl of(){
        return new GoogleCloudPubSubDestinationImpl();
    }
    

    public static GoogleCloudPubSubDestinationImpl of(final GoogleCloudPubSubDestination template) {
        GoogleCloudPubSubDestinationImpl instance = new GoogleCloudPubSubDestinationImpl();
        instance.setProjectId(template.getProjectId());
        instance.setTopic(template.getTopic());
        return instance;
    }

    default <T> T withGoogleCloudPubSubDestination(Function<GoogleCloudPubSubDestination, T> helper) {
        return helper.apply(this);
    }
}
