package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importer.models.errors.ResourceNotFoundErrorImpl;

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
@JsonDeserialize(as = ResourceNotFoundErrorImpl.class)
public interface ResourceNotFoundError extends ErrorObject {

   
   
   @JsonProperty("resource")
   public JsonNode getResource();

   public void setResource(final JsonNode resource);
   
   public static ResourceNotFoundErrorImpl of(){
      return new ResourceNotFoundErrorImpl();
   }
   

   public static ResourceNotFoundErrorImpl of(final ResourceNotFoundError template) {
      ResourceNotFoundErrorImpl instance = new ResourceNotFoundErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setResource(template.getResource());
      return instance;
   }

}