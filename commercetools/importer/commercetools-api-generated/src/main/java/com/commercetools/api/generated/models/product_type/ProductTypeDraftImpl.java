package com.commercetools.api.generated.models.product_type;

import com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductTypeDraftImpl implements ProductTypeDraft {

   private String name;
   
   private String description;
   
   private java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> attributes;
   
   private String key;

   @JsonCreator
   ProductTypeDraftImpl(@JsonProperty("name") final String name, @JsonProperty("description") final String description, @JsonProperty("attributes") final java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> attributes, @JsonProperty("key") final String key) {
      this.name = name;
      this.description = description;
      this.attributes = attributes;
      this.key = key;
   }
   public ProductTypeDraftImpl() {
      
   }
   
   
   public String getName(){
      return this.name;
   }
   
   
   public String getDescription(){
      return this.description;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> getAttributes(){
      return this.attributes;
   }
   
   /**
   *  <p>User-specific unique identifier for the product type (min.
   *  2 and max.
   *  256 characters).</p>
   */
   public String getKey(){
      return this.key;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setDescription(final String description){
      this.description = description;
   }
   
   public void setAttributes(final java.util.List<com.commercetools.api.generated.models.product_type.AttributeDefinitionDraft> attributes){
      this.attributes = attributes;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}