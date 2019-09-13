package com.commercetools.models.product;

import com.commercetools.models.product.ProductUpdateAction;
import java.lang.String;
import com.commercetools.models.product.ProductRevertStagedChangesActionImpl;

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
@JsonDeserialize(as = ProductRevertStagedChangesActionImpl.class)
public interface ProductRevertStagedChangesAction extends ProductUpdateAction {


   
   public static ProductRevertStagedChangesActionImpl of(){
      return new ProductRevertStagedChangesActionImpl();
   }
   

   public static ProductRevertStagedChangesActionImpl of(final ProductRevertStagedChangesAction template) {
      ProductRevertStagedChangesActionImpl instance = new ProductRevertStagedChangesActionImpl();
      return instance;
   }

}