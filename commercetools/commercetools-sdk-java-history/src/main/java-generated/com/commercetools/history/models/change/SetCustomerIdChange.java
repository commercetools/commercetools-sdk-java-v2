
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Customer ID on Orders.</li>
 *   <li>Set Customer ID on Staged Orders.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerIdChange setCustomerIdChange = SetCustomerIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomerIdChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerIdChangeImpl.class)
public interface SetCustomerIdChange extends Change {

    /**
     * discriminator value for SetCustomerIdChange
     */
    String SET_CUSTOMER_ID_CHANGE = "SetCustomerIdChange";

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
     * @return instance of SetCustomerIdChange
     */
    public static SetCustomerIdChange of() {
        return new SetCustomerIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomerIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomerIdChange of(final SetCustomerIdChange template) {
        SetCustomerIdChangeImpl instance = new SetCustomerIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCustomerIdChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomerIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomerIdChange deepCopy(@Nullable final SetCustomerIdChange template) {
        if (template == null) {
            return null;
        }
        SetCustomerIdChangeImpl instance = new SetCustomerIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomerIdChange
     * @return builder
     */
    public static SetCustomerIdChangeBuilder builder() {
        return SetCustomerIdChangeBuilder.of();
    }

    /**
     * create builder for SetCustomerIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerIdChangeBuilder builder(final SetCustomerIdChange template) {
        return SetCustomerIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomerIdChange(Function<SetCustomerIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerIdChange>";
            }
        };
    }
}
