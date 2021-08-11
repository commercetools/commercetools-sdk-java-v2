
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeIsActiveChangeBuilder implements Builder<ChangeIsActiveChange> {

    private String change;

    private Boolean previousValue;

    private Boolean nextValue;

    public ChangeIsActiveChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeIsActiveChangeBuilder previousValue(final Boolean previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeIsActiveChangeBuilder nextValue(final Boolean nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public Boolean getPreviousValue() {
        return this.previousValue;
    }

    public Boolean getNextValue() {
        return this.nextValue;
    }

    public ChangeIsActiveChange build() {
        Objects.requireNonNull(change, ChangeIsActiveChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeIsActiveChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeIsActiveChange.class + ": nextValue is missing");
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeIsActiveChange without checking for non null required values
     */
    public ChangeIsActiveChange buildUnchecked() {
        return new ChangeIsActiveChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeIsActiveChangeBuilder of() {
        return new ChangeIsActiveChangeBuilder();
    }

    public static ChangeIsActiveChangeBuilder of(final ChangeIsActiveChange template) {
        ChangeIsActiveChangeBuilder builder = new ChangeIsActiveChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
