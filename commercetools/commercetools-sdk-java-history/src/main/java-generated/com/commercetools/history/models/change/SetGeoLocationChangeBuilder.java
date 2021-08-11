
package com.commercetools.history.models.change;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetGeoLocationChangeBuilder implements Builder<SetGeoLocationChange> {

    private String change;

    private com.commercetools.history.models.common.GeoLocation nextValue;

    private com.commercetools.history.models.common.GeoLocation previousValue;

    public SetGeoLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetGeoLocationChangeBuilder nextValue(
            Function<com.commercetools.history.models.common.GeoLocationBuilder, com.commercetools.history.models.common.GeoLocationBuilder> builder) {
        this.nextValue = builder.apply(com.commercetools.history.models.common.GeoLocationBuilder.of()).build();
        return this;
    }

    public SetGeoLocationChangeBuilder nextValue(final com.commercetools.history.models.common.GeoLocation nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public SetGeoLocationChangeBuilder previousValue(
            Function<com.commercetools.history.models.common.GeoLocationBuilder, com.commercetools.history.models.common.GeoLocationBuilder> builder) {
        this.previousValue = builder.apply(com.commercetools.history.models.common.GeoLocationBuilder.of()).build();
        return this;
    }

    public SetGeoLocationChangeBuilder previousValue(
            final com.commercetools.history.models.common.GeoLocation previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.GeoLocation getNextValue() {
        return this.nextValue;
    }

    public com.commercetools.history.models.common.GeoLocation getPreviousValue() {
        return this.previousValue;
    }

    public SetGeoLocationChange build() {
        Objects.requireNonNull(change, SetGeoLocationChange.class + ": change is missing");
        Objects.requireNonNull(nextValue, SetGeoLocationChange.class + ": nextValue is missing");
        Objects.requireNonNull(previousValue, SetGeoLocationChange.class + ": previousValue is missing");
        return new SetGeoLocationChangeImpl(change, nextValue, previousValue);
    }

    /**
     * builds SetGeoLocationChange without checking for non null required values
     */
    public SetGeoLocationChange buildUnchecked() {
        return new SetGeoLocationChangeImpl(change, nextValue, previousValue);
    }

    public static SetGeoLocationChangeBuilder of() {
        return new SetGeoLocationChangeBuilder();
    }

    public static SetGeoLocationChangeBuilder of(final SetGeoLocationChange template) {
        SetGeoLocationChangeBuilder builder = new SetGeoLocationChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
