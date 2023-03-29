
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.LocalizedEnumValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveLocalizedEnumValuesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveLocalizedEnumValuesChange removeLocalizedEnumValuesChange = RemoveLocalizedEnumValuesChange.builder()
 *             .change("{change}")
 *             .attributeName("{attributeName}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RemoveLocalizedEnumValuesChangeImpl.class)
public interface RemoveLocalizedEnumValuesChange extends Change {

    /**
     * discriminator value for RemoveLocalizedEnumValuesChange
     */
    String REMOVE_LOCALIZED_ENUM_VALUES_CHANGE = "RemoveLocalizedEnumValuesChange";

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
    public LocalizedEnumValue getPreviousValue();

    /**
     *  <p>Update action for <code>removeEnumValues</code> on product types</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>The name of the attribute updated.</p>
     * @param attributeName value to be set
     */

    public void setAttributeName(final String attributeName);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedEnumValue previousValue);

    /**
     * factory method
     * @return instance of RemoveLocalizedEnumValuesChange
     */
    public static RemoveLocalizedEnumValuesChange of() {
        return new RemoveLocalizedEnumValuesChangeImpl();
    }

    /**
     * factory method to create a shallow copy RemoveLocalizedEnumValuesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static RemoveLocalizedEnumValuesChange of(final RemoveLocalizedEnumValuesChange template) {
        RemoveLocalizedEnumValuesChangeImpl instance = new RemoveLocalizedEnumValuesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of RemoveLocalizedEnumValuesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RemoveLocalizedEnumValuesChange deepCopy(@Nullable final RemoveLocalizedEnumValuesChange template) {
        if (template == null) {
            return null;
        }
        RemoveLocalizedEnumValuesChangeImpl instance = new RemoveLocalizedEnumValuesChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setPreviousValue(
            com.commercetools.history.models.change_value.LocalizedEnumValue.deepCopy(template.getPreviousValue()));
        return instance;
    }

    /**
     * builder factory method for RemoveLocalizedEnumValuesChange
     * @return builder
     */
    public static RemoveLocalizedEnumValuesChangeBuilder builder() {
        return RemoveLocalizedEnumValuesChangeBuilder.of();
    }

    /**
     * create builder for RemoveLocalizedEnumValuesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveLocalizedEnumValuesChangeBuilder builder(final RemoveLocalizedEnumValuesChange template) {
        return RemoveLocalizedEnumValuesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRemoveLocalizedEnumValuesChange(Function<RemoveLocalizedEnumValuesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RemoveLocalizedEnumValuesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveLocalizedEnumValuesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveLocalizedEnumValuesChange>";
            }
        };
    }
}
