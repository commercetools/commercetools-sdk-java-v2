
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class UnknownChangeBuilder implements Builder<UnknownChange> {

    private String change;

    private java.lang.Object previousValue;

    private java.lang.Object nextValue;

    public UnknownChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public UnknownChangeBuilder previousValue(final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public UnknownChangeBuilder nextValue(final java.lang.Object nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    public java.lang.Object getNextValue() {
        return this.nextValue;
    }

    public UnknownChange build() {
        Objects.requireNonNull(change, UnknownChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, UnknownChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, UnknownChange.class + ": nextValue is missing");
        return new UnknownChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds UnknownChange without checking for non null required values
     */
    public UnknownChange buildUnchecked() {
        return new UnknownChangeImpl(change, previousValue, nextValue);
    }

    public static UnknownChangeBuilder of() {
        return new UnknownChangeBuilder();
    }

    public static UnknownChangeBuilder of(final UnknownChange template) {
        UnknownChangeBuilder builder = new UnknownChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
