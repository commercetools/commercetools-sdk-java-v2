package com.commercetools.importapi.models.prices;

import com.commercetools.importapi.models.prices.SubRate;
import com.commercetools.importapi.models.prices.TaxRateImpl;

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
@JsonDeserialize(as = TaxRateImpl.class)
public interface TaxRate  {

    
    
    @JsonProperty("id")
    public String getId();
    
    @NotNull
    @JsonProperty("name")
    public String getName();
    
    @NotNull
    @JsonProperty("amount")
    public Double getAmount();
    
    @NotNull
    @JsonProperty("includedInPrice")
    public Boolean getIncludedInPrice();
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    @NotNull
    @JsonProperty("country")
    public String getCountry();
    
    
    @JsonProperty("state")
    public String getState();
    
    @Valid
    @JsonProperty("subRates")
    public List<SubRate> getSubRates();

    public void setId(final String id);
    
    public void setName(final String name);
    
    public void setAmount(final Double amount);
    
    public void setIncludedInPrice(final Boolean includedInPrice);
    
    public void setCountry(final String country);
    
    public void setState(final String state);
    
    public void setSubRates(final List<SubRate> subRates);

    public static TaxRateImpl of(){
        return new TaxRateImpl();
    }
    

    public static TaxRateImpl of(final TaxRate template) {
        TaxRateImpl instance = new TaxRateImpl();
        instance.setId(template.getId());
        instance.setName(template.getName());
        instance.setAmount(template.getAmount());
        instance.setIncludedInPrice(template.getIncludedInPrice());
        instance.setCountry(template.getCountry());
        instance.setState(template.getState());
        instance.setSubRates(template.getSubRates());
        return instance;
    }

}
