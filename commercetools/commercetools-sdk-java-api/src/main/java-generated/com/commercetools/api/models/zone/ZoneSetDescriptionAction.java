
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneSetDescriptionActionImpl.class)
public interface ZoneSetDescriptionAction extends ZoneUpdateAction {

    String SET_DESCRIPTION = "setDescription";

    /**
    *  <p>Description of the Zone.</p>
    */

    @JsonProperty("description")
    public String getDescription();

    public void setDescription(final String description);

    public static ZoneSetDescriptionAction of() {
        return new ZoneSetDescriptionActionImpl();
    }

    public static ZoneSetDescriptionAction of(final ZoneSetDescriptionAction template) {
        ZoneSetDescriptionActionImpl instance = new ZoneSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static ZoneSetDescriptionActionBuilder builder() {
        return ZoneSetDescriptionActionBuilder.of();
    }

    public static ZoneSetDescriptionActionBuilder builder(final ZoneSetDescriptionAction template) {
        return ZoneSetDescriptionActionBuilder.of(template);
    }

    default <T> T withZoneSetDescriptionAction(Function<ZoneSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneSetDescriptionAction>";
            }
        };
    }
}
