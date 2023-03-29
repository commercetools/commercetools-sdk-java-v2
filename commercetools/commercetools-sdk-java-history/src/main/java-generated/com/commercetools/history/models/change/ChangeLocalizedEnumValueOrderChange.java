
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.LocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeLocalizedEnumValueOrderChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedEnumValueOrderChange changeLocalizedEnumValueOrderChange = ChangeLocalizedEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
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
     *  <p>Update action for <code>changeLocalizedEnumValueOrder</code> on types and product types</p>
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
    public List<LocalizedEnumValue> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<LocalizedEnumValue> getPreviousValue();

    /**
     *  <p>Update action for <code>changeLocalizedEnumValueOrder</code> on types and product types</p>
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
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final LocalizedEnumValue... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<LocalizedEnumValue> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final LocalizedEnumValue... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<LocalizedEnumValue> previousValue);

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
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.LocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.LocalizedEnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
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
