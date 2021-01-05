package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.ResourceCreatedDeliveryImpl;

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
@JsonDeserialize(as = ResourceCreatedDeliveryImpl.class)
public interface ResourceCreatedDelivery extends SubscriptionDelivery {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    public void setVersion(final Long version);
    
    public void setModifiedAt(final ZonedDateTime modifiedAt);

    public static ResourceCreatedDelivery of(){
        return new ResourceCreatedDeliveryImpl();
    }
    

    public static ResourceCreatedDelivery of(final ResourceCreatedDelivery template) {
        ResourceCreatedDeliveryImpl instance = new ResourceCreatedDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public static ResourceCreatedDeliveryBuilder builder(){
        return ResourceCreatedDeliveryBuilder.of();
    }
    
    public static ResourceCreatedDeliveryBuilder builder(final ResourceCreatedDelivery template){
        return ResourceCreatedDeliveryBuilder.of(template);
    }
    

    default <T> T withResourceCreatedDelivery(Function<ResourceCreatedDelivery, T> helper) {
        return helper.apply(this);
    }
}
