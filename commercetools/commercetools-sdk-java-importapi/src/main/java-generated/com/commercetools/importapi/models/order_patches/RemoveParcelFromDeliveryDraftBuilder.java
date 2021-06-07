
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveParcelFromDeliveryDraftBuilder {

    private String parcelId;

    public RemoveParcelFromDeliveryDraftBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public RemoveParcelFromDeliveryDraft build() {
        return new RemoveParcelFromDeliveryDraftImpl(parcelId);
    }

    public static RemoveParcelFromDeliveryDraftBuilder of() {
        return new RemoveParcelFromDeliveryDraftBuilder();
    }

    public static RemoveParcelFromDeliveryDraftBuilder of(final RemoveParcelFromDeliveryDraft template) {
        RemoveParcelFromDeliveryDraftBuilder builder = new RemoveParcelFromDeliveryDraftBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
