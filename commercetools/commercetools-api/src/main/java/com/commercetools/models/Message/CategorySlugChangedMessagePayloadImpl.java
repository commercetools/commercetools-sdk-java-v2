package com.commercetools.models.message;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.message.MessagePayload;
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
public final class CategorySlugChangedMessagePayloadImpl implements CategorySlugChangedMessagePayload {

   private String type;
   
   private com.commercetools.models.common.LocalizedString slug;

   @JsonCreator
   CategorySlugChangedMessagePayloadImpl(@JsonProperty("slug") final com.commercetools.models.common.LocalizedString slug) {
      this.slug = slug;
      this.type = "CategorySlugChanged";
   }
   public CategorySlugChangedMessagePayloadImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public com.commercetools.models.common.LocalizedString getSlug(){
      return this.slug;
   }

   public void setSlug(final com.commercetools.models.common.LocalizedString slug){
      this.slug = slug;
   }

}