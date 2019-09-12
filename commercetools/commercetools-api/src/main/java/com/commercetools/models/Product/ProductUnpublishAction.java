package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.String;
import com.commercetools.models.Product.ProductUnpublishActionImpl;

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
@JsonDeserialize(as = ProductUnpublishActionImpl.class)
public interface ProductUnpublishAction extends ProductUpdateAction {


   
   public static ProductUnpublishActionImpl of(){
      return new ProductUnpublishActionImpl();
   }
   

   public static ProductUnpublishActionImpl of(final ProductUnpublishAction template) {
      ProductUnpublishActionImpl instance = new ProductUnpublishActionImpl();
      return instance;
   }

}