
package com.commercetools.api.models.zone;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class LocationBuilder {

    private String country;

    @Nullable
    private String state;

    public LocationBuilder country(final String country) {
        this.country = country;
        return this;
    }

    public LocationBuilder state(@Nullable final String state) {
        this.state = state;
        return this;
    }

    public String getCountry() {
        return this.country;
    }

    @Nullable
    public String getState() {
        return this.state;
    }

    public Location build() {
        return new LocationImpl(country, state);
    }

    public static LocationBuilder of() {
        return new LocationBuilder();
    }

    public static LocationBuilder of(final Location template) {
        LocationBuilder builder = new LocationBuilder();
        builder.country = template.getCountry();
        builder.state = template.getState();
        return builder;
    }

}
