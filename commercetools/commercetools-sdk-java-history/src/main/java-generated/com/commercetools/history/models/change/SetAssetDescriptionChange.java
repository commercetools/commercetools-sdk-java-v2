
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetAssetDescriptionChange
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetDescriptionChange setAssetDescriptionChange = SetAssetDescriptionChange.builder()
 *             .change("{change}")
 *             .asset(assetBuilder -> assetBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SetAssetDescriptionChangeImpl.class)
public interface SetAssetDescriptionChange extends Change {

    /**
     * discriminator value for SetAssetDescriptionChange
     */
    String SET_ASSET_DESCRIPTION_CHANGE = "SetAssetDescriptionChange";

    /**
     *  <p>Update action for <code>setAssetDescription</code></p>
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
    public LocalizedString getNextValue();

    /**
     *
     * @return previousValue
     */
    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    /**
     *  <p>Update action for <code>setAssetDescription</code></p>
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
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     * set previousValue
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     * factory method
     * @return instance of SetAssetDescriptionChange
     */
    public static SetAssetDescriptionChange of() {
        return new SetAssetDescriptionChangeImpl();
    }

    /**
     * factory method to copy an instance of SetAssetDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetDescriptionChange of(final SetAssetDescriptionChange template) {
        SetAssetDescriptionChangeImpl instance = new SetAssetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setAsset(template.getAsset());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    /**
     * builder factory method for SetAssetDescriptionChange
     * @return builder
     */
    public static SetAssetDescriptionChangeBuilder builder() {
        return SetAssetDescriptionChangeBuilder.of();
    }

    /**
     * create builder for SetAssetDescriptionChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetAssetDescriptionChangeBuilder builder(final SetAssetDescriptionChange template) {
        return SetAssetDescriptionChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSetAssetDescriptionChange(Function<SetAssetDescriptionChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SetAssetDescriptionChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetAssetDescriptionChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetAssetDescriptionChange>";
            }
        };
    }
}
