
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAccountAction" rel="nofollow">Set MethodInfoInterfaceAccount</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoInterfaceAccountChange setMethodInfoInterfaceAccountChange = SetMethodInfoInterfaceAccountChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMethodInfoInterfaceAccountChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoInterfaceAccountChangeImpl.class)
public interface SetMethodInfoInterfaceAccountChange extends Change {

    /**
     * discriminator value for SetMethodInfoInterfaceAccountChange
     */
    String SET_METHOD_INFO_INTERFACE_ACCOUNT_CHANGE = "SetMethodInfoInterfaceAccountChange";

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
     * @return instance of SetMethodInfoInterfaceAccountChange
     */
    public static SetMethodInfoInterfaceAccountChange of() {
        return new SetMethodInfoInterfaceAccountChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMethodInfoInterfaceAccountChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoInterfaceAccountChange of(final SetMethodInfoInterfaceAccountChange template) {
        SetMethodInfoInterfaceAccountChangeImpl instance = new SetMethodInfoInterfaceAccountChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMethodInfoInterfaceAccountChange copyDeep();

    /**
     * factory method to create a deep copy of SetMethodInfoInterfaceAccountChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMethodInfoInterfaceAccountChange deepCopy(
            @Nullable final SetMethodInfoInterfaceAccountChange template) {
        if (template == null) {
            return null;
        }
        SetMethodInfoInterfaceAccountChangeImpl instance = new SetMethodInfoInterfaceAccountChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoInterfaceAccountChange
     * @return builder
     */
    public static SetMethodInfoInterfaceAccountChangeBuilder builder() {
        return SetMethodInfoInterfaceAccountChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoInterfaceAccountChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoInterfaceAccountChangeBuilder builder(
            final SetMethodInfoInterfaceAccountChange template) {
        return SetMethodInfoInterfaceAccountChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoInterfaceAccountChange(Function<SetMethodInfoInterfaceAccountChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<SetMethodInfoInterfaceAccountChange> typeReference() {
        return new tools.jackson.core.type.TypeReference<SetMethodInfoInterfaceAccountChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoInterfaceAccountChange>";
            }
        };
    }
}
