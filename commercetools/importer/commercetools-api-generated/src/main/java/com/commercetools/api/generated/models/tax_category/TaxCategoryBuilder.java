package com.commercetools.api.generated.models.tax_category;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.tax_category.TaxRate;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.tax_category.TaxCategory;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TaxCategoryBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private java.util.List<com.commercetools.api.generated.models.tax_category.TaxRate> rates;
   
   
   private String name;
   
   @Nullable
   private String description;
   
   @Nullable
   private String key;
   
   public TaxCategoryBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public TaxCategoryBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public TaxCategoryBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public TaxCategoryBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public TaxCategoryBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public TaxCategoryBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public TaxCategoryBuilder rates( final java.util.List<com.commercetools.api.generated.models.tax_category.TaxRate> rates) {
      this.rates = rates;
      return this;
   }
   
   public TaxCategoryBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public TaxCategoryBuilder description(@Nullable final String description) {
      this.description = description;
      return this;
   }
   
   public TaxCategoryBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.tax_category.TaxRate> getRates(){
      return this.rates;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public String getDescription(){
      return this.description;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }

   public TaxCategory build() {
       return new TaxCategoryImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, rates, name, description, key);
   }
   
   public static TaxCategoryBuilder of() {
      return new TaxCategoryBuilder();
   }
   
   public static TaxCategoryBuilder of(final TaxCategory template) {
      TaxCategoryBuilder builder = new TaxCategoryBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.rates = template.getRates();
      builder.name = template.getName();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      return builder;
   }
   
}