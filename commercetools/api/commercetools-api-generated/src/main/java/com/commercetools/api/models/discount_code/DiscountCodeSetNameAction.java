package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeSetNameActionImpl;

import com.fasterxml.jackson.annotation.*;
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
@JsonDeserialize(as = DiscountCodeSetNameActionImpl.class)
public interface DiscountCodeSetNameAction extends DiscountCodeUpdateAction {

   /**
   *  <p>If the <code>name</code> parameter is not included, the field will be emptied.</p>
   */
   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);

   public static DiscountCodeSetNameActionImpl of(){
      return new DiscountCodeSetNameActionImpl();
   }


   public static DiscountCodeSetNameActionImpl of(final DiscountCodeSetNameAction template) {
      DiscountCodeSetNameActionImpl instance = new DiscountCodeSetNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}
