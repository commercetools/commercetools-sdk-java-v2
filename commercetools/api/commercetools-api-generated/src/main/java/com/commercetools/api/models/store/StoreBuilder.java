package com.commercetools.api.models.store;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import java.time.ZonedDateTime;
import com.commercetools.api.models.store.Store;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StoreBuilder {
   
   
   private String id;
   
   
   private Long version;
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   @Nullable
   private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.api.models.common.CreatedBy createdBy;
   
   
   private String key;
   
   @Nullable
   private com.commercetools.api.models.common.LocalizedString name;
   
   @Nullable
   private java.util.List<String> languages;
   
   
   private java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels;
   
   @Nullable
   private java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels;
   
   public StoreBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public StoreBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public StoreBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public StoreBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public StoreBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public StoreBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public StoreBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   public StoreBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public StoreBuilder languages(@Nullable final java.util.List<String> languages) {
      this.languages = languages;
      return this;
   }
   
   public StoreBuilder distributionChannels( final java.util.List<com.commercetools.api.models.channel.ChannelReference> distributionChannels) {
      this.distributionChannels = distributionChannels;
      return this;
   }
   
   public StoreBuilder supplyChannels(@Nullable final java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> supplyChannels) {
      this.supplyChannels = supplyChannels;
      return this;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   @Nullable
   public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.api.models.common.LocalizedString getName(){
      return this.name;
   }
   
   @Nullable
   public java.util.List<String> getLanguages(){
      return this.languages;
   }
   
   
   public java.util.List<com.commercetools.api.models.channel.ChannelReference> getDistributionChannels(){
      return this.distributionChannels;
   }
   
   @Nullable
   public java.util.List<com.commercetools.api.models.channel.ChannelResourceIdentifier> getSupplyChannels(){
      return this.supplyChannels;
   }

   public Store build() {
       return new StoreImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, name, languages, distributionChannels, supplyChannels);
   }
   
   public static StoreBuilder of() {
      return new StoreBuilder();
   }
   
   public static StoreBuilder of(final Store template) {
      StoreBuilder builder = new StoreBuilder();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.createdBy = template.getCreatedBy();
      builder.key = template.getKey();
      builder.name = template.getName();
      builder.languages = template.getLanguages();
      builder.distributionChannels = template.getDistributionChannels();
      builder.supplyChannels = template.getSupplyChannels();
      return builder;
   }
   
}
