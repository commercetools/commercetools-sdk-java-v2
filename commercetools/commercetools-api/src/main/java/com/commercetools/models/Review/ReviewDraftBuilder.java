package com.commercetools.models.review;

import com.commercetools.models.customer.CustomerResourceIdentifier;
import com.commercetools.models.state.StateResourceIdentifier;
import com.commercetools.models.type.CustomFieldsDraft;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.review.ReviewDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReviewDraftBuilder {
   
   @Nullable
   private java.lang.String uniquenessValue;
   
   @Nullable
   private java.lang.String authorName;
   
   @Nullable
   private com.commercetools.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private java.lang.Integer rating;
   
   @Nullable
   private com.commercetools.models.state.StateResourceIdentifier state;
   
   @Nullable
   private java.lang.String text;
   
   @Nullable
   private java.lang.String title;
   
   @Nullable
   private java.lang.String locale;
   
   @Nullable
   private java.lang.String key;
   
   @Nullable
   private com.commercetools.models.customer.CustomerResourceIdentifier customer;
   
   @Nullable
   private java.lang.Object target;
   
   public ReviewDraftBuilder uniquenessValue(@Nullable final java.lang.String uniquenessValue) {
      this.uniquenessValue = uniquenessValue;
      return this;
   }
   
   public ReviewDraftBuilder authorName(@Nullable final java.lang.String authorName) {
      this.authorName = authorName;
      return this;
   }
   
   public ReviewDraftBuilder custom(@Nullable final com.commercetools.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ReviewDraftBuilder rating(@Nullable final java.lang.Integer rating) {
      this.rating = rating;
      return this;
   }
   
   public ReviewDraftBuilder state(@Nullable final com.commercetools.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public ReviewDraftBuilder text(@Nullable final java.lang.String text) {
      this.text = text;
      return this;
   }
   
   public ReviewDraftBuilder title(@Nullable final java.lang.String title) {
      this.title = title;
      return this;
   }
   
   public ReviewDraftBuilder locale(@Nullable final java.lang.String locale) {
      this.locale = locale;
      return this;
   }
   
   public ReviewDraftBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public ReviewDraftBuilder customer(@Nullable final com.commercetools.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   public ReviewDraftBuilder target(@Nullable final java.lang.Object target) {
      this.target = target;
      return this;
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
   public com.commercetools.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public java.lang.Integer getRating(){
      return this.rating;
   }
   
   @Nullable
   public com.commercetools.models.state.StateResourceIdentifier getState(){
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
   public com.commercetools.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }
   
   @Nullable
   public java.lang.Object getTarget(){
      return this.target;
   }

   public ReviewDraft build() {
       return new ReviewDraftImpl(uniquenessValue, authorName, custom, rating, state, text, title, locale, key, customer, target);
   }
   
   public static ReviewDraftBuilder of() {
      return new ReviewDraftBuilder();
   }
   
   public static ReviewDraftBuilder of(final ReviewDraft template) {
      ReviewDraftBuilder builder = new ReviewDraftBuilder();
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