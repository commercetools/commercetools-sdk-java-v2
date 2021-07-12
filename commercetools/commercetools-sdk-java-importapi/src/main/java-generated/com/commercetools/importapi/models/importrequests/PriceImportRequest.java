
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.prices.PriceImport;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The request body to <a href="#import-prices">import Prices</a>. Contains data for <a href="/../api/projects/products#price">Prices</a> to be created or updated in a commercetools Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceImportRequestImpl.class)
public interface PriceImportRequest extends ImportRequest {

    String PRICE = "price";

    /**
    *  <p>The price import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<PriceImport> getResources();

    @JsonIgnore
    public void setResources(final PriceImport... resources);

    public void setResources(final List<PriceImport> resources);

    public static PriceImportRequest of() {
        return new PriceImportRequestImpl();
    }

    public static PriceImportRequest of(final PriceImportRequest template) {
        PriceImportRequestImpl instance = new PriceImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    public static PriceImportRequestBuilder builder() {
        return PriceImportRequestBuilder.of();
    }

    public static PriceImportRequestBuilder builder(final PriceImportRequest template) {
        return PriceImportRequestBuilder.of(template);
    }

    default <T> T withPriceImportRequest(Function<PriceImportRequest, T> helper) {
        return helper.apply(this);
    }
}
