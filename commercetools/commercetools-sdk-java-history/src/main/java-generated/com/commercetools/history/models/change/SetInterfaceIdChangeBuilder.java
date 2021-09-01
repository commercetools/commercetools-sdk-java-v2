
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetInterfaceIdChangeBuilder implements Builder<SetInterfaceIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetInterfaceIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetInterfaceIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetInterfaceIdChangeBuilder nextValue(final String nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public String getPreviousValue() {
        return this.previousValue;
    }

    public String getNextValue() {
        return this.nextValue;
    }

    public SetInterfaceIdChange build() {
        Objects.requireNonNull(change, SetInterfaceIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetInterfaceIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetInterfaceIdChange.class + ": nextValue is missing");
        return new SetInterfaceIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetInterfaceIdChange without checking for non null required values
     */
    public SetInterfaceIdChange buildUnchecked() {
        return new SetInterfaceIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetInterfaceIdChangeBuilder of() {
        return new SetInterfaceIdChangeBuilder();
    }

    public static SetInterfaceIdChangeBuilder of(final SetInterfaceIdChange template) {
        SetInterfaceIdChangeBuilder builder = new SetInterfaceIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
