
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for product discounts external value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeValueExternalChangeValueImpl.class)
public interface ChangeValueExternalChangeValue extends ChangeValueChangeValue {

    String EXTERNAL = "external";

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static ChangeValueExternalChangeValue of() {
        return new ChangeValueExternalChangeValueImpl();
    }

    public static ChangeValueExternalChangeValue of(final ChangeValueExternalChangeValue template) {
        ChangeValueExternalChangeValueImpl instance = new ChangeValueExternalChangeValueImpl();
        return instance;
    }

    public static ChangeValueExternalChangeValueBuilder builder() {
        return ChangeValueExternalChangeValueBuilder.of();
    }

    public static ChangeValueExternalChangeValueBuilder builder(final ChangeValueExternalChangeValue template) {
        return ChangeValueExternalChangeValueBuilder.of(template);
    }

    default <T> T withChangeValueExternalChangeValue(Function<ChangeValueExternalChangeValue, T> helper) {
        return helper.apply(this);
    }
}
