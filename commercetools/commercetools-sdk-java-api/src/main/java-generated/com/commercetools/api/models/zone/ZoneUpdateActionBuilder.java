
package com.commercetools.api.models.zone;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ZoneUpdateActionBuilder {

    public com.commercetools.api.models.zone.ZoneAddLocationActionBuilder addLocationBuilder() {
        return com.commercetools.api.models.zone.ZoneAddLocationActionBuilder.of();
    }

    public com.commercetools.api.models.zone.ZoneChangeNameActionBuilder changeNameBuilder() {
        return com.commercetools.api.models.zone.ZoneChangeNameActionBuilder.of();
    }

    public com.commercetools.api.models.zone.ZoneRemoveLocationActionBuilder removeLocationBuilder() {
        return com.commercetools.api.models.zone.ZoneRemoveLocationActionBuilder.of();
    }

    public com.commercetools.api.models.zone.ZoneSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.zone.ZoneSetDescriptionActionBuilder.of();
    }

    public com.commercetools.api.models.zone.ZoneSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.zone.ZoneSetKeyActionBuilder.of();
    }

    public static ZoneUpdateActionBuilder of() {
        return new ZoneUpdateActionBuilder();
    }
}
