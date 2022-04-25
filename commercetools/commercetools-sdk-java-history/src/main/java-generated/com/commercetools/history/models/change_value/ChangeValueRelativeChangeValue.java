
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts relative value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeValueRelativeChangeValueImpl.class)
public interface ChangeValueRelativeChangeValue extends ChangeValueChangeValue {

    String RELATIVE = "relative";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("permyriad")
    public Integer getPermyriad();

    public void setPermyriad(final Integer permyriad);

    public static ChangeValueRelativeChangeValue of() {
        return new ChangeValueRelativeChangeValueImpl();
    }

    public static ChangeValueRelativeChangeValue of(final ChangeValueRelativeChangeValue template) {
        ChangeValueRelativeChangeValueImpl instance = new ChangeValueRelativeChangeValueImpl();
        instance.setPermyriad(template.getPermyriad());
        return instance;
    }

    public static ChangeValueRelativeChangeValueBuilder builder() {
        return ChangeValueRelativeChangeValueBuilder.of();
    }

    public static ChangeValueRelativeChangeValueBuilder builder(final ChangeValueRelativeChangeValue template) {
        return ChangeValueRelativeChangeValueBuilder.of(template);
    }

    default <T> T withChangeValueRelativeChangeValue(Function<ChangeValueRelativeChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueRelativeChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueRelativeChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueRelativeChangeValue>";
            }
        };
    }
}
