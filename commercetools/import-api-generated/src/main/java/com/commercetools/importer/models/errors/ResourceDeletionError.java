package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.ResourceDeletionErrorImpl;

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
@JsonDeserialize(as = ResourceDeletionErrorImpl.class)
public interface ResourceDeletionError extends ErrorObject {

   
   
   @JsonProperty("resource")
   public Object getResource();

   public void setResource(final Object resource);
   
   public static ResourceDeletionErrorImpl of(){
      return new ResourceDeletionErrorImpl();
   }
   

   public static ResourceDeletionErrorImpl of(final ResourceDeletionError template) {
      ResourceDeletionErrorImpl instance = new ResourceDeletionErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setResource(template.getResource());
      return instance;
   }

}