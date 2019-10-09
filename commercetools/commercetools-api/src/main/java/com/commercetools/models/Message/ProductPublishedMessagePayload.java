package com.commercetools.models.message;

import com.commercetools.models.cart.ProductPublishScope;
import com.commercetools.models.message.MessagePayload;
import com.commercetools.models.product.ProductProjection;
import com.commercetools.models.message.ProductPublishedMessagePayloadImpl;

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
@JsonDeserialize(as = ProductPublishedMessagePayloadImpl.class)
public interface ProductPublishedMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<Object> getRemovedImageUrls();
   
   @NotNull
   @Valid
   @JsonProperty("productProjection")
   public ProductProjection getProductProjection();
   
   @NotNull
   @JsonProperty("scope")
   public ProductPublishScope getScope();

   public void setRemovedImageUrls(final List<Object> removedImageUrls);
   
   public void setProductProjection(final ProductProjection productProjection);
   
   public void setScope(final ProductPublishScope scope);
   
   public static ProductPublishedMessagePayloadImpl of(){
      return new ProductPublishedMessagePayloadImpl();
   }
   

   public static ProductPublishedMessagePayloadImpl of(final ProductPublishedMessagePayload template) {
      ProductPublishedMessagePayloadImpl instance = new ProductPublishedMessagePayloadImpl();
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      instance.setProductProjection(template.getProductProjection());
      instance.setScope(template.getScope());
      return instance;
   }

}