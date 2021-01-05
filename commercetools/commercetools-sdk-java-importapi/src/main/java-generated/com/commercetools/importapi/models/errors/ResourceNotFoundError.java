package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importapi.models.errors.ResourceNotFoundErrorImpl;

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
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {

    
    
    @JsonProperty("resource")
    public JsonNode getResource();

    public void setResource(final JsonNode resource);

    public static ResourceNotFoundError of(){
        return new ResourceNotFoundErrorImpl();
    }
    

    public static ResourceNotFoundError of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setResource(template.getResource());
        return instance;
    }

    public static ResourceNotFoundErrorBuilder builder(){
        return ResourceNotFoundErrorBuilder.of();
    }
    
    public static ResourceNotFoundErrorBuilder builder(final ResourceNotFoundError template){
        return ResourceNotFoundErrorBuilder.of(template);
    }
    

    default <T> T withResourceNotFoundError(Function<ResourceNotFoundError, T> helper) {
        return helper.apply(this);
    }
}
