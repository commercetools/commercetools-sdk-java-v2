
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetSourcesAction productTailoringSetAssetSourcesAction = ProductTailoringSetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetAssetSourcesActionImpl.class)
public interface ProductTailoringSetAssetSourcesAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetAssetSourcesAction
     */
    String SET_ASSET_SOURCES = "setAssetSources";

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
     * @return instance of ProductTailoringSetAssetSourcesAction
     */
    public static ProductTailoringSetAssetSourcesAction of() {
        return new ProductTailoringSetAssetSourcesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetAssetSourcesAction of(final ProductTailoringSetAssetSourcesAction template) {
        ProductTailoringSetAssetSourcesActionImpl instance = new ProductTailoringSetAssetSourcesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetAssetSourcesAction deepCopy(
            @Nullable final ProductTailoringSetAssetSourcesAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetAssetSourcesActionImpl instance = new ProductTailoringSetAssetSourcesActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(Optional.ofNullable(template.getSources())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetAssetSourcesAction
     * @return builder
     */
    public static ProductTailoringSetAssetSourcesActionBuilder builder() {
        return ProductTailoringSetAssetSourcesActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetSourcesActionBuilder builder(
            final ProductTailoringSetAssetSourcesAction template) {
        return ProductTailoringSetAssetSourcesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetAssetSourcesAction(Function<ProductTailoringSetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetSourcesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetSourcesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetAssetSourcesAction>";
            }
        };
    }
}
