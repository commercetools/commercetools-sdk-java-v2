
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetValidFromAndUntilChangeBuilder implements Builder<SetValidFromAndUntilChange> {

    private String change;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue;

    private com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue;

    public SetValidFromAndUntilChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetValidFromAndUntilChangeBuilder previousValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public SetValidFromAndUntilChangeBuilder nextValue(
            final com.commercetools.history.models.change_value.ValidFromAndUntilValue nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.change_value.ValidFromAndUntilValue getNextValue() {
        return this.nextValue;
    }

    public SetValidFromAndUntilChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new SetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds SetValidFromAndUntilChange without checking for non null required values
     */
    public SetValidFromAndUntilChange buildUnchecked() {
        return new SetValidFromAndUntilChangeImpl(change, previousValue, nextValue);
    }

    public static SetValidFromAndUntilChangeBuilder of() {
        return new SetValidFromAndUntilChangeBuilder();
    }

    public static SetValidFromAndUntilChangeBuilder of(final SetValidFromAndUntilChange template) {
        SetValidFromAndUntilChangeBuilder builder = new SetValidFromAndUntilChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
