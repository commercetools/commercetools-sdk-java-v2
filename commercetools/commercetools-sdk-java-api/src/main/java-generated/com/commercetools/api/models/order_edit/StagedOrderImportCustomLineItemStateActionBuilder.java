
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderImportCustomLineItemStateActionBuilder {

    private String customLineItemId;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    public StagedOrderImportCustomLineItemStateActionBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public StagedOrderImportCustomLineItemStateActionBuilder state(
            final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
        return this;
    }

    public StagedOrderImportCustomLineItemStateActionBuilder state(
            final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public StagedOrderImportCustomLineItemStateAction build() {
        return new StagedOrderImportCustomLineItemStateActionImpl(customLineItemId, state);
    }

    public static StagedOrderImportCustomLineItemStateActionBuilder of() {
        return new StagedOrderImportCustomLineItemStateActionBuilder();
    }

    public static StagedOrderImportCustomLineItemStateActionBuilder of(
            final StagedOrderImportCustomLineItemStateAction template) {
        StagedOrderImportCustomLineItemStateActionBuilder builder = new StagedOrderImportCustomLineItemStateActionBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
