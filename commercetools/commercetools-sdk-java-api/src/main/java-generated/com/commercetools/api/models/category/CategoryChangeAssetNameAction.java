
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategoryChangeAssetNameActionImpl.class)
public interface CategoryChangeAssetNameAction extends CategoryUpdateAction {

    String CHANGE_ASSET_NAME = "changeAssetName";

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

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
}
