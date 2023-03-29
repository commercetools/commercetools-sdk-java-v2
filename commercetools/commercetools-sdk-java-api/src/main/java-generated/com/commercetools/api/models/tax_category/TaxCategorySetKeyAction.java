
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * TaxCategorySetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategorySetKeyAction taxCategorySetKeyAction = TaxCategorySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategorySetKeyActionImpl.class)
public interface TaxCategorySetKeyAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategorySetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of TaxCategorySetKeyAction
     */
    public static TaxCategorySetKeyAction of() {
        return new TaxCategorySetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategorySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategorySetKeyAction of(final TaxCategorySetKeyAction template) {
        TaxCategorySetKeyActionImpl instance = new TaxCategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategorySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategorySetKeyAction deepCopy(@Nullable final TaxCategorySetKeyAction template) {
        if (template == null) {
            return null;
        }
        TaxCategorySetKeyActionImpl instance = new TaxCategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TaxCategorySetKeyAction
     * @return builder
     */
    public static TaxCategorySetKeyActionBuilder builder() {
        return TaxCategorySetKeyActionBuilder.of();
    }

    /**
     * create builder for TaxCategorySetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategorySetKeyActionBuilder builder(final TaxCategorySetKeyAction template) {
        return TaxCategorySetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategorySetKeyAction(Function<TaxCategorySetKeyAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategorySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategorySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategorySetKeyAction>";
            }
        };
    }
}
