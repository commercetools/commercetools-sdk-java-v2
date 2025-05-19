
package com.commercetools.api.models.product;

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
 * ProductSetMetaDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaDescriptionAction productSetMetaDescriptionAction = ProductSetMetaDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setMetaDescription")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaDescriptionActionImpl.class)
public interface ProductSetMetaDescriptionAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetMetaDescriptionAction
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
     * @return instance of ProductSetMetaDescriptionAction
     */
    public static ProductSetMetaDescriptionAction of() {
        return new ProductSetMetaDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetMetaDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetMetaDescriptionAction of(final ProductSetMetaDescriptionAction template) {
        ProductSetMetaDescriptionActionImpl instance = new ProductSetMetaDescriptionActionImpl();
        instance.setMetaDescription(template.getMetaDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductSetMetaDescriptionAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetMetaDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetMetaDescriptionAction deepCopy(@Nullable final ProductSetMetaDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductSetMetaDescriptionActionImpl instance = new ProductSetMetaDescriptionActionImpl();
        instance.setMetaDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaDescription()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetMetaDescriptionAction
     * @return builder
     */
    public static ProductSetMetaDescriptionActionBuilder builder() {
        return ProductSetMetaDescriptionActionBuilder.of();
    }

    /**
     * create builder for ProductSetMetaDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetMetaDescriptionActionBuilder builder(final ProductSetMetaDescriptionAction template) {
        return ProductSetMetaDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetMetaDescriptionAction(Function<ProductSetMetaDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetMetaDescriptionAction>";
            }
        };
    }
}
