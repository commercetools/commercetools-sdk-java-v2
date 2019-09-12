package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.SelectionMode;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.CartDiscount.MultiBuyCustomLineItemsTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MultiBuyCustomLineItemsTargetBuilder {
   
   
   private java.lang.String predicate;
   
   
   private java.lang.Integer triggerQuantity;
   
   
   private java.lang.Integer discountedQuantity;
   
   @Nullable
   private java.lang.Integer maxOccurrence;
   
   
   private com.commercetools.models.CartDiscount.SelectionMode selectionMode;
   
   public MultiBuyCustomLineItemsTargetBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public MultiBuyCustomLineItemsTargetBuilder triggerQuantity( final java.lang.Integer triggerQuantity) {
      this.triggerQuantity = triggerQuantity;
      return this;
   }
   
   public MultiBuyCustomLineItemsTargetBuilder discountedQuantity( final java.lang.Integer discountedQuantity) {
      this.discountedQuantity = discountedQuantity;
      return this;
   }
   
   public MultiBuyCustomLineItemsTargetBuilder maxOccurrence(@Nullable final java.lang.Integer maxOccurrence) {
      this.maxOccurrence = maxOccurrence;
      return this;
   }
   
   public MultiBuyCustomLineItemsTargetBuilder selectionMode( final com.commercetools.models.CartDiscount.SelectionMode selectionMode) {
      this.selectionMode = selectionMode;
      return this;
   }
   
   
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   
   public java.lang.Integer getTriggerQuantity(){
      return this.triggerQuantity;
   }
   
   
   public java.lang.Integer getDiscountedQuantity(){
      return this.discountedQuantity;
   }
   
   @Nullable
   public java.lang.Integer getMaxOccurrence(){
      return this.maxOccurrence;
   }
   
   
   public com.commercetools.models.CartDiscount.SelectionMode getSelectionMode(){
      return this.selectionMode;
   }

   public MultiBuyCustomLineItemsTarget build() {
       return new MultiBuyCustomLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence, selectionMode);
   }
   
   public static MultiBuyCustomLineItemsTargetBuilder of() {
      return new MultiBuyCustomLineItemsTargetBuilder();
   }
   
   public static MultiBuyCustomLineItemsTargetBuilder of(final MultiBuyCustomLineItemsTarget template) {
      MultiBuyCustomLineItemsTargetBuilder builder = new MultiBuyCustomLineItemsTargetBuilder();
      builder.predicate = template.getPredicate();
      builder.triggerQuantity = template.getTriggerQuantity();
      builder.discountedQuantity = template.getDiscountedQuantity();
      builder.maxOccurrence = template.getMaxOccurrence();
      builder.selectionMode = template.getSelectionMode();
      return builder;
   }
   
}