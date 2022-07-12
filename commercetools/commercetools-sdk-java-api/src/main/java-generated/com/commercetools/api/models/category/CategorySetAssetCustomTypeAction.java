
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetCustomTypeAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetCustomTypeAction categorySetAssetCustomTypeAction = CategorySetAssetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetCustomTypeActionImpl.class)
public interface CategorySetAssetCustomTypeAction extends CategoryUpdateAction {

    String SET_ASSET_CUSTOM_TYPE = "setAssetCustomType";

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
     *  <p>Defines the Type that extends the Asset with Custom Fields. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the Custom Fields fields for the Asset.</p>
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    public void setType(final TypeResourceIdentifier type);

    public void setFields(final FieldContainer fields);

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

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetCustomTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetCustomTypeAction>";
            }
        };
    }
}
