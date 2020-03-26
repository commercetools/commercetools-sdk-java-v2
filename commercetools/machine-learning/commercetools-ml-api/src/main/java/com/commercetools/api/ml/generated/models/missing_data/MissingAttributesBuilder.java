package com.commercetools.api.ml.generated.models.missing_data;

import com.commercetools.api.ml.generated.models.common.ProductReference;
import com.commercetools.api.ml.generated.models.common.ProductTypeReference;
import com.commercetools.api.ml.generated.models.missing_data.AttributeCount;
import com.commercetools.api.ml.generated.models.missing_data.AttributeCoverage;
import com.commercetools.api.ml.generated.models.missing_data.MissingAttributes;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingAttributesBuilder {
   
   
   private ProductReference product;
   
   
   private ProductTypeReference productType;
   
   
   private Integer variantId;
   
   
   private List<String> missingAttributeValues;
   
   @Nullable
   private List<String> missingAttributeNames;
   
   @Nullable
   private AttributeCount attributeCount;
   
   @Nullable
   private AttributeCoverage attributeCoverage;
   
   public MissingAttributesBuilder product( final ProductReference product) {
      this.product = product;
      return this;
   }
   
   public MissingAttributesBuilder productType( final ProductTypeReference productType) {
      this.productType = productType;
      return this;
   }
   
   public MissingAttributesBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   public MissingAttributesBuilder missingAttributeValues( final List<String> missingAttributeValues) {
      this.missingAttributeValues = missingAttributeValues;
      return this;
   }
   
   public MissingAttributesBuilder missingAttributeNames(@Nullable final List<String> missingAttributeNames) {
      this.missingAttributeNames = missingAttributeNames;
      return this;
   }
   
   public MissingAttributesBuilder attributeCount(@Nullable final AttributeCount attributeCount) {
      this.attributeCount = attributeCount;
      return this;
   }
   
   public MissingAttributesBuilder attributeCoverage(@Nullable final AttributeCoverage attributeCoverage) {
      this.attributeCoverage = attributeCoverage;
      return this;
   }
   
   
   public ProductReference getProduct(){
      return this.product;
   }
   
   
   public ProductTypeReference getProductType(){
      return this.productType;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }
   
   
   public List<String> getMissingAttributeValues(){
      return this.missingAttributeValues;
   }
   
   @Nullable
   public List<String> getMissingAttributeNames(){
      return this.missingAttributeNames;
   }
   
   @Nullable
   public AttributeCount getAttributeCount(){
      return this.attributeCount;
   }
   
   @Nullable
   public AttributeCoverage getAttributeCoverage(){
      return this.attributeCoverage;
   }

   public MissingAttributes build() {
       return new MissingAttributesImpl(product, productType, variantId, missingAttributeValues, missingAttributeNames, attributeCount, attributeCoverage);
   }
   
   public static MissingAttributesBuilder of() {
      return new MissingAttributesBuilder();
   }
   
   public static MissingAttributesBuilder of(final MissingAttributes template) {
      MissingAttributesBuilder builder = new MissingAttributesBuilder();
      builder.product = template.getProduct();
      builder.productType = template.getProductType();
      builder.variantId = template.getVariantId();
      builder.missingAttributeValues = template.getMissingAttributeValues();
      builder.missingAttributeNames = template.getMissingAttributeNames();
      builder.attributeCount = template.getAttributeCount();
      builder.attributeCoverage = template.getAttributeCoverage();
      return builder;
   }
   
}
