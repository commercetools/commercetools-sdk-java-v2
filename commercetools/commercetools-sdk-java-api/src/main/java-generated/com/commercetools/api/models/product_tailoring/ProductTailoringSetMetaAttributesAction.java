
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Updates all meta attributes at the same time.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaAttributesAction productTailoringSetMetaAttributesAction = ProductTailoringSetMetaAttributesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMetaAttributes")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetMetaAttributesActionImpl.class)
public interface ProductTailoringSetMetaAttributesAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetMetaAttributesAction
     */
    String SET_META_ATTRIBUTES = "setMetaAttributes";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaTitle value to be set
     */

    public void setMetaTitle(final LocalizedString metaTitle);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>If <code>true</code>, only the staged attributes are updated. If <code>false</code>, both the current and staged attributes are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetMetaAttributesAction
     */
    public static ProductTailoringSetMetaAttributesAction of() {
        return new ProductTailoringSetMetaAttributesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetMetaAttributesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetMetaAttributesAction of(final ProductTailoringSetMetaAttributesAction template) {
        ProductTailoringSetMetaAttributesActionImpl instance = new ProductTailoringSetMetaAttributesActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        instance.setMetaDescription(template.getMetaDescription());
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductTailoringSetMetaAttributesAction copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringSetMetaAttributesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetMetaAttributesAction deepCopy(
            @Nullable final ProductTailoringSetMetaAttributesAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetMetaAttributesActionImpl instance = new ProductTailoringSetMetaAttributesActionImpl();
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetMetaAttributesAction
     * @return builder
     */
    public static ProductTailoringSetMetaAttributesActionBuilder builder() {
        return ProductTailoringSetMetaAttributesActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetMetaAttributesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaAttributesActionBuilder builder(
            final ProductTailoringSetMetaAttributesAction template) {
        return ProductTailoringSetMetaAttributesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetMetaAttributesAction(
            Function<ProductTailoringSetMetaAttributesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaAttributesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaAttributesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetMetaAttributesAction>";
            }
        };
    }
}
