
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceChangedErrorImpl.class)
public interface PriceChangedError extends ErrorObject {

    String PRICE_CHANGED = "PriceChanged";

    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();

    @NotNull
    @JsonProperty("shipping")
    public Boolean getShipping();

    @JsonIgnore
    public void setLineItems(final String... lineItems);

    public void setLineItems(final List<String> lineItems);

    public void setShipping(final Boolean shipping);

    public static PriceChangedError of() {
        return new PriceChangedErrorImpl();
    }

    public static PriceChangedError of(final PriceChangedError template) {
        PriceChangedErrorImpl instance = new PriceChangedErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItems(template.getLineItems());
        instance.setShipping(template.getShipping());
        return instance;
    }

    public static PriceChangedErrorBuilder builder() {
        return PriceChangedErrorBuilder.of();
    }

    public static PriceChangedErrorBuilder builder(final PriceChangedError template) {
        return PriceChangedErrorBuilder.of(template);
    }

    default <T> T withPriceChangedError(Function<PriceChangedError, T> helper) {
        return helper.apply(this);
    }
}
