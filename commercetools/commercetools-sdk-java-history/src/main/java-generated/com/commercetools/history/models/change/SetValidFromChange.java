
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetValidFromChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetValidFromChange setValidFromChange = SetValidFromChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetValidFromChangeImpl.class)
public interface SetValidFromChange extends Change {

    /**
     * discriminator value for SetValidFromChange
     */
    String SET_VALID_FROM_CHANGE = "SetValidFromChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setValidFrom</code></p>
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
     *  <p>Shape of the action for <code>setValidFrom</code></p>
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
     * @return instance of SetValidFromChange
     */
    public static SetValidFromChange of() {
        return new SetValidFromChangeImpl();
    }

    /**
     * factory method to copy an instance of SetValidFromChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetValidFromChange of(final SetValidFromChange template) {
        SetValidFromChangeImpl instance = new SetValidFromChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetValidFromChange
     * @return builder
     */
    public static SetValidFromChangeBuilder builder() {
        return SetValidFromChangeBuilder.of();
    }

    /**
     * create builder for SetValidFromChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetValidFromChangeBuilder builder(final SetValidFromChange template) {
        return SetValidFromChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetValidFromChange(Function<SetValidFromChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetValidFromChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetValidFromChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetValidFromChange>";
            }
        };
    }
}
