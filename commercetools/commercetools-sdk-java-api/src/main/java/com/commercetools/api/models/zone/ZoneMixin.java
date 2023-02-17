
package com.commercetools.api.models.zone;

import com.commercetools.api.models.Referencable;
import com.commercetools.api.models.ResourceIdentifiable;

public interface ZoneMixin extends Referencable<Zone>, ResourceIdentifiable<Zone> {
    @Override
    public default ZoneResourceIdentifier toResourceIdentifier() {
        return ZoneResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default ZoneReference toReference() {
        return ZoneReference.builder().id(getId()).build();
    }
}
