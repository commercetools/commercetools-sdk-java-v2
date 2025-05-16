
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
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringChangeAssetNameAction productTailoringChangeAssetNameAction = ProductTailoringChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeAssetName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringChangeAssetNameActionImpl.class)
public interface ProductTailoringChangeAssetNameAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringChangeAssetNameAction
     */
    String CHANGE_ASSET_NAME = "changeAssetName";

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
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

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
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ProductTailoringChangeAssetNameAction
     */
    public static ProductTailoringChangeAssetNameAction of() {
        return new ProductTailoringChangeAssetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringChangeAssetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringChangeAssetNameAction of(final ProductTailoringChangeAssetNameAction template) {
        ProductTailoringChangeAssetNameActionImpl instance = new ProductTailoringChangeAssetNameActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        return instance;
    }

    public ProductTailoringChangeAssetNameAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringChangeAssetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringChangeAssetNameAction deepCopy(
            @Nullable final ProductTailoringChangeAssetNameAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringChangeAssetNameActionImpl instance = new ProductTailoringChangeAssetNameActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringChangeAssetNameAction
     * @return builder
     */
    public static ProductTailoringChangeAssetNameActionBuilder builder() {
        return ProductTailoringChangeAssetNameActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringChangeAssetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringChangeAssetNameActionBuilder builder(
            final ProductTailoringChangeAssetNameAction template) {
        return ProductTailoringChangeAssetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringChangeAssetNameAction(Function<ProductTailoringChangeAssetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringChangeAssetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringChangeAssetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringChangeAssetNameAction>";
            }
        };
    }
}
