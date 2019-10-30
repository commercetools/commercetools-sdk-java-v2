package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.common.ReferenceTypeId;
import com.commercetools.api.generated.models.product_type.ProductType;
import com.commercetools.api.generated.models.product_type.ProductTypeReferenceImpl;

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