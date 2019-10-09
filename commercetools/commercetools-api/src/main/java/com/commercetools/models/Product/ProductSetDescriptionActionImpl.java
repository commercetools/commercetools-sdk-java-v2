package com.commercetools.models.product;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.product.ProductUpdateAction;
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
public final class ProductSetDescriptionActionImpl implements ProductSetDescriptionAction {

   private String action;
   
   private com.commercetools.models.common.LocalizedString description;
   
   private Boolean staged;

   @JsonCreator
   ProductSetDescriptionActionImpl(@JsonProperty("description") final com.commercetools.models.common.LocalizedString description, @JsonProperty("staged") final Boolean staged) {
      this.description = description;
      this.staged = staged;
      this.action = "setDescription";
   }
   public ProductSetDescriptionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }

   public void setDescription(final com.commercetools.models.common.LocalizedString description){
      this.description = description;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

}