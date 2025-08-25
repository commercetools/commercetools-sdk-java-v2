
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.EnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:TypeChangeEnumValueOrderAction" rel="nofollow">Change the order of EnumValues</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEnumValueOrderChange changeEnumValueOrderChange = ChangeEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .fieldName("{fieldName}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ChangeEnumValueOrderChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeEnumValueOrderChangeImpl.class)
public interface ChangeEnumValueOrderChange extends Change {

    /**
     * discriminator value for ChangeEnumValueOrderChange
     */
    String CHANGE_ENUM_VALUE_ORDER_CHANGE = "ChangeEnumValueOrderChange";

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
    public List<EnumValue> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<EnumValue> getNextValue();

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

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
    public void setPreviousValue(final EnumValue... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<EnumValue> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final EnumValue... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<EnumValue> nextValue);

    /**
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldDefinition" rel="nofollow">FieldDefinition</a>.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

    /**
     * factory method
     * @return instance of ChangeEnumValueOrderChange
     */
    public static ChangeEnumValueOrderChange of() {
        return new ChangeEnumValueOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeEnumValueOrderChange of(final ChangeEnumValueOrderChange template) {
        ChangeEnumValueOrderChangeImpl instance = new ChangeEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setFieldName(template.getFieldName());
        return instance;
    }

    public ChangeEnumValueOrderChange copyDeep();

    /**
     * factory method to create a deep copy of ChangeEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeEnumValueOrderChange deepCopy(@Nullable final ChangeEnumValueOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangeEnumValueOrderChangeImpl instance = new ChangeEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.EnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.EnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setFieldName(template.getFieldName());
        return instance;
    }

    /**
     * builder factory method for ChangeEnumValueOrderChange
     * @return builder
     */
    public static ChangeEnumValueOrderChangeBuilder builder() {
        return ChangeEnumValueOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangeEnumValueOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeEnumValueOrderChangeBuilder builder(final ChangeEnumValueOrderChange template) {
        return ChangeEnumValueOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeEnumValueOrderChange(Function<ChangeEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeEnumValueOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeEnumValueOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeEnumValueOrderChange>";
            }
        };
    }
}
