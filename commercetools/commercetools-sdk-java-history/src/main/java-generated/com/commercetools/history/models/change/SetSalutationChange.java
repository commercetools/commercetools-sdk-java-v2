
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
 *  <p>Change triggered by the Set Salutation update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetSalutationChange setSalutationChange = SetSalutationChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetSalutationChangeImpl.class)
public interface SetSalutationChange extends Change {

    /**
     * discriminator value for SetSalutationChange
     */
    String SET_SALUTATION_CHANGE = "SetSalutationChange";

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
     * @return instance of SetSalutationChange
     */
    public static SetSalutationChange of() {
        return new SetSalutationChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetSalutationChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetSalutationChange of(final SetSalutationChange template) {
        SetSalutationChangeImpl instance = new SetSalutationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetSalutationChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetSalutationChange deepCopy(@Nullable final SetSalutationChange template) {
        if (template == null) {
            return null;
        }
        SetSalutationChangeImpl instance = new SetSalutationChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetSalutationChange
     * @return builder
     */
    public static SetSalutationChangeBuilder builder() {
        return SetSalutationChangeBuilder.of();
    }

    /**
     * create builder for SetSalutationChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetSalutationChangeBuilder builder(final SetSalutationChange template) {
        return SetSalutationChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetSalutationChange(Function<SetSalutationChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetSalutationChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetSalutationChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetSalutationChange>";
            }
        };
    }
}
