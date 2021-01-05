package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.zone.ZoneReference;
import com.commercetools.api.models.shipping_method.ZoneRateImpl;

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
@JsonDeserialize(as = ZoneRateImpl.class)
public interface ZoneRate  {

    
    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneReference getZone();
    /**
    *  <p>The array does not contain two shipping rates with the same currency.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("shippingRates")
    public List<ShippingRate> getShippingRates();

    public void setZone(final ZoneReference zone);
    
    @JsonIgnore
    public void setShippingRates(final ShippingRate ...shippingRates);
    public void setShippingRates(final List<ShippingRate> shippingRates);

    public static ZoneRate of(){
        return new ZoneRateImpl();
    }
    

    public static ZoneRate of(final ZoneRate template) {
        ZoneRateImpl instance = new ZoneRateImpl();
        instance.setZone(template.getZone());
        instance.setShippingRates(template.getShippingRates());
        return instance;
    }

    public static ZoneRateBuilder builder(){
        return ZoneRateBuilder.of();
    }
    
    public static ZoneRateBuilder builder(final ZoneRate template){
        return ZoneRateBuilder.of(template);
    }
    

    default <T> T withZoneRate(Function<ZoneRate, T> helper) {
        return helper.apply(this);
    }
}
