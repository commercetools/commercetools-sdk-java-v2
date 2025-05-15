
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. The Asset to remove must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringRemoveAssetAction productTailoringRemoveAssetAction = ProductTailoringRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeAsset")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringRemoveAssetActionImpl.class)
public interface ProductTailoringRemoveAssetAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringRemoveAssetAction
     */
    String REMOVE_ASSET = "removeAsset";

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @JsonProperty("sku")
    public String getSku();

    /**
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @return assetId
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     */

    public void setSku(final String sku);

    /**
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @param assetId value to be set
     */

    public void setAssetId(final String assetId);

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     * factory method
     * @return instance of ProductTailoringRemoveAssetAction
     */
    public static ProductTailoringRemoveAssetAction of() {
        return new ProductTailoringRemoveAssetActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringRemoveAssetAction of(final ProductTailoringRemoveAssetAction template) {
        ProductTailoringRemoveAssetActionImpl instance = new ProductTailoringRemoveAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public ProductTailoringRemoveAssetAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringRemoveAssetAction deepCopy(
            @Nullable final ProductTailoringRemoveAssetAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringRemoveAssetActionImpl instance = new ProductTailoringRemoveAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringRemoveAssetAction
     * @return builder
     */
    public static ProductTailoringRemoveAssetActionBuilder builder() {
        return ProductTailoringRemoveAssetActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringRemoveAssetActionBuilder builder(final ProductTailoringRemoveAssetAction template) {
        return ProductTailoringRemoveAssetActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringRemoveAssetAction(Function<ProductTailoringRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringRemoveAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringRemoveAssetAction>";
            }
        };
    }
}
