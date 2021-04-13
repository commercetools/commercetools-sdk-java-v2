
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class SetGeoLocationChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.GeoLocation nextValue;

    private com.commercetools.history.models.common.GeoLocation previousValue;

    public SetGeoLocationChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public SetGeoLocationChangeBuilder nextValue(final com.commercetools.history.models.common.GeoLocation nextValue) {
        this.nextValue = nextValue;
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
