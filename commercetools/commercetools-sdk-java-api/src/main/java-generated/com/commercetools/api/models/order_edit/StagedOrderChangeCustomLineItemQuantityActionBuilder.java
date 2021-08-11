
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderChangeCustomLineItemQuantityActionBuilder
        implements Builder<StagedOrderChangeCustomLineItemQuantityAction> {

    private String customLineItemId;

    private Double quantity;

    public StagedOrderChangeCustomLineItemQuantityActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderChangeCustomLineItemQuantityActionBuilder quantity(final Double quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public StagedOrderChangeCustomLineItemQuantityAction build() {
        Objects.requireNonNull(customLineItemId,
            StagedOrderChangeCustomLineItemQuantityAction.class + ": customLineItemId is missing");
        Objects.requireNonNull(quantity, StagedOrderChangeCustomLineItemQuantityAction.class + ": quantity is missing");
        return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    /**
     * builds StagedOrderChangeCustomLineItemQuantityAction without checking for non null required values
     */
    public StagedOrderChangeCustomLineItemQuantityAction buildUnchecked() {
        return new StagedOrderChangeCustomLineItemQuantityActionImpl(customLineItemId, quantity);
    }

    public static StagedOrderChangeCustomLineItemQuantityActionBuilder of() {
        return new StagedOrderChangeCustomLineItemQuantityActionBuilder();
    }

    public static StagedOrderChangeCustomLineItemQuantityActionBuilder of(
            final StagedOrderChangeCustomLineItemQuantityAction template) {
        StagedOrderChangeCustomLineItemQuantityActionBuilder builder = new StagedOrderChangeCustomLineItemQuantityActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
