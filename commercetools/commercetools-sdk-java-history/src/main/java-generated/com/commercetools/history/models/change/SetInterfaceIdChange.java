
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
 *  <p>Change triggered by the Set InterfaceId update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetInterfaceIdChange setInterfaceIdChange = SetInterfaceIdChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetInterfaceIdChangeImpl.class)
public interface SetInterfaceIdChange extends Change {

    /**
     * discriminator value for SetInterfaceIdChange
     */
    String SET_INTERFACE_ID_CHANGE = "SetInterfaceIdChange";

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
     * @return instance of SetInterfaceIdChange
     */
    public static SetInterfaceIdChange of() {
        return new SetInterfaceIdChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetInterfaceIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetInterfaceIdChange of(final SetInterfaceIdChange template) {
        SetInterfaceIdChangeImpl instance = new SetInterfaceIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetInterfaceIdChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetInterfaceIdChange deepCopy(@Nullable final SetInterfaceIdChange template) {
        if (template == null) {
            return null;
        }
        SetInterfaceIdChangeImpl instance = new SetInterfaceIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetInterfaceIdChange
     * @return builder
     */
    public static SetInterfaceIdChangeBuilder builder() {
        return SetInterfaceIdChangeBuilder.of();
    }

    /**
     * create builder for SetInterfaceIdChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetInterfaceIdChangeBuilder builder(final SetInterfaceIdChange template) {
        return SetInterfaceIdChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetInterfaceIdChange(Function<SetInterfaceIdChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetInterfaceIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetInterfaceIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetInterfaceIdChange>";
            }
        };
    }
}
