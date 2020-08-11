package com.commercetools.api.models.me;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.me.MyPaymentUpdateAction;
import com.commercetools.api.models.me.MyPaymentSetMethodInfoNameActionImpl;

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
@JsonDeserialize(as = MyPaymentSetMethodInfoNameActionImpl.class)
public interface MyPaymentSetMethodInfoNameAction extends MyPaymentUpdateAction {


   @Valid
   @JsonProperty("name")
   public LocalizedString getName();

   public void setName(final LocalizedString name);

   public static MyPaymentSetMethodInfoNameActionImpl of(){
      return new MyPaymentSetMethodInfoNameActionImpl();
   }


   public static MyPaymentSetMethodInfoNameActionImpl of(final MyPaymentSetMethodInfoNameAction template) {
      MyPaymentSetMethodInfoNameActionImpl instance = new MyPaymentSetMethodInfoNameActionImpl();
      instance.setName(template.getName());
      return instance;
   }

}
