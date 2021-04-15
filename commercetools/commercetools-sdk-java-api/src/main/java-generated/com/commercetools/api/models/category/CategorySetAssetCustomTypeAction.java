
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetCustomTypeActionImpl.class)
public interface CategorySetAssetCustomTypeAction extends CategoryUpdateAction {

    String SET_ASSET_CUSTOM_TYPE = "setAssetCustomType";

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
    *  <p>If set, the custom type is set to this new value.
    *  If absent, the custom type and any existing custom fields are removed.</p>
    */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
    *  <p>If set, the custom fields are set to this new value.</p>
    */
    @Valid
    @JsonProperty("fields")
    public Object getFields();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final Object fields);

    public static CategorySetAssetCustomTypeAction of() {
        return new CategorySetAssetCustomTypeActionImpl();
    }

    public static CategorySetAssetCustomTypeAction of(final CategorySetAssetCustomTypeAction template) {
        CategorySetAssetCustomTypeActionImpl instance = new CategorySetAssetCustomTypeActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public static CategorySetAssetCustomTypeActionBuilder builder() {
        return CategorySetAssetCustomTypeActionBuilder.of();
    }

    public static CategorySetAssetCustomTypeActionBuilder builder(final CategorySetAssetCustomTypeAction template) {
        return CategorySetAssetCustomTypeActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetCustomTypeAction(Function<CategorySetAssetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }
}
