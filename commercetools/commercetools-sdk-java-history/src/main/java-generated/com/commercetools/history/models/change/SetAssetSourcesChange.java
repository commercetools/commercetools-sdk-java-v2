
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:CategorySetAssetSourcesAction" rel="nofollow">Set Asset Sources</a> on Categories.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSetAssetSourcesAction" rel="nofollow">Set Asset Sources</a> on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetSourcesChange setAssetSourcesChange = SetAssetSourcesChange.builder()
 *             .change("{change}")
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .asset(assetBuilder -> assetBuilder)
 *             .catalogData("{catalogData}")
 *             .variant("{variant}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("SetAssetSourcesChange")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetSourcesChangeImpl.class)
public interface SetAssetSourcesChange extends Change {

    /**
     * discriminator value for SetAssetSourcesChange
     */
    String SET_ASSET_SOURCES_CHANGE = "SetAssetSourcesChange";

    /**
     *
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Value before the change.</p>
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<AssetSource> getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<AssetSource> getNextValue();

    /**
     *  <p>Information about the updated Asset.</p>
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @return catalogData
     */
    @NotNull
    @JsonProperty("catalogData")
    public String getCatalogData();

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @return variant
     */
    @NotNull
    @JsonProperty("variant")
    public String getVariant();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final AssetSource... previousValue);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<AssetSource> previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final AssetSource... nextValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue values to be set
     */

    public void setNextValue(final List<AssetSource> nextValue);

    /**
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     */

    public void setAsset(final AssetChangeValue asset);

    /**
     *  <p>Product data that was updated.</p>
     *  <ul>
     *   <li><code>staged</code>, if the staged <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *   <li><code>current</code>, if the current <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductCatalogData" rel="nofollow">ProductCatalogData</a> was updated.</li>
     *  </ul>
     * @param catalogData value to be set
     */

    public void setCatalogData(final String catalogData);

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     * @param variant value to be set
     */

    public void setVariant(final String variant);

    /**
     * factory method
     * @return instance of SetAssetSourcesChange
     */
    public static SetAssetSourcesChange of() {
        return new SetAssetSourcesChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAssetSourcesChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetSourcesChange of(final SetAssetSourcesChange template) {
        SetAssetSourcesChangeImpl instance = new SetAssetSourcesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAsset(template.getAsset());
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        return instance;
    }

    public SetAssetSourcesChange copyDeep();

    /**
     * factory method to create a deep copy of SetAssetSourcesChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAssetSourcesChange deepCopy(@Nullable final SetAssetSourcesChange template) {
        if (template == null) {
            return null;
        }
        SetAssetSourcesChangeImpl instance = new SetAssetSourcesChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        instance.setCatalogData(template.getCatalogData());
        instance.setVariant(template.getVariant());
        return instance;
    }

    /**
     * builder factory method for SetAssetSourcesChange
     * @return builder
     */
    public static SetAssetSourcesChangeBuilder builder() {
        return SetAssetSourcesChangeBuilder.of();
    }

    /**
     * create builder for SetAssetSourcesChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetSourcesChangeBuilder builder(final SetAssetSourcesChange template) {
        return SetAssetSourcesChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetSourcesChange(Function<SetAssetSourcesChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetSourcesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetSourcesChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetSourcesChange>";
            }
        };
    }
}
