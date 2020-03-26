package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.common.ProductTypeReference;
import com.commercetools.api.ml.generated.models.missing_data.AttributeCount;
import com.commercetools.api.ml.generated.models.missing_data.AttributeCoverage;
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
public final class MissingAttributesImpl implements MissingAttributes {

   private ProductReference product;
   
   private ProductTypeReference productType;
   
   private Integer variantId;
   
   private List<String> missingAttributeValues;
   
   private List<String> missingAttributeNames;
   
   private AttributeCount attributeCount;
   
   private AttributeCoverage attributeCoverage;

   @JsonCreator
   MissingAttributesImpl(@JsonProperty("product") final ProductReference product, @JsonProperty("productType") final ProductTypeReference productType, @JsonProperty("variantId") final Integer variantId, @JsonProperty("missingAttributeValues") final List<String> missingAttributeValues, @JsonProperty("missingAttributeNames") final List<String> missingAttributeNames, @JsonProperty("attributeCount") final AttributeCount attributeCount, @JsonProperty("attributeCoverage") final AttributeCoverage attributeCoverage) {
      this.product = product;
      this.productType = productType;
      this.variantId = variantId;
      this.missingAttributeValues = missingAttributeValues;
      this.missingAttributeNames = missingAttributeNames;
      this.attributeCount = attributeCount;
      this.attributeCoverage = attributeCoverage;
   }
   public MissingAttributesImpl() {
      
   }
   
   
   public ProductReference getProduct(){
      return this.product;
   }
   
   
   public ProductTypeReference getProductType(){
      return this.productType;
   }
   
   /**
   *  <p>ID of a ProductVariant.</p>
   */
   public Integer getVariantId(){
      return this.variantId;
   }
   
   /**
   *  <p>The names of the attributes of the product type that the variant is missing, sorted by attribute importance in descending order.</p>
   */
   public List<String> getMissingAttributeValues(){
      return this.missingAttributeValues;
   }
   
   /**
   *  <p>The names of the attributes of the product type that the variant is missing, sorted by attribute importance in descending order.</p>
   */
   public List<String> getMissingAttributeNames(){
      return this.missingAttributeNames;
   }
   
   
   public AttributeCount getAttributeCount(){
      return this.attributeCount;
   }
   
   
   public AttributeCoverage getAttributeCoverage(){
      return this.attributeCoverage;
   }

   public void setProduct(final ProductReference product){
      this.product = product;
   }
   
   public void setProductType(final ProductTypeReference productType){
      this.productType = productType;
   }
   
   public void setVariantId(final Integer variantId){
      this.variantId = variantId;
   }
   
   public void setMissingAttributeValues(final List<String> missingAttributeValues){
      this.missingAttributeValues = missingAttributeValues;
   }
   
   public void setMissingAttributeNames(final List<String> missingAttributeNames){
      this.missingAttributeNames = missingAttributeNames;
   }
   
   public void setAttributeCount(final AttributeCount attributeCount){
      this.attributeCount = attributeCount;
   }
   
   public void setAttributeCoverage(final AttributeCoverage attributeCoverage){
      this.attributeCoverage = attributeCoverage;
   }

}
