package com.commercetools.importapi.models.importrequests;

import com.commercetools.importapi.models.common.ImportResourceType;
import com.commercetools.importapi.models.importrequests.ImportRequest;
import com.commercetools.importapi.models.prices.PriceImport;
import com.commercetools.importapi.models.importrequests.PriceImportRequestImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

/**
*  <p>An import request for multiple price import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = PriceImportRequestImpl.class)
public interface PriceImportRequest extends ImportRequest {

    /**
    *  <p>The price import resources of this request.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("resources")
    public List<PriceImport> getResources();

    public void setResources(final List<PriceImport> resources);

    public static PriceImportRequestImpl of(){
        return new PriceImportRequestImpl();
    }
    

    public static PriceImportRequestImpl of(final PriceImportRequest template) {
        PriceImportRequestImpl instance = new PriceImportRequestImpl();
        instance.setResources(template.getResources());
        return instance;
    }

    default <T extends Accessor<PriceImportRequest>> T withPriceImportRequest(Function<PriceImportRequest, T> helper) {
        return helper.apply(this);
    }
}
