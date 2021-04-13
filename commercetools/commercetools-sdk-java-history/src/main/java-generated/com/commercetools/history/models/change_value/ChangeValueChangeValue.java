
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueAbsoluteChangeValueImpl.class, name = ChangeValueAbsoluteChangeValue.ABSOLUTE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueExternalChangeValueImpl.class, name = ChangeValueExternalChangeValue.EXTERNAL),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueGiftLineItemChangeValueImpl.class, name = ChangeValueGiftLineItemChangeValue.GIFT_LINE_ITEM),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeValueRelativeChangeValueImpl.class, name = ChangeValueRelativeChangeValue.RELATIVE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ChangeValueChangeValueImpl.class, visible = true)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChangeValueChangeValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withChangeValueChangeValue(Function<ChangeValueChangeValue, T> helper) {
        return helper.apply(this);
    }
}
