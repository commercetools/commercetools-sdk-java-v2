
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderRemoveParcelFromDeliveryActionBuilder {

    private String parcelId;

    public StagedOrderRemoveParcelFromDeliveryActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public StagedOrderRemoveParcelFromDeliveryAction build() {
        return new StagedOrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    public static StagedOrderRemoveParcelFromDeliveryActionBuilder of() {
        return new StagedOrderRemoveParcelFromDeliveryActionBuilder();
    }

    public static StagedOrderRemoveParcelFromDeliveryActionBuilder of(
            final StagedOrderRemoveParcelFromDeliveryAction template) {
        StagedOrderRemoveParcelFromDeliveryActionBuilder builder = new StagedOrderRemoveParcelFromDeliveryActionBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
