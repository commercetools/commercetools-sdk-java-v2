
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.variant.VariantResourceIdentifier;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the <span>defaultVariant</span> of the Product. Only available for Projects with <span>productCatalogModel</span> set to <code>Modular</code>. The Variant must belong to the Product. If <code>variant</code> is omitted, any existing default Variant is cleared.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetDefaultVariantAction productSetDefaultVariantAction = ProductSetDefaultVariantAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setDefaultVariant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSetDefaultVariantActionImpl.class)
public interface ProductSetDefaultVariantAction extends ProductUpdateAction {

    /**
     * discriminator value for ProductSetDefaultVariantAction
     */
    String SET_DEFAULT_VARIANT = "setDefaultVariant";

    /**
     *  <p>The Variant to set as default. If empty, any existing value will be removed.</p>
     * @return variant
     */
    @Valid
    @JsonProperty("variant")
    public VariantResourceIdentifier getVariant();

    /**
     *  <p>Whether only the staged <code>defaultVariant</code> is updated. If <code>false</code>, both the current and staged <code>defaultVariant</code> are updated.</p>
     * @return staged
     */

    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>The Variant to set as default. If empty, any existing value will be removed.</p>
     * @param variant value to be set
     */

    public void setVariant(final VariantResourceIdentifier variant);

    /**
     *  <p>Whether only the staged <code>defaultVariant</code> is updated. If <code>false</code>, both the current and staged <code>defaultVariant</code> are updated.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductSetDefaultVariantAction
     */
    public static ProductSetDefaultVariantAction of() {
        return new ProductSetDefaultVariantActionImpl();
    }

    /**
     * factory method to create a shallow copy ProductSetDefaultVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSetDefaultVariantAction of(final ProductSetDefaultVariantAction template) {
        ProductSetDefaultVariantActionImpl instance = new ProductSetDefaultVariantActionImpl();
        instance.setVariant(template.getVariant());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public ProductSetDefaultVariantAction copyDeep();

    /**
     * factory method to create a deep copy of ProductSetDefaultVariantAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSetDefaultVariantAction deepCopy(@Nullable final ProductSetDefaultVariantAction template) {
        if (template == null) {
            return null;
        }
        ProductSetDefaultVariantActionImpl instance = new ProductSetDefaultVariantActionImpl();
        instance.setVariant(
            com.commercetools.api.models.variant.VariantResourceIdentifier.deepCopy(template.getVariant()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductSetDefaultVariantAction
     * @return builder
     */
    public static ProductSetDefaultVariantActionBuilder builder() {
        return ProductSetDefaultVariantActionBuilder.of();
    }

    /**
     * create builder for ProductSetDefaultVariantAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetDefaultVariantActionBuilder builder(final ProductSetDefaultVariantAction template) {
        return ProductSetDefaultVariantActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSetDefaultVariantAction(Function<ProductSetDefaultVariantAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProductSetDefaultVariantAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProductSetDefaultVariantAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSetDefaultVariantAction>";
            }
        };
    }
}
