package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.common.LocalizedString;
import com.commercetools.api.generated.models.product.ProductUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class ProductSetMetaTitleActionImpl implements ProductSetMetaTitleAction {

   private String action;
   
   private com.commercetools.api.generated.models.common.LocalizedString metaTitle;
   
   private Boolean staged;

   @JsonCreator
   ProductSetMetaTitleActionImpl(@JsonProperty("metaTitle") final com.commercetools.api.generated.models.common.LocalizedString metaTitle, @JsonProperty("staged") final Boolean staged) {
      this.metaTitle = metaTitle;
      this.staged = staged;
      this.action = "setMetaTitle";
   }
   public ProductSetMetaTitleActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getMetaTitle(){
      return this.metaTitle;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }

   public void setMetaTitle(final com.commercetools.api.generated.models.common.LocalizedString metaTitle){
      this.metaTitle = metaTitle;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }

}