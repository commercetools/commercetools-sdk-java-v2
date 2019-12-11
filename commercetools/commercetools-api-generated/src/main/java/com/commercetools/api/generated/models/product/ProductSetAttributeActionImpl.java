package com.commercetools.api.generated.models.product;

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
public final class ProductSetAttributeActionImpl implements ProductSetAttributeAction {

   private String action;
   
   private String name;
   
   private Boolean staged;
   
   private Long variantId;
   
   private String sku;
   
   private Object value;

   @JsonCreator
   ProductSetAttributeActionImpl(@JsonProperty("name") final String name, @JsonProperty("staged") final Boolean staged, @JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("value") final Object value) {
      this.name = name;
      this.staged = staged;
      this.variantId = variantId;
      this.sku = sku;
      this.value = value;
      this.action = "setAttribute";
   }
   public ProductSetAttributeActionImpl() {
      
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
   
   
   public Long getVariantId(){
      return this.variantId;
   }
   
   
   public String getSku(){
      return this.sku;
   }
   
   /**
   *  <p>If the attribute exists and the value is omitted or set to <code>null</code>, the attribute is removed.
   *  If the attribute exists and a value is provided, the new value is applied.
   *  If the attribute does not exist and a value is provided, it is added as a new attribute.</p>
   */
   public Object getValue(){
      return this.value;
   }

   public void setName(final String name){
      this.name = name;
   }
   
   public void setStaged(final Boolean staged){
      this.staged = staged;
   }
   
   public void setVariantId(final Long variantId){
      this.variantId = variantId;
   }
   
   public void setSku(final String sku){
      this.sku = sku;
   }
   
   public void setValue(final Object value){
      this.value = value;
   }

}