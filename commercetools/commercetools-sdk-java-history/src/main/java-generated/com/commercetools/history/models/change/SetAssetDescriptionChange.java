
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.history.models.change_value.AssetChangeValue;
import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li>Set Asset Description on Categories.</li>
 *   <li>Set Asset Description on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetAssetDescriptionChange setAssetDescriptionChange = SetAssetDescriptionChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .asset(assetBuilder -> assetBuilder)
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
    public LocalizedString getPreviousValue();

    /**
     *  <p>Value after the change.</p>
     * @return nextValue
     */
    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    /**
     *  <p>Information about the updated Asset.</p>
     * @return asset
     */
    @NotNull
    @Valid
    @JsonProperty("asset")
    public AssetChangeValue getAsset();

    /**
     * set change
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     *  <p>Value before the change.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final LocalizedString previousValue);

    /**
     *  <p>Value after the change.</p>
     * @param nextValue value to be set
     */

    public void setNextValue(final LocalizedString nextValue);

    /**
     *  <p>Information about the updated Asset.</p>
     * @param asset value to be set
     */

    public void setAsset(final AssetChangeValue asset);

    /**
     * factory method
     * @return instance of SetAssetDescriptionChange
     */
    public static SetAssetDescriptionChange of() {
        return new SetAssetDescriptionChangeImpl();
    }

    /**
     * factory method to create a shallow copy SetAssetDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static SetAssetDescriptionChange of(final SetAssetDescriptionChange template) {
        SetAssetDescriptionChangeImpl instance = new SetAssetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAsset(template.getAsset());
        return instance;
    }

    /**
     * factory method to create a deep copy of SetAssetDescriptionChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SetAssetDescriptionChange deepCopy(@Nullable final SetAssetDescriptionChange template) {
        if (template == null) {
            return null;
        }
        SetAssetDescriptionChangeImpl instance = new SetAssetDescriptionChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
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
