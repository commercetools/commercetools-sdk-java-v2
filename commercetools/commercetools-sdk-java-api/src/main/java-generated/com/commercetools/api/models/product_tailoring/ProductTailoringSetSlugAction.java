
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generates the ProductTailoringSlugSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetSlugAction productTailoringSetSlugAction = ProductTailoringSetSlugAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetSlugActionImpl.class)
public interface ProductTailoringSetSlugAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetSlugAction
     */
    String SET_SLUG = "setSlug";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p>If <code>true</code>, only the staged <code>slug</code> is updated. If <code>false</code>, both the current and staged <code>slug</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductTailoringSetSlugAction
     */
    public static ProductTailoringSetSlugAction of() {
        return new ProductTailoringSetSlugActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetSlugAction of(final ProductTailoringSetSlugAction template) {
        ProductTailoringSetSlugActionImpl instance = new ProductTailoringSetSlugActionImpl();
        instance.setSlug(template.getSlug());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetSlugAction deepCopy(@Nullable final ProductTailoringSetSlugAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetSlugActionImpl instance = new ProductTailoringSetSlugActionImpl();
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetSlugAction
     * @return builder
     */
    public static ProductTailoringSetSlugActionBuilder builder() {
        return ProductTailoringSetSlugActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetSlugActionBuilder builder(final ProductTailoringSetSlugAction template) {
        return ProductTailoringSetSlugActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetSlugAction(Function<ProductTailoringSetSlugAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetSlugAction>";
            }
        };
    }
}
