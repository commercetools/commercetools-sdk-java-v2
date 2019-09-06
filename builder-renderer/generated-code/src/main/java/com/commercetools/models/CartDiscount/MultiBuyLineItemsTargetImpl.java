package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.SelectionMode;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MultiBuyLineItemsTargetImpl implements MultiBuyLineItemsTarget {

   private java.lang.String type;
   
   private java.lang.String predicate;
   
   private java.lang.Integer triggerQuantity;
   
   private java.lang.Integer discountedQuantity;
   
   private java.lang.Integer maxOccurrence;
   
   private com.commercetools.models.CartDiscount.SelectionMode selectionMode;

   @JsonCreator
   MultiBuyLineItemsTargetImpl(@JsonProperty("predicate") final java.lang.String predicate, @JsonProperty("triggerQuantity") final java.lang.Integer triggerQuantity, @JsonProperty("discountedQuantity") final java.lang.Integer discountedQuantity, @JsonProperty("maxOccurrence") final java.lang.Integer maxOccurrence, @JsonProperty("selectionMode") final com.commercetools.models.CartDiscount.SelectionMode selectionMode) {
      this.predicate = predicate;
      this.triggerQuantity = triggerQuantity;
      this.discountedQuantity = discountedQuantity;
      this.maxOccurrence = maxOccurrence;
      this.selectionMode = selectionMode;
      this.type = "multiBuyLineItems";
   }
   public MultiBuyLineItemsTargetImpl() {
      
   }
   
   
   public java.lang.String getType(){
      return this.type;
   }
   
   /**
   	<p>A valid line item target predicate. The discount will be applied to line items that are matched by the predicate.</p>
   */
   public java.lang.String getPredicate(){
      return this.predicate;
   }
   
   /**
   	<p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
   */
   public java.lang.Integer getTriggerQuantity(){
      return this.triggerQuantity;
   }
   
   /**
   	<p>Quantity of line items that are discounted per application of this discount.</p>
   */
   public java.lang.Integer getDiscountedQuantity(){
      return this.discountedQuantity;
   }
   
   /**
   	<p>Maximum number of applications of this discount.</p>
   */
   public java.lang.Integer getMaxOccurrence(){
      return this.maxOccurrence;
   }
   
   
   public com.commercetools.models.CartDiscount.SelectionMode getSelectionMode(){
      return this.selectionMode;
   }

   public void setPredicate(final java.lang.String predicate){
      this.predicate = predicate;
   }
   
   public void setTriggerQuantity(final java.lang.Integer triggerQuantity){
      this.triggerQuantity = triggerQuantity;
   }
   
   public void setDiscountedQuantity(final java.lang.Integer discountedQuantity){
      this.discountedQuantity = discountedQuantity;
   }
   
   public void setMaxOccurrence(final java.lang.Integer maxOccurrence){
      this.maxOccurrence = maxOccurrence;
   }
   
   public void setSelectionMode(final com.commercetools.models.CartDiscount.SelectionMode selectionMode){
      this.selectionMode = selectionMode;
   }

}