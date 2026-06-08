
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> that exists. The <a href="https://docs.commercetools.com/apis/ctp:api:type:Asset" rel="nofollow">Asset</a> to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetDescriptionAction productTailoringSetAssetDescriptionAction = ProductTailoringSetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetAssetDescriptionActionImpl.class)
public interface ProductTailoringSetAssetDescriptionAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetAssetDescriptionAction
     */
    String SET_ASSET_DESCRIPTION = "setAssetDescription";

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of ProductTailoringSetAssetDescriptionAction
     */
    public static ProductTailoringSetAssetDescriptionAction of() {
        return new ProductTailoringSetAssetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetAssetDescriptionAction of(
            final ProductTailoringSetAssetDescriptionAction template) {
        ProductTailoringSetAssetDescriptionActionImpl instance = new ProductTailoringSetAssetDescriptionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public ProductTailoringSetAssetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetAssetDescriptionAction deepCopy(
            @Nullable final ProductTailoringSetAssetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetAssetDescriptionActionImpl instance = new ProductTailoringSetAssetDescriptionActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetAssetDescriptionAction
     * @return builder
     */
    public static ProductTailoringSetAssetDescriptionActionBuilder builder() {
        return ProductTailoringSetAssetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetAssetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetDescriptionActionBuilder builder(
            final ProductTailoringSetAssetDescriptionAction template) {
        return ProductTailoringSetAssetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetAssetDescriptionAction(
            Function<ProductTailoringSetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetAssetDescriptionAction>";
            }
        };
    }
}
