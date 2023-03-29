
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
 * SetCustomerEmailChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetCustomerEmailChange setCustomerEmailChange = SetCustomerEmailChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetCustomerEmailChangeImpl.class)
public interface SetCustomerEmailChange extends Change {

    /**
     * discriminator value for SetCustomerEmailChange
     */
    String SET_CUSTOMER_EMAIL_CHANGE = "SetCustomerEmailChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setCustomerEmail</code></p>
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
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Shape of the action for <code>setCustomerEmail</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final String nextValue);

    /**
     * factory method
     * @return instance of SetCustomerEmailChange
     */
    public static SetCustomerEmailChange of() {
        return new SetCustomerEmailChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetCustomerEmailChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetCustomerEmailChange of(final SetCustomerEmailChange template) {
        SetCustomerEmailChangeImpl instance = new SetCustomerEmailChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetCustomerEmailChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetCustomerEmailChange deepCopy(@Nullable final SetCustomerEmailChange template) {
        if (template == null) {
            return null;
        }
        SetCustomerEmailChangeImpl instance = new SetCustomerEmailChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetCustomerEmailChange
     * @return builder
     */
    public static SetCustomerEmailChangeBuilder builder() {
        return SetCustomerEmailChangeBuilder.of();
    }

    /**
     * create builder for SetCustomerEmailChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetCustomerEmailChangeBuilder builder(final SetCustomerEmailChange template) {
        return SetCustomerEmailChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetCustomerEmailChange(Function<SetCustomerEmailChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerEmailChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerEmailChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerEmailChange>";
            }
        };
    }
}
