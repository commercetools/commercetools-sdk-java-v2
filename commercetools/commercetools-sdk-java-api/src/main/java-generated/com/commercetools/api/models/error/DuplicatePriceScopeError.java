
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Price;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Returned when a Price scope conflicts with an existing one during an Update Product request.</p>
 *  <p>Every Price of a Product Variant must have a distinct combination of currency, Customer Group, country, and Channel that constitute the scope of a Price.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicatePriceScopeError duplicatePriceScopeError = DuplicatePriceScopeError.builder()
 *             .message("{message}")
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicatePriceScopeErrorImpl.class)
public interface DuplicatePriceScopeError extends ErrorObject {

    String DUPLICATE_PRICE_SCOPE = "DuplicatePriceScope";

    /**
     *
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Duplicate price scope: $priceScope. The combination of currency, country, customerGroup and channel must be unique for each price of a product variant."</code></p>
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting Embedded Price.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingPrice")
    public Price getConflictingPrice();

    public void setMessage(final String message);

    public void setConflictingPrice(final Price conflictingPrice);

    public static DuplicatePriceScopeError of() {
        return new DuplicatePriceScopeErrorImpl();
    }

    public static DuplicatePriceScopeError of(final DuplicatePriceScopeError template) {
        DuplicatePriceScopeErrorImpl instance = new DuplicatePriceScopeErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingPrice(template.getConflictingPrice());
        return instance;
    }

    public static DuplicatePriceScopeErrorBuilder builder() {
        return DuplicatePriceScopeErrorBuilder.of();
    }

    public static DuplicatePriceScopeErrorBuilder builder(final DuplicatePriceScopeError template) {
        return DuplicatePriceScopeErrorBuilder.of(template);
    }

    default <T> T withDuplicatePriceScopeError(Function<DuplicatePriceScopeError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceScopeError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceScopeError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicatePriceScopeError>";
            }
        };
    }
}
