package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountTarget;
import com.commercetools.models.cart_discount.SelectionMode;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.cart_discount.MultiBuyLineItemsTarget;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MultiBuyLineItemsTargetBuilder {
   
   
   private java.lang.String predicate;
   
   
   private java.lang.Integer triggerQuantity;
   
   
   private java.lang.Integer discountedQuantity;
   
   @Nullable
   private java.lang.Integer maxOccurrence;
   
   
   private com.commercetools.models.cart_discount.SelectionMode selectionMode;
   
   public MultiBuyLineItemsTargetBuilder predicate( final java.lang.String predicate) {
      this.predicate = predicate;
      return this;
   }
   
   public MultiBuyLineItemsTargetBuilder triggerQuantity( final java.lang.Integer triggerQuantity) {
      this.triggerQuantity = triggerQuantity;
      return this;
   }
   
   public MultiBuyLineItemsTargetBuilder discountedQuantity( final java.lang.Integer discountedQuantity) {
      this.discountedQuantity = discountedQuantity;
      return this;
   }
   
   public MultiBuyLineItemsTargetBuilder maxOccurrence(@Nullable final java.lang.Integer maxOccurrence) {
      this.maxOccurrence = maxOccurrence;
      return this;
   }
   
   public MultiBuyLineItemsTargetBuilder selectionMode( final com.commercetools.models.cart_discount.SelectionMode selectionMode) {
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
   
   
   public com.commercetools.models.cart_discount.SelectionMode getSelectionMode(){
      return this.selectionMode;
   }

   public MultiBuyLineItemsTarget build() {
       return new MultiBuyLineItemsTargetImpl(predicate, triggerQuantity, discountedQuantity, maxOccurrence, selectionMode);
   }
   
   public static MultiBuyLineItemsTargetBuilder of() {
      return new MultiBuyLineItemsTargetBuilder();
   }
   
   public static MultiBuyLineItemsTargetBuilder of(final MultiBuyLineItemsTarget template) {
      MultiBuyLineItemsTargetBuilder builder = new MultiBuyLineItemsTargetBuilder();
      builder.predicate = template.getPredicate();
      builder.triggerQuantity = template.getTriggerQuantity();
      builder.discountedQuantity = template.getDiscountedQuantity();
      builder.maxOccurrence = template.getMaxOccurrence();
      builder.selectionMode = template.getSelectionMode();
      return builder;
   }
   
}