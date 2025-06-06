
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
 *  <p>Change triggered by the Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetNameChange setNameChange = SetNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetNameChangeImpl.class)
public interface SetNameChange extends Change {

    /**
     * discriminator value for SetNameChange
     */
    String SET_NAME_CHANGE = "SetNameChange";

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
     * @return instance of SetNameChange
     */
    public static SetNameChange of() {
        return new SetNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetNameChange of(final SetNameChange template) {
        SetNameChangeImpl instance = new SetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetNameChange copyDeep();

    /**
     * factory method to create a deep copy of SetNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetNameChange deepCopy(@Nullable final SetNameChange template) {
        if (template == null) {
            return null;
        }
        SetNameChangeImpl instance = new SetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetNameChange
     * @return builder
     */
    public static SetNameChangeBuilder builder() {
        return SetNameChangeBuilder.of();
    }

    /**
     * create builder for SetNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetNameChangeBuilder builder(final SetNameChange template) {
        return SetNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetNameChange(Function<SetNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetNameChange>";
            }
        };
    }
}
