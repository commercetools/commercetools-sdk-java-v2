
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelChangeValueImpl.class)
public interface ParcelChangeValue {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("createdAt")
    public String getCreatedAt();

    public void setId(final String id);

    public void setCreatedAt(final String createdAt);

    public static ParcelChangeValue of() {
        return new ParcelChangeValueImpl();
    }

    public static ParcelChangeValue of(final ParcelChangeValue template) {
        ParcelChangeValueImpl instance = new ParcelChangeValueImpl();
        instance.setId(template.getId());
        instance.setCreatedAt(template.getCreatedAt());
        return instance;
    }

    public static ParcelChangeValueBuilder builder() {
        return ParcelChangeValueBuilder.of();
    }

    public static ParcelChangeValueBuilder builder(final ParcelChangeValue template) {
        return ParcelChangeValueBuilder.of(template);
    }

    default <T> T withParcelChangeValue(Function<ParcelChangeValue, T> helper) {
        return helper.apply(this);
    }
}
