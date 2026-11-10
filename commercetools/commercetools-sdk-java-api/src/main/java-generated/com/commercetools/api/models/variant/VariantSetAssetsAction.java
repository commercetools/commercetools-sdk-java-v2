
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetDraft;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the assets of the Variant. Existing assets will be replaced with the new ones.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetsAction variantSetAssetsAction = VariantSetAssetsAction.builder()
 *             .plusAssets(assetsBuilder -> assetsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssets")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetsActionImpl.class)
public interface VariantSetAssetsAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetsAction
     */
    String SET_ASSETS = "setAssets";

    /**
     *  <p>Assets to set for the Variant.</p>
     * @return assets
     */
    @NotNull
    @Valid
    @JsonProperty("assets")
    public List<AssetDraft> getAssets();

    /**
     *  <p>Whether only the staged assets are set. If <code>false</code>, both the current and staged assets are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param assets values to be set
     */

    @JsonIgnore
    public void setAssets(final AssetDraft... assets);

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param assets values to be set
     */

    public void setAssets(final List<AssetDraft> assets);

    /**
     *  <p>Whether only the staged assets are set. If <code>false</code>, both the current and staged assets are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of VariantSetAssetsAction
     */
    public static VariantSetAssetsAction of() {
        return new VariantSetAssetsActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetsAction of(final VariantSetAssetsAction template) {
        VariantSetAssetsActionImpl instance = new VariantSetAssetsActionImpl();
        instance.setAssets(template.getAssets());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public VariantSetAssetsAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetsAction deepCopy(@Nullable final VariantSetAssetsAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetsActionImpl instance = new VariantSetAssetsActionImpl();
        instance.setAssets(Optional.ofNullable(template.getAssets())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.AssetDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetsAction
     * @return builder
     */
    public static VariantSetAssetsActionBuilder builder() {
        return VariantSetAssetsActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetsActionBuilder builder(final VariantSetAssetsAction template) {
        return VariantSetAssetsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetsAction(Function<VariantSetAssetsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetsAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetsAction>";
            }
        };
    }
}
