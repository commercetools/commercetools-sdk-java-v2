
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantRemoveStagedChangesAction" rel="nofollow">Staged Changes Removed</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantStagedChangesRemovedMessagePayload variantStagedChangesRemovedMessagePayload = VariantStagedChangesRemovedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("VariantStagedChangesRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = VariantStagedChangesRemovedMessagePayloadImpl.class)
public interface VariantStagedChangesRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for VariantStagedChangesRemovedMessagePayload
     */
    String VARIANT_STAGED_CHANGES_REMOVED = "VariantStagedChangesRemoved";

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Reference to the Product containing the Variant.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of VariantStagedChangesRemovedMessagePayload
     */
    public static VariantStagedChangesRemovedMessagePayload of() {
        return new VariantStagedChangesRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy VariantStagedChangesRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static VariantStagedChangesRemovedMessagePayload of(
            final VariantStagedChangesRemovedMessagePayload template) {
        VariantStagedChangesRemovedMessagePayloadImpl instance = new VariantStagedChangesRemovedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    public VariantStagedChangesRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of VariantStagedChangesRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static VariantStagedChangesRemovedMessagePayload deepCopy(
            @Nullable final VariantStagedChangesRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        VariantStagedChangesRemovedMessagePayloadImpl instance = new VariantStagedChangesRemovedMessagePayloadImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for VariantStagedChangesRemovedMessagePayload
     * @return builder
     */
    public static VariantStagedChangesRemovedMessagePayloadBuilder builder() {
        return VariantStagedChangesRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for VariantStagedChangesRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantStagedChangesRemovedMessagePayloadBuilder builder(
            final VariantStagedChangesRemovedMessagePayload template) {
        return VariantStagedChangesRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withVariantStagedChangesRemovedMessagePayload(
            Function<VariantStagedChangesRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<VariantStagedChangesRemovedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<VariantStagedChangesRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<VariantStagedChangesRemovedMessagePayload>";
            }
        };
    }
}
