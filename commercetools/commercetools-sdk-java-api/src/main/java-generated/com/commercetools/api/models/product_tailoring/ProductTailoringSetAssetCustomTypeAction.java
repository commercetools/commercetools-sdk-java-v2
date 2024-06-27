
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Either <code>variantId</code> or <code>sku</code> is required to reference a ProductVariant that exists. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetCustomTypeAction productTailoringSetAssetCustomTypeAction = ProductTailoringSetAssetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetAssetCustomTypeActionImpl.class)
public interface ProductTailoringSetAssetCustomTypeAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetAssetCustomTypeAction
     */
    String SET_ASSET_CUSTOM_TYPE = "setAssetCustomType";

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
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

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
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of ProductTailoringSetAssetCustomTypeAction
     */
    public static ProductTailoringSetAssetCustomTypeAction of() {
        return new ProductTailoringSetAssetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetAssetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetAssetCustomTypeAction of(final ProductTailoringSetAssetCustomTypeAction template) {
        ProductTailoringSetAssetCustomTypeActionImpl instance = new ProductTailoringSetAssetCustomTypeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetAssetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetAssetCustomTypeAction deepCopy(
            @Nullable final ProductTailoringSetAssetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetAssetCustomTypeActionImpl instance = new ProductTailoringSetAssetCustomTypeActionImpl();
        instance.setVariantId(template.getVariantId());
        instance.setSku(template.getSku());
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetAssetCustomTypeAction
     * @return builder
     */
    public static ProductTailoringSetAssetCustomTypeActionBuilder builder() {
        return ProductTailoringSetAssetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetAssetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetCustomTypeActionBuilder builder(
            final ProductTailoringSetAssetCustomTypeAction template) {
        return ProductTailoringSetAssetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetAssetCustomTypeAction(
            Function<ProductTailoringSetAssetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetAssetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetAssetCustomTypeAction>";
            }
        };
    }
}
