
package com.commercetools.api.models.zone;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

import java.util.List;
import java.util.Set;

public interface ZoneMixin extends Referencable<Zone>, ResourceIdentifiable<Zone> {
    List<Location> getLocations();

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
