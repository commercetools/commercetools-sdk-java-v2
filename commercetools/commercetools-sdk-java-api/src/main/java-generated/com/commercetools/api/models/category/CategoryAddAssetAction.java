
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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

    String ADD_ASSET = "addAsset";

    /**
     *  <p>Value to append.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetDraft getAsset();

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    @JsonProperty("position")
    public Integer getPosition();

    public void setAsset(final AssetDraft asset);

    public void setPosition(final Integer position);

    public static CategoryAddAssetAction of() {
        return new CategoryAddAssetActionImpl();
    }

    public static CategoryAddAssetAction of(final CategoryAddAssetAction template) {
        CategoryAddAssetActionImpl instance = new CategoryAddAssetActionImpl();
        instance.setAsset(template.getAsset());
        instance.setPosition(template.getPosition());
        return instance;
    }

    public static CategoryAddAssetActionBuilder builder() {
        return CategoryAddAssetActionBuilder.of();
    }

    public static CategoryAddAssetActionBuilder builder(final CategoryAddAssetAction template) {
        return CategoryAddAssetActionBuilder.of(template);
    }

    default <T> T withCategoryAddAssetAction(Function<CategoryAddAssetAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryAddAssetAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryAddAssetAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryAddAssetAction>";
            }
        };
    }
}
