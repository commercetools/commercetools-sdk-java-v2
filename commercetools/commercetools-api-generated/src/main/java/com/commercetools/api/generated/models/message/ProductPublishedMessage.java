package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.cart.ProductPublishScope;
import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.product.ProductProjection;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.generated.models.message.ProductPublishedMessageImpl;

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
@JsonDeserialize(as = ProductPublishedMessageImpl.class)
public interface ProductPublishedMessage extends Message {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<JsonNode> getRemovedImageUrls();
   
   @NotNull
   @Valid
   @JsonProperty("productProjection")
   public ProductProjection getProductProjection();
   
   @NotNull
   @JsonProperty("scope")
   public ProductPublishScope getScope();

   public void setRemovedImageUrls(final List<JsonNode> removedImageUrls);
   
   public void setProductProjection(final ProductProjection productProjection);
   
   public void setScope(final ProductPublishScope scope);
   
   public static ProductPublishedMessageImpl of(){
      return new ProductPublishedMessageImpl();
   }
   

   public static ProductPublishedMessageImpl of(final ProductPublishedMessage template) {
      ProductPublishedMessageImpl instance = new ProductPublishedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      instance.setProductProjection(template.getProductProjection());
      instance.setScope(template.getScope());
      return instance;
   }

}