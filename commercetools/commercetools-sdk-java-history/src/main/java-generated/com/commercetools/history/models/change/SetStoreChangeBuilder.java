
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetStoreChangeBuilder implements Builder<SetStoreChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public SetStoreChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetStoreChangeBuilder previousValue(final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetStoreChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Reference getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Reference getNextValue() {
        return this.nextValue;
    }

    public SetStoreChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new SetStoreChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetStoreChange without checking for non null required values
     */
    public SetStoreChange buildUnchecked() {
        return new SetStoreChangeImpl(change, previousValue, nextValue);
    }

    public static SetStoreChangeBuilder of() {
        return new SetStoreChangeBuilder();
    }

    public static SetStoreChangeBuilder of(final SetStoreChange template) {
        SetStoreChangeBuilder builder = new SetStoreChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
