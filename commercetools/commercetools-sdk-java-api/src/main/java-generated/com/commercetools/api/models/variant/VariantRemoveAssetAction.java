
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Removes an asset from an existing Variant's assets. The asset to remove must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantRemoveAssetAction variantRemoveAssetAction = VariantRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("removeAsset")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantRemoveAssetActionImpl.class)
public interface VariantRemoveAssetAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantRemoveAssetAction
     */
    String REMOVE_ASSET = "removeAsset";

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
     * @return instance of VariantRemoveAssetAction
     */
    public static VariantRemoveAssetAction of() {
        return new VariantRemoveAssetActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantRemoveAssetAction of(final VariantRemoveAssetAction template) {
        VariantRemoveAssetActionImpl instance = new VariantRemoveAssetActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public VariantRemoveAssetAction copyDeep();

    /**
     * factory method to create a deep copy of VariantRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantRemoveAssetAction deepCopy(@Nullable final VariantRemoveAssetAction template) {
        if (template == null) {
            return null;
        }
        VariantRemoveAssetActionImpl instance = new VariantRemoveAssetActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for VariantRemoveAssetAction
     * @return builder
     */
    public static VariantRemoveAssetActionBuilder builder() {
        return VariantRemoveAssetActionBuilder.of();
    }

    /**
     * create builder for VariantRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantRemoveAssetActionBuilder builder(final VariantRemoveAssetAction template) {
        return VariantRemoveAssetActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantRemoveAssetAction(Function<VariantRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantRemoveAssetAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantRemoveAssetAction>";
            }
        };
    }
}
