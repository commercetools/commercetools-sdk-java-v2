
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String REMOVE_ASSET = "removeAsset";

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public static CategoryRemoveAssetAction of() {
        return new CategoryRemoveAssetActionImpl();
    }

    public static CategoryRemoveAssetAction of(final CategoryRemoveAssetAction template) {
        CategoryRemoveAssetActionImpl instance = new CategoryRemoveAssetActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static CategoryRemoveAssetActionBuilder builder() {
        return CategoryRemoveAssetActionBuilder.of();
    }

    public static CategoryRemoveAssetActionBuilder builder(final CategoryRemoveAssetAction template) {
        return CategoryRemoveAssetActionBuilder.of(template);
    }

    default <T> T withCategoryRemoveAssetAction(Function<CategoryRemoveAssetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryRemoveAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryRemoveAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryRemoveAssetAction>";
            }
        };
    }
}
