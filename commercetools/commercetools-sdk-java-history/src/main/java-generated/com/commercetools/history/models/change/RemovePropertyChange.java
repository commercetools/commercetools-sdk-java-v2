
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
 *  <p>Change triggered by the Update CustomObject request when an existing property is removed.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemovePropertyChange removePropertyChange = RemovePropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemovePropertyChangeImpl.class)
public interface RemovePropertyChange extends Change {

    /**
     * discriminator value for RemovePropertyChange
     */
    String REMOVE_PROPERTY_CHANGE = "RemovePropertyChange";

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
     *  <p>Path to the property that was removed.</p>
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
     *  <p>Path to the property that was removed.</p>
     * @param path value to be set
     */

    public void setPath(final String path);

    /**
     * factory method
     * @return instance of RemovePropertyChange
     */
    public static RemovePropertyChange of() {
        return new RemovePropertyChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemovePropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemovePropertyChange of(final RemovePropertyChange template) {
        RemovePropertyChangeImpl instance = new RemovePropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemovePropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemovePropertyChange deepCopy(@Nullable final RemovePropertyChange template) {
        if (template == null) {
            return null;
        }
        RemovePropertyChangeImpl instance = new RemovePropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * builder factory method for RemovePropertyChange
     * @return builder
     */
    public static RemovePropertyChangeBuilder builder() {
        return RemovePropertyChangeBuilder.of();
    }

    /**
     * create builder for RemovePropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemovePropertyChangeBuilder builder(final RemovePropertyChange template) {
        return RemovePropertyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemovePropertyChange(Function<RemovePropertyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemovePropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemovePropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemovePropertyChange>";
            }
        };
    }
}
