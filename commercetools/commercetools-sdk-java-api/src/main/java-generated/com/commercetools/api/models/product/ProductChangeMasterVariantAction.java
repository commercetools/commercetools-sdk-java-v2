
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Assigns the specified Product Variant to the <code>masterVariant</code> and removes the same from <code>variants</code> at the same time. The current Master Variant becomes part of the <code>variants</code> array. Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeMasterVariantAction productChangeMasterVariantAction = ProductChangeMasterVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeMasterVariantActionImpl.class)
public interface ProductChangeMasterVariantAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductChangeMasterVariantAction
     */
    String CHANGE_MASTER_VARIANT = "changeMasterVariant";

    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the ProductVariant to become the Master Variant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to become the Master Variant.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>If <code>true</code>, only the staged Master Variant is changed. If <code>false</code>, both the current and staged Master Variant are changed.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductChangeMasterVariantAction
     */
    public static ProductChangeMasterVariantAction of() {
        return new ProductChangeMasterVariantActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductChangeMasterVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductChangeMasterVariantAction of(final ProductChangeMasterVariantAction template) {
        ProductChangeMasterVariantActionImpl instance = new ProductChangeMasterVariantActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductChangeMasterVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductChangeMasterVariantAction deepCopy(@Nullable final ProductChangeMasterVariantAction template) {
        if (template == null) {
            return null;
        }
        ProductChangeMasterVariantActionImpl instance = new ProductChangeMasterVariantActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductChangeMasterVariantAction
     * @return builder
     */
    public static ProductChangeMasterVariantActionBuilder builder() {
        return ProductChangeMasterVariantActionBuilder.of();
    }

    /**
     * create builder for ProductChangeMasterVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeMasterVariantActionBuilder builder(final ProductChangeMasterVariantAction template) {
        return ProductChangeMasterVariantActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductChangeMasterVariantAction(Function<ProductChangeMasterVariantAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeMasterVariantAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeMasterVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeMasterVariantAction>";
            }
        };
    }
}
