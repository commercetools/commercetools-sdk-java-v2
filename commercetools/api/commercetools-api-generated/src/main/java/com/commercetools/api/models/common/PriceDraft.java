package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelResourceIdentifier;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.common.PriceTierDraft;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.models.common.PriceDraftImpl;

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
@JsonDeserialize(as = PriceDraftImpl.class)
public interface PriceDraft  {

   
   @NotNull
   @Valid
   @JsonProperty("value")
   public Money getValue();
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();
   
   @Valid
   @JsonProperty("channel")
   public ChannelResourceIdentifier getChannel();
   
   
   @JsonProperty("validFrom")
   public ZonedDateTime getValidFrom();
   
   
   @JsonProperty("validUntil")
   public ZonedDateTime getValidUntil();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   @Valid
   @JsonProperty("tiers")
   public List<PriceTierDraft> getTiers();
   
   @Valid
   @JsonProperty("discounted")
   public DiscountedPrice getDiscounted();

   public void setValue(final Money value);
   
   public void setCountry(final String country);
   
   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public void setChannel(final ChannelResourceIdentifier channel);
   
   public void setValidFrom(final ZonedDateTime validFrom);
   
   public void setValidUntil(final ZonedDateTime validUntil);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setTiers(final List<PriceTierDraft> tiers);
   
   public void setDiscounted(final DiscountedPrice discounted);
   
   public static PriceDraftImpl of(){
      return new PriceDraftImpl();
   }
   

   public static PriceDraftImpl of(final PriceDraft template) {
      PriceDraftImpl instance = new PriceDraftImpl();
      instance.setValue(template.getValue());
      instance.setCountry(template.getCountry());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setChannel(template.getChannel());
      instance.setValidFrom(template.getValidFrom());
      instance.setValidUntil(template.getValidUntil());
      instance.setCustom(template.getCustom());
      instance.setTiers(template.getTiers());
      instance.setDiscounted(template.getDiscounted());
      return instance;
   }

}
