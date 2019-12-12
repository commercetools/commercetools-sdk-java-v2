package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.MatchingPriceNotFoundErrorImpl;

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
@JsonDeserialize(as = MatchingPriceNotFoundErrorImpl.class)
public interface MatchingPriceNotFoundError extends ErrorObject {

   
   @NotNull
   @JsonProperty("productId")
   public String getProductId();
   
   @NotNull
   @JsonProperty("variantId")
   public Integer getVariantId();
   
   
   @JsonProperty("currency")
   public String getCurrency();
   
   
   @JsonProperty("country")
   public String getCountry();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   @Valid
   @JsonProperty("channel")
   public ChannelReference getChannel();

   public void setProductId(final String productId);
   
   public void setVariantId(final Integer variantId);
   
   public void setCurrency(final String currency);
   
   public void setCountry(final String country);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setChannel(final ChannelReference channel);
   
   public static MatchingPriceNotFoundErrorImpl of(){
      return new MatchingPriceNotFoundErrorImpl();
   }
   

   public static MatchingPriceNotFoundErrorImpl of(final MatchingPriceNotFoundError template) {
      MatchingPriceNotFoundErrorImpl instance = new MatchingPriceNotFoundErrorImpl();
      instance.setMessage(template.getMessage());
      instance.setCountry(template.getCountry());
      instance.setProductId(template.getProductId());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setChannel(template.getChannel());
      instance.setCurrency(template.getCurrency());
      instance.setVariantId(template.getVariantId());
      return instance;
   }

}