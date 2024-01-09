
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.AttributeLocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Add LocalizableEnumValue to AttributeDefinition on Product Types.</li>
 *   <li>Add LocalizedEnumValue to FieldDefinition on Types.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddLocalizedEnumValueChange addLocalizedEnumValueChange = AddLocalizedEnumValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddLocalizedEnumValueChangeImpl.class)
public interface AddLocalizedEnumValueChange extends Change {

    /**
     * discriminator value for AddLocalizedEnumValueChange
     */
    String ADD_LOCALIZED_ENUM_VALUE_CHANGE = "AddLocalizedEnumValueChange";

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
    @Valid
    @JsonProperty("nextValue")
    public AttributeLocalizedEnumValue getNextValue();

    /**
     *  <p>Name of the updated FieldDefinition; only present on changes to Types.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Name of the updated AttributeDefinition; only present on changes to Product Types.</p>
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
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final AttributeLocalizedEnumValue nextValue);

    /**
     *  <p>Name of the updated FieldDefinition; only present on changes to Types.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Name of the updated AttributeDefinition; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of AddLocalizedEnumValueChange
     */
    public static AddLocalizedEnumValueChange of() {
        return new AddLocalizedEnumValueChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddLocalizedEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddLocalizedEnumValueChange of(final AddLocalizedEnumValueChange template) {
        AddLocalizedEnumValueChangeImpl instance = new AddLocalizedEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of AddLocalizedEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddLocalizedEnumValueChange deepCopy(@Nullable final AddLocalizedEnumValueChange template) {
        if (template == null) {
            return null;
        }
        AddLocalizedEnumValueChangeImpl instance = new AddLocalizedEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.common.AttributeLocalizedEnumValue.deepCopy(template.getNextValue()));
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for AddLocalizedEnumValueChange
     * @return builder
     */
    public static AddLocalizedEnumValueChangeBuilder builder() {
        return AddLocalizedEnumValueChangeBuilder.of();
    }

    /**
     * create builder for AddLocalizedEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddLocalizedEnumValueChangeBuilder builder(final AddLocalizedEnumValueChange template) {
        return AddLocalizedEnumValueChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddLocalizedEnumValueChange(Function<AddLocalizedEnumValueChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddLocalizedEnumValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddLocalizedEnumValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddLocalizedEnumValueChange>";
            }
        };
    }
}
