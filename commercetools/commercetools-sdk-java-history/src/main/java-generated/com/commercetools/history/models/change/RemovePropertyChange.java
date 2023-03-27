
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemovePropertyChange
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
     *  <p>Update action for <code>removeProperty</code> on custom objects</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value path to the property that was removed</p>
     * @return path
     */
    @NotNull
    @JsonProperty("path")
    public String getPath();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p>Update action for <code>removeProperty</code> on custom objects</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value path to the property that was removed</p>
     * @param path value to be set
     */

    public void setPath(final String path);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     * factory method
     * @return instance of RemovePropertyChange
     */
    public static RemovePropertyChange of() {
        return new RemovePropertyChangeImpl();
    }

    /**
     * factory method to copy an instance of RemovePropertyChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemovePropertyChange of(final RemovePropertyChange template) {
        RemovePropertyChangeImpl instance = new RemovePropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setPreviousValue(template.getPreviousValue());
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
