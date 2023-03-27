
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.LocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddLocalizedEnumValueChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddLocalizedEnumValueChange addLocalizedEnumValueChange = AddLocalizedEnumValueChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
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
     *  <p>Update action for <code>addLocalizedEnumValue</code> on types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>The name of the field definition updated.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>The name of the attribute updated.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedEnumValue getNextValue();

    /**
     *  <p>Update action for <code>addLocalizedEnumValue</code> on types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the field definition updated.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * set nextValue
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedEnumValue nextValue);

    /**
     * factory method
     * @return instance of AddLocalizedEnumValueChange
     */
    public static AddLocalizedEnumValueChange of() {
        return new AddLocalizedEnumValueChangeImpl();
    }

    /**
     * factory method to copy an instance of AddLocalizedEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddLocalizedEnumValueChange of(final AddLocalizedEnumValueChange template) {
        AddLocalizedEnumValueChangeImpl instance = new AddLocalizedEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
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
