
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.AssetSource;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetSourcesChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetSourcesChange setAssetSourcesChange = SetAssetSourcesChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetSourcesChangeImpl.class)
public interface SetAssetSourcesChange extends Change {

    /**
     * discriminator value for SetAssetSourcesChange
     */
    String SET_ASSET_SOURCES_CHANGE = "SetAssetSourcesChange";

    /**
     *  <p>Update action for <code>setAssetSources</code></p>
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
     *
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    /**
     *
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<AssetSource> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<AssetSource> getPreviousValue();

    /**
     *  <p>Update action for <code>setAssetSources</code></p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * set asset
     * @param asset value to be set
     */

    public void setAsset(final AssetChangeValue asset);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    @JsonIgnore
    public void setNextValue(final AssetSource... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<AssetSource> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final AssetSource... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<AssetSource> previousValue);

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
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

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
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        instance.setNextValue(Optional.ofNullable(template.getNextValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue())
                .map(t -> t.stream()
                        .map(com.commercetools.history.models.common.AssetSource::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
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
