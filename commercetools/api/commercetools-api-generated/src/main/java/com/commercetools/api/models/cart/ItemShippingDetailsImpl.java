package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ItemShippingTarget;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ItemShippingDetailsImpl implements ItemShippingDetails {

   private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets;
   
   private Boolean valid;

   @JsonCreator
   ItemShippingDetailsImpl(@JsonProperty("targets") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets, @JsonProperty("valid") final Boolean valid) {
      this.targets = targets;
      this.valid = valid;
   }
   public ItemShippingDetailsImpl() {
      
   }
   
   /**
   *  <p>Used to map what sub-quantity should be shipped to which address.
   *  Duplicate address keys are not allowed.</p>
   */
   public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargets(){
      return this.targets;
   }
   
   /**
   *  <p><code>true</code> if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise.
   *  A cart cannot be ordered when the value is <code>false</code>.
   *  The error InvalidItemShippingDetails will be triggered.</p>
   */
   public Boolean getValid(){
      return this.valid;
   }

   public void setTargets(final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targets){
      this.targets = targets;
   }
   
   public void setValid(final Boolean valid){
      this.valid = valid;
   }

}
