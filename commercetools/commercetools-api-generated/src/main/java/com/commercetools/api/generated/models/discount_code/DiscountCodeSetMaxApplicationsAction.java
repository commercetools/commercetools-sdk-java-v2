package com.commercetools.api.generated.models.discount_code;

import com.commercetools.api.generated.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.generated.models.discount_code.DiscountCodeSetMaxApplicationsActionImpl;

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
@JsonDeserialize(as = DiscountCodeSetMaxApplicationsActionImpl.class)
public interface DiscountCodeSetMaxApplicationsAction extends DiscountCodeUpdateAction {

   /**
   *  <p>If the <code>maxApplications</code> parameter is not included, the field will be emptied.</p>
   */
   
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