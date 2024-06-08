
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
 * ProductTailoringSetMetaKeywordsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetMetaKeywordsAction productTailoringSetMetaKeywordsAction = ProductTailoringSetMetaKeywordsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetMetaKeywordsActionImpl.class)
public interface ProductTailoringSetMetaKeywordsAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetMetaKeywordsAction
     */
    String SET_META_KEYWORDS = "setMetaKeywords";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return metaKeywords
     */
    @Valid
    @JsonProperty("metaKeywords")
    public LocalizedString getMetaKeywords();

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param metaKeywords value to be set
     */

    public void setMetaKeywords(final LocalizedString metaKeywords);

    /**
     *  <p>If <code>true</code>, only the staged <code>metaKeywords</code> is updated. If <code>false</code>, both the current and staged <code>metaKeywords</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetMetaKeywordsAction
     */
    public static ProductTailoringSetMetaKeywordsAction of() {
        return new ProductTailoringSetMetaKeywordsActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetMetaKeywordsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetMetaKeywordsAction of(final ProductTailoringSetMetaKeywordsAction template) {
        ProductTailoringSetMetaKeywordsActionImpl instance = new ProductTailoringSetMetaKeywordsActionImpl();
        instance.setMetaKeywords(template.getMetaKeywords());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetMetaKeywordsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetMetaKeywordsAction deepCopy(
            @Nullable final ProductTailoringSetMetaKeywordsAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetMetaKeywordsActionImpl instance = new ProductTailoringSetMetaKeywordsActionImpl();
        instance.setMetaKeywords(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getMetaKeywords()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetMetaKeywordsAction
     * @return builder
     */
    public static ProductTailoringSetMetaKeywordsActionBuilder builder() {
        return ProductTailoringSetMetaKeywordsActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetMetaKeywordsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetMetaKeywordsActionBuilder builder(
            final ProductTailoringSetMetaKeywordsAction template) {
        return ProductTailoringSetMetaKeywordsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetMetaKeywordsAction(Function<ProductTailoringSetMetaKeywordsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaKeywordsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetMetaKeywordsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetMetaKeywordsAction>";
            }
        };
    }
}
