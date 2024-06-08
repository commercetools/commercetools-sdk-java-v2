
package com.commercetools.api.models.tax_category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * TaxCategoryChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryChangeNameAction taxCategoryChangeNameAction = TaxCategoryChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryChangeNameActionImpl.class)
public interface TaxCategoryChangeNameAction extends TaxCategoryUpdateAction {

    /**
     * discriminator value for TaxCategoryChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of TaxCategoryChangeNameAction
     */
    public static TaxCategoryChangeNameAction of() {
        return new TaxCategoryChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryChangeNameAction of(final TaxCategoryChangeNameAction template) {
        TaxCategoryChangeNameActionImpl instance = new TaxCategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of TaxCategoryChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryChangeNameAction deepCopy(@Nullable final TaxCategoryChangeNameAction template) {
        if (template == null) {
            return null;
        }
        TaxCategoryChangeNameActionImpl instance = new TaxCategoryChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for TaxCategoryChangeNameAction
     * @return builder
     */
    public static TaxCategoryChangeNameActionBuilder builder() {
        return TaxCategoryChangeNameActionBuilder.of();
    }

    /**
     * create builder for TaxCategoryChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryChangeNameActionBuilder builder(final TaxCategoryChangeNameAction template) {
        return TaxCategoryChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryChangeNameAction(Function<TaxCategoryChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryChangeNameAction>";
            }
        };
    }
}
