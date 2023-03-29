
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.EnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangePlainEnumValueOrderChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangePlainEnumValueOrderChange changePlainEnumValueOrderChange = ChangePlainEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangePlainEnumValueOrderChangeImpl.class)
public interface ChangePlainEnumValueOrderChange extends Change {

    /**
     * discriminator value for ChangePlainEnumValueOrderChange
     */
    String CHANGE_PLAIN_ENUM_VALUE_ORDER_CHANGE = "ChangePlainEnumValueOrderChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>changePlainEnumValueOrder</code> on product types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

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
    public List<EnumValue> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<EnumValue> getPreviousValue();

    /**
     *  <p>Update action for <code>changePlainEnumValueOrder</code> on product types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

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
    public void setNextValue(final EnumValue... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<EnumValue> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final EnumValue... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<EnumValue> previousValue);

    /**
     * factory method
     * @return instance of ChangePlainEnumValueOrderChange
     */
    public static ChangePlainEnumValueOrderChange of() {
        return new ChangePlainEnumValueOrderChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangePlainEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangePlainEnumValueOrderChange of(final ChangePlainEnumValueOrderChange template) {
        ChangePlainEnumValueOrderChangeImpl instance = new ChangePlainEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangePlainEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangePlainEnumValueOrderChange deepCopy(@Nullable final ChangePlainEnumValueOrderChange template) {
        if (template == null) {
            return null;
        }
        ChangePlainEnumValueOrderChangeImpl instance = new ChangePlainEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.EnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.change_value.EnumValue::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ChangePlainEnumValueOrderChange
     * @return builder
     */
    public static ChangePlainEnumValueOrderChangeBuilder builder() {
        return ChangePlainEnumValueOrderChangeBuilder.of();
    }

    /**
     * create builder for ChangePlainEnumValueOrderChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangePlainEnumValueOrderChangeBuilder builder(final ChangePlainEnumValueOrderChange template) {
        return ChangePlainEnumValueOrderChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangePlainEnumValueOrderChange(Function<ChangePlainEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePlainEnumValueOrderChange>";
            }
        };
    }
}
