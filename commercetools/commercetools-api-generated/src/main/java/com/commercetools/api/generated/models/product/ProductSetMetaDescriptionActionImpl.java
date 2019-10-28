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
public final class ProductSetMetaDescriptionActionImpl implements ProductSetMetaDescriptionAction {

   private String action;
   
   private Boolean staged;
   
   private com.commercetools.api.generated.models.common.LocalizedString metaDescription;

   @JsonCreator
   ProductSetMetaDescriptionActionImpl(@JsonProperty("staged") final Boolean staged, @JsonProperty("metaDescription") final com.commercetools.api.generated.models.common.LocalizedString metaDescription) {
      this.staged = staged;
      this.metaDescription = metaDescription;
      this.action = "setMetaDescription";
   }
   public ProductSetMetaDescriptionActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public com.commercetools.api.generated.models.common.LocalizedString getMetaDescription(){
      return this.metaDescription;
   }

   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setMetaDescription(final com.commercetools.api.generated.models.common.LocalizedString metaDescription){
      this.metaDescription = metaDescription;
   }

}