
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
 * SetPropertyChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetPropertyChange setPropertyChange = SetPropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetPropertyChangeImpl.class)
public interface SetPropertyChange extends Change {

    /**
     * discriminator value for SetPropertyChange
     */
    String SET_PROPERTY_CHANGE = "SetPropertyChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>setProperty</code> on custom objects</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value path to the property that was changed</p>
     * @return path
     */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>setProperty</code> on custom objects</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value path to the property that was changed</p>
     * @param path value to be set
     */

    public void setPath(final String path);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of SetPropertyChange
     */
    public static SetPropertyChange of() {
        return new SetPropertyChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetPropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetPropertyChange of(final SetPropertyChange template) {
        SetPropertyChangeImpl instance = new SetPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetPropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetPropertyChange deepCopy(@Nullable final SetPropertyChange template) {
        if (template == null) {
            return null;
        }
        SetPropertyChangeImpl instance = new SetPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetPropertyChange
     * @return builder
     */
    public static SetPropertyChangeBuilder builder() {
        return SetPropertyChangeBuilder.of();
    }

    /**
     * create builder for SetPropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetPropertyChangeBuilder builder(final SetPropertyChange template) {
        return SetPropertyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetPropertyChange(Function<SetPropertyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetPropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetPropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetPropertyChange>";
            }
        };
    }
}
