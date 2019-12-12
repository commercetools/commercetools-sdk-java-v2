package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetMaxApplicationsPerCustomerActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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

   /**
   *  <p>If the <code>maxApplicationsPerCustomer</code> parameter is not included, the field will be emptied.</p>
   */
   
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