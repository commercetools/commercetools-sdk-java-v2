
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
 * AddEnumValueChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddEnumValueChange addEnumValueChange = AddEnumValueChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = AddEnumValueChangeImpl.class)
public interface AddEnumValueChange extends Change {

    String ADD_ENUM_VALUE_CHANGE = "AddEnumValueChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>addEnumValue</code> on types</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>The name of the field/attribute definition updated.</p>
     * @return fieldName
     */
    @NotNull
    @JsonProperty("fieldName")
    public String getFieldName();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public EnumValue getNextValue();

    public void setChange(final String change);

    public void setFieldName(final String fieldName);

    public void setNextValue(final EnumValue nextValue);

    public static AddEnumValueChange of() {
        return new AddEnumValueChangeImpl();
    }

    public static AddEnumValueChange of(final AddEnumValueChange template) {
        AddEnumValueChangeImpl instance = new AddEnumValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddEnumValueChangeBuilder builder() {
        return AddEnumValueChangeBuilder.of();
    }

    public static AddEnumValueChangeBuilder builder(final AddEnumValueChange template) {
        return AddEnumValueChangeBuilder.of(template);
    }

    default <T> T withAddEnumValueChange(Function<AddEnumValueChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddEnumValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddEnumValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddEnumValueChange>";
            }
        };
    }
}
