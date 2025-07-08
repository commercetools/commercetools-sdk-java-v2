
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.discount_codes.DiscountCodeImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import DiscountCodes. Contains data for Discount Codes to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeImportRequest discountCodeImportRequest = DiscountCodeImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("discount-code")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeImportRequestImpl.class)
public interface DiscountCodeImportRequest extends ImportRequest {

    /**
     * discriminator value for DiscountCodeImportRequest
     */
    String DISCOUNT_CODE = "discount-code";

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<DiscountCodeImport> getResources();

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final DiscountCodeImport... resources);

    /**
     *  <p>The Discount Code import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<DiscountCodeImport> resources);

    /**
     * factory method
     * @return instance of DiscountCodeImportRequest
     */
    public static DiscountCodeImportRequest of() {
        return new DiscountCodeImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeImportRequest of(final DiscountCodeImportRequest template) {
        DiscountCodeImportRequestImpl instance = new DiscountCodeImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public DiscountCodeImportRequest copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeImportRequest deepCopy(@Nullable final DiscountCodeImportRequest template) {
        if (template == null) {
            return null;
        }
        DiscountCodeImportRequestImpl instance = new DiscountCodeImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.discount_codes.DiscountCodeImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for DiscountCodeImportRequest
     * @return builder
     */
    public static DiscountCodeImportRequestBuilder builder() {
        return DiscountCodeImportRequestBuilder.of();
    }

    /**
     * create builder for DiscountCodeImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeImportRequestBuilder builder(final DiscountCodeImportRequest template) {
        return DiscountCodeImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeImportRequest(Function<DiscountCodeImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeImportRequest>";
            }
        };
    }
}
