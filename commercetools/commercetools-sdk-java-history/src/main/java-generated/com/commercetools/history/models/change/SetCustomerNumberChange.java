
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
 *  <p>Change triggered by the Set Customer Number update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerNumberChange setCustomerNumberChange = SetCustomerNumberChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerNumberChangeImpl.class)
public interface SetCustomerNumberChange extends Change {

    /**
     * discriminator value for SetCustomerNumberChange
     */
    String SET_CUSTOMER_NUMBER_CHANGE = "SetCustomerNumberChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetCustomerNumberChange
     */
    public static SetCustomerNumberChange of() {
        return new SetCustomerNumberChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomerNumberChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomerNumberChange of(final SetCustomerNumberChange template) {
        SetCustomerNumberChangeImpl instance = new SetCustomerNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomerNumberChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomerNumberChange deepCopy(@Nullable final SetCustomerNumberChange template) {
        if (template == null) {
            return null;
        }
        SetCustomerNumberChangeImpl instance = new SetCustomerNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomerNumberChange
     * @return builder
     */
    public static SetCustomerNumberChangeBuilder builder() {
        return SetCustomerNumberChangeBuilder.of();
    }

    /**
     * create builder for SetCustomerNumberChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerNumberChangeBuilder builder(final SetCustomerNumberChange template) {
        return SetCustomerNumberChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomerNumberChange(Function<SetCustomerNumberChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerNumberChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerNumberChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerNumberChange>";
            }
        };
    }
}
