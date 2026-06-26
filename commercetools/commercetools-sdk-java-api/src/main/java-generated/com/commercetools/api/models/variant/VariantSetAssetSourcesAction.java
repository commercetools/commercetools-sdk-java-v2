
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the sources of an existing Asset on a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetSourcesAction variantSetAssetSourcesAction = VariantSetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetSources")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetSourcesActionImpl.class)
public interface VariantSetAssetSourcesAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetSourcesAction
     */
    String SET_ASSET_SOURCES = "setAssetSources";

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
     *  <p>Value to set.</p>
     * @return sources
     */
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

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
     *  <p>Value to set.</p>
     * @param sources values to be set
     */

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    /**
     *  <p>Value to set.</p>
     * @param sources values to be set
     */

    public void setSources(final List<AssetSource> sources);

    /**
     * factory method
     * @return instance of VariantSetAssetSourcesAction
     */
    public static VariantSetAssetSourcesAction of() {
        return new VariantSetAssetSourcesActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetSourcesAction of(final VariantSetAssetSourcesAction template) {
        VariantSetAssetSourcesActionImpl instance = new VariantSetAssetSourcesActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    public VariantSetAssetSourcesAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetSourcesAction deepCopy(@Nullable final VariantSetAssetSourcesAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetSourcesActionImpl instance = new VariantSetAssetSourcesActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(Optional.ofNullable(template.getSources())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetSourcesAction
     * @return builder
     */
    public static VariantSetAssetSourcesActionBuilder builder() {
        return VariantSetAssetSourcesActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetSourcesActionBuilder builder(final VariantSetAssetSourcesAction template) {
        return VariantSetAssetSourcesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetSourcesAction(Function<VariantSetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetSourcesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetSourcesAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetSourcesAction>";
            }
        };
    }
}
