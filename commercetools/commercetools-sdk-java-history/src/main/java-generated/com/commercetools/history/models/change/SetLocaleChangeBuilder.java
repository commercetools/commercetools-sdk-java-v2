
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetLocaleChangeBuilder implements Builder<SetLocaleChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetLocaleChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetLocaleChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetLocaleChangeBuilder nextValue(final String nextValue) {
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

    public SetLocaleChange build() {
        Objects.requireNonNull(change, SetLocaleChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetLocaleChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetLocaleChange.class + ": nextValue is missing");
        return new SetLocaleChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetLocaleChange without checking for non null required values
     */
    public SetLocaleChange buildUnchecked() {
        return new SetLocaleChangeImpl(change, previousValue, nextValue);
    }

    public static SetLocaleChangeBuilder of() {
        return new SetLocaleChangeBuilder();
    }

    public static SetLocaleChangeBuilder of(final SetLocaleChange template) {
        SetLocaleChangeBuilder builder = new SetLocaleChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
