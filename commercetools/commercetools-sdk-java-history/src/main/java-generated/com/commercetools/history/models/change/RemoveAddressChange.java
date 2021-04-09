
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveAddressChangeImpl.class)
public interface RemoveAddressChange extends Change {

    String REMOVE_ADDRESS_CHANGE = "RemoveAddressChange";

    /**
    *  <p>Update action for <code>removeAddress</code> action.</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final Address previousValue);

    public static RemoveAddressChange of() {
        return new RemoveAddressChangeImpl();
    }

    public static RemoveAddressChange of(final RemoveAddressChange template) {
        RemoveAddressChangeImpl instance = new RemoveAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveAddressChangeBuilder builder() {
        return RemoveAddressChangeBuilder.of();
    }

    public static RemoveAddressChangeBuilder builder(final RemoveAddressChange template) {
        return RemoveAddressChangeBuilder.of(template);
    }

    default <T> T withRemoveAddressChange(Function<RemoveAddressChange, T> helper) {
        return helper.apply(this);
    }
}
