package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeDefinition;
import com.commercetools.api.generated.models.product_type.ProductTypeUpdateAction;
import com.commercetools.api.generated.models.product_type.ProductTypeChangeAttributeOrderActionImpl;

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
@JsonDeserialize(as = ProductTypeChangeAttributeOrderActionImpl.class)
public interface ProductTypeChangeAttributeOrderAction extends ProductTypeUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("attributes")
   public List<AttributeDefinition> getAttributes();

   public void setAttributes(final List<AttributeDefinition> attributes);
   
   public static ProductTypeChangeAttributeOrderActionImpl of(){
      return new ProductTypeChangeAttributeOrderActionImpl();
   }
   

   public static ProductTypeChangeAttributeOrderActionImpl of(final ProductTypeChangeAttributeOrderAction template) {
      ProductTypeChangeAttributeOrderActionImpl instance = new ProductTypeChangeAttributeOrderActionImpl();
      instance.setAttributes(template.getAttributes());
      return instance;
   }

}