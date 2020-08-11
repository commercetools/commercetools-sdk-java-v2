package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import java.time.ZonedDateTime;
import com.commercetools.api.models.error.DiscountCodeNonApplicableErrorImpl;

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
@JsonDeserialize(as = DiscountCodeNonApplicableErrorImpl.class)
public interface DiscountCodeNonApplicableError extends ErrorObject {



   @JsonProperty("discountCode")
   public String getDiscountCode();


   @JsonProperty("reason")
   public String getReason();


   @JsonProperty("dicountCodeId")
   public String getDicountCodeId();


   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();


   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();


   @JsonProperty("validityCheckTime")
   public ZonedDateTime getValidityCheckTime();

   public void setDiscountCode(final String discountCode);

   public void setReason(final String reason);

   public void setDicountCodeId(final String dicountCodeId);

   public void setValidFrom(final ZonedDateTime validFrom);

   public void setValidUntil(final ZonedDateTime validUntil);

   public void setValidityCheckTime(final ZonedDateTime validityCheckTime);

   public static DiscountCodeNonApplicableErrorImpl of(){
      return new DiscountCodeNonApplicableErrorImpl();
   }


   public static DiscountCodeNonApplicableErrorImpl of(final DiscountCodeNonApplicableError template) {
      DiscountCodeNonApplicableErrorImpl instance = new DiscountCodeNonApplicableErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setReason(template.getReason());
      instance.setValidityCheckTime(template.getValidityCheckTime());
      instance.setDiscountCode(template.getDiscountCode());
      instance.setValidUntil(template.getValidUntil());
      instance.setValidFrom(template.getValidFrom());
      instance.setDicountCodeId(template.getDicountCodeId());
      return instance;
   }

}
