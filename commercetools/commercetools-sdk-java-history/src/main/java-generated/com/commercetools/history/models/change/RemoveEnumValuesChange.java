
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.EnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the Remove EnumValues from AttributeDefinition update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveEnumValuesChange removeEnumValuesChange = RemoveEnumValuesChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveEnumValuesChangeImpl.class)
public interface RemoveEnumValuesChange extends Change {

    /**
     * discriminator value for RemoveEnumValuesChange
     */
    String REMOVE_ENUM_VALUES_CHANGE = "RemoveEnumValuesChange";

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
    @Valid
    @JsonProperty("previousValue")
    public EnumValue getPreviousValue();

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final EnumValue previousValue);

    /**
     *  <p>Name of the updated AttributeDefinition.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of RemoveEnumValuesChange
     */
    public static RemoveEnumValuesChange of() {
        return new RemoveEnumValuesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveEnumValuesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveEnumValuesChange of(final RemoveEnumValuesChange template) {
        RemoveEnumValuesChangeImpl instance = new RemoveEnumValuesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveEnumValuesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveEnumValuesChange deepCopy(@Nullable final RemoveEnumValuesChange template) {
        if (template == null) {
            return null;
        }
        RemoveEnumValuesChangeImpl instance = new RemoveEnumValuesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.EnumValue.deepCopy(template.getPreviousValue()));
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for RemoveEnumValuesChange
     * @return builder
     */
    public static RemoveEnumValuesChangeBuilder builder() {
        return RemoveEnumValuesChangeBuilder.of();
    }

    /**
     * create builder for RemoveEnumValuesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveEnumValuesChangeBuilder builder(final RemoveEnumValuesChange template) {
        return RemoveEnumValuesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveEnumValuesChange(Function<RemoveEnumValuesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveEnumValuesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveEnumValuesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveEnumValuesChange>";
            }
        };
    }
}
