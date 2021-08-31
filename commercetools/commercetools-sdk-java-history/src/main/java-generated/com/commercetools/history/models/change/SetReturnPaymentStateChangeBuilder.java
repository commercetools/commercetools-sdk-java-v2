
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetReturnPaymentStateChangeBuilder implements Builder<SetReturnPaymentStateChange> {

    private String change;

    private com.commercetools.history.models.common.ReturnPaymentState nextValue;

    private com.commercetools.history.models.common.ReturnPaymentState previousValue;

    public SetReturnPaymentStateChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetReturnPaymentStateChangeBuilder nextValue(
            final com.commercetools.history.models.common.ReturnPaymentState nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetReturnPaymentStateChangeBuilder previousValue(
            final com.commercetools.history.models.common.ReturnPaymentState previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.ReturnPaymentState getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.ReturnPaymentState getPreviousValue() {
        return this.previousValue;
    }

    public SetReturnPaymentStateChange build() {
        Objects.requireNonNull(change, SetReturnPaymentStateChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetReturnPaymentStateChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetReturnPaymentStateChange.class + ": previousValue is missing");
        return new SetReturnPaymentStateChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetReturnPaymentStateChange without checking for non null required values
     */
    public SetReturnPaymentStateChange buildUnchecked() {
        return new SetReturnPaymentStateChangeImpl(change, nextValue, previousValue);
    }

    public static SetReturnPaymentStateChangeBuilder of() {
        return new SetReturnPaymentStateChangeBuilder();
    }

    public static SetReturnPaymentStateChangeBuilder of(final SetReturnPaymentStateChange template) {
        SetReturnPaymentStateChangeBuilder builder = new SetReturnPaymentStateChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
