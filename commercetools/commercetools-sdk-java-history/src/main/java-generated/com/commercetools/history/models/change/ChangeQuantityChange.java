
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.InventoryQuantityValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Update action for <code>changeQuantity</code> on inventories</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeQuantityChangeImpl.class)
public interface ChangeQuantityChange extends Change {

    String CHANGE_QUANTITY_CHANGE = "ChangeQuantityChange";

    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public InventoryQuantityValue getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public InventoryQuantityValue getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final InventoryQuantityValue nextValue);

    public void setPreviousValue(final InventoryQuantityValue previousValue);

    public static ChangeQuantityChange of() {
        return new ChangeQuantityChangeImpl();
    }

    public static ChangeQuantityChange of(final ChangeQuantityChange template) {
        ChangeQuantityChangeImpl instance = new ChangeQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeQuantityChangeBuilder builder() {
        return ChangeQuantityChangeBuilder.of();
    }

    public static ChangeQuantityChangeBuilder builder(final ChangeQuantityChange template) {
        return ChangeQuantityChangeBuilder.of(template);
    }

    default <T> T withChangeQuantityChange(Function<ChangeQuantityChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeQuantityChange>";
            }
        };
    }
}
