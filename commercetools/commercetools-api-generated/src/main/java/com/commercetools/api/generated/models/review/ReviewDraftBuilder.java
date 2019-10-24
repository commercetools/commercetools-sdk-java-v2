package com.commercetools.api.generated.models.review;

import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.state.StateResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.review.ReviewDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ReviewDraftBuilder {
   
   @Nullable
   private String uniquenessValue;
   
   @Nullable
   private String authorName;
   
   @Nullable
   private com.commercetools.api.generated.models.type.CustomFieldsDraft custom;
   
   @Nullable
   private Integer rating;
   
   @Nullable
   private com.commercetools.api.generated.models.state.StateResourceIdentifier state;
   
   @Nullable
   private String text;
   
   @Nullable
   private String title;
   
   @Nullable
   private String locale;
   
   @Nullable
   private String key;
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer;
   
   @Nullable
   private Object target;
   
   public ReviewDraftBuilder uniquenessValue(@Nullable final String uniquenessValue) {
      this.uniquenessValue = uniquenessValue;
      return this;
   }
   
   public ReviewDraftBuilder authorName(@Nullable final String authorName) {
      this.authorName = authorName;
      return this;
   }
   
   public ReviewDraftBuilder custom(@Nullable final com.commercetools.api.generated.models.type.CustomFieldsDraft custom) {
      this.custom = custom;
      return this;
   }
   
   public ReviewDraftBuilder rating(@Nullable final Integer rating) {
      this.rating = rating;
      return this;
   }
   
   public ReviewDraftBuilder state(@Nullable final com.commercetools.api.generated.models.state.StateResourceIdentifier state) {
      this.state = state;
      return this;
   }
   
   public ReviewDraftBuilder text(@Nullable final String text) {
      this.text = text;
      return this;
   }
   
   public ReviewDraftBuilder title(@Nullable final String title) {
      this.title = title;
      return this;
   }
   
   public ReviewDraftBuilder locale(@Nullable final String locale) {
      this.locale = locale;
      return this;
   }
   
   public ReviewDraftBuilder key(@Nullable final String key) {
      this.key = key;
      return this;
   }
   
   public ReviewDraftBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   public ReviewDraftBuilder target(@Nullable final Object target) {
      this.target = target;
      return this;
   }
   
   @Nullable
   public String getUniquenessValue(){
      return this.uniquenessValue;
   }
   
   @Nullable
   public String getAuthorName(){
      return this.authorName;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }
   
   @Nullable
   public Integer getRating(){
      return this.rating;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.state.StateResourceIdentifier getState(){
      return this.state;
   }
   
   @Nullable
   public String getText(){
      return this.text;
   }
   
   @Nullable
   public String getTitle(){
      return this.title;
   }
   
   @Nullable
   public String getLocale(){
      return this.locale;
   }
   
   @Nullable
   public String getKey(){
      return this.key;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }
   
   @Nullable
   public Object getTarget(){
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