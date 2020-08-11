package com.commercetools.api.models.product;

import com.commercetools.api.models.product.ProductUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
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
public final class ProductSetAttributeInAllVariantsActionImpl implements ProductSetAttributeInAllVariantsAction {

   private String action;

   private String name;

   private Boolean staged;

   private com.fasterxml.jackson.databind.JsonNode value;

   @JsonCreator
   ProductSetAttributeInAllVariantsActionImpl(@JsonProperty("name") final String name, @JsonProperty("staged") final Boolean staged, @JsonProperty("value") final com.fasterxml.jackson.databind.JsonNode value) {
      this.name = name;
      this.staged = staged;
      this.value = value;
      this.action = "setAttributeInAllVariants";
   }
   public ProductSetAttributeInAllVariantsActionImpl() {

   }


   public String getAction(){
      return this.action;
   }


   public String getName(){
      return this.name;
   }


   public Boolean getStaged(){
      return this.staged;
   }

   /**
   *  <p>The same update behavior as for Set Attribute applies.</p>
   */
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

   public void setValue(final com.fasterxml.jackson.databind.JsonNode value){
      this.value = value;
   }

}
