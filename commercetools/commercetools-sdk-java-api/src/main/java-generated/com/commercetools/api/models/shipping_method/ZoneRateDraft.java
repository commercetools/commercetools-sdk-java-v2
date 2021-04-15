
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.zone.ZoneResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneRateDraftImpl.class)
public interface ZoneRateDraft {

    @NotNull
    @Valid
    @JsonProperty("zone")
    public ZoneResourceIdentifier getZone();

    /**
    *  <p>The array must not contain two shipping rates with the same currency.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("shippingRates")
    public List<ShippingRateDraft> getShippingRates();

    public void setZone(final ZoneResourceIdentifier zone);

    @JsonIgnore
    public void setShippingRates(final ShippingRateDraft... shippingRates);

    public void setShippingRates(final List<ShippingRateDraft> shippingRates);

    public static ZoneRateDraft of() {
        return new ZoneRateDraftImpl();
    }

    public static ZoneRateDraft of(final ZoneRateDraft template) {
        ZoneRateDraftImpl instance = new ZoneRateDraftImpl();
        instance.setZone(template.getZone());
        instance.setShippingRates(template.getShippingRates());
        return instance;
    }

    public static ZoneRateDraftBuilder builder() {
        return ZoneRateDraftBuilder.of();
    }

    public static ZoneRateDraftBuilder builder(final ZoneRateDraft template) {
        return ZoneRateDraftBuilder.of(template);
    }

    default <T> T withZoneRateDraft(Function<ZoneRateDraft, T> helper) {
        return helper.apply(this);
    }
}
