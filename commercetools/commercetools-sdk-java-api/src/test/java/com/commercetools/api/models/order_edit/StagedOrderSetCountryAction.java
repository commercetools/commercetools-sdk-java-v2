package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetCountryActionImpl;

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
@JsonDeserialize(as = StagedOrderSetCountryActionImpl.class)
public interface StagedOrderSetCountryAction extends StagedOrderUpdateAction {

    String SET_COUNTRY = "setCountry";

    
    
    @JsonProperty("country")
    public String getCountry();

    
    public void setCountry(final String country);
    

    public static StagedOrderSetCountryAction of(){
        return new StagedOrderSetCountryActionImpl();
    }
    

    public static StagedOrderSetCountryAction of(final StagedOrderSetCountryAction template) {
        StagedOrderSetCountryActionImpl instance = new StagedOrderSetCountryActionImpl();
        instance.setCountry(template.getCountry());
        return instance;
    }

    public static StagedOrderSetCountryActionBuilder builder(){
        return StagedOrderSetCountryActionBuilder.of();
    }
    
    public static StagedOrderSetCountryActionBuilder builder(final StagedOrderSetCountryAction template){
        return StagedOrderSetCountryActionBuilder.of(template);
    }
    

    default <T> T withStagedOrderSetCountryAction(Function<StagedOrderSetCountryAction, T> helper) {
        return helper.apply(this);
    }
}
