package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Price;
import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.DuplicatePriceScopeErrorImpl;

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
@JsonDeserialize(as = DuplicatePriceScopeErrorImpl.class)
public interface DuplicatePriceScopeError extends ErrorObject {

    String DUPLICATE_PRICE_SCOPE = "DuplicatePriceScope";

    
    @NotNull
    @Valid
    @JsonProperty("conflictingPrices")
    public List<Price> getConflictingPrices();

    
    @JsonIgnore
    public void setConflictingPrices(final Price ...conflictingPrices);
    public void setConflictingPrices(final List<Price> conflictingPrices);

    public static DuplicatePriceScopeError of(){
        return new DuplicatePriceScopeErrorImpl();
    }
    

    public static DuplicatePriceScopeError of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorImpl instance = new DuplicatePriceScopeErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setConflictingPrices(template.getConflictingPrices());
        return instance;
    }

    public static DuplicatePriceScopeErrorBuilder builder(){
        return DuplicatePriceScopeErrorBuilder.of();
    }
    
    public static DuplicatePriceScopeErrorBuilder builder(final DuplicatePriceScopeError template){
        return DuplicatePriceScopeErrorBuilder.of(template);
    }
    

    default <T> T withDuplicatePriceScopeError(Function<DuplicatePriceScopeError, T> helper) {
        return helper.apply(this);
    }
}
