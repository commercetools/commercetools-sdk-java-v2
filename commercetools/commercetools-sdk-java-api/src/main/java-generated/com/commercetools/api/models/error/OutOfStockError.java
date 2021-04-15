
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OutOfStockErrorImpl.class)
public interface OutOfStockError extends ErrorObject {

    String OUT_OF_STOCK = "OutOfStock";

    @NotNull
    @JsonProperty("lineItems")
    public List<String> getLineItems();

    @NotNull
    @JsonProperty("skus")
    public List<String> getSkus();

    @JsonIgnore
    public void setLineItems(final String... lineItems);

    public void setLineItems(final List<String> lineItems);

    @JsonIgnore
    public void setSkus(final String... skus);

    public void setSkus(final List<String> skus);

    public static OutOfStockError of() {
        return new OutOfStockErrorImpl();
    }

    public static OutOfStockError of(final OutOfStockError template) {
        OutOfStockErrorImpl instance = new OutOfStockErrorImpl();
        instance.setMessage(template.getMessage());
        instance.setLineItems(template.getLineItems());
        instance.setSkus(template.getSkus());
        return instance;
    }

    public static OutOfStockErrorBuilder builder() {
        return OutOfStockErrorBuilder.of();
    }

    public static OutOfStockErrorBuilder builder(final OutOfStockError template) {
        return OutOfStockErrorBuilder.of(template);
    }

    default <T> T withOutOfStockError(Function<OutOfStockError, T> helper) {
        return helper.apply(this);
    }
}
