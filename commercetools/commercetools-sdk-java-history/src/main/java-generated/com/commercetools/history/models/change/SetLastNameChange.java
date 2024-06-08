
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
 *  <p>Change triggered by Set Last Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetLastNameChange setLastNameChange = SetLastNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetLastNameChangeImpl.class)
public interface SetLastNameChange extends Change {

    /**
     * discriminator value for SetLastNameChange
     */
    String SET_LAST_NAME_CHANGE = "SetLastNameChange";

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
     * @return instance of SetLastNameChange
     */
    public static SetLastNameChange of() {
        return new SetLastNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetLastNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetLastNameChange of(final SetLastNameChange template) {
        SetLastNameChangeImpl instance = new SetLastNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetLastNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetLastNameChange deepCopy(@Nullable final SetLastNameChange template) {
        if (template == null) {
            return null;
        }
        SetLastNameChangeImpl instance = new SetLastNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetLastNameChange
     * @return builder
     */
    public static SetLastNameChangeBuilder builder() {
        return SetLastNameChangeBuilder.of();
    }

    /**
     * create builder for SetLastNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetLastNameChangeBuilder builder(final SetLastNameChange template) {
        return SetLastNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetLastNameChange(Function<SetLastNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetLastNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetLastNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetLastNameChange>";
            }
        };
    }
}
