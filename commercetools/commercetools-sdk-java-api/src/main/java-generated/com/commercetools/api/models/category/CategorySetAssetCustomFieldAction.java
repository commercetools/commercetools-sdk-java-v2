
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetCustomFieldActionImpl.class)
public interface CategorySetAssetCustomFieldAction extends CategoryUpdateAction {

    String SET_ASSET_CUSTOM_FIELD = "setAssetCustomField";

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

    @NotNull
    @JsonProperty("name")
    public String getName();

    @JsonProperty("value")
    public Object getValue();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setName(final String name);

    public void setValue(final Object value);

    public static CategorySetAssetCustomFieldAction of() {
        return new CategorySetAssetCustomFieldActionImpl();
    }

    public static CategorySetAssetCustomFieldAction of(final CategorySetAssetCustomFieldAction template) {
        CategorySetAssetCustomFieldActionImpl instance = new CategorySetAssetCustomFieldActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static CategorySetAssetCustomFieldActionBuilder builder() {
        return CategorySetAssetCustomFieldActionBuilder.of();
    }

    public static CategorySetAssetCustomFieldActionBuilder builder(final CategorySetAssetCustomFieldAction template) {
        return CategorySetAssetCustomFieldActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetCustomFieldAction(Function<CategorySetAssetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
}
