
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetAnonymousIdChangeBuilder implements Builder<SetAnonymousIdChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetAnonymousIdChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetAnonymousIdChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetAnonymousIdChangeBuilder nextValue(final String nextValue) {
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

    public SetAnonymousIdChange build() {
        Objects.requireNonNull(change, SetAnonymousIdChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetAnonymousIdChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetAnonymousIdChange.class + ": nextValue is missing");
        return new SetAnonymousIdChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetAnonymousIdChange without checking for non null required values
     */
    public SetAnonymousIdChange buildUnchecked() {
        return new SetAnonymousIdChangeImpl(change, previousValue, nextValue);
    }

    public static SetAnonymousIdChangeBuilder of() {
        return new SetAnonymousIdChangeBuilder();
    }

    public static SetAnonymousIdChangeBuilder of(final SetAnonymousIdChange template) {
        SetAnonymousIdChangeBuilder builder = new SetAnonymousIdChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
