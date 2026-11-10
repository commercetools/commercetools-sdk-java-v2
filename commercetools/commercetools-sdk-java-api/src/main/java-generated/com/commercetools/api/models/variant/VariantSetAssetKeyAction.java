
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
 *  <p>Sets the key of an existing Asset on a Variant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetKeyAction variantSetAssetKeyAction = VariantSetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetKeyActionImpl.class)
public interface VariantSetAssetKeyAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetKeyAction
     */
    String SET_ASSET_KEY = "setAssetKey";

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
    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

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
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     * factory method
     * @return instance of VariantSetAssetKeyAction
     */
    public static VariantSetAssetKeyAction of() {
        return new VariantSetAssetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetKeyAction of(final VariantSetAssetKeyAction template) {
        VariantSetAssetKeyActionImpl instance = new VariantSetAssetKeyActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    public VariantSetAssetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetKeyAction deepCopy(@Nullable final VariantSetAssetKeyAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetKeyActionImpl instance = new VariantSetAssetKeyActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetKeyAction
     * @return builder
     */
    public static VariantSetAssetKeyActionBuilder builder() {
        return VariantSetAssetKeyActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetKeyActionBuilder builder(final VariantSetAssetKeyAction template) {
        return VariantSetAssetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetKeyAction(Function<VariantSetAssetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetKeyAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetKeyAction>";
            }
        };
    }
}
