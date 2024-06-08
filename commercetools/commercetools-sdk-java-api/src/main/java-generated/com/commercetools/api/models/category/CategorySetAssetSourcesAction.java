
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CategorySetAssetSourcesAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetSourcesAction categorySetAssetSourcesAction = CategorySetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetSourcesActionImpl.class)
public interface CategorySetAssetSourcesAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetAssetSourcesAction
     */
    String SET_ASSET_SOURCES = "setAssetSources";

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @return sources
     */
    @NotNull
    @Valid
    @JsonProperty("sources")
    public List<AssetSource> getSources();

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     */

    public void setAssetId(final String assetId);

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param sources values to be set
     */

    @JsonIgnore
    public void setSources(final AssetSource... sources);

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param sources values to be set
     */

    public void setSources(final List<AssetSource> sources);

    /**
     * factory method
     * @return instance of CategorySetAssetSourcesAction
     */
    public static CategorySetAssetSourcesAction of() {
        return new CategorySetAssetSourcesActionImpl();
    }

    /**
     * factory method to create a shallow copy CategorySetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetAssetSourcesAction of(final CategorySetAssetSourcesAction template) {
        CategorySetAssetSourcesActionImpl instance = new CategorySetAssetSourcesActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setSources(template.getSources());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetAssetSourcesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetAssetSourcesAction deepCopy(@Nullable final CategorySetAssetSourcesAction template) {
        if (template == null) {
            return null;
        }
        CategorySetAssetSourcesActionImpl instance = new CategorySetAssetSourcesActionImpl();
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
     * builder factory method for CategorySetAssetSourcesAction
     * @return builder
     */
    public static CategorySetAssetSourcesActionBuilder builder() {
        return CategorySetAssetSourcesActionBuilder.of();
    }

    /**
     * create builder for CategorySetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetSourcesActionBuilder builder(final CategorySetAssetSourcesAction template) {
        return CategorySetAssetSourcesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetAssetSourcesAction(Function<CategorySetAssetSourcesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetSourcesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetSourcesAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetSourcesAction>";
            }
        };
    }
}
