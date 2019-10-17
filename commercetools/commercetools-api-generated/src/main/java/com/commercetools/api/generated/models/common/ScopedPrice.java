package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.common.DiscountedPrice;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.common.ScopedPriceImpl;

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
@JsonDeserialize(as = ScopedPriceImpl.class)
public interface ScopedPrice  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public TypedMoney getValue();
   
   @NotNull
   @Valid
   @JsonProperty("currentValue")
   public TypedMoney getCurrentValue();
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("channel")
   public ChannelReference getChannel();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();
   
   @Valid
   @JsonProperty("discounted")
   public DiscountedPrice getDiscounted();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();

   public void setId(final String id);
   
   public void setValue(final TypedMoney value);
   
   public void setCurrentValue(final TypedMoney currentValue);
   
   public void setCountry(final String country);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setChannel(final ChannelReference channel);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setDiscounted(final DiscountedPrice discounted);
   
   public void setCustom(final CustomFields custom);
   
   public static ScopedPriceImpl of(){
      return new ScopedPriceImpl();
   }
   

   public static ScopedPriceImpl of(final ScopedPrice template) {
      ScopedPriceImpl instance = new ScopedPriceImpl();
      instance.setDiscounted(template.getDiscounted());
      instance.setCountry(template.getCountry());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setChannel(template.getChannel());
      instance.setValidUntil(template.getValidUntil());
      instance.setValidFrom(template.getValidFrom());
      instance.setId(template.getId());
      instance.setValue(template.getValue());
      instance.setCurrentValue(template.getCurrentValue());
      return instance;
   }

}