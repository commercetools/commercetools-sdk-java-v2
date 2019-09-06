package com.commercetools.models.Common;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.Common.DiscountedPrice;
import com.commercetools.models.Common.Money;
import com.commercetools.models.Common.PriceTier;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Common.PriceImpl;

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
@JsonDeserialize(as = PriceImpl.class)
public interface Price  {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();
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
   
   @Valid
   @JsonProperty("tiers")
   public List<PriceTier> getTiers();

   public void setId(final String id);
   
   public void setValue(final Money value);
   
   public void setCountry(final String country);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setChannel(final ChannelReference channel);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setDiscounted(final DiscountedPrice discounted);
   
   public void setCustom(final CustomFields custom);
   
   public void setTiers(final List<PriceTier> tiers);
   
   public static PriceImpl of(){
      return new PriceImpl();
   }
   

   public static PriceImpl of(final Price template) {
      PriceImpl instance = new PriceImpl();
      instance.setDiscounted(template.getDiscounted());
      instance.setCountry(template.getCountry());
      instance.setTiers(template.getTiers());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setChannel(template.getChannel());
      instance.setValidUntil(template.getValidUntil());
      instance.setValidFrom(template.getValidFrom());
      instance.setId(template.getId());
      instance.setValue(template.getValue());
      return instance;
   }

}