
package com.commercetools.api.models.variant;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the tags of an existing Asset on a Variant. The Asset to update must be specified using either <code>assetId</code> or <code>assetKey</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetTagsAction variantSetAssetTagsAction = VariantSetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setAssetTags")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantSetAssetTagsActionImpl.class)
public interface VariantSetAssetTagsAction extends VariantUpdateAction {

    /**
     * discriminator value for VariantSetAssetTagsAction
     */
    String SET_ASSET_TAGS = "setAssetTags";

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

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */

    @JsonProperty("tags")
    public List<String> getTags();

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
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     */

    public void setAssetKey(final String assetKey);

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */

    @JsonIgnore
    public void setTags(final String... tags);

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */

    public void setTags(final List<String> tags);

    /**
     * factory method
     * @return instance of VariantSetAssetTagsAction
     */
    public static VariantSetAssetTagsAction of() {
        return new VariantSetAssetTagsActionImpl();
    }

    /**
     * factory method to create a shallow copy VariantSetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantSetAssetTagsAction of(final VariantSetAssetTagsAction template) {
        VariantSetAssetTagsActionImpl instance = new VariantSetAssetTagsActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    public VariantSetAssetTagsAction copyDeep();

    /**
     * factory method to create a deep copy of VariantSetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantSetAssetTagsAction deepCopy(@Nullable final VariantSetAssetTagsAction template) {
        if (template == null) {
            return null;
        }
        VariantSetAssetTagsActionImpl instance = new VariantSetAssetTagsActionImpl();
        instance.setStaged(template.getStaged());
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(Optional.ofNullable(template.getTags()).map(ArrayList::new).orElse(null));
        return instance;
    }

    /**
     * builder factory method for VariantSetAssetTagsAction
     * @return builder
     */
    public static VariantSetAssetTagsActionBuilder builder() {
        return VariantSetAssetTagsActionBuilder.of();
    }

    /**
     * create builder for VariantSetAssetTagsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetTagsActionBuilder builder(final VariantSetAssetTagsAction template) {
        return VariantSetAssetTagsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantSetAssetTagsAction(Function<VariantSetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantSetAssetTagsAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantSetAssetTagsAction>() {
            @Override
            public String toString() {
                return "TypeReference<VariantSetAssetTagsAction>";
            }
        };
    }
}
