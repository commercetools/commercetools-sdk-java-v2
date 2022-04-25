
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetKeyActionImpl.class)
public interface CategorySetAssetKeyAction extends CategoryUpdateAction {

    String SET_ASSET_KEY = "setAssetKey";

    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();

    /**
    *  <p>User-defined identifier for the asset.
    *  If left blank or set to <code>null</code>, the asset key is unset/removed.</p>
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
