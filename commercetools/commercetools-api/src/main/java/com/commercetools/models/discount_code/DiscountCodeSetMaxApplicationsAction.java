package com.commercetools.models.discount_code;

import com.commercetools.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsActionImpl.class)
public interface DiscountCodeSetMaxApplicationsAction extends DiscountCodeUpdateAction {

   
   
   @JsonProperty("maxApplications")
   public Long getMaxApplications();

   public void setMaxApplications(final Long maxApplications);
   
   public static DiscountCodeSetMaxApplicationsActionImpl of(){
      return new DiscountCodeSetMaxApplicationsActionImpl();
   }
   

   public static DiscountCodeSetMaxApplicationsActionImpl of(final DiscountCodeSetMaxApplicationsAction template) {
      DiscountCodeSetMaxApplicationsActionImpl instance = new DiscountCodeSetMaxApplicationsActionImpl();
      instance.setMaxApplications(template.getMaxApplications());
      return instance;
   }

}