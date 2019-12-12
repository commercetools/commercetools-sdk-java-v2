package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeSetKeyActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = ProductTypeSetKeyActionImpl.class)
public interface ProductTypeSetKeyAction extends ProductTypeUpdateAction {

   /**
   *  <p>If <code>key</code> is absent or <code>null</code>, this field will be removed if it exists.</p>
   */
   
   @JsonProperty("key")
   public String getKey();

   public void setKey(final String key);
   
   public static ProductTypeSetKeyActionImpl of(){
      return new ProductTypeSetKeyActionImpl();
   }
   

   public static ProductTypeSetKeyActionImpl of(final ProductTypeSetKeyAction template) {
      ProductTypeSetKeyActionImpl instance = new ProductTypeSetKeyActionImpl();
      instance.setKey(template.getKey());
      return instance;
   }

}