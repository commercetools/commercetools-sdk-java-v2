
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Produces the ProductSlugChanged Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeSlugAction productChangeSlugAction = ProductChangeSlugAction.builder()
 *             .slug(slugBuilder -> slugBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductChangeSlugActionImpl.class)
public interface ProductChangeSlugAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductChangeSlugAction
     */
    String CHANGE_SLUG = "changeSlug";

    /**
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
     * @return slug
     */
    @NotNull
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
     *  <p>Value to set. Must not be empty. A Product can have the same slug for different Locales, but it must be unique across the Project. Must match the pattern <code>^[A-Za-z0-9_-]{2,256}+$</code>.</p>
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
     * @return instance of ProductChangeSlugAction
     */
    public static ProductChangeSlugAction of() {
        return new ProductChangeSlugActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductChangeSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductChangeSlugAction of(final ProductChangeSlugAction template) {
        ProductChangeSlugActionImpl instance = new ProductChangeSlugActionImpl();
        instance.setSlug(template.getSlug());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductChangeSlugAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductChangeSlugAction deepCopy(@Nullable final ProductChangeSlugAction template) {
        if (template == null) {
            return null;
        }
        ProductChangeSlugActionImpl instance = new ProductChangeSlugActionImpl();
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductChangeSlugAction
     * @return builder
     */
    public static ProductChangeSlugActionBuilder builder() {
        return ProductChangeSlugActionBuilder.of();
    }

    /**
     * create builder for ProductChangeSlugAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductChangeSlugActionBuilder builder(final ProductChangeSlugAction template) {
        return ProductChangeSlugActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductChangeSlugAction(Function<ProductChangeSlugAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductChangeSlugAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductChangeSlugAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductChangeSlugAction>";
            }
        };
    }
}
