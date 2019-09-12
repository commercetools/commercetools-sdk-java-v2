package com.commercetools.models.DiscountCode;

import com.commercetools.models.DiscountCode.DiscountCodeUpdateAction;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.DiscountCode.DiscountCodeSetMaxApplicationsPerCustomerActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsPerCustomerActionImpl.class)
public interface DiscountCodeSetMaxApplicationsPerCustomerAction extends DiscountCodeUpdateAction {

   
   
   @JsonProperty("maxApplicationsPerCustomer")
   public Long getMaxApplicationsPerCustomer();

   public void setMaxApplicationsPerCustomer(final Long maxApplicationsPerCustomer);
   
   public static DiscountCodeSetMaxApplicationsPerCustomerActionImpl of(){
      return new DiscountCodeSetMaxApplicationsPerCustomerActionImpl();
   }
   

   public static DiscountCodeSetMaxApplicationsPerCustomerActionImpl of(final DiscountCodeSetMaxApplicationsPerCustomerAction template) {
      DiscountCodeSetMaxApplicationsPerCustomerActionImpl instance = new DiscountCodeSetMaxApplicationsPerCustomerActionImpl();
      instance.setMaxApplicationsPerCustomer(template.getMaxApplicationsPerCustomer());
      return instance;
   }

}