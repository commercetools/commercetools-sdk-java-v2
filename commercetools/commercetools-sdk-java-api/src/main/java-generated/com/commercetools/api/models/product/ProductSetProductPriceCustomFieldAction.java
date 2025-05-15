
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * ProductSetProductPriceCustomFieldAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetProductPriceCustomFieldAction productSetProductPriceCustomFieldAction = ProductSetProductPriceCustomFieldAction.builder()
 *             .priceId("{priceId}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setProductPriceCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetProductPriceCustomFieldActionImpl.class)
public interface ProductSetProductPriceCustomFieldAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetProductPriceCustomFieldAction
     */
    String SET_PRODUCT_PRICE_CUSTOM_FIELD = "setProductPriceCustomField";

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @return priceId
     */
    @NotNull
    @JsonProperty("priceId")
    public String getPriceId();

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price Custom Field is updated. If <code>false</code>, both the current and staged Embedded Price Custom Field are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>The <code>id</code> of the Embedded Price to update.</p>
     * @param priceId value to be set
     */

    public void setPriceId(final String priceId);

    /**
     *  <p>If <code>true</code>, only the staged Embedded Price Custom Field is updated. If <code>false</code>, both the current and staged Embedded Price Custom Field are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of ProductSetProductPriceCustomFieldAction
     */
    public static ProductSetProductPriceCustomFieldAction of() {
        return new ProductSetProductPriceCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetProductPriceCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetProductPriceCustomFieldAction of(final ProductSetProductPriceCustomFieldAction template) {
        ProductSetProductPriceCustomFieldActionImpl instance = new ProductSetProductPriceCustomFieldActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public ProductSetProductPriceCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetProductPriceCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetProductPriceCustomFieldAction deepCopy(
            @Nullable final ProductSetProductPriceCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        ProductSetProductPriceCustomFieldActionImpl instance = new ProductSetProductPriceCustomFieldActionImpl();
        instance.setPriceId(template.getPriceId());
        instance.setStaged(template.getStaged());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for ProductSetProductPriceCustomFieldAction
     * @return builder
     */
    public static ProductSetProductPriceCustomFieldActionBuilder builder() {
        return ProductSetProductPriceCustomFieldActionBuilder.of();
    }

    /**
     * create builder for ProductSetProductPriceCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetProductPriceCustomFieldActionBuilder builder(
            final ProductSetProductPriceCustomFieldAction template) {
        return ProductSetProductPriceCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetProductPriceCustomFieldAction(
            Function<ProductSetProductPriceCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    public static ProductSetProductPriceCustomFieldAction ofUnset(final String name, final String priceId) {
        return ProductSetProductPriceCustomFieldActionBuilder.of().name(name).priceId(priceId).build();
    }

    public static ProductSetProductPriceCustomFieldAction ofUnsetStaged(final String name, final String priceId,
            final Boolean staged) {
        return ProductSetProductPriceCustomFieldActionBuilder.of().name(name).priceId(priceId).staged(staged).build();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetProductPriceCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetProductPriceCustomFieldAction>";
            }
        };
    }
}
