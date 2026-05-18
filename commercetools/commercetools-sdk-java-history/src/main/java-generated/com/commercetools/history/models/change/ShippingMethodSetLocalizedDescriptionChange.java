
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodSetLocalizedDescriptionAction" rel="nofollow">Set Localized Description</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedDescriptionChange shippingMethodSetLocalizedDescriptionChange = ShippingMethodSetLocalizedDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodSetLocalizedDescriptionChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedDescriptionChangeImpl.class)
public interface ShippingMethodSetLocalizedDescriptionChange extends Change {

    /**
     * discriminator value for ShippingMethodSetLocalizedDescriptionChange
     */
    String SHIPPING_METHOD_SET_LOCALIZED_DESCRIPTION_CHANGE = "ShippingMethodSetLocalizedDescriptionChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

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
     * factory method
     * @return instance of ShippingMethodSetLocalizedDescriptionChange
     */
    public static ShippingMethodSetLocalizedDescriptionChange of() {
        return new ShippingMethodSetLocalizedDescriptionChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetLocalizedDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetLocalizedDescriptionChange of(
            final ShippingMethodSetLocalizedDescriptionChange template) {
        ShippingMethodSetLocalizedDescriptionChangeImpl instance = new ShippingMethodSetLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodSetLocalizedDescriptionChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetLocalizedDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetLocalizedDescriptionChange deepCopy(
            @Nullable final ShippingMethodSetLocalizedDescriptionChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetLocalizedDescriptionChangeImpl instance = new ShippingMethodSetLocalizedDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetLocalizedDescriptionChange
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionChangeBuilder builder() {
        return ShippingMethodSetLocalizedDescriptionChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetLocalizedDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedDescriptionChangeBuilder builder(
            final ShippingMethodSetLocalizedDescriptionChange template) {
        return ShippingMethodSetLocalizedDescriptionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetLocalizedDescriptionChange(
            Function<ShippingMethodSetLocalizedDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetLocalizedDescriptionChange>";
            }
        };
    }
}
