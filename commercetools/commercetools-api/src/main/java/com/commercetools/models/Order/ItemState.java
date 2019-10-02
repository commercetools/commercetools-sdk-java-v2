package com.commercetools.models.order;

import com.commercetools.models.state.StateReference;
import com.commercetools.models.order.ItemStateImpl;

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
@JsonDeserialize(as = ItemStateImpl.class)
public interface ItemState  {

   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();
   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateReference getState();

   public void setQuantity(final Integer quantity);
   
   public void setState(final StateReference state);
   
   public static ItemStateImpl of(){
      return new ItemStateImpl();
   }
   

   public static ItemStateImpl of(final ItemState template) {
      ItemStateImpl instance = new ItemStateImpl();
      instance.setQuantity(template.getQuantity());
      instance.setState(template.getState());
      return instance;
   }

}