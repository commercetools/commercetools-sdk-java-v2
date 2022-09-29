
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.standalone_prices.StandalonePriceImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StandalonePriceImportRequestImpl.class)
public interface StandalonePriceImportRequest extends ImportRequest {

    String STANDALONE_PRICE = "standalone-price";

    /**
     *  <p>The Standalone Price import resources of this request.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<StandalonePriceImport> getResources();

    @JsonIgnore
    public void setResources(final StandalonePriceImport... resources);

    public void setResources(final List<StandalonePriceImport> resources);

    public static StandalonePriceImportRequest of() {
        return new StandalonePriceImportRequestImpl();
    }

    public static StandalonePriceImportRequest of(final StandalonePriceImportRequest template) {
        StandalonePriceImportRequestImpl instance = new StandalonePriceImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static StandalonePriceImportRequestBuilder builder() {
        return StandalonePriceImportRequestBuilder.of();
    }

    public static StandalonePriceImportRequestBuilder builder(final StandalonePriceImportRequest template) {
        return StandalonePriceImportRequestBuilder.of(template);
    }

    default <T> T withStandalonePriceImportRequest(Function<StandalonePriceImportRequest, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImportRequest> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StandalonePriceImportRequest>() {
            @Override
            public String toString() {
                return "TypeReference<StandalonePriceImportRequest>";
            }
        };
    }
}
