
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
 * ChangeEnumValueOrderChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeEnumValueOrderChange changeEnumValueOrderChange = ChangeEnumValueOrderChange.builder()
 *             .change("{change}")
 *             .fieldName("{fieldName}")
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Update action for <code>changeEnumValueOrder</code> on types</p>
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
     *  <p>Update action for <code>changeEnumValueOrder</code> on types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the field/attribute definition updated.</p>
     * @param fieldName value to be set
     */

    public void setFieldName(final String fieldName);

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
     * @return instance of ChangeEnumValueOrderChange
     */
    public static ChangeEnumValueOrderChange of() {
        return new ChangeEnumValueOrderChangeImpl();
    }

    /**
     * factory method to copy an instance of ChangeEnumValueOrderChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeEnumValueOrderChange of(final ChangeEnumValueOrderChange template) {
        ChangeEnumValueOrderChangeImpl instance = new ChangeEnumValueOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setFieldName(template.getFieldName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
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
