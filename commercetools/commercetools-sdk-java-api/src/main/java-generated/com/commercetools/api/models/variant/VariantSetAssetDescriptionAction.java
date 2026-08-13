
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the description of an existing Asset on a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetDescriptionAction variantSetAssetDescriptionAction = VariantSetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetDescriptionActionImpl.class)
public interface VariantSetAssetDescriptionAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetDescriptionAction
     */
    String SET_ASSET_DESCRIPTION = "setAssetDescription";

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
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of VariantSetAssetDescriptionAction
     */
    public static VariantSetAssetDescriptionAction of() {
        return new VariantSetAssetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetDescriptionAction of(final VariantSetAssetDescriptionAction template) {
        VariantSetAssetDescriptionActionImpl instance = new VariantSetAssetDescriptionActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    public VariantSetAssetDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetDescriptionAction deepCopy(@Nullable final VariantSetAssetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetDescriptionActionImpl instance = new VariantSetAssetDescriptionActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetDescriptionAction
     * @return builder
     */
    public static VariantSetAssetDescriptionActionBuilder builder() {
        return VariantSetAssetDescriptionActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetDescriptionActionBuilder builder(final VariantSetAssetDescriptionAction template) {
        return VariantSetAssetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetDescriptionAction(Function<VariantSetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetDescriptionAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetDescriptionAction>";
            }
        };
    }
}
