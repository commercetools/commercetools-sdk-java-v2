
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryQuantityValue
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryQuantityValue inventoryQuantityValue = InventoryQuantityValue.builder()
 *             .quantityOnStock(1)
 *             .availableQuantity(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryQuantityValueImpl.class)
public interface InventoryQuantityValue {

    /**
     *
     * @return quantityOnStock
     */
    @NotNull
    @JsonProperty("quantityOnStock")
    public Integer getQuantityOnStock();

    /**
     *
     * @return availableQuantity
     */
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

    public static com.fasterxml.jackson.core.type.TypeReference<InventoryQuantityValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryQuantityValue>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryQuantityValue>";
            }
        };
    }
}
