
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
 *  <p>Change triggered by the Set Text update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTextChange setTextChange = SetTextChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetTextChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTextChangeImpl.class)
public interface SetTextChange extends Change {

    /**
     * discriminator value for SetTextChange
     */
    String SET_TEXT_CHANGE = "SetTextChange";

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
     * @return instance of SetTextChange
     */
    public static SetTextChange of() {
        return new SetTextChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTextChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTextChange of(final SetTextChange template) {
        SetTextChangeImpl instance = new SetTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetTextChange copyDeep();

    /**
     * factory method to create a deep copy of SetTextChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTextChange deepCopy(@Nullable final SetTextChange template) {
        if (template == null) {
            return null;
        }
        SetTextChangeImpl instance = new SetTextChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetTextChange
     * @return builder
     */
    public static SetTextChangeBuilder builder() {
        return SetTextChangeBuilder.of();
    }

    /**
     * create builder for SetTextChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTextChangeBuilder builder(final SetTextChange template) {
        return SetTextChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTextChange(Function<SetTextChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTextChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTextChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTextChange>";
            }
        };
    }
}
