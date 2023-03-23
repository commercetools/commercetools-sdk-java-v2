
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
 * RemoveEnumValuesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveEnumValuesChange removeEnumValuesChange = RemoveEnumValuesChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveEnumValuesChangeImpl.class)
public interface RemoveEnumValuesChange extends Change {

    String REMOVE_ENUM_VALUES_CHANGE = "RemoveEnumValuesChange";

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Update action for <code>removeEnumValues</code> on product types</p>
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
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public EnumValue getPreviousValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setPreviousValue(final EnumValue previousValue);

    public static RemoveEnumValuesChange of() {
        return new RemoveEnumValuesChangeImpl();
    }

    public static RemoveEnumValuesChange of(final RemoveEnumValuesChange template) {
        RemoveEnumValuesChangeImpl instance = new RemoveEnumValuesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveEnumValuesChangeBuilder builder() {
        return RemoveEnumValuesChangeBuilder.of();
    }

    public static RemoveEnumValuesChangeBuilder builder(final RemoveEnumValuesChange template) {
        return RemoveEnumValuesChangeBuilder.of(template);
    }

    default <T> T withRemoveEnumValuesChange(Function<RemoveEnumValuesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveEnumValuesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveEnumValuesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveEnumValuesChange>";
            }
        };
    }
}
