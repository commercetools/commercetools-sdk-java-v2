
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
 * SetValueChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValueChange setValueChange = SetValueChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValueChangeImpl.class)
public interface SetValueChange extends Change {

    /**
     * discriminator value for SetValueChange
     */
    String SET_VALUE_CHANGE = "SetValueChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setValue</code> on custom objects</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>setValue</code> on custom objects</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of SetValueChange
     */
    public static SetValueChange of() {
        return new SetValueChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetValueChange of(final SetValueChange template) {
        SetValueChangeImpl instance = new SetValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetValueChange deepCopy(@Nullable final SetValueChange template) {
        if (template == null) {
            return null;
        }
        SetValueChangeImpl instance = new SetValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetValueChange
     * @return builder
     */
    public static SetValueChangeBuilder builder() {
        return SetValueChangeBuilder.of();
    }

    /**
     * create builder for SetValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValueChangeBuilder builder(final SetValueChange template) {
        return SetValueChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetValueChange(Function<SetValueChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValueChange>";
            }
        };
    }
}
