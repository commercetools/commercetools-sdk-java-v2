package com.commercetools.models.Message;

import com.commercetools.models.Common.LocalizedString;
import com.commercetools.models.Message.MessagePayload;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductSlugChangedMessagePayloadImpl implements ProductSlugChangedMessagePayload {

   private java.lang.String type;
   
   private com.commercetools.models.Common.LocalizedString slug;

   @JsonCreator
   ProductSlugChangedMessagePayloadImpl(@JsonProperty("slug") final com.commercetools.models.Common.LocalizedString slug) {
      this.slug = slug;
      this.type = "ProductSlugChanged";
   }
   public ProductSlugChangedMessagePayloadImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setSlug(final com.commercetools.models.Common.LocalizedString slug){
      this.slug = slug;
   }

}