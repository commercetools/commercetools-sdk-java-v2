package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.MessagePayload;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductRevertedStagedChangesMessagePayloadImpl implements ProductRevertedStagedChangesMessagePayload {

   private String type;
   
   private java.util.List<String> removedImageUrls;

   @JsonCreator
   ProductRevertedStagedChangesMessagePayloadImpl(@JsonProperty("removedImageUrls") final java.util.List<String> removedImageUrls) {
      this.removedImageUrls = removedImageUrls;
      this.type = "ProductRevertedStagedChanges";
   }
   public ProductRevertedStagedChangesMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public java.util.List<String> getRemovedImageUrls(){
      return this.removedImageUrls;
   }

   public void setRemovedImageUrls(final java.util.List<String> removedImageUrls){
      this.removedImageUrls = removedImageUrls;
   }

}