package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.orders.TaxPortionImpl;

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
@JsonDeserialize(as = TaxPortionImpl.class)
public interface TaxPortion  {

    
    
    @JsonProperty("name")
    public String getName();
    
    @NotNull
    @JsonProperty("rate")
    public Double getRate();
    
    @NotNull
    @Valid
    @JsonProperty("amount")
    public TypedMoney getAmount();

    public void setName(final String name);
    
    public void setRate(final Double rate);
    
    public void setAmount(final TypedMoney amount);

    public static TaxPortion of(){
        return new TaxPortionImpl();
    }
    

    public static TaxPortion of(final TaxPortion template) {
        TaxPortionImpl instance = new TaxPortionImpl();
        instance.setName(template.getName());
        instance.setRate(template.getRate());
        instance.setAmount(template.getAmount());
        return instance;
    }

    public static TaxPortionBuilder builder(){
        return TaxPortionBuilder.of();
    }
    
    public static TaxPortionBuilder builder(final TaxPortion template){
        return TaxPortionBuilder.of(template);
    }
    

    default <T> T withTaxPortion(Function<TaxPortion, T> helper) {
        return helper.apply(this);
    }
}
