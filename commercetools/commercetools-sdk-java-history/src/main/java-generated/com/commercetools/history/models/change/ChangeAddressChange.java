
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
@JsonDeserialize(as = ChangeAddressChangeImpl.class)
public interface ChangeAddressChange extends Change {

    String CHANGE_ADDRESS_CHANGE = "ChangeAddressChange";

    /**
    *  <p>Update action <code>changeAddress</code> action.</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final Address nextValue);

    public void setPreviousValue(final Address previousValue);

    public static ChangeAddressChange of() {
        return new ChangeAddressChangeImpl();
    }

    public static ChangeAddressChange of(final ChangeAddressChange template) {
        ChangeAddressChangeImpl instance = new ChangeAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeAddressChangeBuilder builder() {
        return ChangeAddressChangeBuilder.of();
    }

    public static ChangeAddressChangeBuilder builder(final ChangeAddressChange template) {
        return ChangeAddressChangeBuilder.of(template);
    }

    default <T> T withChangeAddressChange(Function<ChangeAddressChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAddressChange>";
            }
        };
    }
}
