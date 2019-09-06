package com.commercetools.models.Payment;

import com.commercetools.models.Common.Reference;
import com.commercetools.models.Common.ReferenceTypeId;
import com.commercetools.models.Payment.Payment;
import com.commercetools.models.Payment.PaymentReferenceImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PaymentReferenceImpl.class)
public interface PaymentReference extends Reference {

   
   @Valid
   @JsonProperty("obj")
   public Payment getObj();

   public void setObj(final Payment obj);
   
   public static PaymentReferenceImpl of(){
      return new PaymentReferenceImpl();
   }
   

   public static PaymentReferenceImpl of(final PaymentReference template) {
      PaymentReferenceImpl instance = new PaymentReferenceImpl();
      instance.setId(template.getId());
      instance.setObj(template.getObj());
      return instance;
   }

}