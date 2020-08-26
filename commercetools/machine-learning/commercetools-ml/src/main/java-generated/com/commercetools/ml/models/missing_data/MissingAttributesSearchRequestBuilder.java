package com.commercetools.ml.models.missing_data;


import com.commercetools.ml.models.missing_data.MissingAttributesSearchRequest;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MissingAttributesSearchRequestBuilder {

   @Nullable
   private Integer limit;

   @Nullable
   private Integer offset;

   @Nullable
   private Boolean staged;

   @Nullable
   private Integer productSetLimit;

   @Nullable
   private Boolean includeVariants;

   @Nullable
   private Integer coverageMin;

   @Nullable
   private Integer coverageMax;

   @Nullable
   private String sortBy;

   @Nullable
   private Boolean showMissingAttributeNames;

   @Nullable
   private java.util.List<String> productIds;

   @Nullable
   private java.util.List<String> productTypeIds;

   @Nullable
   private String attributeName;

   public MissingAttributesSearchRequestBuilder limit(@Nullable final Integer limit) {
      this.limit = limit;
      return this;
   }

   public MissingAttributesSearchRequestBuilder offset(@Nullable final Integer offset) {
      this.offset = offset;
      return this;
   }

   public MissingAttributesSearchRequestBuilder staged(@Nullable final Boolean staged) {
      this.staged = staged;
      return this;
   }

   public MissingAttributesSearchRequestBuilder productSetLimit(@Nullable final Integer productSetLimit) {
      this.productSetLimit = productSetLimit;
      return this;
   }

   public MissingAttributesSearchRequestBuilder includeVariants(@Nullable final Boolean includeVariants) {
      this.includeVariants = includeVariants;
      return this;
   }

   public MissingAttributesSearchRequestBuilder coverageMin(@Nullable final Integer coverageMin) {
      this.coverageMin = coverageMin;
      return this;
   }

   public MissingAttributesSearchRequestBuilder coverageMax(@Nullable final Integer coverageMax) {
      this.coverageMax = coverageMax;
      return this;
   }

   public MissingAttributesSearchRequestBuilder sortBy(@Nullable final String sortBy) {
      this.sortBy = sortBy;
      return this;
   }

   public MissingAttributesSearchRequestBuilder showMissingAttributeNames(@Nullable final Boolean showMissingAttributeNames) {
      this.showMissingAttributeNames = showMissingAttributeNames;
      return this;
   }

   public MissingAttributesSearchRequestBuilder productIds(@Nullable final java.util.List<String> productIds) {
      this.productIds = productIds;
      return this;
   }

   public MissingAttributesSearchRequestBuilder productTypeIds(@Nullable final java.util.List<String> productTypeIds) {
      this.productTypeIds = productTypeIds;
      return this;
   }

   public MissingAttributesSearchRequestBuilder attributeName(@Nullable final String attributeName) {
      this.attributeName = attributeName;
      return this;
   }

   @Nullable
   public Integer getLimit(){
      return this.limit;
   }

   @Nullable
   public Integer getOffset(){
      return this.offset;
   }

   @Nullable
   public Boolean getStaged(){
      return this.staged;
   }

   @Nullable
   public Integer getProductSetLimit(){
      return this.productSetLimit;
   }

   @Nullable
   public Boolean getIncludeVariants(){
      return this.includeVariants;
   }

   @Nullable
   public Integer getCoverageMin(){
      return this.coverageMin;
   }

   @Nullable
   public Integer getCoverageMax(){
      return this.coverageMax;
   }

   @Nullable
   public String getSortBy(){
      return this.sortBy;
   }

   @Nullable
   public Boolean getShowMissingAttributeNames(){
      return this.showMissingAttributeNames;
   }

   @Nullable
   public java.util.List<String> getProductIds(){
      return this.productIds;
   }

   @Nullable
   public java.util.List<String> getProductTypeIds(){
      return this.productTypeIds;
   }

   @Nullable
   public String getAttributeName(){
      return this.attributeName;
   }

   public MissingAttributesSearchRequest build() {
       return new MissingAttributesSearchRequestImpl(limit, offset, staged, productSetLimit, includeVariants, coverageMin, coverageMax, sortBy, showMissingAttributeNames, productIds, productTypeIds, attributeName);
   }

   public static MissingAttributesSearchRequestBuilder of() {
      return new MissingAttributesSearchRequestBuilder();
   }

   public static MissingAttributesSearchRequestBuilder of(final MissingAttributesSearchRequest template) {
      MissingAttributesSearchRequestBuilder builder = new MissingAttributesSearchRequestBuilder();
      builder.limit = template.getLimit();
      builder.offset = template.getOffset();
      builder.staged = template.getStaged();
      builder.productSetLimit = template.getProductSetLimit();
      builder.includeVariants = template.getIncludeVariants();
      builder.coverageMin = template.getCoverageMin();
      builder.coverageMax = template.getCoverageMax();
      builder.sortBy = template.getSortBy();
      builder.showMissingAttributeNames = template.getShowMissingAttributeNames();
      builder.productIds = template.getProductIds();
      builder.productTypeIds = template.getProductTypeIds();
      builder.attributeName = template.getAttributeName();
      return builder;
   }

}
