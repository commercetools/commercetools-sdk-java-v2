
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodSetLocalizedNameAction" rel="nofollow">Set Localized Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSetLocalizedNameChange shippingMethodSetLocalizedNameChange = ShippingMethodSetLocalizedNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodSetLocalizedNameChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodSetLocalizedNameChangeImpl.class)
public interface ShippingMethodSetLocalizedNameChange extends Change {

    /**
     * discriminator value for ShippingMethodSetLocalizedNameChange
     */
    String SHIPPING_METHOD_SET_LOCALIZED_NAME_CHANGE = "ShippingMethodSetLocalizedNameChange";

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
     * @return instance of ShippingMethodSetLocalizedNameChange
     */
    public static ShippingMethodSetLocalizedNameChange of() {
        return new ShippingMethodSetLocalizedNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodSetLocalizedNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodSetLocalizedNameChange of(final ShippingMethodSetLocalizedNameChange template) {
        ShippingMethodSetLocalizedNameChangeImpl instance = new ShippingMethodSetLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodSetLocalizedNameChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodSetLocalizedNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodSetLocalizedNameChange deepCopy(
            @Nullable final ShippingMethodSetLocalizedNameChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodSetLocalizedNameChangeImpl instance = new ShippingMethodSetLocalizedNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodSetLocalizedNameChange
     * @return builder
     */
    public static ShippingMethodSetLocalizedNameChangeBuilder builder() {
        return ShippingMethodSetLocalizedNameChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodSetLocalizedNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSetLocalizedNameChangeBuilder builder(
            final ShippingMethodSetLocalizedNameChange template) {
        return ShippingMethodSetLocalizedNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodSetLocalizedNameChange(Function<ShippingMethodSetLocalizedNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodSetLocalizedNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodSetLocalizedNameChange>";
            }
        };
    }
}
