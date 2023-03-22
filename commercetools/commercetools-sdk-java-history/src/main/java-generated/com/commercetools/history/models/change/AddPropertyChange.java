
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddPropertyChange
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

    String ADD_PROPERTY_CHANGE = "AddPropertyChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addProperty</code> on custom objects</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Value path to the property that was added</p>
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

    public void setChange(final String change);

    public void setPath(final String path);

    public void setNextValue(final Object nextValue);

    public static AddPropertyChange of() {
        return new AddPropertyChangeImpl();
    }

    public static AddPropertyChange of(final AddPropertyChange template) {
        AddPropertyChangeImpl instance = new AddPropertyChangeImpl();
        instance.setChange(template.getChange());
        instance.setPath(template.getPath());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddPropertyChangeBuilder builder() {
        return AddPropertyChangeBuilder.of();
    }

    public static AddPropertyChangeBuilder builder(final AddPropertyChange template) {
        return AddPropertyChangeBuilder.of(template);
    }

    default <T> T withAddPropertyChange(Function<AddPropertyChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddPropertyChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPropertyChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPropertyChange>";
            }
        };
    }
}
