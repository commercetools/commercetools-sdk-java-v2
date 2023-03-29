
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
 * SetTitleChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetTitleChange setTitleChange = SetTitleChange.builder()
 *             .change("{change}")
 *             .previousValue("{previousValue}")
 *             .nextValue("{nextValue}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetTitleChangeImpl.class)
public interface SetTitleChange extends Change {

    /**
     * discriminator value for SetTitleChange
     */
    String SET_TITLE_CHANGE = "SetTitleChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Shape of the action for <code>setTitle</code></p>
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
     *  <p>Shape of the action for <code>setTitle</code></p>
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
     * @return instance of SetTitleChange
     */
    public static SetTitleChange of() {
        return new SetTitleChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetTitleChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetTitleChange of(final SetTitleChange template) {
        SetTitleChangeImpl instance = new SetTitleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetTitleChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetTitleChange deepCopy(@Nullable final SetTitleChange template) {
        if (template == null) {
            return null;
        }
        SetTitleChangeImpl instance = new SetTitleChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for SetTitleChange
     * @return builder
     */
    public static SetTitleChangeBuilder builder() {
        return SetTitleChangeBuilder.of();
    }

    /**
     * create builder for SetTitleChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetTitleChangeBuilder builder(final SetTitleChange template) {
        return SetTitleChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetTitleChange(Function<SetTitleChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetTitleChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetTitleChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetTitleChange>";
            }
        };
    }
}
