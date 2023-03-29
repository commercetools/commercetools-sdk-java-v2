
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.AssetDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryAddAssetAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryAddAssetAction categoryAddAssetAction = CategoryAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryAddAssetActionImpl.class)
public interface CategoryAddAssetAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryAddAssetAction
     */
    String ADD_ASSET = "addAsset";

    /**
     *  <p>Value to append.</p>
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @return position
     */

    @JsonProperty("position")
    public Integer getPosition();

    /**
     *  <p>Value to append.</p>
     * @param asset value to be set
     */

    public void setAsset(final AssetDraft asset);

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @param position value to be set
     */

    public void setPosition(final Integer position);

    /**
     * factory method
     * @return instance of CategoryAddAssetAction
     */
    public static CategoryAddAssetAction of() {
        return new CategoryAddAssetActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryAddAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryAddAssetAction of(final CategoryAddAssetAction template) {
        CategoryAddAssetActionImpl instance = new CategoryAddAssetActionImpl();
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryAddAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryAddAssetAction deepCopy(@Nullable final CategoryAddAssetAction template) {
        if (template == null) {
            return null;
        }
        CategoryAddAssetActionImpl instance = new CategoryAddAssetActionImpl();
        instance.setAsset(com.commercetools.api.models.common.AssetDraft.deepCopy(template.getAsset()));
        instance.setPosition(template.getPosition());
        return instance;
    }

    /**
     * builder factory method for CategoryAddAssetAction
     * @return builder
     */
    public static CategoryAddAssetActionBuilder builder() {
        return CategoryAddAssetActionBuilder.of();
    }

    /**
     * create builder for CategoryAddAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryAddAssetActionBuilder builder(final CategoryAddAssetAction template) {
        return CategoryAddAssetActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryAddAssetAction(Function<CategoryAddAssetAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryAddAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryAddAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryAddAssetAction>";
            }
        };
    }
}
