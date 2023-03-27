
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetMetaTitleAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetMetaTitleAction productSetMetaTitleAction = ProductSetMetaTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetMetaTitleActionImpl.class)
public interface ProductSetMetaTitleAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetMetaTitleAction
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
     * @return instance of ProductSetMetaTitleAction
     */
    public static ProductSetMetaTitleAction of() {
        return new ProductSetMetaTitleActionImpl();
    }

    /**
     * factory method to copy an instance of ProductSetMetaTitleAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetMetaTitleAction of(final ProductSetMetaTitleAction template) {
        ProductSetMetaTitleActionImpl instance = new ProductSetMetaTitleActionImpl();
        instance.setMetaTitle(template.getMetaTitle());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetMetaTitleAction
     * @return builder
     */
    public static ProductSetMetaTitleActionBuilder builder() {
        return ProductSetMetaTitleActionBuilder.of();
    }

    /**
     * create builder for ProductSetMetaTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetMetaTitleActionBuilder builder(final ProductSetMetaTitleAction template) {
        return ProductSetMetaTitleActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetMetaTitleAction(Function<ProductSetMetaTitleAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaTitleAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetMetaTitleAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetMetaTitleAction>";
            }
        };
    }
}
