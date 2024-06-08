
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
 *  <p>Generates the ProductTailoringDescriptionSet Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetDescriptionAction productTailoringSetDescriptionAction = ProductTailoringSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringSetDescriptionActionImpl.class)
public interface ProductTailoringSetDescriptionAction extends ProductTailoringUpdateAction {

    /**
     * discriminator value for ProductTailoringSetDescriptionAction
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
     * @return instance of ProductTailoringSetDescriptionAction
     */
    public static ProductTailoringSetDescriptionAction of() {
        return new ProductTailoringSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringSetDescriptionAction of(final ProductTailoringSetDescriptionAction template) {
        ProductTailoringSetDescriptionActionImpl instance = new ProductTailoringSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringSetDescriptionAction deepCopy(
            @Nullable final ProductTailoringSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        ProductTailoringSetDescriptionActionImpl instance = new ProductTailoringSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringSetDescriptionAction
     * @return builder
     */
    public static ProductTailoringSetDescriptionActionBuilder builder() {
        return ProductTailoringSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for ProductTailoringSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetDescriptionActionBuilder builder(
            final ProductTailoringSetDescriptionAction template) {
        return ProductTailoringSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringSetDescriptionAction(Function<ProductTailoringSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringSetDescriptionAction>";
            }
        };
    }
}
