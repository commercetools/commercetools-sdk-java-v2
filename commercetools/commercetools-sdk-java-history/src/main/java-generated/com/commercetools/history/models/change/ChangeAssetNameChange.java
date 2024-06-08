
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
 *   <li>Change Asset Name on Categories.</li>
 *   <li>Change Asset Name on Products.</li>
 *  </ul>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ChangeAssetNameChange changeAssetNameChange = ChangeAssetNameChange.builder()
 *             .change("{change}")
 *             .previousValue(previousValueBuilder -> previousValueBuilder)
 *             .nextValue(nextValueBuilder -> nextValueBuilder)
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ChangeAssetNameChangeImpl.class)
public interface ChangeAssetNameChange extends Change {

    /**
     * discriminator value for ChangeAssetNameChange
     */
    String CHANGE_ASSET_NAME_CHANGE = "ChangeAssetNameChange";

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
     * @return instance of ChangeAssetNameChange
     */
    public static ChangeAssetNameChange of() {
        return new ChangeAssetNameChangeImpl();
    }

    /**
     * factory method to create a shallow copy ChangeAssetNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    public static ChangeAssetNameChange of(final ChangeAssetNameChange template) {
        ChangeAssetNameChangeImpl instance = new ChangeAssetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        instance.setAsset(template.getAsset());
        return instance;
    }

    /**
     * factory method to create a deep copy of ChangeAssetNameChange
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ChangeAssetNameChange deepCopy(@Nullable final ChangeAssetNameChange template) {
        if (template == null) {
            return null;
        }
        ChangeAssetNameChangeImpl instance = new ChangeAssetNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getPreviousValue()));
        instance.setNextValue(
            com.commercetools.history.models.common.LocalizedString.deepCopy(template.getNextValue()));
        instance.setAsset(com.commercetools.history.models.change_value.AssetChangeValue.deepCopy(template.getAsset()));
        return instance;
    }

    /**
     * builder factory method for ChangeAssetNameChange
     * @return builder
     */
    public static ChangeAssetNameChangeBuilder builder() {
        return ChangeAssetNameChangeBuilder.of();
    }

    /**
     * create builder for ChangeAssetNameChange instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ChangeAssetNameChangeBuilder builder(final ChangeAssetNameChange template) {
        return ChangeAssetNameChangeBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChangeAssetNameChange(Function<ChangeAssetNameChange, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAssetNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAssetNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAssetNameChange>";
            }
        };
    }
}
