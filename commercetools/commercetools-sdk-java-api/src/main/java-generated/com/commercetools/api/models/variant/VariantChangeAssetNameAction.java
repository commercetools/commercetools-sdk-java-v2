
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Changes the name of an existing Asset on a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantChangeAssetNameAction variantChangeAssetNameAction = VariantChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeAssetName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantChangeAssetNameActionImpl.class)
public interface VariantChangeAssetNameAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantChangeAssetNameAction
     */
    String CHANGE_ASSET_NAME = "changeAssetName";

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
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
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
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
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of VariantChangeAssetNameAction
     */
    public static VariantChangeAssetNameAction of() {
        return new VariantChangeAssetNameActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantChangeAssetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantChangeAssetNameAction of(final VariantChangeAssetNameAction template) {
        VariantChangeAssetNameActionImpl instance = new VariantChangeAssetNameActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        return instance;
    }

    public VariantChangeAssetNameAction copyDeep();

    /**
     * factory method to create a deep copy of VariantChangeAssetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantChangeAssetNameAction deepCopy(@Nullable final VariantChangeAssetNameAction template) {
        if (template == null) {
            return null;
        }
        VariantChangeAssetNameActionImpl instance = new VariantChangeAssetNameActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for VariantChangeAssetNameAction
     * @return builder
     */
    public static VariantChangeAssetNameActionBuilder builder() {
        return VariantChangeAssetNameActionBuilder.of();
    }

    /**
     * create builder for VariantChangeAssetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantChangeAssetNameActionBuilder builder(final VariantChangeAssetNameAction template) {
        return VariantChangeAssetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantChangeAssetNameAction(Function<VariantChangeAssetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantChangeAssetNameAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantChangeAssetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantChangeAssetNameAction>";
            }
        };
    }
}
