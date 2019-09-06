package com.commercetools.models.Product;

import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Common.ResourceIdentifier;
import com.commercetools.models.Product.ProductResourceIdentifierImpl;

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
@JsonDeserialize(as = ProductResourceIdentifierImpl.class)
public interface ProductResourceIdentifier extends ResourceIdentifier {


   
   public static ProductResourceIdentifierImpl of(){
      return new ProductResourceIdentifierImpl();
   }
   

   public static ProductResourceIdentifierImpl of(final ProductResourceIdentifier template) {
      ProductResourceIdentifierImpl instance = new ProductResourceIdentifierImpl();
      instance.setId(template.getId());
      instance.setKey(template.getKey());
      return instance;
   }

}