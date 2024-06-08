
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
 * ProductTailoringSetMetaTitleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaTitleAction productTailoringSetMetaTitleAction = ProductTailoringSetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetMetaTitleActionImpl.class)
public interface ProductTailoringSetMetaTitleAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetMetaTitleAction
     */
    String SET_META_TITLE = "setMetaTitle";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaTitle
     */
    @Valid
    @JsonProperty("metaTitle")
    public LocalizedString getMetaTitle();

    /**
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
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
     *  <p>If <code>true</code>, only the staged <code>metaTitle</code> is updated. If <code>false</code>, both the current and staged <code>metaTitle</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetMetaTitleAction
     */
    public static ProductTailoringSetMetaTitleAction of() {
        return new ProductTailoringSetMetaTitleActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetMetaTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetMetaTitleAction of(final ProductTailoringSetMetaTitleAction template) {
        ProductTailoringSetMetaTitleActionImpl instance = new ProductTailoringSetMetaTitleActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetMetaTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetMetaTitleAction deepCopy(
            @Nullable final ProductTailoringSetMetaTitleAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetMetaTitleActionImpl instance = new ProductTailoringSetMetaTitleActionImpl();
        instance.setMetaTitle(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaTitle()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetMetaTitleAction
     * @return builder
     */
    public static ProductTailoringSetMetaTitleActionBuilder builder() {
        return ProductTailoringSetMetaTitleActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetMetaTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaTitleActionBuilder builder(final ProductTailoringSetMetaTitleAction template) {
        return ProductTailoringSetMetaTitleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetMetaTitleAction(Function<ProductTailoringSetMetaTitleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetMetaTitleAction>";
            }
        };
    }
}
