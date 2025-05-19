
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
 *  <p>Change triggered by the Update CustomObject request when an existing property is updated.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("SetPropertyChange")
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
    public Object getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *  <p>Path to the property that was updated.</p>
     * @return path
     */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     *  <p>Path to the property that was updated.</p>
     * @param path value to be set
     */

    public void setPath(final String path);

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setPath(template.getPath());
        return instance;
    }

    public SetPropertyChange copyDeep();

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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setPath(template.getPath());
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
