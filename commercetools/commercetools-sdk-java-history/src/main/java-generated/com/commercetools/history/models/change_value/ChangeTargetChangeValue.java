
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetCustomLineItemsChangeValueImpl.class, name = ChangeTargetCustomLineItemsChangeValue.CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetLineItemsChangeValueImpl.class, name = ChangeTargetLineItemsChangeValue.LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetMultiBuyCustomLineItemsChangeValueImpl.class, name = ChangeTargetMultiBuyCustomLineItemsChangeValue.MULTI_BUY_CUSTOM_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetMultiBuyLineItemsChangeValueImpl.class, name = ChangeTargetMultiBuyLineItemsChangeValue.MULTI_BUY_LINE_ITEMS),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change_value.ChangeTargetShippingChangeValueImpl.class, name = ChangeTargetShippingChangeValue.SHIPPING) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ChangeTargetChangeValueImpl.class, visible = true)
@JsonDeserialize(as = ChangeTargetChangeValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface ChangeTargetChangeValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    default <T> T withChangeTargetChangeValue(Function<ChangeTargetChangeValue, T> helper) {
        return helper.apply(this);
    }
}
