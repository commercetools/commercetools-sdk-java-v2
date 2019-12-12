package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.ProductUpdateAction;
import com.commercetools.api.generated.models.product.ProductRevertStagedChangesActionImpl;

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