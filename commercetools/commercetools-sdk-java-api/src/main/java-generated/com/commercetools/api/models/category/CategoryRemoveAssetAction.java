
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryRemoveAssetAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryRemoveAssetAction categoryRemoveAssetAction = CategoryRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryRemoveAssetActionImpl.class)
public interface CategoryRemoveAssetAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryRemoveAssetAction
     */
    String REMOVE_ASSET = "removeAsset";

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     */

    public void setAssetId(final String assetId);

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     * factory method
     * @return instance of CategoryRemoveAssetAction
     */
    public static CategoryRemoveAssetAction of() {
        return new CategoryRemoveAssetActionImpl();
    }

    /**
     * factory method to create a shallow copy CategoryRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryRemoveAssetAction of(final CategoryRemoveAssetAction template) {
        CategoryRemoveAssetActionImpl instance = new CategoryRemoveAssetActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryRemoveAssetAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryRemoveAssetAction deepCopy(@Nullable final CategoryRemoveAssetAction template) {
        if (template == null) {
            return null;
        }
        CategoryRemoveAssetActionImpl instance = new CategoryRemoveAssetActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for CategoryRemoveAssetAction
     * @return builder
     */
    public static CategoryRemoveAssetActionBuilder builder() {
        return CategoryRemoveAssetActionBuilder.of();
    }

    /**
     * create builder for CategoryRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryRemoveAssetActionBuilder builder(final CategoryRemoveAssetAction template) {
        return CategoryRemoveAssetActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryRemoveAssetAction(Function<CategoryRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryRemoveAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryRemoveAssetAction>";
            }
        };
    }
}
