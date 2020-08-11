package com.commercetools.api.models.product_type;

import com.commercetools.api.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.models.product_type.ProductTypeChangeNameActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeNameActionImpl.class)
public interface ProductTypeChangeNameAction extends ProductTypeUpdateAction {


   @NotNull
   @JsonProperty("name")
   public String getName();

   public void setName(final String name);

   public static ProductTypeChangeNameActionImpl of(){
      return new ProductTypeChangeNameActionImpl();
   }


   public static ProductTypeChangeNameActionImpl of(final ProductTypeChangeNameAction template) {
      ProductTypeChangeNameActionImpl instance = new ProductTypeChangeNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}
