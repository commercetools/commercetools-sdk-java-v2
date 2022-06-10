
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeAssetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetNameAction categoryChangeAssetNameAction = CategoryChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeAssetNameActionImpl.class)
public interface CategoryChangeAssetNameAction extends CategoryUpdateAction {

    String CHANGE_ASSET_NAME = "changeAssetName";

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
     *  <p>New value to set. Must not be empty.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setName(final LocalizedString name);

    public static CategoryChangeAssetNameAction of() {
        return new CategoryChangeAssetNameActionImpl();
    }

    public static CategoryChangeAssetNameAction of(final CategoryChangeAssetNameAction template) {
        CategoryChangeAssetNameActionImpl instance = new CategoryChangeAssetNameActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        return instance;
    }

    public static CategoryChangeAssetNameActionBuilder builder() {
        return CategoryChangeAssetNameActionBuilder.of();
    }

    public static CategoryChangeAssetNameActionBuilder builder(final CategoryChangeAssetNameAction template) {
        return CategoryChangeAssetNameActionBuilder.of(template);
    }

    default <T> T withCategoryChangeAssetNameAction(Function<CategoryChangeAssetNameAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeAssetNameAction>";
            }
        };
    }
}
