
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetTagsChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetTagsChange setAssetTagsChange = SetAssetTagsChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .plusNextValue(nextValueBuilder -> nextValueBuilder)
 *             .plusPreviousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetTagsChangeImpl.class)
public interface SetAssetTagsChange extends Change {

    /**
     * discriminator value for SetAssetTagsChange
     */
    String SET_ASSET_TAGS_CHANGE = "SetAssetTagsChange";

    /**
     *  <p>Update action for <code>setAssetTags</code></p>
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
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    /**
     *  <p>Update action for <code>setAssetTags</code></p>
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
    public void setNextValue(final String... nextValue);

    /**
     * set nextValue
     * @param nextValue values to be set
     */

    public void setNextValue(final List<String> nextValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    /**
     * set previousValue
     * @param previousValue values to be set
     */

    public void setPreviousValue(final List<String> previousValue);

    /**
     * factory method
     * @return instance of SetAssetTagsChange
     */
    public static SetAssetTagsChange of() {
        return new SetAssetTagsChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAssetTagsChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetTagsChange of(final SetAssetTagsChange template) {
        SetAssetTagsChangeImpl instance = new SetAssetTagsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAssetTagsChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAssetTagsChange deepCopy(@Nullable final SetAssetTagsChange template) {
        if (template == null) {
            return null;
        }
        SetAssetTagsChangeImpl instance = new SetAssetTagsChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        instance.setNextValue(Optional.ofNullable(template.getNextValue()).map(ArrayList::new).orElse(null));
        instance.setPreviousValue(Optional.ofNullable(template.getPreviousValue()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for SetAssetTagsChange
     * @return builder
     */
    public static SetAssetTagsChangeBuilder builder() {
        return SetAssetTagsChangeBuilder.of();
    }

    /**
     * create builder for SetAssetTagsChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetTagsChangeBuilder builder(final SetAssetTagsChange template) {
        return SetAssetTagsChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetTagsChange(Function<SetAssetTagsChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetTagsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetTagsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetTagsChange>";
            }
        };
    }
}
