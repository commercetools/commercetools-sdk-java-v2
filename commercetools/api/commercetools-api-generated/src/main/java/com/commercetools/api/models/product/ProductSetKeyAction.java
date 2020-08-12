package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.commercetools.api.models.product.ProductSetKeyActionImpl;

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
@JsonDeserialize(as = ProductSetKeyActionImpl.class)
public interface ProductSetKeyAction extends ProductUpdateAction {

   /**
   *  <p>User-specific unique identifier for the product.
   *  If left blank or set to <code>null</code>, the product key is unset/removed.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ProductSetKeyActionImpl of(){
      return new ProductSetKeyActionImpl();
   }
   

   public static ProductSetKeyActionImpl of(final ProductSetKeyAction template) {
      ProductSetKeyActionImpl instance = new ProductSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}
