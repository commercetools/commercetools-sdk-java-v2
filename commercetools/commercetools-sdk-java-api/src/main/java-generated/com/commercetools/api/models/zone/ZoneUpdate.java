
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneUpdateImpl.class)
public interface ZoneUpdate extends com.commercetools.api.models.ResourceUpdate<ZoneUpdate, ZoneUpdateAction> {

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<ZoneUpdateAction> getActions();

    public void setVersion(final Long version);

    @JsonIgnore
    public void setActions(final ZoneUpdateAction... actions);

    public void setActions(final List<ZoneUpdateAction> actions);

    public static ZoneUpdate of() {
        return new ZoneUpdateImpl();
    }

    public static ZoneUpdate of(final ZoneUpdate template) {
        ZoneUpdateImpl instance = new ZoneUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static ZoneUpdateBuilder builder() {
        return ZoneUpdateBuilder.of();
    }

    public static ZoneUpdateBuilder builder(final ZoneUpdate template) {
        return ZoneUpdateBuilder.of(template);
    }

    default <T> T withZoneUpdate(Function<ZoneUpdate, T> helper) {
        return helper.apply(this);
    }
}
