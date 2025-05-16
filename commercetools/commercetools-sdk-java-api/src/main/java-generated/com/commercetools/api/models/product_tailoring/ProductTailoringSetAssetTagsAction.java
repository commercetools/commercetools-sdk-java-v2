
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetTagsAction productTailoringSetAssetTagsAction = ProductTailoringSetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetTags")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetAssetTagsActionImpl.class)
public interface ProductTailoringSetAssetTagsAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetAssetTagsAction
     */
    String SET_ASSET_TAGS = "setAssetTags";

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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
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
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */

    @JsonProperty("tags")
    public List<String> getTags();

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
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */

    @JsonIgnore
    public void setTags(final String... tags);

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */

    public void setTags(final List<String> tags);

    /**
     * factory method
     * @return instance of ProductTailoringSetAssetTagsAction
     */
    public static ProductTailoringSetAssetTagsAction of() {
        return new ProductTailoringSetAssetTagsActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetAssetTagsAction of(final ProductTailoringSetAssetTagsAction template) {
        ProductTailoringSetAssetTagsActionImpl instance = new ProductTailoringSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    public ProductTailoringSetAssetTagsAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetAssetTagsAction deepCopy(
            @Nullable final ProductTailoringSetAssetTagsAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetAssetTagsActionImpl instance = new ProductTailoringSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(Optional.ofNullable(template.getTags()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetAssetTagsAction
     * @return builder
     */
    public static ProductTailoringSetAssetTagsActionBuilder builder() {
        return ProductTailoringSetAssetTagsActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetAssetTagsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetTagsActionBuilder builder(final ProductTailoringSetAssetTagsAction template) {
        return ProductTailoringSetAssetTagsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetAssetTagsAction(Function<ProductTailoringSetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetTagsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetTagsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetAssetTagsAction>";
            }
        };
    }
}
