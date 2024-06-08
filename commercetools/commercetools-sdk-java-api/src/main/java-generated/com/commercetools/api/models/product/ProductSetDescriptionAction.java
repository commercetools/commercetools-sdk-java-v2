
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
 * ProductSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDescriptionAction productSetDescriptionAction = ProductSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetDescriptionActionImpl.class)
public interface ProductSetDescriptionAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>If <code>true</code>, only the staged <code>description</code> is updated. If <code>false</code>, both the current and staged <code>description</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetDescriptionAction
     */
    public static ProductSetDescriptionAction of() {
        return new ProductSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetDescriptionAction of(final ProductSetDescriptionAction template) {
        ProductSetDescriptionActionImpl instance = new ProductSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetDescriptionAction deepCopy(@Nullable final ProductSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductSetDescriptionActionImpl instance = new ProductSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetDescriptionAction
     * @return builder
     */
    public static ProductSetDescriptionActionBuilder builder() {
        return ProductSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ProductSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetDescriptionActionBuilder builder(final ProductSetDescriptionAction template) {
        return ProductSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetDescriptionAction(Function<ProductSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetDescriptionAction>";
            }
        };
    }
}
