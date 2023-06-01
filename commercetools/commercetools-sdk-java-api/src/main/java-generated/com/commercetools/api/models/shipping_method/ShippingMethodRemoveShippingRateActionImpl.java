package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
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
 * ShippingMethodRemoveShippingRateAction
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingMethodRemoveShippingRateActionImpl implements ShippingMethodRemoveShippingRateAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;
    
    
    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodRemoveShippingRateActionImpl(@JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone, @JsonProperty("shippingRate") final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.zone = zone;
        this.shippingRate = shippingRate;
        this.action =  REMOVE_SHIPPING_RATE;
    }
    /**
     * create empty instance
     */
    public ShippingMethodRemoveShippingRateActionImpl() {
        this.action =  REMOVE_SHIPPING_RATE;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>Zone from which the ShippingRate should be removed.</p>
     */
    
    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
        return this.zone;
    }
    
    /**
     *  <p>Value to remove from <code>shippingRates</code>.</p>
     */
    
    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }

    
    public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone){
        this.zone = zone;
    }
    
    
    public void setShippingRate(final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate){
        this.shippingRate = shippingRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingMethodRemoveShippingRateActionImpl that = (ShippingMethodRemoveShippingRateActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(zone, that.zone)
                .append(shippingRate, that.shippingRate)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(zone)
            .append(shippingRate)
            .toHashCode();
    }

}
