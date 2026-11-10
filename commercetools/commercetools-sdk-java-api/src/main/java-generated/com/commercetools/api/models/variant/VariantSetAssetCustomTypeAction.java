
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.FieldContainer;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets or removes the Custom Type on an existing Asset of a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetCustomTypeAction variantSetAssetCustomTypeAction = VariantSetAssetCustomTypeAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetCustomType")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetCustomTypeActionImpl.class)
public interface VariantSetAssetCustomTypeAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetCustomTypeAction
     */
    String SET_ASSET_CUSTOM_TYPE = "setAssetCustomType";

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Asset with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @return type
     */
    @Valid
    @JsonProperty("type")
    public TypeResourceIdentifier getType();

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Asset.</p>
     * @return fields
     */
    @Valid
    @JsonProperty("fields")
    public FieldContainer getFields();

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     */

    public void setAssetId(final String assetId);

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     *  <p>Defines the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that extends the Asset with <span>Custom Fields</span>. If absent, any existing Type and Custom Fields are removed from the Asset.</p>
     * @param type value to be set
     */

    public void setType(final TypeResourceIdentifier type);

    /**
     *  <p>Sets the <span>Custom Fields</span> fields for the Asset.</p>
     * @param fields value to be set
     */

    public void setFields(final FieldContainer fields);

    /**
     * factory method
     * @return instance of VariantSetAssetCustomTypeAction
     */
    public static VariantSetAssetCustomTypeAction of() {
        return new VariantSetAssetCustomTypeActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetCustomTypeAction of(final VariantSetAssetCustomTypeAction template) {
        VariantSetAssetCustomTypeActionImpl instance = new VariantSetAssetCustomTypeActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setType(template.getType());
        instance.setFields(template.getFields());
        return instance;
    }

    public VariantSetAssetCustomTypeAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetCustomTypeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetCustomTypeAction deepCopy(@Nullable final VariantSetAssetCustomTypeAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetCustomTypeActionImpl instance = new VariantSetAssetCustomTypeActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setType(com.commercetools.api.models.type.TypeResourceIdentifier.deepCopy(template.getType()));
        instance.setFields(com.commercetools.api.models.type.FieldContainer.deepCopy(template.getFields()));
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetCustomTypeAction
     * @return builder
     */
    public static VariantSetAssetCustomTypeActionBuilder builder() {
        return VariantSetAssetCustomTypeActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetCustomTypeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetCustomTypeActionBuilder builder(final VariantSetAssetCustomTypeAction template) {
        return VariantSetAssetCustomTypeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetCustomTypeAction(Function<VariantSetAssetCustomTypeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetCustomTypeAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetCustomTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetCustomTypeAction>";
            }
        };
    }
}
