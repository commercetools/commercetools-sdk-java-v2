package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ShippingMethod.ShippingMethod;
import com.commercetools.models.ShippingMethod.ShippingMethodReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
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
@JsonDeserialize(as = ShippingMethodReferenceImpl.class)
public interface ShippingMethodReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public ShippingMethod getObj();

   public void setObj(final ShippingMethod obj);
   
   public static ShippingMethodReferenceImpl of(){
      return new ShippingMethodReferenceImpl();
   }
   

   public static ShippingMethodReferenceImpl of(final ShippingMethodReference template) {
      ShippingMethodReferenceImpl instance = new ShippingMethodReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}