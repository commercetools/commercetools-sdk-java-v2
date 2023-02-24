
package com.commercetools.api.models.zone;

import java.util.List;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ZoneMixin extends Referencable<Zone>, ResourceIdentifiable<Zone> {
    public List<Location> getLocations();

    default boolean contains(final String countryCode) {
        return getLocations().stream().anyMatch(location -> location.getCountry().equals(countryCode));
    }

    @Override
    public default ZoneResourceIdentifier toResourceIdentifier() {
        return ZoneResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ZoneReference toReference() {
        return ZoneReference.builder().id(getId()).build();
    }
}
