
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeLineItemQuantityChangeBuilder implements Builder<ChangeLineItemQuantityChange> {

    private String change;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    private Integer nextValue;

    private Integer previousValue;

    public ChangeLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeLineItemQuantityChangeBuilder lineItem(
            final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    public ChangeLineItemQuantityChangeBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    public ChangeLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public ChangeLineItemQuantityChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(lineItem);
        Objects.requireNonNull(lineItemId);
        Objects.requireNonNull(nextValue);
        Objects.requireNonNull(previousValue);
        return new ChangeLineItemQuantityChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    /**
     * builds ChangeLineItemQuantityChange without checking for non null required values
     */
    public ChangeLineItemQuantityChange buildUnchecked() {
        return new ChangeLineItemQuantityChangeImpl(change, lineItem, lineItemId, nextValue, previousValue);
    }

    public static ChangeLineItemQuantityChangeBuilder of() {
        return new ChangeLineItemQuantityChangeBuilder();
    }

    public static ChangeLineItemQuantityChangeBuilder of(final ChangeLineItemQuantityChange template) {
        ChangeLineItemQuantityChangeBuilder builder = new ChangeLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.lineItem = template.getLineItem();
        builder.lineItemId = template.getLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
