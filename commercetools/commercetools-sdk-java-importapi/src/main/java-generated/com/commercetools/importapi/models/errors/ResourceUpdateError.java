package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importapi.models.errors.ResourceUpdateErrorImpl;

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
@JsonDeserialize(as = ResourceUpdateErrorImpl.class)
public interface ResourceUpdateError extends ErrorObject {

    
    
    @JsonProperty("resource")
    public JsonNode getResource();

    public void setResource(final JsonNode resource);

    public static ResourceUpdateError of(){
        return new ResourceUpdateErrorImpl();
    }
    

    public static ResourceUpdateError of(final ResourceUpdateError template) {
        ResourceUpdateErrorImpl instance = new ResourceUpdateErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceUpdateErrorBuilder builder(){
        return ResourceUpdateErrorBuilder.of();
    }
    
    public static ResourceUpdateErrorBuilder builder(final ResourceUpdateError template){
        return ResourceUpdateErrorBuilder.of(template);
    }
    

    default <T> T withResourceUpdateError(Function<ResourceUpdateError, T> helper) {
        return helper.apply(this);
    }
}
