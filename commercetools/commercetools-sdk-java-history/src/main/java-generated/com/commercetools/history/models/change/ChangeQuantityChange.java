
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.InventoryQuantityValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Change Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeQuantityChange changeQuantityChange = ChangeQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeQuantityChangeImpl.class)
public interface ChangeQuantityChange extends Change {

    /**
     * discriminator value for ChangeQuantityChange
     */
    String CHANGE_QUANTITY_CHANGE = "ChangeQuantityChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public InventoryQuantityValue getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public InventoryQuantityValue getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final InventoryQuantityValue previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final InventoryQuantityValue nextValue);

    /**
     * factory method
     * @return instance of ChangeQuantityChange
     */
    public static ChangeQuantityChange of() {
        return new ChangeQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeQuantityChange of(final ChangeQuantityChange template) {
        ChangeQuantityChangeImpl instance = new ChangeQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeQuantityChange deepCopy(@Nullable final ChangeQuantityChange template) {
        if (template == null) {
            return null;
        }
        ChangeQuantityChangeImpl instance = new ChangeQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.InventoryQuantityValue.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.change_value.InventoryQuantityValue.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ChangeQuantityChange
     * @return builder
     */
    public static ChangeQuantityChangeBuilder builder() {
        return ChangeQuantityChangeBuilder.of();
    }

    /**
     * create builder for ChangeQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeQuantityChangeBuilder builder(final ChangeQuantityChange template) {
        return ChangeQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeQuantityChange(Function<ChangeQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeQuantityChange>";
            }
        };
    }
}
