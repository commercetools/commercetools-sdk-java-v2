
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddAssetAction productAddAssetAction = ProductAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductAddAssetActionImpl.class)
public interface ProductAddAssetAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductAddAssetAction
     */
    String ADD_ASSET = "addAsset";

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
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to append.</p>
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @return position
     */

    @JsonProperty("position")
    public Integer getPosition();

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
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>Value to append.</p>
     * @param asset value to be set
     */

    public void setAsset(final AssetDraft asset);

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @param position value to be set
     */

    public void setPosition(final Integer position);

    /**
     * factory method
     * @return instance of ProductAddAssetAction
     */
    public static ProductAddAssetAction of() {
        return new ProductAddAssetActionImpl();
    }

    /**
     * factory method to copy an instance of ProductAddAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductAddAssetAction of(final ProductAddAssetAction template) {
        ProductAddAssetActionImpl instance = new ProductAddAssetActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    /**
     * builder factory method for ProductAddAssetAction
     * @return builder
     */
    public static ProductAddAssetActionBuilder builder() {
        return ProductAddAssetActionBuilder.of();
    }

    /**
     * create builder for ProductAddAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductAddAssetActionBuilder builder(final ProductAddAssetAction template) {
        return ProductAddAssetActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductAddAssetAction(Function<ProductAddAssetAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductAddAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductAddAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductAddAssetAction>";
            }
        };
    }
}
