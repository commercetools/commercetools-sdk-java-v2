
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetCustomerGroupChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerGroupChange setCustomerGroupChange = SetCustomerGroupChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerGroupChangeImpl.class)
public interface SetCustomerGroupChange extends Change {

    /**
     * discriminator value for SetCustomerGroupChange
     */
    String SET_CUSTOMER_GROUP_CHANGE = "SetCustomerGroupChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setCustomerGroup</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     *  <p>Shape of the action for <code>setCustomerGroup</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of SetCustomerGroupChange
     */
    public static SetCustomerGroupChange of() {
        return new SetCustomerGroupChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomerGroupChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomerGroupChange of(final SetCustomerGroupChange template) {
        SetCustomerGroupChangeImpl instance = new SetCustomerGroupChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomerGroupChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomerGroupChange deepCopy(@Nullable final SetCustomerGroupChange template) {
        if (template == null) {
            return null;
        }
        SetCustomerGroupChangeImpl instance = new SetCustomerGroupChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(com.commercetools.history.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(com.commercetools.history.models.common.Reference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetCustomerGroupChange
     * @return builder
     */
    public static SetCustomerGroupChangeBuilder builder() {
        return SetCustomerGroupChangeBuilder.of();
    }

    /**
     * create builder for SetCustomerGroupChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerGroupChangeBuilder builder(final SetCustomerGroupChange template) {
        return SetCustomerGroupChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomerGroupChange(Function<SetCustomerGroupChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerGroupChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerGroupChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerGroupChange>";
            }
        };
    }
}
