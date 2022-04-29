
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
@JsonDeserialize(as = RemoveShippingAddressIdChangeImpl.class)
public interface RemoveShippingAddressIdChange extends Change {

    String REMOVE_SHIPPING_ADDRESS_ID_CHANGE = "RemoveShippingAddressIdChange";

    /**
    *  <p>Update action for <code>removeShippingAddressId</code> action on customers.</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setChange(final String change);

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    public void setNextValue(final List<String> nextValue);

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    public void setPreviousValue(final List<String> previousValue);

    public void setAddress(final Address address);

    public static RemoveShippingAddressIdChange of() {
        return new RemoveShippingAddressIdChangeImpl();
    }

    public static RemoveShippingAddressIdChange of(final RemoveShippingAddressIdChange template) {
        RemoveShippingAddressIdChangeImpl instance = new RemoveShippingAddressIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static RemoveShippingAddressIdChangeBuilder builder() {
        return RemoveShippingAddressIdChangeBuilder.of();
    }

    public static RemoveShippingAddressIdChangeBuilder builder(final RemoveShippingAddressIdChange template) {
        return RemoveShippingAddressIdChangeBuilder.of(template);
    }

    default <T> T withRemoveShippingAddressIdChange(Function<RemoveShippingAddressIdChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveShippingAddressIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveShippingAddressIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveShippingAddressIdChange>";
            }
        };
    }
}
