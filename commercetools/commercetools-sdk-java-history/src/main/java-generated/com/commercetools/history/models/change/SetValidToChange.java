
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
 *  <p>Change triggered by the Set Valid To update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidToChange setValidToChange = SetValidToChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValidToChangeImpl.class)
public interface SetValidToChange extends Change {

    /**
     * discriminator value for SetValidToChange
     */
    String SET_VALID_TO_CHANGE = "SetValidToChange";

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
     * @return instance of SetValidToChange
     */
    public static SetValidToChange of() {
        return new SetValidToChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetValidToChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetValidToChange of(final SetValidToChange template) {
        SetValidToChangeImpl instance = new SetValidToChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetValidToChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetValidToChange deepCopy(@Nullable final SetValidToChange template) {
        if (template == null) {
            return null;
        }
        SetValidToChangeImpl instance = new SetValidToChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetValidToChange
     * @return builder
     */
    public static SetValidToChangeBuilder builder() {
        return SetValidToChangeBuilder.of();
    }

    /**
     * create builder for SetValidToChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidToChangeBuilder builder(final SetValidToChange template) {
        return SetValidToChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetValidToChange(Function<SetValidToChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetValidToChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidToChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidToChange>";
            }
        };
    }
}
