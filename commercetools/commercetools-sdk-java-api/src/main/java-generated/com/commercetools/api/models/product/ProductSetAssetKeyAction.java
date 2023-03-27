
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

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
 *     ProductSetAssetKeyAction productSetAssetKeyAction = ProductSetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetKeyActionImpl.class)
public interface ProductSetAssetKeyAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetAssetKeyAction
     */
    String SET_ASSET_KEY = "setAssetKey";

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */
    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     */

    public void setAssetId(final String assetId);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     * factory method
     * @return instance of ProductSetAssetKeyAction
     */
    public static ProductSetAssetKeyAction of() {
        return new ProductSetAssetKeyActionImpl();
    }

    /**
     * factory method to copy an instance of ProductSetAssetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetAssetKeyAction of(final ProductSetAssetKeyAction template) {
        ProductSetAssetKeyActionImpl instance = new ProductSetAssetKeyActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for ProductSetAssetKeyAction
     * @return builder
     */
    public static ProductSetAssetKeyActionBuilder builder() {
        return ProductSetAssetKeyActionBuilder.of();
    }

    /**
     * create builder for ProductSetAssetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAssetKeyActionBuilder builder(final ProductSetAssetKeyAction template) {
        return ProductSetAssetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetAssetKeyAction(Function<ProductSetAssetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetKeyAction>";
            }
        };
    }
}
