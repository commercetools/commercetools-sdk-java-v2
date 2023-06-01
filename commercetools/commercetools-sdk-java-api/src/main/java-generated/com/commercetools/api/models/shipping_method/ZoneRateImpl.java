package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingRate;
import com.commercetools.api.models.zone.ZoneReference;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Defines shipping rates in different currencies for a specific Zone.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneRateImpl implements ZoneRate, ModelBase {

    
    private com.commercetools.api.models.zone.ZoneReference zone;
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ZoneRateImpl(@JsonProperty("zone") final com.commercetools.api.models.zone.ZoneReference zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates) {
        this.zone = zone;
        this.shippingRates = shippingRates;
    }
    /**
     * create empty instance
     */
    public ZoneRateImpl() {
    }

    /**
     *  <p>Zone for which the shipping rates are valid.</p>
     */
    
    public com.commercetools.api.models.zone.ZoneReference getZone(){
        return this.zone;
    }
    
    /**
     *  <p>Shipping rates defined per currency.</p>
     */
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> getShippingRates(){
        return this.shippingRates;
    }

    
    public void setZone(final com.commercetools.api.models.zone.ZoneReference zone){
        this.zone = zone;
    }
    
    
    public void setShippingRates(final com.commercetools.api.models.shipping_method.ShippingRate ...shippingRates){
       this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
    }
    
    
    public void setShippingRates(final java.util.List<com.commercetools.api.models.shipping_method.ShippingRate> shippingRates){
       this.shippingRates = shippingRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ZoneRateImpl that = (ZoneRateImpl) o;
    
        return new EqualsBuilder()
                .append(zone, that.zone)
                .append(shippingRates, that.shippingRates)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(zone)
            .append(shippingRates)
            .toHashCode();
    }

}
