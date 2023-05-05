
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetPurchaseOrderNumberChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPurchaseOrderNumberChange setPurchaseOrderNumberChange = SetPurchaseOrderNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPurchaseOrderNumberChangeImpl.class)
public interface SetPurchaseOrderNumberChange extends Change {

    /**
     * discriminator value for SetPurchaseOrderNumberChange
     */
    String SET_PURCHASE_ORDER_NUMBER_CHANGE = "SetPurchaseOrderNumberChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setPurchaseOrderNumber</code>.</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Purchase Order number prior to the update action.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Purchase Order number after the update action.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Update action for <code>setPurchaseOrderNumber</code>.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Purchase Order number prior to the update action.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Purchase Order number after the update action.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetPurchaseOrderNumberChange
     */
    public static SetPurchaseOrderNumberChange of() {
        return new SetPurchaseOrderNumberChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetPurchaseOrderNumberChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPurchaseOrderNumberChange of(final SetPurchaseOrderNumberChange template) {
        SetPurchaseOrderNumberChangeImpl instance = new SetPurchaseOrderNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetPurchaseOrderNumberChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPurchaseOrderNumberChange deepCopy(@Nullable final SetPurchaseOrderNumberChange template) {
        if (template == null) {
            return null;
        }
        SetPurchaseOrderNumberChangeImpl instance = new SetPurchaseOrderNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetPurchaseOrderNumberChange
     * @return builder
     */
    public static SetPurchaseOrderNumberChangeBuilder builder() {
        return SetPurchaseOrderNumberChangeBuilder.of();
    }

    /**
     * create builder for SetPurchaseOrderNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPurchaseOrderNumberChangeBuilder builder(final SetPurchaseOrderNumberChange template) {
        return SetPurchaseOrderNumberChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPurchaseOrderNumberChange(Function<SetPurchaseOrderNumberChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPurchaseOrderNumberChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPurchaseOrderNumberChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPurchaseOrderNumberChange>";
            }
        };
    }
}
