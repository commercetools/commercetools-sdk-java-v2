
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
 *  <p>Change triggered by the Update CustomObject request when a new property is added.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPropertyChange addPropertyChange = AddPropertyChange.builder()
 *             .change("{change}")
 *             .path("{path}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddPropertyChangeImpl.class)
public interface AddPropertyChange extends Change {

    /**
     * discriminator value for AddPropertyChange
     */
    String ADD_PROPERTY_CHANGE = "AddPropertyChange";

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
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    /**
     *  <p>Path to the new property that was added.</p>
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
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Object nextValue);

    /**
     *  <p>Path to the new property that was added.</p>
     * @param path value to be set
     */

    public void setPath(final String path);

    /**
     * factory method
     * @return instance of AddPropertyChange
     */
    public static AddPropertyChange of() {
        return new AddPropertyChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddPropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddPropertyChange of(final AddPropertyChange template) {
        AddPropertyChangeImpl instance = new AddPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddPropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddPropertyChange deepCopy(@Nullable final AddPropertyChange template) {
        if (template == null) {
            return null;
        }
        AddPropertyChangeImpl instance = new AddPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPath(template.getPath());
        return instance;
    }

    /**
     * builder factory method for AddPropertyChange
     * @return builder
     */
    public static AddPropertyChangeBuilder builder() {
        return AddPropertyChangeBuilder.of();
    }

    /**
     * create builder for AddPropertyChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddPropertyChangeBuilder builder(final AddPropertyChange template) {
        return AddPropertyChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddPropertyChange(Function<AddPropertyChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddPropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPropertyChange>";
            }
        };
    }
}
