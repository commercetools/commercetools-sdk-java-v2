
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
 *  <p>Change triggered by the Set MethodInfoInterface update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetMethodInfoInterfaceChange setMethodInfoInterfaceChange = SetMethodInfoInterfaceChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetMethodInfoInterfaceChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetMethodInfoInterfaceChangeImpl.class)
public interface SetMethodInfoInterfaceChange extends Change {

    /**
     * discriminator value for SetMethodInfoInterfaceChange
     */
    String SET_METHOD_INFO_INTERFACE_CHANGE = "SetMethodInfoInterfaceChange";

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
     * @return instance of SetMethodInfoInterfaceChange
     */
    public static SetMethodInfoInterfaceChange of() {
        return new SetMethodInfoInterfaceChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetMethodInfoInterfaceChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetMethodInfoInterfaceChange of(final SetMethodInfoInterfaceChange template) {
        SetMethodInfoInterfaceChangeImpl instance = new SetMethodInfoInterfaceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetMethodInfoInterfaceChange copyDeep();

    /**
     * factory method to create a deep copy of SetMethodInfoInterfaceChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetMethodInfoInterfaceChange deepCopy(@Nullable final SetMethodInfoInterfaceChange template) {
        if (template == null) {
            return null;
        }
        SetMethodInfoInterfaceChangeImpl instance = new SetMethodInfoInterfaceChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetMethodInfoInterfaceChange
     * @return builder
     */
    public static SetMethodInfoInterfaceChangeBuilder builder() {
        return SetMethodInfoInterfaceChangeBuilder.of();
    }

    /**
     * create builder for SetMethodInfoInterfaceChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetMethodInfoInterfaceChangeBuilder builder(final SetMethodInfoInterfaceChange template) {
        return SetMethodInfoInterfaceChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetMethodInfoInterfaceChange(Function<SetMethodInfoInterfaceChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoInterfaceChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMethodInfoInterfaceChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMethodInfoInterfaceChange>";
            }
        };
    }
}
