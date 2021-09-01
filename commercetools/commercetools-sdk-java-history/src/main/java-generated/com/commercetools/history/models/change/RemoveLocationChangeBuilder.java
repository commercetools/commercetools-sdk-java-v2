
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class RemoveLocationChangeBuilder implements Builder<RemoveLocationChange> {

    private String change;

    private com.commercetools.history.models.common.Location previousValue;

    private com.commercetools.history.models.common.Location nextValue;

    public RemoveLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public RemoveLocationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    public RemoveLocationChangeBuilder previousValue(
            final com.commercetools.history.models.common.Location previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public RemoveLocationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.LocationBuilder, com.commercetools.history.models.common.LocationBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.LocationBuilder.of()).build();
        return this;
    }

    public RemoveLocationChangeBuilder nextValue(final com.commercetools.history.models.common.Location nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.Location getPreviousValue() {
        return this.previousValue;
    }

    public com.commercetools.history.models.common.Location getNextValue() {
        return this.nextValue;
    }

    public RemoveLocationChange build() {
        Objects.requireNonNull(change, RemoveLocationChange.class + ": change is missing");
        Objects.requireNonNull(previousValue, RemoveLocationChange.class + ": previousValue is missing");
        Objects.requireNonNull(nextValue, RemoveLocationChange.class + ": nextValue is missing");
        return new RemoveLocationChangeImpl(change, previousValue, nextValue);
    }

    /**
     * builds RemoveLocationChange without checking for non null required values
     */
    public RemoveLocationChange buildUnchecked() {
        return new RemoveLocationChangeImpl(change, previousValue, nextValue);
    }

    public static RemoveLocationChangeBuilder of() {
        return new RemoveLocationChangeBuilder();
    }

    public static RemoveLocationChangeBuilder of(final RemoveLocationChange template) {
        RemoveLocationChangeBuilder builder = new RemoveLocationChangeBuilder();
        builder.change = template.getChange();
        builder.previousValue = template.getPreviousValue();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
