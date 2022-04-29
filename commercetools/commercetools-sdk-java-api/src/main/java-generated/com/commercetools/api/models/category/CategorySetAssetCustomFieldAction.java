
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

    /**
    *  <p>Name of the <a href="/../api/projects/custom-fields">Custom Field</a>.</p>
    */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
    *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists.
    *  Trying to remove a field that does not exist will fail with an <a href="/../api/errors#general-400-invalid-operation">InvalidOperation</a> error.
    *  If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
    */

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

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetCustomFieldAction>";
            }
        };
    }
}
