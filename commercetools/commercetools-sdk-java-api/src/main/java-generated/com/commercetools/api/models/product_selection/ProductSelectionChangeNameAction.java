
package com.commercetools.api.models.product_selection;

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
 * ProductSelectionChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionChangeNameAction productSelectionChangeNameAction = ProductSelectionChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionChangeNameActionImpl.class)
public interface ProductSelectionChangeNameAction extends ProductSelectionUpdateAction {

    /**
     * discriminator value for ProductSelectionChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>The new name to be set for the ProductSelection.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The new name to be set for the ProductSelection.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of ProductSelectionChangeNameAction
     */
    public static ProductSelectionChangeNameAction of() {
        return new ProductSelectionChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionChangeNameAction of(final ProductSelectionChangeNameAction template) {
        ProductSelectionChangeNameActionImpl instance = new ProductSelectionChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionChangeNameAction deepCopy(@Nullable final ProductSelectionChangeNameAction template) {
        if (template == null) {
            return null;
        }
        ProductSelectionChangeNameActionImpl instance = new ProductSelectionChangeNameActionImpl();
        instance.setName(Optional.ofNullable(template.getName())
                .map(com.commercetools.api.models.common.LocalizedString::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionChangeNameAction
     * @return builder
     */
    public static ProductSelectionChangeNameActionBuilder builder() {
        return ProductSelectionChangeNameActionBuilder.of();
    }

    /**
     * create builder for ProductSelectionChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionChangeNameActionBuilder builder(final ProductSelectionChangeNameAction template) {
        return ProductSelectionChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionChangeNameAction(Function<ProductSelectionChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionChangeNameAction>";
            }
        };
    }
}
