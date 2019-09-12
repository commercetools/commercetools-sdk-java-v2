package com.commercetools.models.Review;

import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.Review.ReviewUpdateAction;
import java.lang.String;
import com.commercetools.models.Review.ReviewSetCustomerActionImpl;

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
@JsonDeserialize(as = ReviewSetCustomerActionImpl.class)
public interface ReviewSetCustomerAction extends ReviewUpdateAction {

   
   @Valid
   @JsonProperty("customer")
   public CustomerResourceIdentifier getCustomer();

   public void setCustomer(final CustomerResourceIdentifier customer);
   
   public static ReviewSetCustomerActionImpl of(){
      return new ReviewSetCustomerActionImpl();
   }
   

   public static ReviewSetCustomerActionImpl of(final ReviewSetCustomerAction template) {
      ReviewSetCustomerActionImpl instance = new ReviewSetCustomerActionImpl();
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}