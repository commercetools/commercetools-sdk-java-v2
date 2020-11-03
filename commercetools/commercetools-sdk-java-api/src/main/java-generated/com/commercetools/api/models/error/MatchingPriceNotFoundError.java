package com.commercetools.api.models.error;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.MatchingPriceNotFoundErrorImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
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
        instance.setProductId(template.getProductId());
        instance.setVariantId(template.getVariantId());
        instance.setCurrency(template.getCurrency());
        instance.setCountry(template.getCountry());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setChannel(template.getChannel());
        return instance;
    }

    default <T> T withMatchingPriceNotFoundError(Function<MatchingPriceNotFoundError, T> helper) {
        return helper.apply(this);
    }
}
