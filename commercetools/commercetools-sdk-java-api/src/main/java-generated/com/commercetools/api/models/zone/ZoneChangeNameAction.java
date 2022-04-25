
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneChangeNameActionImpl.class)
public interface ZoneChangeNameAction extends ZoneUpdateAction {

    String CHANGE_NAME = "changeName";

    /**
    *  <p>New name of the Zone.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    public void setName(final String name);

    public static ZoneChangeNameAction of() {
        return new ZoneChangeNameActionImpl();
    }

    public static ZoneChangeNameAction of(final ZoneChangeNameAction template) {
        ZoneChangeNameActionImpl instance = new ZoneChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public static ZoneChangeNameActionBuilder builder() {
        return ZoneChangeNameActionBuilder.of();
    }

    public static ZoneChangeNameActionBuilder builder(final ZoneChangeNameAction template) {
        return ZoneChangeNameActionBuilder.of(template);
    }

    default <T> T withZoneChangeNameAction(Function<ZoneChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ZoneChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ZoneChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ZoneChangeNameAction>";
            }
        };
    }
}
