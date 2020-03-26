package com.commercetools.api.ml.generated.models.similar_products;

import com.commercetools.api.ml.generated.models.common.LocalizedString;
import com.commercetools.api.ml.generated.models.common.Money;
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
public final class SimilarProductMetaImpl implements SimilarProductMeta {

   private LocalizedString name;
   
   private LocalizedString description;
   
   private Money price;
   
   private Long variantCount;

   @JsonCreator
   SimilarProductMetaImpl(@JsonProperty("name") final LocalizedString name, @JsonProperty("description") final LocalizedString description, @JsonProperty("price") final Money price, @JsonProperty("variantCount") final Long variantCount) {
      this.name = name;
      this.description = description;
      this.price = price;
      this.variantCount = variantCount;
   }
   public SimilarProductMetaImpl() {
      
   }
   
   /**
   *  <p>Localized product name used for similarity estimation.</p>
   */
   public LocalizedString getName(){
      return this.name;
   }
   
   /**
   *  <p>Localized product description used for similarity estimation.</p>
   */
   public LocalizedString getDescription(){
      return this.description;
   }
   
   /**
   *  <p>The product price in cents using the currency defined in SimilarProductSearchRequest If multiple prices exist, the median value is taken as a representative amount.</p>
   */
   public Money getPrice(){
      return this.price;
   }
   
   /**
   *  <p>Total number of variants associated with the product.</p>
   */
   public Long getVariantCount(){
      return this.variantCount;
   }

   public void setName(final LocalizedString name){
      this.name = name;
   }
   
   public void setDescription(final LocalizedString description){
      this.description = description;
   }
   
   public void setPrice(final Money price){
      this.price = price;
   }
   
   public void setVariantCount(final Long variantCount){
      this.variantCount = variantCount;
   }

}
