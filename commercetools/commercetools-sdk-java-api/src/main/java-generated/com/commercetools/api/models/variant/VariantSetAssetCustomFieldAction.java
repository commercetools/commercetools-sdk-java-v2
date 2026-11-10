
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets or removes a Custom Field on an existing Asset of a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetCustomFieldAction variantSetAssetCustomFieldAction = VariantSetAssetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetCustomField")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetCustomFieldActionImpl.class)
public interface VariantSetAssetCustomFieldAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetCustomFieldAction
     */
    String SET_ASSET_CUSTOM_FIELD = "setAssetCustomField";

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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */

    @JsonProperty("value")
    public Object getValue();

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
     *  <p>Name of the <span>Custom Field</span>.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of VariantSetAssetCustomFieldAction
     */
    public static VariantSetAssetCustomFieldAction of() {
        return new VariantSetAssetCustomFieldActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetCustomFieldAction of(final VariantSetAssetCustomFieldAction template) {
        VariantSetAssetCustomFieldActionImpl instance = new VariantSetAssetCustomFieldActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public VariantSetAssetCustomFieldAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetCustomFieldAction deepCopy(@Nullable final VariantSetAssetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetCustomFieldActionImpl instance = new VariantSetAssetCustomFieldActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetCustomFieldAction
     * @return builder
     */
    public static VariantSetAssetCustomFieldActionBuilder builder() {
        return VariantSetAssetCustomFieldActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetCustomFieldActionBuilder builder(final VariantSetAssetCustomFieldAction template) {
        return VariantSetAssetCustomFieldActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetCustomFieldAction(Function<VariantSetAssetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetCustomFieldAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetCustomFieldAction>";
            }
        };
    }
}
