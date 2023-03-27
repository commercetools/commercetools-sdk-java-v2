
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryChangeAssetNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryChangeAssetNameAction categoryChangeAssetNameAction = CategoryChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryChangeAssetNameActionImpl.class)
public interface CategoryChangeAssetNameAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategoryChangeAssetNameAction
     */
    String CHANGE_ASSET_NAME = "changeAssetName";

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
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

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
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of CategoryChangeAssetNameAction
     */
    public static CategoryChangeAssetNameAction of() {
        return new CategoryChangeAssetNameActionImpl();
    }

    /**
     * factory method to copy an instance of CategoryChangeAssetNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryChangeAssetNameAction of(final CategoryChangeAssetNameAction template) {
        CategoryChangeAssetNameActionImpl instance = new CategoryChangeAssetNameActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for CategoryChangeAssetNameAction
     * @return builder
     */
    public static CategoryChangeAssetNameActionBuilder builder() {
        return CategoryChangeAssetNameActionBuilder.of();
    }

    /**
     * create builder for CategoryChangeAssetNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryChangeAssetNameActionBuilder builder(final CategoryChangeAssetNameAction template) {
        return CategoryChangeAssetNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryChangeAssetNameAction(Function<CategoryChangeAssetNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryChangeAssetNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryChangeAssetNameAction>";
            }
        };
    }
}
