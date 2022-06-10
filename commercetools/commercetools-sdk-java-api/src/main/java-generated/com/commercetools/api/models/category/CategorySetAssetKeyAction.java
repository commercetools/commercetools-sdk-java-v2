
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Set or remove the <code>key</code> of an Asset.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetKeyAction categorySetAssetKeyAction = CategorySetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetKeyActionImpl.class)
public interface CategorySetAssetKeyAction extends CategoryUpdateAction {

    String SET_ASSET_KEY = "setAssetKey";

    /**
     *  <p>Value to set.</p>
     */
    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public static CategorySetAssetKeyAction of() {
        return new CategorySetAssetKeyActionImpl();
    }

    public static CategorySetAssetKeyAction of(final CategorySetAssetKeyAction template) {
        CategorySetAssetKeyActionImpl instance = new CategorySetAssetKeyActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public static CategorySetAssetKeyActionBuilder builder() {
        return CategorySetAssetKeyActionBuilder.of();
    }

    public static CategorySetAssetKeyActionBuilder builder(final CategorySetAssetKeyAction template) {
        return CategorySetAssetKeyActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetKeyAction(Function<CategorySetAssetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetKeyAction>";
            }
        };
    }
}
