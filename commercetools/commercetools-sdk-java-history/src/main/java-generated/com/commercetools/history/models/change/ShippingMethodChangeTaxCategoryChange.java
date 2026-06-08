
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethodChangeTaxCategoryAction" rel="nofollow">Change TaxCategory</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodChangeTaxCategoryChange shippingMethodChangeTaxCategoryChange = ShippingMethodChangeTaxCategoryChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShippingMethodChangeTaxCategoryChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShippingMethodChangeTaxCategoryChangeImpl.class)
public interface ShippingMethodChangeTaxCategoryChange extends Change {

    /**
     * discriminator value for ShippingMethodChangeTaxCategoryChange
     */
    String SHIPPING_METHOD_CHANGE_TAX_CATEGORY_CHANGE = "ShippingMethodChangeTaxCategoryChange";

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
    public Reference getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Reference previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final Reference nextValue);

    /**
     * factory method
     * @return instance of ShippingMethodChangeTaxCategoryChange
     */
    public static ShippingMethodChangeTaxCategoryChange of() {
        return new ShippingMethodChangeTaxCategoryChangeImpl();
    }

    /**
     * factory method to create a shallow copy ShippingMethodChangeTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShippingMethodChangeTaxCategoryChange of(final ShippingMethodChangeTaxCategoryChange template) {
        ShippingMethodChangeTaxCategoryChangeImpl instance = new ShippingMethodChangeTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public ShippingMethodChangeTaxCategoryChange copyDeep();

    /**
     * factory method to create a deep copy of ShippingMethodChangeTaxCategoryChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShippingMethodChangeTaxCategoryChange deepCopy(
            @Nullable final ShippingMethodChangeTaxCategoryChange template) {
        if (template == null) {
            return null;
        }
        ShippingMethodChangeTaxCategoryChangeImpl instance = new ShippingMethodChangeTaxCategoryChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.Reference.deepCopy(template.getPreviousValue()));
        instance.setNextValue(com.commercetools.history.models.common.Reference.deepCopy(template.getNextValue()));
        return instance;
    }

    /**
     * builder factory method for ShippingMethodChangeTaxCategoryChange
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryChangeBuilder builder() {
        return ShippingMethodChangeTaxCategoryChangeBuilder.of();
    }

    /**
     * create builder for ShippingMethodChangeTaxCategoryChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodChangeTaxCategoryChangeBuilder builder(
            final ShippingMethodChangeTaxCategoryChange template) {
        return ShippingMethodChangeTaxCategoryChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShippingMethodChangeTaxCategoryChange(Function<ShippingMethodChangeTaxCategoryChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeTaxCategoryChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShippingMethodChangeTaxCategoryChange>() {
            @Override
            public String toString() {
                return "TypeReference<ShippingMethodChangeTaxCategoryChange>";
            }
        };
    }
}
