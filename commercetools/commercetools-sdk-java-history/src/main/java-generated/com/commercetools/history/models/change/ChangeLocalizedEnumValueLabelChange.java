
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * ChangeLocalizedEnumValueLabelChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeLocalizedEnumValueLabelChange changeLocalizedEnumValueLabelChange = ChangeLocalizedEnumValueLabelChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .valueKey("{valueKey}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeLocalizedEnumValueLabelChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeLocalizedEnumValueLabelChangeImpl.class)
public interface ChangeLocalizedEnumValueLabelChange extends Change {

    /**
     * discriminator value for ChangeLocalizedEnumValueLabelChange
     */
    String CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE = "ChangeLocalizedEnumValueLabelChange";

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
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @return attributeName
     */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    /**
     *  <p>Key of the updated values.</p>
     * @return valueKey
     */
    @NotNull
    @JsonProperty("valueKey")
    public String getValueKey();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>; only present on changes to Types.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>; only present on changes to Product Types.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     *  <p>Key of the updated values.</p>
     * @param valueKey value to be set
     */

    public void setValueKey(final String valueKey);

    /**
     * factory method
     * @return instance of ChangeLocalizedEnumValueLabelChange
     */
    public static ChangeLocalizedEnumValueLabelChange of() {
        return new ChangeLocalizedEnumValueLabelChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeLocalizedEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeLocalizedEnumValueLabelChange of(final ChangeLocalizedEnumValueLabelChange template) {
        ChangeLocalizedEnumValueLabelChangeImpl instance = new ChangeLocalizedEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        return instance;
    }

    public ChangeLocalizedEnumValueLabelChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeLocalizedEnumValueLabelChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeLocalizedEnumValueLabelChange deepCopy(
            @Nullable final ChangeLocalizedEnumValueLabelChange template) {
        if (template == null) {
            return null;
        }
        ChangeLocalizedEnumValueLabelChangeImpl instance = new ChangeLocalizedEnumValueLabelChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        instance.setValueKey(template.getValueKey());
        return instance;
    }

    /**
     * builder factory method for ChangeLocalizedEnumValueLabelChange
     * @return builder
     */
    public static ChangeLocalizedEnumValueLabelChangeBuilder builder() {
        return ChangeLocalizedEnumValueLabelChangeBuilder.of();
    }

    /**
     * create builder for ChangeLocalizedEnumValueLabelChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeLocalizedEnumValueLabelChangeBuilder builder(
            final ChangeLocalizedEnumValueLabelChange template) {
        return ChangeLocalizedEnumValueLabelChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeLocalizedEnumValueLabelChange(Function<ChangeLocalizedEnumValueLabelChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedEnumValueLabelChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeLocalizedEnumValueLabelChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeLocalizedEnumValueLabelChange>";
            }
        };
    }
}
