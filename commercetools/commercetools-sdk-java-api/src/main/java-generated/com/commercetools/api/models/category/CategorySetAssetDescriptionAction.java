
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetDescriptionAction categorySetAssetDescriptionAction = CategorySetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetDescriptionActionImpl.class)
public interface CategorySetAssetDescriptionAction extends CategoryUpdateAction {

    String SET_ASSET_DESCRIPTION = "setAssetDescription";

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setDescription(final LocalizedString description);

    public static CategorySetAssetDescriptionAction of() {
        return new CategorySetAssetDescriptionActionImpl();
    }

    public static CategorySetAssetDescriptionAction of(final CategorySetAssetDescriptionAction template) {
        CategorySetAssetDescriptionActionImpl instance = new CategorySetAssetDescriptionActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public static CategorySetAssetDescriptionActionBuilder builder() {
        return CategorySetAssetDescriptionActionBuilder.of();
    }

    public static CategorySetAssetDescriptionActionBuilder builder(final CategorySetAssetDescriptionAction template) {
        return CategorySetAssetDescriptionActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetDescriptionAction(Function<CategorySetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetDescriptionAction>";
            }
        };
    }
}
