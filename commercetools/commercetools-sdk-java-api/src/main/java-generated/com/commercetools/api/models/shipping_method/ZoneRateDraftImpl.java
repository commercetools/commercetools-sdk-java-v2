package com.commercetools.api.models.shipping_method;

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
 * ZoneRateDraft
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ZoneRateDraftImpl implements ZoneRateDraft, ModelBase {

    
    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;
    
    
    private java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ZoneRateDraftImpl(@JsonProperty("zone") final com.commercetools.api.models.zone.ZoneResourceIdentifier zone, @JsonProperty("shippingRates") final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates) {
        this.zone = zone;
        this.shippingRates = shippingRates;
    }
    /**
     * create empty instance
     */
    public ZoneRateDraftImpl() {
    }

    /**
     *  <p>Sets the Zone for which the shippng rates are valid.</p>
     */
    
    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
        return this.zone;
    }
    
    /**
     *  <p>Shipping rates for the <code>currencies</code> configured in the Project. The array must not contain two ShippingRates with the same CurrencyCode.</p>
     */
    
    public java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> getShippingRates(){
        return this.shippingRates;
    }

    
    public void setZone(final com.commercetools.api.models.zone.ZoneResourceIdentifier zone){
        this.zone = zone;
    }
    
    
    public void setShippingRates(final com.commercetools.api.models.shipping_method.ShippingRateDraft ...shippingRates){
       this.shippingRates = new ArrayList<>(Arrays.asList(shippingRates));
    }
    
    
    public void setShippingRates(final java.util.List<com.commercetools.api.models.shipping_method.ShippingRateDraft> shippingRates){
       this.shippingRates = shippingRates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ZoneRateDraftImpl that = (ZoneRateDraftImpl) o;
    
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
