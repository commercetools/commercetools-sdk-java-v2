package com.commercetools.models.CustomObject;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.CustomObject.CustomObject;
import com.commercetools.models.CustomObject.CustomObjectReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomObjectReferenceImpl.class)
public interface CustomObjectReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public CustomObject getObj();

   public void setObj(final CustomObject obj);
   
   public static CustomObjectReferenceImpl of(){
      return new CustomObjectReferenceImpl();
   }
   

   public static CustomObjectReferenceImpl of(final CustomObjectReference template) {
      CustomObjectReferenceImpl instance = new CustomObjectReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}