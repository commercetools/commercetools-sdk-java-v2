
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddTextLineItemChangeBuilder implements Builder<AddTextLineItemChange> {

    private String change;

    private com.commercetools.history.models.common.TextLineItem nextValue;

    public AddTextLineItemChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddTextLineItemChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.TextLineItemBuilder, com.commercetools.history.models.common.TextLineItemBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.TextLineItemBuilder.of()).build();
        return this;
    }

    public AddTextLineItemChangeBuilder nextValue(
            final com.commercetools.history.models.common.TextLineItem nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.TextLineItem getNextValue() {
        return this.nextValue;
    }

    public AddTextLineItemChange build() {
        Objects.requireNonNull(change, AddTextLineItemChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, AddTextLineItemChange.class + ": nextValue is missing");
        return new AddTextLineItemChangeImpl(change, nextValue);
    }

    /**
     * builds AddTextLineItemChange without checking for non null required values
     */
    public AddTextLineItemChange buildUnchecked() {
        return new AddTextLineItemChangeImpl(change, nextValue);
    }

    public static AddTextLineItemChangeBuilder of() {
        return new AddTextLineItemChangeBuilder();
    }

    public static AddTextLineItemChangeBuilder of(final AddTextLineItemChange template) {
        AddTextLineItemChangeBuilder builder = new AddTextLineItemChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
