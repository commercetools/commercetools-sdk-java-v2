
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
 *  <p>Change triggered by the Change initial State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeInitialChange changeInitialChange = ChangeInitialChange.builder()
 *             .change("{change}")
 *             .previousValue(true)
 *             .nextValue(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeInitialChangeImpl.class)
public interface ChangeInitialChange extends Change {

    /**
     * discriminator value for ChangeInitialChange
     */
    String CHANGE_INITIAL_CHANGE = "ChangeInitialChange";

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
    public Boolean getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Boolean previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Boolean nextValue);

    /**
     * factory method
     * @return instance of ChangeInitialChange
     */
    public static ChangeInitialChange of() {
        return new ChangeInitialChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeInitialChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeInitialChange of(final ChangeInitialChange template) {
        ChangeInitialChangeImpl instance = new ChangeInitialChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeInitialChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeInitialChange deepCopy(@Nullable final ChangeInitialChange template) {
        if (template == null) {
            return null;
        }
        ChangeInitialChangeImpl instance = new ChangeInitialChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for ChangeInitialChange
     * @return builder
     */
    public static ChangeInitialChangeBuilder builder() {
        return ChangeInitialChangeBuilder.of();
    }

    /**
     * create builder for ChangeInitialChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeInitialChangeBuilder builder(final ChangeInitialChange template) {
        return ChangeInitialChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeInitialChange(Function<ChangeInitialChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeInitialChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeInitialChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeInitialChange>";
            }
        };
    }
}
