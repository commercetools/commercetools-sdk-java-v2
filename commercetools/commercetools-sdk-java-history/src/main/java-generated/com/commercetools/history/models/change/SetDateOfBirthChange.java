
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
 *  <p>Change triggered by the Set Date of Birth update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetDateOfBirthChange setDateOfBirthChange = SetDateOfBirthChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetDateOfBirthChangeImpl.class)
public interface SetDateOfBirthChange extends Change {

    /**
     * discriminator value for SetDateOfBirthChange
     */
    String SET_DATE_OF_BIRTH_CHANGE = "SetDateOfBirthChange";

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
     * @return instance of SetDateOfBirthChange
     */
    public static SetDateOfBirthChange of() {
        return new SetDateOfBirthChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetDateOfBirthChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetDateOfBirthChange of(final SetDateOfBirthChange template) {
        SetDateOfBirthChangeImpl instance = new SetDateOfBirthChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetDateOfBirthChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetDateOfBirthChange deepCopy(@Nullable final SetDateOfBirthChange template) {
        if (template == null) {
            return null;
        }
        SetDateOfBirthChangeImpl instance = new SetDateOfBirthChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetDateOfBirthChange
     * @return builder
     */
    public static SetDateOfBirthChangeBuilder builder() {
        return SetDateOfBirthChangeBuilder.of();
    }

    /**
     * create builder for SetDateOfBirthChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetDateOfBirthChangeBuilder builder(final SetDateOfBirthChange template) {
        return SetDateOfBirthChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetDateOfBirthChange(Function<SetDateOfBirthChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetDateOfBirthChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDateOfBirthChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDateOfBirthChange>";
            }
        };
    }
}
