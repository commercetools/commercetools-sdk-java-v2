package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.commercetools.api.models.shipping_method.ShippingMethodRemoveShippingRateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingMethodRemoveShippingRateActionBuilder {

    
    
    private com.commercetools.api.models.zone.ZoneResourceIdentifier zone;
    
    
    
    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    
    public ShippingMethodRemoveShippingRateActionBuilder zone( final com.commercetools.api.models.zone.ZoneResourceIdentifier zone) {
        this.zone = zone;
        return this;
    }
    
    
    public ShippingMethodRemoveShippingRateActionBuilder shippingRate( final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    
    
    public com.commercetools.api.models.zone.ZoneResourceIdentifier getZone(){
        return this.zone;
    }
    
    
    
    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }

    public ShippingMethodRemoveShippingRateAction build() {
        return new ShippingMethodRemoveShippingRateActionImpl(zone, shippingRate);
    }

    public static ShippingMethodRemoveShippingRateActionBuilder of() {
        return new ShippingMethodRemoveShippingRateActionBuilder();
    }

    public static ShippingMethodRemoveShippingRateActionBuilder of(final ShippingMethodRemoveShippingRateAction template) {
        ShippingMethodRemoveShippingRateActionBuilder builder = new ShippingMethodRemoveShippingRateActionBuilder();
        builder.zone = template.getZone();
        builder.shippingRate = template.getShippingRate();
        return builder;
    }

}
