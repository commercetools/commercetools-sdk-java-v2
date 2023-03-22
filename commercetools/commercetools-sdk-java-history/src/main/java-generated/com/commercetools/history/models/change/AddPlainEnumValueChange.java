
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
 * AddPlainEnumValueChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddPlainEnumValueChange addPlainEnumValueChange = AddPlainEnumValueChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddPlainEnumValueChangeImpl.class)
public interface AddPlainEnumValueChange extends Change {

    String ADD_PLAIN_ENUM_VALUE_CHANGE = "AddPlainEnumValueChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addPlainEnumValue</code> on product types</p>
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
    public EnumValue getNextValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final EnumValue nextValue);

    public static AddPlainEnumValueChange of() {
        return new AddPlainEnumValueChangeImpl();
    }

    public static AddPlainEnumValueChange of(final AddPlainEnumValueChange template) {
        AddPlainEnumValueChangeImpl instance = new AddPlainEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddPlainEnumValueChangeBuilder builder() {
        return AddPlainEnumValueChangeBuilder.of();
    }

    public static AddPlainEnumValueChangeBuilder builder(final AddPlainEnumValueChange template) {
        return AddPlainEnumValueChangeBuilder.of(template);
    }

    default <T> T withAddPlainEnumValueChange(Function<AddPlainEnumValueChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddPlainEnumValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddPlainEnumValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddPlainEnumValueChange>";
            }
        };
    }
}
