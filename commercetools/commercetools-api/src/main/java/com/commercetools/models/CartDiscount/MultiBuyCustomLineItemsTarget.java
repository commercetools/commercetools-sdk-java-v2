package com.commercetools.models.CartDiscount;

import com.commercetools.models.CartDiscount.CartDiscountTarget;
import com.commercetools.models.CartDiscount.SelectionMode;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.CartDiscount.MultiBuyCustomLineItemsTargetImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = MultiBuyCustomLineItemsTargetImpl.class)
public interface MultiBuyCustomLineItemsTarget extends CartDiscountTarget {

   /**
   	<p>A valid custom line item target predicate. The discount will be applied to custom line items that are
   	matched by the predicate.</p>
   */
   @NotNull
   @JsonProperty("predicate")
   public String getPredicate();
   /**
   	<p>Quantity of line items that need to be present in order to trigger an application of this discount.</p>
   */
   @NotNull
   @JsonProperty("triggerQuantity")
   public Integer getTriggerQuantity();
   /**
   	<p>Quantity of line items that are discounted per application of this discount.</p>
   */
   @NotNull
   @JsonProperty("discountedQuantity")
   public Integer getDiscountedQuantity();
   /**
   	<p>Maximum number of applications of this discount.</p>
   */
   
   @JsonProperty("maxOccurrence")
   public Integer getMaxOccurrence();
   
   @NotNull
   @JsonProperty("selectionMode")
   public SelectionMode getSelectionMode();

   public void setPredicate(final String predicate);
   
   public void setTriggerQuantity(final Integer triggerQuantity);
   
   public void setDiscountedQuantity(final Integer discountedQuantity);
   
   public void setMaxOccurrence(final Integer maxOccurrence);
   
   public void setSelectionMode(final SelectionMode selectionMode);
   
   public static MultiBuyCustomLineItemsTargetImpl of(){
      return new MultiBuyCustomLineItemsTargetImpl();
   }
   

   public static MultiBuyCustomLineItemsTargetImpl of(final MultiBuyCustomLineItemsTarget template) {
      MultiBuyCustomLineItemsTargetImpl instance = new MultiBuyCustomLineItemsTargetImpl();
      instance.setPredicate(template.getPredicate());
      instance.setTriggerQuantity(template.getTriggerQuantity());
      instance.setDiscountedQuantity(template.getDiscountedQuantity());
      instance.setMaxOccurrence(template.getMaxOccurrence());
      instance.setSelectionMode(template.getSelectionMode());
      return instance;
   }

}