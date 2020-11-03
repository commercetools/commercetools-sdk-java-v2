package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.PriceChangedErrorImpl;

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
@JsonDeserialize(as = PriceChangedErrorImpl.class)
public interface PriceChangedError extends ErrorObject {

    
    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();
    
    @NotNull
    @JsonProperty("shipping")
    public Boolean getShipping();

    @JsonIgnore
    public void setLineItems(final String ...lineItems);
    public void setLineItems(final List<String> lineItems);
    
    public void setShipping(final Boolean shipping);

    public static PriceChangedErrorImpl of(){
        return new PriceChangedErrorImpl();
    }
    

    public static PriceChangedErrorImpl of(final PriceChangedError template) {
        PriceChangedErrorImpl instance = new PriceChangedErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItems(template.getLineItems());
        instance.setShipping(template.getShipping());
        return instance;
    }

    default <T> T withPriceChangedError(Function<PriceChangedError, T> helper) {
        return helper.apply(this);
    }
}
