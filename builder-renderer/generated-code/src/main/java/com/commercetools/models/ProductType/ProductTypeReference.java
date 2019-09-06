package com.commercetools.models.ProductType;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.ProductType.ProductType;
import com.commercetools.models.ProductType.ProductTypeReferenceImpl;

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
@JsonDeserialize(as = ProductTypeReferenceImpl.class)
public interface ProductTypeReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public ProductType getObj();

   public void setObj(final ProductType obj);
   
   public static ProductTypeReferenceImpl of(){
      return new ProductTypeReferenceImpl();
   }
   

   public static ProductTypeReferenceImpl of(final ProductTypeReference template) {
      ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}