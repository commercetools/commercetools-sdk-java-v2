
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetDescriptionChangeBuilder implements Builder<SetDescriptionChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public SetDescriptionChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetDescriptionChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetDescriptionChangeBuilder nextValue(final String nextValue) {
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

    public SetDescriptionChange build() {
        Objects.requireNonNull(change, SetDescriptionChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, SetDescriptionChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, SetDescriptionChange.class + ": nextValue is missing");
        return new SetDescriptionChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetDescriptionChange without checking for non null required values
     */
    public SetDescriptionChange buildUnchecked() {
        return new SetDescriptionChangeImpl(change, previousValue, nextValue);
    }

    public static SetDescriptionChangeBuilder of() {
        return new SetDescriptionChangeBuilder();
    }

    public static SetDescriptionChangeBuilder of(final SetDescriptionChange template) {
        SetDescriptionChangeBuilder builder = new SetDescriptionChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
