package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Message.ProductRevertedStagedChangesMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductRevertedStagedChangesMessagePayloadImpl.class)
public interface ProductRevertedStagedChangesMessagePayload extends MessagePayload {

   
   @NotNull
   @JsonProperty("removedImageUrls")
   public List<Object> getRemovedImageUrls();

   public void setRemovedImageUrls(final List<Object> removedImageUrls);
   
   public static ProductRevertedStagedChangesMessagePayloadImpl of(){
      return new ProductRevertedStagedChangesMessagePayloadImpl();
   }
   

   public static ProductRevertedStagedChangesMessagePayloadImpl of(final ProductRevertedStagedChangesMessagePayload template) {
      ProductRevertedStagedChangesMessagePayloadImpl instance = new ProductRevertedStagedChangesMessagePayloadImpl();
      instance.setRemovedImageUrls(template.getRemovedImageUrls());
      return instance;
   }

}