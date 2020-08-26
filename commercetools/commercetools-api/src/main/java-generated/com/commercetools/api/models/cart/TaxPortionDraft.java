package com.commercetools.api.models.cart;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.cart.TaxPortionDraftImpl;

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
@JsonDeserialize(as = TaxPortionDraftImpl.class)
public interface TaxPortionDraft  {

    
    
    @JsonProperty("name")
    public String getName();
    
    @NotNull
    @JsonProperty("rate")
    public Double getRate();
    
    @NotNull
    @Valid
    @JsonProperty("amount")
    public Money getAmount();

    public void setName(final String name);
    
    public void setRate(final Double rate);
    
    public void setAmount(final Money amount);

    public static TaxPortionDraftImpl of(){
        return new TaxPortionDraftImpl();
    }
    

    public static TaxPortionDraftImpl of(final TaxPortionDraft template) {
        TaxPortionDraftImpl instance = new TaxPortionDraftImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

}
