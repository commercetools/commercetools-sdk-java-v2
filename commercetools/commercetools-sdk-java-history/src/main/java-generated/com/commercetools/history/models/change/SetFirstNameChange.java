
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetFirstNameAction" rel="nofollow">Set First Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetFirstNameChange setFirstNameChange = SetFirstNameChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetFirstNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetFirstNameChangeImpl.class)
public interface SetFirstNameChange extends Change {

    /**
     * discriminator value for SetFirstNameChange
     */
    String SET_FIRST_NAME_CHANGE = "SetFirstNameChange";

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
     * @return instance of SetFirstNameChange
     */
    public static SetFirstNameChange of() {
        return new SetFirstNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetFirstNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetFirstNameChange of(final SetFirstNameChange template) {
        SetFirstNameChangeImpl instance = new SetFirstNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public SetFirstNameChange copyDeep();

    /**
     * factory method to create a deep copy of SetFirstNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetFirstNameChange deepCopy(@Nullable final SetFirstNameChange template) {
        if (template == null) {
            return null;
        }
        SetFirstNameChangeImpl instance = new SetFirstNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetFirstNameChange
     * @return builder
     */
    public static SetFirstNameChangeBuilder builder() {
        return SetFirstNameChangeBuilder.of();
    }

    /**
     * create builder for SetFirstNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetFirstNameChangeBuilder builder(final SetFirstNameChange template) {
        return SetFirstNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetFirstNameChange(Function<SetFirstNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetFirstNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetFirstNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetFirstNameChange>";
            }
        };
    }
}
