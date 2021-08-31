
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeSortOrderChangeBuilder implements Builder<ChangeSortOrderChange> {

    private String change;

    private String previousValue;

    private String nextValue;

    public ChangeSortOrderChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public ChangeSortOrderChangeBuilder previousValue(final String previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public ChangeSortOrderChangeBuilder nextValue(final String nextValue) {
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

    public ChangeSortOrderChange build() {
        Objects.requireNonNull(change, ChangeSortOrderChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, ChangeSortOrderChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, ChangeSortOrderChange.class + ": nextValue is missing");
        return new ChangeSortOrderChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds ChangeSortOrderChange without checking for non null required values
     */
    public ChangeSortOrderChange buildUnchecked() {
        return new ChangeSortOrderChangeImpl(change, previousValue, nextValue);
    }

    public static ChangeSortOrderChangeBuilder of() {
        return new ChangeSortOrderChangeBuilder();
    }

    public static ChangeSortOrderChangeBuilder of(final ChangeSortOrderChange template) {
        ChangeSortOrderChangeBuilder builder = new ChangeSortOrderChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
