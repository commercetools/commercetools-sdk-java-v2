package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.prices.SubRate;
import com.commercetools.importapi.models.orders.ExternalTaxRateDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ExternalTaxRateDraftImpl.class)
public interface ExternalTaxRateDraft  {

    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    
    @JsonProperty("amount")
    public Double getAmount();
    
    @NotNull
    @JsonProperty("country")
    public String getCountry();
    
    
    @JsonProperty("state")
    public String getState();
    
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();
    
    
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();

    public void setName(final String name);
    
    public void setAmount(final Double amount);
    
    public void setCountry(final String country);
    
    public void setState(final String state);
    
    public void setSubRates(final List<SubRate> subRates);
    
    public void setIncludedInPrice(final Boolean includedInPrice);

    public static ExternalTaxRateDraftImpl of(){
        return new ExternalTaxRateDraftImpl();
    }
    

    public static ExternalTaxRateDraftImpl of(final ExternalTaxRateDraft template) {
        ExternalTaxRateDraftImpl instance = new ExternalTaxRateDraftImpl();
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        return instance;
    }

    default <T extends Accessor<ExternalTaxRateDraft>> T withExternalTaxRateDraft(Function<ExternalTaxRateDraft, T> helper) {
        return helper.apply(this);
    }
}
