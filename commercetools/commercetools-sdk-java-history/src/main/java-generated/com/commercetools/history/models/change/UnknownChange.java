
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
 *  <p>Change triggered when the format of changes on an entity is not identified by Audit Log.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnknownChange unknownChange = UnknownChange.builder()
 *             .change("{change}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("UnknownChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = UnknownChangeImpl.class)
public interface UnknownChange extends Change {

    /**
     * discriminator value for UnknownChange
     */
    String UNKNOWN_CHANGE = "UnknownChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Identifier for the type of modification.</p>
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
     *  <p>Identifier for the type of modification.</p>
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
     * factory method
     * @return instance of UnknownChange
     */
    public static UnknownChange of() {
        return new UnknownChangeImpl();
    }

    /**
     * factory method to create a shallow copy UnknownChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static UnknownChange of(final UnknownChange template) {
        UnknownChangeImpl instance = new UnknownChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public UnknownChange copyDeep();

    /**
     * factory method to create a deep copy of UnknownChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static UnknownChange deepCopy(@Nullable final UnknownChange template) {
        if (template == null) {
            return null;
        }
        UnknownChangeImpl instance = new UnknownChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    /**
     * builder factory method for UnknownChange
     * @return builder
     */
    public static UnknownChangeBuilder builder() {
        return UnknownChangeBuilder.of();
    }

    /**
     * create builder for UnknownChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnknownChangeBuilder builder(final UnknownChange template) {
        return UnknownChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withUnknownChange(Function<UnknownChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<UnknownChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<UnknownChange>() {
            @Override
            public String toString() {
                return "TypeReference<UnknownChange>";
            }
        };
    }
}
