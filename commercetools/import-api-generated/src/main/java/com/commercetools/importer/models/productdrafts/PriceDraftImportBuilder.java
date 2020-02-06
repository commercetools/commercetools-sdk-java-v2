package com.commercetools.importer.models.productdrafts;

import com.commercetools.importer.models.common.ChannelKeyReference;
import com.commercetools.importer.models.common.CustomerGroupKeyReference;
import com.commercetools.importer.models.common.Money;
import java.time.ZonedDateTime;
import com.commercetools.importer.models.productdrafts.PriceDraftImport;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceDraftImportBuilder {
   
   
   private com.commercetools.importer.models.common.Money value;
   
   @Nullable
   private String country;
   
   @Nullable
   private com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup;
   
   @Nullable
   private com.commercetools.importer.models.common.ChannelKeyReference channel;
   
   @Nullable
   private java.time.ZonedDateTime validFrom;
   
   @Nullable
   private java.time.ZonedDateTime validUntil;
   
   public PriceDraftImportBuilder value( final com.commercetools.importer.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   public PriceDraftImportBuilder country(@Nullable final String country) {
      this.country = country;
      return this;
   }
   
   public PriceDraftImportBuilder customerGroup(@Nullable final com.commercetools.importer.models.common.CustomerGroupKeyReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   public PriceDraftImportBuilder channel(@Nullable final com.commercetools.importer.models.common.ChannelKeyReference channel) {
      this.channel = channel;
      return this;
   }
   
   public PriceDraftImportBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
      this.validFrom = validFrom;
      return this;
   }
   
   public PriceDraftImportBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
      this.validUntil = validUntil;
      return this;
   }
   
   
   public com.commercetools.importer.models.common.Money getValue(){
      return this.value;
   }
   
   @Nullable
   public String getCountry(){
      return this.country;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.CustomerGroupKeyReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   @Nullable
   public com.commercetools.importer.models.common.ChannelKeyReference getChannel(){
      return this.channel;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidFrom(){
      return this.validFrom;
   }
   
   @Nullable
   public java.time.ZonedDateTime getValidUntil(){
      return this.validUntil;
   }

   public PriceDraftImport build() {
       return new PriceDraftImportImpl(value, country, customerGroup, channel, validFrom, validUntil);
   }
   
   public static PriceDraftImportBuilder of() {
      return new PriceDraftImportBuilder();
   }
   
   public static PriceDraftImportBuilder of(final PriceDraftImport template) {
      PriceDraftImportBuilder builder = new PriceDraftImportBuilder();
      builder.value = template.getValue();
      builder.country = template.getCountry();
      builder.customerGroup = template.getCustomerGroup();
      builder.channel = template.getChannel();
      builder.validFrom = template.getValidFrom();
      builder.validUntil = template.getValidUntil();
      return builder;
   }
   
}