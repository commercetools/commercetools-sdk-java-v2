
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

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
 *     ProductSetAssetTagsAction productSetAssetTagsAction = ProductSetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetTags")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetAssetTagsActionImpl.class)
public interface ProductSetAssetTagsAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetAssetTagsAction
     */
    String SET_ASSET_TAGS = "setAssetTags";

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
     * @return instance of ProductSetAssetTagsAction
     */
    public static ProductSetAssetTagsAction of() {
        return new ProductSetAssetTagsActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetAssetTagsAction of(final ProductSetAssetTagsAction template) {
        ProductSetAssetTagsActionImpl instance = new ProductSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    public ProductSetAssetTagsAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetAssetTagsAction deepCopy(@Nullable final ProductSetAssetTagsAction template) {
        if (template == null) {
            return null;
        }
        ProductSetAssetTagsActionImpl instance = new ProductSetAssetTagsActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(Optional.ofNullable(template.getTags()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSetAssetTagsAction
     * @return builder
     */
    public static ProductSetAssetTagsActionBuilder builder() {
        return ProductSetAssetTagsActionBuilder.of();
    }

    /**
     * create builder for ProductSetAssetTagsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetAssetTagsActionBuilder builder(final ProductSetAssetTagsAction template) {
        return ProductSetAssetTagsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetAssetTagsAction(Function<ProductSetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetTagsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetAssetTagsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetAssetTagsAction>";
            }
        };
    }
}
