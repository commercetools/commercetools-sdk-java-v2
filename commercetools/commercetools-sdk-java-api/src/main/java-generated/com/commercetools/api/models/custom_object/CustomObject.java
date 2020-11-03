package com.commercetools.api.models.custom_object;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.ZonedDateTime;
import com.commercetools.api.models.custom_object.CustomObjectImpl;

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
@JsonDeserialize(as = CustomObjectImpl.class)
public interface CustomObject extends BaseResource {

    
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
    
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();
    /**
    *  <p>A namespace to group custom objects.</p>
    */
    @NotNull
    @JsonProperty("container")
    public String getContainer();
    
    @NotNull
    @JsonProperty("key")
    public String getKey();
    
    @NotNull
    @JsonProperty("value")
    public JsonNode getValue();

    public void setId(final String id);
    
    public void setVersion(final Long version);
    
    public void setCreatedAt(final ZonedDateTime createdAt);
    
    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
    
    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
    
    public void setCreatedBy(final CreatedBy createdBy);
    
    public void setContainer(final String container);
    
    public void setKey(final String key);
    
    public void setValue(final JsonNode value);

    public static CustomObjectImpl of(){
        return new CustomObjectImpl();
    }
    

    public static CustomObjectImpl of(final CustomObject template) {
        CustomObjectImpl instance = new CustomObjectImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        return instance;
    }

    default <T> T withCustomObject(Function<CustomObject, T> helper) {
        return helper.apply(this);
    }
}
