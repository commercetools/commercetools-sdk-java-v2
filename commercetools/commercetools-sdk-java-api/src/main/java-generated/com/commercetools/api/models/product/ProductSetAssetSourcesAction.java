
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetSourcesAction productSetAssetSourcesAction = ProductSetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetSourcesActionImpl.class)
public interface ProductSetAssetSourcesAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetAssetSourcesAction
     */
    String SET_ASSET_SOURCES = "setAssetSources";

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code> both the current and staged Asset is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Value to set.</p>
     * @return sources
     */
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code> both the current and staged Asset is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     */

    public void setAssetId(final String assetId);

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     *  <p>Value to set.</p>
     * @param sources values to be set
     */

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    /**
     *  <p>Value to set.</p>
     * @param sources values to be set
     */

    public void setSources(final List<AssetSource> sources);

    /**
     * factory method
     * @return instance of ProductSetAssetSourcesAction
     */
    public static ProductSetAssetSourcesAction of() {
        return new ProductSetAssetSourcesActionImpl();
    }

    /**
     * factory method to copy an instance of ProductSetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetAssetSourcesAction of(final ProductSetAssetSourcesAction template) {
        ProductSetAssetSourcesActionImpl instance = new ProductSetAssetSourcesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    /**
     * builder factory method for ProductSetAssetSourcesAction
     * @return builder
     */
    public static ProductSetAssetSourcesActionBuilder builder() {
        return ProductSetAssetSourcesActionBuilder.of();
    }

    /**
     * create builder for ProductSetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAssetSourcesActionBuilder builder(final ProductSetAssetSourcesAction template) {
        return ProductSetAssetSourcesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetAssetSourcesAction(Function<ProductSetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetSourcesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetSourcesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetSourcesAction>";
            }
        };
    }
}
