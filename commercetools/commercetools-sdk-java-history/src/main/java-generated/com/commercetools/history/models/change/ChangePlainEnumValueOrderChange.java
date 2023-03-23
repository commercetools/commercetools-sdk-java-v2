
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    @JsonIgnore
    public void setNextValue(final EnumValue... nextValue);

    public void setNextValue(final List<EnumValue> nextValue);

    @JsonIgnore
    public void setPreviousValue(final EnumValue... previousValue);

    public void setPreviousValue(final List<EnumValue> previousValue);

    public static ChangePlainEnumValueOrderChange of() {
        return new ChangePlainEnumValueOrderChangeImpl();
    }

    public static ChangePlainEnumValueOrderChange of(final ChangePlainEnumValueOrderChange template) {
        ChangePlainEnumValueOrderChangeImpl instance = new ChangePlainEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangePlainEnumValueOrderChangeBuilder builder() {
        return ChangePlainEnumValueOrderChangeBuilder.of();
    }

    public static ChangePlainEnumValueOrderChangeBuilder builder(final ChangePlainEnumValueOrderChange template) {
        return ChangePlainEnumValueOrderChangeBuilder.of(template);
    }

    default <T> T withChangePlainEnumValueOrderChange(Function<ChangePlainEnumValueOrderChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueOrderChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePlainEnumValueOrderChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePlainEnumValueOrderChange>";
            }
        };
    }
}
