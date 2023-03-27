
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetFirstNameChange
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
     *  <p>Shape of the action for <code>setFirstName</code></p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    /**
     *  <p>Shape of the action for <code>setFirstName</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final String previousValue);

    /**
     * set nextValue
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
     * factory method to copy an instance of SetFirstNameChange
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
