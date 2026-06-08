
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetInventoryLimitsAction" rel="nofollow">Set Inventory Limits</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMaxCartQuantityChange setMaxCartQuantityChange = SetMaxCartQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMaxCartQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMaxCartQuantityChangeImpl.class)
public interface SetMaxCartQuantityChange extends Change {

    /**
     * discriminator value for SetMaxCartQuantityChange
     */
    String SET_MAX_CART_QUANTITY_CHANGE = "SetMaxCartQuantityChange";

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
    @JsonProperty("previousValue")
    public Integer getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Integer getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Integer previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Integer nextValue);

    /**
     * factory method
     * @return instance of SetMaxCartQuantityChange
     */
    public static SetMaxCartQuantityChange of() {
        return new SetMaxCartQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMaxCartQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMaxCartQuantityChange of(final SetMaxCartQuantityChange template) {
        SetMaxCartQuantityChangeImpl instance = new SetMaxCartQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMaxCartQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of SetMaxCartQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMaxCartQuantityChange deepCopy(@Nullable final SetMaxCartQuantityChange template) {
        if (template == null) {
            return null;
        }
        SetMaxCartQuantityChangeImpl instance = new SetMaxCartQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMaxCartQuantityChange
     * @return builder
     */
    public static SetMaxCartQuantityChangeBuilder builder() {
        return SetMaxCartQuantityChangeBuilder.of();
    }

    /**
     * create builder for SetMaxCartQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMaxCartQuantityChangeBuilder builder(final SetMaxCartQuantityChange template) {
        return SetMaxCartQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMaxCartQuantityChange(Function<SetMaxCartQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMaxCartQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMaxCartQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMaxCartQuantityChange>";
            }
        };
    }
}
