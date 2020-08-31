package com.commercetools.api.models.extension;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.extension.ExtensionDestination;
import com.commercetools.api.models.extension.ExtensionTrigger;
import java.time.ZonedDateTime;
import com.commercetools.api.models.extension.ExtensionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExtensionImpl.class)
public interface Extension extends BaseResource {

    
    @NotNull
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();
    
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();
    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();
    
    
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @Valid
    @JsonProperty("destination")
    public ExtensionDestination getDestination();
    
    @NotNull
    @Valid
    @JsonProperty("triggers")
    public List<ExtensionTrigger> getTriggers();
    /**
    *  <p>The maximum time the commercetools platform waits for a response from the extension.
    *  If not present, <code>2000</code> (2 seconds) is used.</p>
    */
    
    @JsonProperty("timeoutInMs")
    public Integer getTimeoutInMs();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    
    public void setCreatedBy(final CreatedBy createdBy);
    
    public void setKey(final String key);
    
    public void setDestination(final ExtensionDestination destination);
    
    public void setTriggers(final List<ExtensionTrigger> triggers);
    
    public void setTimeoutInMs(final Integer timeoutInMs);

    public static ExtensionImpl of(){
        return new ExtensionImpl();
    }
    

    public static ExtensionImpl of(final Extension template) {
        ExtensionImpl instance = new ExtensionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setKey(template.getKey());
        instance.setDestination(template.getDestination());
        instance.setTriggers(template.getTriggers());
        instance.setTimeoutInMs(template.getTimeoutInMs());
        return instance;
    }

}
