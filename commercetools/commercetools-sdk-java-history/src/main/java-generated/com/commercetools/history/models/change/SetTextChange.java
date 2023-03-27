
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetTextChange
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
     *  <p>Shape of the action for <code>setText</code></p>
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
     *  <p>Shape of the action for <code>setText</code></p>
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
     * @return instance of SetTextChange
     */
    public static SetTextChange of() {
        return new SetTextChangeImpl();
    }

    /**
     * factory method to copy an instance of SetTextChange
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
