
package com.commercetools.api.models.zone;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ZoneReferenceImpl.class)
public interface ZoneReference extends Reference {

    String ZONE = "zone";

    @Valid
    @JsonProperty("obj")
    public Zone getObj();

    public void setObj(final Zone obj);

    public static ZoneReference of() {
        return new ZoneReferenceImpl();
    }

    public static ZoneReference of(final ZoneReference template) {
        ZoneReferenceImpl instance = new ZoneReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public static ZoneReferenceBuilder builder() {
        return ZoneReferenceBuilder.of();
    }

    public static ZoneReferenceBuilder builder(final ZoneReference template) {
        return ZoneReferenceBuilder.of(template);
    }

    default <T> T withZoneReference(Function<ZoneReference, T> helper) {
        return helper.apply(this);
    }
}
