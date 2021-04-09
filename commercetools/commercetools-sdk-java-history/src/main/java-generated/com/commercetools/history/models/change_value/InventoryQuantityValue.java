
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = InventoryQuantityValueImpl.class)
public interface InventoryQuantityValue {

    @NotNull
    @JsonProperty("quantityOnStock")
    public Integer getQuantityOnStock();

    @NotNull
    @JsonProperty("availableQuantity")
    public Integer getAvailableQuantity();

    public void setQuantityOnStock(final Integer quantityOnStock);

    public void setAvailableQuantity(final Integer availableQuantity);

    public static InventoryQuantityValue of() {
        return new InventoryQuantityValueImpl();
    }

    public static InventoryQuantityValue of(final InventoryQuantityValue template) {
        InventoryQuantityValueImpl instance = new InventoryQuantityValueImpl();
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    public static InventoryQuantityValueBuilder builder() {
        return InventoryQuantityValueBuilder.of();
    }

    public static InventoryQuantityValueBuilder builder(final InventoryQuantityValue template) {
        return InventoryQuantityValueBuilder.of(template);
    }

    default <T> T withInventoryQuantityValue(Function<InventoryQuantityValue, T> helper) {
        return helper.apply(this);
    }
}
