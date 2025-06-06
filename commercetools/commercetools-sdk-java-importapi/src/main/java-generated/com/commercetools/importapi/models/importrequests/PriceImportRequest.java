
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.prices.PriceImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import Embedded Prices. Contains data for Embedded Prices to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceImportRequest priceImportRequest = PriceImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("price")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceImportRequestImpl.class)
public interface PriceImportRequest extends ImportRequest {

    /**
     * discriminator value for PriceImportRequest
     */
    String PRICE = "price";

    /**
     *  <p>The price import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<PriceImport> getResources();

    /**
     *  <p>The price import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final PriceImport... resources);

    /**
     *  <p>The price import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<PriceImport> resources);

    /**
     * factory method
     * @return instance of PriceImportRequest
     */
    public static PriceImportRequest of() {
        return new PriceImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy PriceImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceImportRequest of(final PriceImportRequest template) {
        PriceImportRequestImpl instance = new PriceImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public PriceImportRequest copyDeep();

    /**
     * factory method to create a deep copy of PriceImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceImportRequest deepCopy(@Nullable final PriceImportRequest template) {
        if (template == null) {
            return null;
        }
        PriceImportRequestImpl instance = new PriceImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.prices.PriceImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for PriceImportRequest
     * @return builder
     */
    public static PriceImportRequestBuilder builder() {
        return PriceImportRequestBuilder.of();
    }

    /**
     * create builder for PriceImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceImportRequestBuilder builder(final PriceImportRequest template) {
        return PriceImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceImportRequest(Function<PriceImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<PriceImportRequest>";
            }
        };
    }
}
