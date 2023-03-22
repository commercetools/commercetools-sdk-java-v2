
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
 *  <p>Returned when a Price key conflicts with an existing key.</p>
 *  <p>Keys of Embedded Prices must be unique per ProductVariant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DuplicatePriceKeyError duplicatePriceKeyError = DuplicatePriceKeyError.builder()
 *             .message("{message}")
 *             .conflictingPrice(conflictingPriceBuilder -> conflictingPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DuplicatePriceKeyErrorImpl.class)
public interface DuplicatePriceKeyError extends ErrorObject {

    String DUPLICATE_PRICE_KEY = "DuplicatePriceKey";

    /**
     *
     * @return code
     */
    @NotNull
    @JsonProperty("code")
    public String getCode();

    /**
     *  <p><code>"Duplicate price key: $priceKey. The price key must be unique per variant."</code></p>
     * @return message
     */
    @NotNull
    @JsonProperty("message")
    public String getMessage();

    /**
     *  <p>Conflicting Embedded Price.</p>
     * @return conflictingPrice
     */
    @NotNull
    @Valid
    @JsonProperty("conflictingPrice")
    public Price getConflictingPrice();

    public void setMessage(final String message);

    public void setConflictingPrice(final Price conflictingPrice);

    public static DuplicatePriceKeyError of() {
        return new DuplicatePriceKeyErrorImpl();
    }

    public static DuplicatePriceKeyError of(final DuplicatePriceKeyError template) {
        DuplicatePriceKeyErrorImpl instance = new DuplicatePriceKeyErrorImpl();
        instance.setMessage(template.getMessage());

        instance.setConflictingPrice(template.getConflictingPrice());
        return instance;
    }

    public static DuplicatePriceKeyErrorBuilder builder() {
        return DuplicatePriceKeyErrorBuilder.of();
    }

    public static DuplicatePriceKeyErrorBuilder builder(final DuplicatePriceKeyError template) {
        return DuplicatePriceKeyErrorBuilder.of(template);
    }

    default <T> T withDuplicatePriceKeyError(Function<DuplicatePriceKeyError, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceKeyError> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DuplicatePriceKeyError>() {
            @Override
            public String toString() {
                return "TypeReference<DuplicatePriceKeyError>";
            }
        };
    }
}
