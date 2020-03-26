package com.commercetools.api.ml.generated.models.missing_data;


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
public final class AttributeCountImpl implements AttributeCount {

   private Integer productTypeAttributes;
   
   private Integer variantAttributes;
   
   private Integer missingAttributeValues;

   @JsonCreator
   AttributeCountImpl(@JsonProperty("productTypeAttributes") final Integer productTypeAttributes, @JsonProperty("variantAttributes") final Integer variantAttributes, @JsonProperty("missingAttributeValues") final Integer missingAttributeValues) {
      this.productTypeAttributes = productTypeAttributes;
      this.variantAttributes = variantAttributes;
      this.missingAttributeValues = missingAttributeValues;
   }
   public AttributeCountImpl() {
      
   }
   
   /**
   *  <p>Number of attributes defined in the product type.</p>
   */
   public Integer getProductTypeAttributes(){
      return this.productTypeAttributes;
   }
   
   /**
   *  <p>Number of attributes defined in the variant.</p>
   */
   public Integer getVariantAttributes(){
      return this.variantAttributes;
   }
   
   /**
   *  <p>Number of attributes missing values in the variant.</p>
   */
   public Integer getMissingAttributeValues(){
      return this.missingAttributeValues;
   }

   public void setProductTypeAttributes(final Integer productTypeAttributes){
      this.productTypeAttributes = productTypeAttributes;
   }
   
   public void setVariantAttributes(final Integer variantAttributes){
      this.variantAttributes = variantAttributes;
   }
   
   public void setMissingAttributeValues(final Integer missingAttributeValues){
      this.missingAttributeValues = missingAttributeValues;
   }

}
