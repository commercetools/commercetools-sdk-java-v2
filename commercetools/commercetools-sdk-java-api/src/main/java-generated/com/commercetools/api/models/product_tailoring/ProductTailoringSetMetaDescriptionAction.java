
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
 * ProductTailoringSetMetaDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaDescriptionAction productTailoringSetMetaDescriptionAction = ProductTailoringSetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetMetaDescriptionActionImpl.class)
public interface ProductTailoringSetMetaDescriptionAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetMetaDescriptionAction
     */
    String SET_META_DESCRIPTION = "setMetaDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaDescription
     */
    @Valid
    @JsonProperty("metaDescription")
    public LocalizedString getMetaDescription();

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaDescription value to be set
     */

    public void setMetaDescription(final LocalizedString metaDescription);

    /**
     *  <p>If <code>true</code>, only the staged <code>metaDescription</code> is updated. If <code>false</code>, both the current and staged <code>metaDescription</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetMetaDescriptionAction
     */
    public static ProductTailoringSetMetaDescriptionAction of() {
        return new ProductTailoringSetMetaDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetMetaDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetMetaDescriptionAction of(final ProductTailoringSetMetaDescriptionAction template) {
        ProductTailoringSetMetaDescriptionActionImpl instance = new ProductTailoringSetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetMetaDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetMetaDescriptionAction deepCopy(
            @Nullable final ProductTailoringSetMetaDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetMetaDescriptionActionImpl instance = new ProductTailoringSetMetaDescriptionActionImpl();
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetMetaDescriptionAction
     * @return builder
     */
    public static ProductTailoringSetMetaDescriptionActionBuilder builder() {
        return ProductTailoringSetMetaDescriptionActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetMetaDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaDescriptionActionBuilder builder(
            final ProductTailoringSetMetaDescriptionAction template) {
        return ProductTailoringSetMetaDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetMetaDescriptionAction(
            Function<ProductTailoringSetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetMetaDescriptionAction>";
            }
        };
    }
}
