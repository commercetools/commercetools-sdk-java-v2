
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.CustomFieldEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:TypeAddEnumValueAction" rel="nofollow">Add EnumValue to FieldDefinition</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddEnumValueChange addEnumValueChange = AddEnumValueChange.builder()
 *             .change("{change}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .attributeName("{attributeName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("AddEnumValueChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddEnumValueChangeImpl.class)
public interface AddEnumValueChange extends Change {

    /**
     * discriminator value for AddEnumValueChange
     */
    String ADD_ENUM_VALUE_CHANGE = "AddEnumValueChange";

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
    public CustomFieldEnumValue getNextValue();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
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

    public void setNextValue(final CustomFieldEnumValue nextValue);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:AttributeDefinition" rel="nofollow">AttributeDefinition</a>.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * factory method
     * @return instance of AddEnumValueChange
     */
    public static AddEnumValueChange of() {
        return new AddEnumValueChangeImpl();
    }

    /**
     * factory method to create a shallow copy AddEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static AddEnumValueChange of(final AddEnumValueChange template) {
        AddEnumValueChangeImpl instance = new AddEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    public AddEnumValueChange copyDeep();

    /**
     * factory method to create a deep copy of AddEnumValueChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static AddEnumValueChange deepCopy(@Nullable final AddEnumValueChange template) {
        if (template == null) {
            return null;
        }
        AddEnumValueChangeImpl instance = new AddEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(
            com.commercetools.history.models.common.CustomFieldEnumValue.deepCopy(template.getNextValue()));
        instance.setFieldName(template.getFieldName());
        instance.setAttributeName(template.getAttributeName());
        return instance;
    }

    /**
     * builder factory method for AddEnumValueChange
     * @return builder
     */
    public static AddEnumValueChangeBuilder builder() {
        return AddEnumValueChangeBuilder.of();
    }

    /**
     * create builder for AddEnumValueChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddEnumValueChangeBuilder builder(final AddEnumValueChange template) {
        return AddEnumValueChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withAddEnumValueChange(Function<AddEnumValueChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<AddEnumValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddEnumValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddEnumValueChange>";
            }
        };
    }
}
