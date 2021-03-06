
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeCustomLineItemQuantityChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private Integer nextValue;

    private Integer previousValue;

    public ChangeCustomLineItemQuantityChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeCustomLineItemQuantityChangeBuilder customLineItem(
            final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public ChangeCustomLineItemQuantityChangeBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    public ChangeCustomLineItemQuantityChangeBuilder nextValue(final Integer nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public ChangeCustomLineItemQuantityChangeBuilder previousValue(final Integer previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public Integer getNextValue() {
        return this.nextValue;
    }

    public Integer getPreviousValue() {
        return this.previousValue;
    }

    public ChangeCustomLineItemQuantityChange build() {
        return new ChangeCustomLineItemQuantityChangeImpl(change, customLineItem, customLineItemId, nextValue,
            previousValue);
    }

    public static ChangeCustomLineItemQuantityChangeBuilder of() {
        return new ChangeCustomLineItemQuantityChangeBuilder();
    }

    public static ChangeCustomLineItemQuantityChangeBuilder of(final ChangeCustomLineItemQuantityChange template) {
        ChangeCustomLineItemQuantityChangeBuilder builder = new ChangeCustomLineItemQuantityChangeBuilder();
        builder.change = template.getChange();
        builder.customLineItem = template.getCustomLineItem();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
