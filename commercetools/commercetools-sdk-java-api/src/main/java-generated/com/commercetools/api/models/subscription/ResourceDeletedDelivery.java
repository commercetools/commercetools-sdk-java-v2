package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.ResourceDeletedDeliveryImpl;

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
@JsonDeserialize(as = ResourceDeletedDeliveryImpl.class)
public interface ResourceDeletedDelivery extends SubscriptionDelivery {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("modifiedAt")
    public ZonedDateTime getModifiedAt();
    
    
    @JsonProperty("dataErasure")
    public Boolean getDataErasure();

    public void setVersion(final Long version);
    
    public void setModifiedAt(final ZonedDateTime modifiedAt);
    
    public void setDataErasure(final Boolean dataErasure);

    public static ResourceDeletedDeliveryImpl of(){
        return new ResourceDeletedDeliveryImpl();
    }
    

    public static ResourceDeletedDeliveryImpl of(final ResourceDeletedDelivery template) {
        ResourceDeletedDeliveryImpl instance = new ResourceDeletedDeliveryImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVersion(template.getVersion());
        instance.setModifiedAt(template.getModifiedAt());
        instance.setDataErasure(template.getDataErasure());
        return instance;
    }

    default <T> T withResourceDeletedDelivery(Function<ResourceDeletedDelivery, T> helper) {
        return helper.apply(this);
    }
}
