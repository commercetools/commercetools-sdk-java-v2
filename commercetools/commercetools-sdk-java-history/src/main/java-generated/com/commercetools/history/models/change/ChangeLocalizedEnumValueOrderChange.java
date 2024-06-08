
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.LocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Change the order of LocalizedEnumValues on Product Types.</li>
 *   <li>Change the order of LocalizedEnumValues on Types.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedEnumValueOrderChange changeLocalizedEnumValueOrderChange = ChangeLocalizedEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLocalizedEnumValueOrderChangeImpl.class)
public interface ChangeLocalizedEnumValueOrderChange extends Change {

    /**
     * discriminator value for ChangeLocalizedEnumValueOrderChange
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_ORDER_CHANGE = "ChangeLocalizedEnumValueOrderChange";

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
    public List<LocalizedEnumValue> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<LocalizedEnumValue> getNextValue();

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
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final LocalizedEnumValue... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<LocalizedEnumValue> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final LocalizedEnumValue... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<LocalizedEnumValue> nextValue);

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
     * @return instance of ChangeLocalizedEnumValueOrderChange
     */
    public static ChangeLocalizedEnumValueOrderChange of() {
        return new ChangeLocalizedEnumValueOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLocalizedEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLocalizedEnumValueOrderChange of(final ChangeLocalizedEnumValueOrderChange template) {
        ChangeLocalizedEnumValueOrderChangeImpl instance = new ChangeLocalizedEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeLocalizedEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLocalizedEnumValueOrderChange deepCopy(
            @Nullable final ChangeLocalizedEnumValueOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeLocalizedEnumValueOrderChangeImpl instance = new ChangeLocalizedEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.LocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.LocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for ChangeLocalizedEnumValueOrderChange
     * @return builder
     */
    public static ChangeLocalizedEnumValueOrderChangeBuilder builder() {
        return ChangeLocalizedEnumValueOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeLocalizedEnumValueOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedEnumValueOrderChangeBuilder builder(
            final ChangeLocalizedEnumValueOrderChange template) {
        return ChangeLocalizedEnumValueOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLocalizedEnumValueOrderChange(Function<ChangeLocalizedEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedEnumValueOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedEnumValueOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedEnumValueOrderChange>";
            }
        };
    }
}
