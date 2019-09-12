package com.commercetools.models.Review;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Customer.CustomerReference;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Review.Review;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   
   private java.lang.Boolean includedInStatistics;
   
   @Nullable
   private java.lang.String uniquenessValue;
   
   @Nullable
   private java.lang.String authorName;
   
   @Nullable
   private com.commercetools.models.Type.CustomFields custom;
   
   @Nullable
   private java.lang.Integer rating;
   
   @Nullable
   private com.commercetools.models.State.StateReference state;
   
   @Nullable
   private java.lang.String text;
   
   @Nullable
   private java.lang.String title;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.Customer.CustomerReference customer;
   
   @Nullable
   private java.lang.Object target;
   
   public ReviewBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public ReviewBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public ReviewBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public ReviewBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public ReviewBuilder createdBy(@Nullable final com.commercetools.models.Common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public ReviewBuilder lastModifiedBy(@Nullable final com.commercetools.models.Common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public ReviewBuilder includedInStatistics( final java.lang.Boolean includedInStatistics) {
      this.includedInStatistics = includedInStatistics;
      return this;
   }
   
   public ReviewBuilder uniquenessValue(@Nullable final java.lang.String uniquenessValue) {
      this.uniquenessValue = uniquenessValue;
      return this;
   }
   
   public ReviewBuilder authorName(@Nullable final java.lang.String authorName) {
      this.authorName = authorName;
      return this;
   }
   
   public ReviewBuilder custom(@Nullable final com.commercetools.models.Type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public ReviewBuilder rating(@Nullable final java.lang.Integer rating) {
      this.rating = rating;
      return this;
   }
   
   public ReviewBuilder state(@Nullable final com.commercetools.models.State.StateReference state) {
      this.state = state;
      return this;
   }
   
   public ReviewBuilder text(@Nullable final java.lang.String text) {
      this.text = text;
      return this;
   }
   
   public ReviewBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   public ReviewBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public ReviewBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ReviewBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerReference customer) {
      this.customer = customer;
      return this;
   }
   
   public ReviewBuilder target(@Nullable final java.lang.Object target) {
      this.target = target;
      return this;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   @Nullable
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public java.lang.Boolean getIncludedInStatistics(){
      return this.includedInStatistics;
   }
   
   @Nullable
   public java.lang.String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   @Nullable
   public java.lang.String getAuthorName(){
      return this.authorName;
   }
   
   @Nullable
   public com.commercetools.models.Type.CustomFields getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.Integer getRating(){
      return this.rating;
   }
   
   @Nullable
   public com.commercetools.models.State.StateReference getState(){
      return this.state;
   }
   
   @Nullable
   public java.lang.String getText(){
      return this.text;
   }
   
   @Nullable
   public java.lang.String getTitle(){
      return this.title;
   }
   
   @Nullable
   public java.lang.String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerReference getCustomer(){
      return this.customer;
   }
   
   @Nullable
   public java.lang.Object getTarget(){
      return this.target;
   }

   public Review build() {
       return new ReviewImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, includedInStatistics, uniquenessValue, authorName, custom, rating, state, text, title, locale, key, customer, target);
   }
   
   public static ReviewBuilder of() {
      return new ReviewBuilder();
   }
   
   public static ReviewBuilder of(final Review template) {
      ReviewBuilder builder = new ReviewBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.includedInStatistics = template.getIncludedInStatistics();
      builder.uniquenessValue = template.getUniquenessValue();
      builder.authorName = template.getAuthorName();
      builder.custom = template.getCustom();
      builder.rating = template.getRating();
      builder.state = template.getState();
      builder.text = template.getText();
      builder.title = template.getTitle();
      builder.locale = template.getLocale();
      builder.key = template.getKey();
      builder.customer = template.getCustomer();
      builder.target = template.getTarget();
      return builder;
   }
   
}