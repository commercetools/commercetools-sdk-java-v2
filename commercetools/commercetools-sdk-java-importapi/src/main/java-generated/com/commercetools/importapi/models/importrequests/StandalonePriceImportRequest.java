
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.standalone_prices.StandalonePriceImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>The request body to import Standalone Prices. Contains data for Standalone Prices to be created or updated in a Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceImportRequest standalonePriceImportRequest = StandalonePriceImportRequest.builder()
 *             .plusResources(resourcesBuilder -> resourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("standalone-price")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceImportRequestImpl.class)
public interface StandalonePriceImportRequest extends ImportRequest {

    /**
     * discriminator value for StandalonePriceImportRequest
     */
    String STANDALONE_PRICE = "standalone-price";

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     * @return resources
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<StandalonePriceImport> getResources();

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     * @param resources values to be set
     */

    @JsonIgnore
    public void setResources(final StandalonePriceImport... resources);

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     * @param resources values to be set
     */

    public void setResources(final List<StandalonePriceImport> resources);

    /**
     * factory method
     * @return instance of StandalonePriceImportRequest
     */
    public static StandalonePriceImportRequest of() {
        return new StandalonePriceImportRequestImpl();
    }

    /**
     * factory method to create a shallow copy StandalonePriceImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    public static StandalonePriceImportRequest of(final StandalonePriceImportRequest template) {
        StandalonePriceImportRequestImpl instance = new StandalonePriceImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public StandalonePriceImportRequest copyDeep();

    /**
     * factory method to create a deep copy of StandalonePriceImportRequest
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StandalonePriceImportRequest deepCopy(@Nullable final StandalonePriceImportRequest template) {
        if (template == null) {
            return null;
        }
        StandalonePriceImportRequestImpl instance = new StandalonePriceImportRequestImpl();
        instance.setResources(Optional.ofNullable(template.getResources())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.standalone_prices.StandalonePriceImport::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StandalonePriceImportRequest
     * @return builder
     */
    public static StandalonePriceImportRequestBuilder builder() {
        return StandalonePriceImportRequestBuilder.of();
    }

    /**
     * create builder for StandalonePriceImportRequest instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceImportRequestBuilder builder(final StandalonePriceImportRequest template) {
        return StandalonePriceImportRequestBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStandalonePriceImportRequest(Function<StandalonePriceImportRequest, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceImportRequest>";
            }
        };
    }
}
