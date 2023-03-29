
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategorySetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategorySetDescriptionAction taxCategorySetDescriptionAction = TaxCategorySetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategorySetDescriptionActionImpl.class)
public interface TaxCategorySetDescriptionAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategorySetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */

    @JsonProperty("description")
    public String getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final String description);

    /**
     * factory method
     * @return instance of TaxCategorySetDescriptionAction
     */
    public static TaxCategorySetDescriptionAction of() {
        return new TaxCategorySetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategorySetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategorySetDescriptionAction of(final TaxCategorySetDescriptionAction template) {
        TaxCategorySetDescriptionActionImpl instance = new TaxCategorySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategorySetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategorySetDescriptionAction deepCopy(@Nullable final TaxCategorySetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        TaxCategorySetDescriptionActionImpl instance = new TaxCategorySetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * builder factory method for TaxCategorySetDescriptionAction
     * @return builder
     */
    public static TaxCategorySetDescriptionActionBuilder builder() {
        return TaxCategorySetDescriptionActionBuilder.of();
    }

    /**
     * create builder for TaxCategorySetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategorySetDescriptionActionBuilder builder(final TaxCategorySetDescriptionAction template) {
        return TaxCategorySetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategorySetDescriptionAction(Function<TaxCategorySetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategorySetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategorySetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategorySetDescriptionAction>";
            }
        };
    }
}
