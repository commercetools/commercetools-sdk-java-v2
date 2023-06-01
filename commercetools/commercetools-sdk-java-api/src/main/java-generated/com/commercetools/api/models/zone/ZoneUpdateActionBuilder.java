package com.commercetools.api.models.zone;

import com.commercetools.api.models.zone.ZoneAddLocationAction;
import com.commercetools.api.models.zone.ZoneChangeNameAction;
import com.commercetools.api.models.zone.ZoneRemoveLocationAction;
import com.commercetools.api.models.zone.ZoneSetDescriptionAction;
import com.commercetools.api.models.zone.ZoneSetKeyAction;
import com.commercetools.api.models.zone.ZoneUpdateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ZoneUpdateActionBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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

    /**
     * factory method for an instance of ZoneUpdateActionBuilder
     * @return builder 
     */
    public static ZoneUpdateActionBuilder of() {
        return new ZoneUpdateActionBuilder();
    }

}
