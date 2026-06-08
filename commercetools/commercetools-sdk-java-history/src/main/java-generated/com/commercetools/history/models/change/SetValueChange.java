
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/custom-objects:POST" rel="nofollow">Update CustomObject</a> request when a value of a property is updated.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("SetValueChange")
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
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetValueChange copyDeep();

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
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
