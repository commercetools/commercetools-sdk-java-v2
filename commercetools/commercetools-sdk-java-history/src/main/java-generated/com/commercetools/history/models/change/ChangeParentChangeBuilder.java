
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeParentChangeBuilder implements Builder<ChangeParentChange> {

    private String change;

    private com.commercetools.history.models.common.Reference previousValue;

    private com.commercetools.history.models.common.Reference nextValue;

    public ChangeParentChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeParentChangeBuilder previousValue(
            final com.commercetools.history.models.common.Reference previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeParentChangeBuilder nextValue(final com.commercetools.history.models.common.Reference nextValue) {
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

    public ChangeParentChange build() {
        Objects.requireNonNull(change);
        Objects.requireNonNull(previousValue);
        Objects.requireNonNull(nextValue);
        return new ChangeParentChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeParentChange without checking for non null required values
     */
    public ChangeParentChange buildUnchecked() {
        return new ChangeParentChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeParentChangeBuilder of() {
        return new ChangeParentChangeBuilder();
    }

    public static ChangeParentChangeBuilder of(final ChangeParentChange template) {
        ChangeParentChangeBuilder builder = new ChangeParentChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
