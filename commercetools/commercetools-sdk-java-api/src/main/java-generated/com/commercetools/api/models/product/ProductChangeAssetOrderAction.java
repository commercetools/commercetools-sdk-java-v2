
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
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeAssetOrderAction productChangeAssetOrderAction = ProductChangeAssetOrderAction.builder()
 *             .plusAssetOrder(assetOrderBuilder -> assetOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeAssetOrder")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeAssetOrderActionImpl.class)
public interface ProductChangeAssetOrderAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductChangeAssetOrderAction
     */
    String CHANGE_ASSET_ORDER = "changeAssetOrder";

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     * @return assetOrder
     */
    @NotNull
    @JsonProperty("assetOrder")
    public List<String> getAssetOrder();

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> is updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     * @param assetOrder values to be set
     */

    @JsonIgnore
    public void setAssetOrder(final String... assetOrder);

    /**
     *  <p>All existing Asset <code>id</code>s of the ProductVariant in the desired new order.</p>
     * @param assetOrder values to be set
     */

    public void setAssetOrder(final List<String> assetOrder);

    /**
     * factory method
     * @return instance of ProductChangeAssetOrderAction
     */
    public static ProductChangeAssetOrderAction of() {
        return new ProductChangeAssetOrderActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductChangeAssetOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductChangeAssetOrderAction of(final ProductChangeAssetOrderAction template) {
        ProductChangeAssetOrderActionImpl instance = new ProductChangeAssetOrderActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetOrder(template.getAssetOrder());
        return instance;
    }

    public ProductChangeAssetOrderAction copyDeep();

    /**
     * factory method to create a deep copy of ProductChangeAssetOrderAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductChangeAssetOrderAction deepCopy(@Nullable final ProductChangeAssetOrderAction template) {
        if (template == null) {
            return null;
        }
        ProductChangeAssetOrderActionImpl instance = new ProductChangeAssetOrderActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetOrder(Optional.ofNullable(template.getAssetOrder()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductChangeAssetOrderAction
     * @return builder
     */
    public static ProductChangeAssetOrderActionBuilder builder() {
        return ProductChangeAssetOrderActionBuilder.of();
    }

    /**
     * create builder for ProductChangeAssetOrderAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeAssetOrderActionBuilder builder(final ProductChangeAssetOrderAction template) {
        return ProductChangeAssetOrderActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductChangeAssetOrderAction(Function<ProductChangeAssetOrderAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeAssetOrderAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeAssetOrderAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeAssetOrderAction>";
            }
        };
    }
}
