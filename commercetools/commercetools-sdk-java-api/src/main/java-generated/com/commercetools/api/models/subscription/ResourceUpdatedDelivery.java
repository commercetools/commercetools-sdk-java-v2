package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.ResourceUpdatedDeliveryImpl;

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
@JsonDeserialize(as = ResourceUpdatedDeliveryImpl.class)
public interface ResourceUpdatedDelivery extends SubscriptionDelivery {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("oldVersion")
    public Long getOldVersion();
    
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();

    public void setVersion(final Long version);
    
    public void setOldVersion(final Long oldVersion);
    
    public void setModifiedAt(final ZonedDateTime modifiedAt);

    public static ResourceUpdatedDelivery of(){
        return new ResourceUpdatedDeliveryImpl();
    }
    

    public static ResourceUpdatedDelivery of(final ResourceUpdatedDelivery template) {
        ResourceUpdatedDeliveryImpl instance = new ResourceUpdatedDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setOldVersion(template.getOldVersion());
        instance.setModifiedAt(template.getModifiedAt());
        return instance;
    }

    public static ResourceUpdatedDeliveryBuilder builder(){
        return ResourceUpdatedDeliveryBuilder.of();
    }
    
    public static ResourceUpdatedDeliveryBuilder builder(final ResourceUpdatedDelivery template){
        return ResourceUpdatedDeliveryBuilder.of(template);
    }
    

    default <T> T withResourceUpdatedDelivery(Function<ResourceUpdatedDelivery, T> helper) {
        return helper.apply(this);
    }
}
