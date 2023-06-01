package com.commercetools.history.models.change_value;


import com.commercetools.history.models.change_value.InventoryQuantityValueImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = InventoryQuantityValueImpl.class)
public interface InventoryQuantityValue  {


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

    /**
     * set quantityOnStock
     * @param quantityOnStock value to be set
     */
    
    public void setQuantityOnStock(final Integer quantityOnStock);
    
    
    /**
     * set availableQuantity
     * @param availableQuantity value to be set
     */
    
    public void setAvailableQuantity(final Integer availableQuantity);
    

    /**
     * factory method
     * @return instance of InventoryQuantityValue
     */
    public static InventoryQuantityValue of(){
        return new InventoryQuantityValueImpl();
    }
    

    /**
     * factory method to create a shallow copy InventoryQuantityValue
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryQuantityValue of(final InventoryQuantityValue template) {
        InventoryQuantityValueImpl instance = new InventoryQuantityValueImpl();
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    /**
     * factory method to create a deep copy of InventoryQuantityValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryQuantityValue deepCopy(@Nullable final InventoryQuantityValue template) {
        if (template == null) {
            return null;
        }
        InventoryQuantityValueImpl instance = new InventoryQuantityValueImpl();
        instance.setQuantityOnStock(template.getQuantityOnStock());
        instance.setAvailableQuantity(template.getAvailableQuantity());
        return instance;
    }

    /**
     * builder factory method for InventoryQuantityValue
     * @return builder
     */
    public static InventoryQuantityValueBuilder builder() {
        return InventoryQuantityValueBuilder.of();
    }
    
    /**
     * create builder for InventoryQuantityValue instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryQuantityValueBuilder builder(final InventoryQuantityValue template) {
        return InventoryQuantityValueBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryQuantityValue(Function<InventoryQuantityValue, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryQuantityValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryQuantityValue>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryQuantityValue>";
            }
        };
    }
}
