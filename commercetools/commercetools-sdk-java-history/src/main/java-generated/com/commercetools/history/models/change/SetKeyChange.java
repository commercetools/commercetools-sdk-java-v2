
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
 * SetKeyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetKeyChange setKeyChange = SetKeyChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetKeyChangeImpl.class)
public interface SetKeyChange extends Change {

    /**
     * discriminator value for SetKeyChange
     */
    String SET_KEY_CHANGE = "SetKeyChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setKey</code></p>
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
     *  <p>Shape of the action for <code>setKey</code></p>
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
     * @return instance of SetKeyChange
     */
    public static SetKeyChange of() {
        return new SetKeyChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetKeyChange of(final SetKeyChange template) {
        SetKeyChangeImpl instance = new SetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetKeyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetKeyChange deepCopy(@Nullable final SetKeyChange template) {
        if (template == null) {
            return null;
        }
        SetKeyChangeImpl instance = new SetKeyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetKeyChange
     * @return builder
     */
    public static SetKeyChangeBuilder builder() {
        return SetKeyChangeBuilder.of();
    }

    /**
     * create builder for SetKeyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetKeyChangeBuilder builder(final SetKeyChange template) {
        return SetKeyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetKeyChange(Function<SetKeyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetKeyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetKeyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetKeyChange>";
            }
        };
    }
}
