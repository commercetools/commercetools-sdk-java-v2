package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.AzureEventGridDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AzureEventGridDestinationImpl.class)
public interface AzureEventGridDestination extends Destination {

    
    @NotNull
    @JsonProperty("uri")
    public String getUri();
    
    @NotNull
    @JsonProperty("accessKey")
    public String getAccessKey();

    public void setUri(final String uri);
    
    public void setAccessKey(final String accessKey);

    public static AzureEventGridDestinationImpl of(){
        return new AzureEventGridDestinationImpl();
    }
    

    public static AzureEventGridDestinationImpl of(final AzureEventGridDestination template) {
        AzureEventGridDestinationImpl instance = new AzureEventGridDestinationImpl();
        instance.setUri(template.getUri());
        instance.setAccessKey(template.getAccessKey());
        return instance;
    }

    default <T> T withAzureEventGridDestination(Function<AzureEventGridDestination, T> helper) {
        return helper.apply(this);
    }
}
