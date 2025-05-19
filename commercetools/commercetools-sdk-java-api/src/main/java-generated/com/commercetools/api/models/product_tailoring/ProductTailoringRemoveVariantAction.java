
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>id</code> or <code>sku</code> is required. Produces the ProductVariantTailoringDeleted Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringRemoveVariantAction productTailoringRemoveVariantAction = ProductTailoringRemoveVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeVariant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringRemoveVariantActionImpl.class)
public interface ProductTailoringRemoveVariantAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringRemoveVariantAction
     */
    String REMOVE_VARIANT = "removeVariant";

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove from the Tailoring.</p>
     * @return id
     */

    @JsonProperty("id")
    public Long getId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove from the Tailoring.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged Product Variant Tailoring is removed. If <code>false</code>, both the current and staged Product Variant Tailoring is removed.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to remove from the Tailoring.</p>
     * @param id value to be set
     */

    public void setId(final Long id);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to remove from the Tailoring.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>If <code>true</code>, only the staged Product Variant Tailoring is removed. If <code>false</code>, both the current and staged Product Variant Tailoring is removed.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringRemoveVariantAction
     */
    public static ProductTailoringRemoveVariantAction of() {
        return new ProductTailoringRemoveVariantActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringRemoveVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringRemoveVariantAction of(final ProductTailoringRemoveVariantAction template) {
        ProductTailoringRemoveVariantActionImpl instance = new ProductTailoringRemoveVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringRemoveVariantAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringRemoveVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringRemoveVariantAction deepCopy(
            @Nullable final ProductTailoringRemoveVariantAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringRemoveVariantActionImpl instance = new ProductTailoringRemoveVariantActionImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringRemoveVariantAction
     * @return builder
     */
    public static ProductTailoringRemoveVariantActionBuilder builder() {
        return ProductTailoringRemoveVariantActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringRemoveVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringRemoveVariantActionBuilder builder(
            final ProductTailoringRemoveVariantAction template) {
        return ProductTailoringRemoveVariantActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringRemoveVariantAction(Function<ProductTailoringRemoveVariantAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringRemoveVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringRemoveVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringRemoveVariantAction>";
            }
        };
    }
}
