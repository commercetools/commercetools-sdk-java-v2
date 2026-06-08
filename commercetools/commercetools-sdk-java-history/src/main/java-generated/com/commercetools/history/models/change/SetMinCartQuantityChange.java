
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
 *     SetMinCartQuantityChange setMinCartQuantityChange = SetMinCartQuantityChange.builder()
 *             .change("{change}")
 *             .previousValue(1)
 *             .nextValue(1)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMinCartQuantityChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMinCartQuantityChangeImpl.class)
public interface SetMinCartQuantityChange extends Change {

    /**
     * discriminator value for SetMinCartQuantityChange
     */
    String SET_MIN_CART_QUANTITY_CHANGE = "SetMinCartQuantityChange";

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
     * @return instance of SetMinCartQuantityChange
     */
    public static SetMinCartQuantityChange of() {
        return new SetMinCartQuantityChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMinCartQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMinCartQuantityChange of(final SetMinCartQuantityChange template) {
        SetMinCartQuantityChangeImpl instance = new SetMinCartQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMinCartQuantityChange copyDeep();

    /**
     * factory method to create a deep copy of SetMinCartQuantityChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMinCartQuantityChange deepCopy(@Nullable final SetMinCartQuantityChange template) {
        if (template == null) {
            return null;
        }
        SetMinCartQuantityChangeImpl instance = new SetMinCartQuantityChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMinCartQuantityChange
     * @return builder
     */
    public static SetMinCartQuantityChangeBuilder builder() {
        return SetMinCartQuantityChangeBuilder.of();
    }

    /**
     * create builder for SetMinCartQuantityChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMinCartQuantityChangeBuilder builder(final SetMinCartQuantityChange template) {
        return SetMinCartQuantityChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMinCartQuantityChange(Function<SetMinCartQuantityChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMinCartQuantityChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMinCartQuantityChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMinCartQuantityChange>";
            }
        };
    }
}
