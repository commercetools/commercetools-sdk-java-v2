package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.product.ProductSetProductPriceCustomFieldActionImpl;

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
@JsonDeserialize(as = ProductSetProductPriceCustomFieldActionImpl.class)
public interface ProductSetProductPriceCustomFieldAction extends ProductUpdateAction {

   
   @NotNull
   @JsonProperty("priceId")
   public String getPriceId();
   
   
   @JsonProperty("staged")
   public Boolean getStaged();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public JsonNode getValue();

   public void setPriceId(final String priceId);
   
   public void setStaged(final Boolean staged);
   
   public void setName(final String name);
   
   public void setValue(final JsonNode value);
   
   public static ProductSetProductPriceCustomFieldActionImpl of(){
      return new ProductSetProductPriceCustomFieldActionImpl();
   }
   

   public static ProductSetProductPriceCustomFieldActionImpl of(final ProductSetProductPriceCustomFieldAction template) {
      ProductSetProductPriceCustomFieldActionImpl instance = new ProductSetProductPriceCustomFieldActionImpl();
      instance.setPriceId(template.getPriceId());
      instance.setStaged(template.getStaged());
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}
