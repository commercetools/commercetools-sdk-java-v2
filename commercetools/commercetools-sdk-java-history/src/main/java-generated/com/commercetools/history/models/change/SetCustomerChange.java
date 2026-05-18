
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * SetCustomerChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerChange setCustomerChange = SetCustomerChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetCustomerChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerChangeImpl.class)
public interface SetCustomerChange extends Change {

    /**
     * discriminator value for SetCustomerChange
     */
    String SET_CUSTOMER_CHANGE = "SetCustomerChange";

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
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of SetCustomerChange
     */
    public static SetCustomerChange of() {
        return new SetCustomerChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomerChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomerChange of(final SetCustomerChange template) {
        SetCustomerChangeImpl instance = new SetCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetCustomerChange copyDeep();

    /**
     * factory method to create a deep copy of SetCustomerChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomerChange deepCopy(@Nullable final SetCustomerChange template) {
        if (template == null) {
            return null;
        }
        SetCustomerChangeImpl instance = new SetCustomerChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for SetCustomerChange
     * @return builder
     */
    public static SetCustomerChangeBuilder builder() {
        return SetCustomerChangeBuilder.of();
    }

    /**
     * create builder for SetCustomerChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerChangeBuilder builder(final SetCustomerChange template) {
        return SetCustomerChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomerChange(Function<SetCustomerChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerChange>";
            }
        };
    }
}
